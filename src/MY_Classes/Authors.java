/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MY_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan
 */
public class Authors {
	
	private int id;
	private String firstName;
	private String lastName;
	private String field_Of_Expertise;
	private String about;
	
	public Authors(){}
	
	public Authors(int _id,String _fname,String _lname,String _expertise,String _about)
	{
		this.id = _id;
		this.firstName = _fname;
		this.lastName = _lname;
		this.field_Of_Expertise = _expertise;
		this.about = _about;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setField_Of_Expertise(String field_Of_Expertise) {
		this.field_Of_Expertise = field_Of_Expertise;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getField_Of_Expertise() {
		return field_Of_Expertise;
	}

	public String getAbout() {
		return about;
	}
	
	public void addAuthor(String _fname,String _lname,String _expertise,String _about){
		
			String insertQuery ="INSERT INTO `authors`(`firstName`, `lastName`, `expertise`, `about`) VALUES (?,?,?,?)";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
			ps.setString(1, _fname);
			ps.setString(2, _lname);
			ps.setString(3, _expertise);
			ps.setString(4, _about);
			
			
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"Yazar Eklendi","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Yazar Eklenmedi","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
	
	public void editAuthor(int _id,String _fname,String _lname,String _expertise,String _about){
			String editQuery ="UPDATE `authors` SET `firstName`= ?,`lastName`= ?,`expertise`= ?,`about`= ? WHERE `id`=?";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
			
			ps.setString(1,_fname);
			ps.setString(2,_lname);
			ps.setString(3,_expertise);
			ps.setString(4,_about);
			ps.setInt(5,_id);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"Yazar DÜZENLENDI","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Yazar DÜZENLEMEDI","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
			
		}
		
		public void deleteAuthor(int _id){
			String deleteQuery ="DELETE FROM `authors` WHERE `id` =?";
			
	try {
			PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
			
			ps.setInt(1, _id);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"Yazar Silendi","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Yazar Silenmedi","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
		
				public ArrayList<Authors> authorList()
		{
			ArrayList<Authors> alist = new ArrayList<>();
			String query = "SELECT * FROM `authors`";
			
			ResultSet rs;
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(query);
			//ps.getConnection().prepareStatement(query);
			rs=ps.executeQuery();
			
		
			Authors authors;
			
			while(rs.next())
			{
			authors = new Authors(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("expertise"),rs.getString("about"));
			alist.add(authors);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		return alist;
		}
}
