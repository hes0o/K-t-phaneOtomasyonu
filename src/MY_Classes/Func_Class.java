/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MY_Classes;


import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 *
 * @author Hassan
 */
public class Func_Class {
	
	private String user;
	private String password;
	
	
	
	
	
	
	public void displayImage(int width, int height,byte[] imagebyte, String imagePath,JLabel label){
		
		
		ImageIcon ImgIcn;
		if(imagebyte !=null)
		{
			ImgIcn = new ImageIcon(imagebyte);
		}else
		{
			 try
			 {
				ImgIcn = new ImageIcon(getClass().getResource(imagePath)); 
			 }catch(Exception e){
				 ImgIcn = new ImageIcon(imagePath);
			 }
				
		
		}
		
		Image image = ImgIcn.getImage().getScaledInstance(width,height,Image.SCALE_SMOOTH);
		
	  
		label.setIcon(new ImageIcon(image));
	}
	public void adduser(String _user,String _password){
		
			String insertQuery ="INSERT INTO `users`(`USERNAME`, `PASSWORD`) VALUES (?,?)";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
			ps.setString(1, _user);
			ps.setString(2, _password);
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"USER eklendi","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"USER Eklenmedi","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Func_Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
	public ResultSet getData(String query)
	{
		//MY_Classes.DB data = new MY_Classes.DB();
		
		PreparedStatement ps ;
		ResultSet rs;
		rs =null ;
		
		try {
			
			ps = DB.getConnection().prepareStatement(query);
			rs=ps.executeQuery();
			
		} catch (SQLException ex) {
			Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
		}
		return rs;
		
	}
	public String selectImage()
	{
		JFileChooser filechooser = new JFileChooser();
		filechooser.setDialogTitle("Dosya yada fofo secin");
		
		filechooser.setCurrentDirectory(new File("C:\\Users\\Hassan\\Pictures"));
		
		FileNameExtensionFilter fxf = new FileNameExtensionFilter("image",".png",".jpg","jepg");
		
		filechooser.addChoosableFileFilter(fxf);
		
		int filestate = filechooser.showSaveDialog(null);
		String path="";
		if(filestate ==JFileChooser.APPROVE_OPTION)
		{
			 path = filechooser.getSelectedFile().getAbsolutePath();
			
		}
		return path;
	}
	public int Countdata(String tableName) 
	{
		
		
		int total = 0;
	    ResultSet rs;
		java.sql.Statement st;
		
		System.out.println("i am working");
		try { 
			 st = DB.getConnection().createStatement();
			 rs =st.executeQuery("SELECT COUNT(*) as total FROM `"+tableName+"`");
			 if(rs.next())
			{
			total = rs.getInt("total");
			}
		} catch (SQLException ex) {
			Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
		}
	
		return total;
		
		
		
	}


}
