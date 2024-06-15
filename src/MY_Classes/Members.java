/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MY_Classes;

import java.lang.reflect.Member;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan
 */
public class Members {
	
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String gender;
	private byte[] picture;
	
	public Members(){}
	
	public Members(int _id,String _fname,String _lname,String _phone,String _email,String _gender,byte[] _picture)
	{
		this.id = _id;
		this.firstName = _fname;
		this.lastName = _lname;
		this.phone = _phone;
		this.email = _email;
		this.gender = _gender;
		this.picture = _picture;
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

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public byte[] getPicture() {
		return picture;
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

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
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
				
	public void addmember(String _fname,String _lname,String _phone,String _email,String _gender,byte[] _picture){
		
			String insertQuery ="INSERT INTO `members`(`firstName`, `lastName`, `phone`, `email`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
			ps.setString(1, _fname);
			ps.setString(2, _lname);
			ps.setString(3, _phone);
			ps.setString(4, _email);
			ps.setString(5, _gender);
			ps.setBytes(6, _picture);
			
			
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"üye eklendi","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"üye Eklenmedi","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
	public void editmember(int _id,String _fname,String _lname,String _phone,String _email,String _gender,byte[] _picture){
			String editQuery ="UPDATE `members` SET `firstName`= ? ,`lastName`= ? ,`phone`= ? ,`email`= ? ,`gender`= ? ,`picture`= ?  WHERE `id`= ?";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
			
			
			ps.setString(1, _fname);
			ps.setString(2, _lname);
			ps.setString(3, _phone);
			ps.setString(4, _email);
			ps.setString(5, _gender);
			ps.setBytes(6, _picture);
			ps.setInt(7, _id);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"üye DÜZENLENDI","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"üye DÜZENLEMEDI","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				}
			}  
	public void deletemember(int _id){
			String deleteQuery ="DELETE FROM `members` WHERE `id` =?";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
			
			 
			ps.setInt(1, _id);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null," üye Silendi","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"üye Silenmedi","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
	public Members getMemberById(Integer _id) throws SQLException
	{
		Func_Class func = new Func_Class();
		String query = "SELECT * FROM `members` WHERE `id` = "+_id;
		
		ResultSet rs = func.getData(query);
	 
	 if(rs.next())
	 {
		return new Members(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBytes(7));
	 }
	 else
	 {
	  return null;	 
	 }
		
	}
			public ArrayList<Members> memberList(String query)
		{
			ArrayList<Members> mlist = new ArrayList<>();
			
			MY_Classes.Func_Class func = new MY_Classes.Func_Class();
			
		try {
			
			if(query.equals(""))
			{
				query = "SELECT * FROM `members`";
			}
			
			
			ResultSet rs = func.getData(query);
			
			PreparedStatement ps = DB.getConnection().prepareStatement(query);
			//ps.getConnection().prepareStatement(query);
			//rs=ps.executeQuery();
			
		
			Members members;
			
			while(rs.next())
			{
			members = new Members(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("phone"),rs.getString("email"),rs.getString("gender"),rs.getBytes("picture"));
			mlist.add(members);
			
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		return mlist;
		}
	
	}
