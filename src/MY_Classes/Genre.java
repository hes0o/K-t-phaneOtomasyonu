/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MY_Classes;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.HashMap;

/**
 *
 * @author Hassan
 */

public class Genre {
	
	private int id;
	private String name;
	
	MY_Classes.Func_Class func = new MY_Classes.Func_Class();
	
	public Genre(){};
	
		public Genre(int _id,String _name){
			
			this.id = _id;
			this.name= _name;
			
		}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int _id) {
		this.id = _id;
	}

	public void setName(String _name) {
		this.name = _name;
	}
		
		public void addGenre(String _name){
			String insertQuery ="INSERT INTO `book_genres`(`name`) VALUES (?)";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
			ps.setString(1, _name);
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"bool was added successfully","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"book was not added","",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Genre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
			
		}
		
		public void editGenre(int _id,String _name){
			String editQuery ="UPDATE `book_genres` SET `name`= ? WHERE`id`= ?";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
			
			ps.setString(1, _name);
			ps.setInt(2, _id);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"book has been edited","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"book wan't edited","",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Genre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
			
		}
		
		public void deleteGenre(int _id){
			String deleteQuery ="DELETE FROM `book_genres` WHERE id = ?";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
			
			
			ps.setInt(1, _id);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"book has been deleted","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"book wan't deleted","",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Genre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
			
		}
		
		public ArrayList<Genre> genreList()
		{
			ArrayList<Genre> glist = new ArrayList<>();
			String query = "SELECT * FROM `book_genres`";
			
			ResultSet rs;
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(query);
			//ps.getConnection().prepareStatement(query);
			rs=ps.executeQuery();
			
		
			Genre genre;
			
			while(rs.next())
			{
			genre = new Genre(rs.getInt("id"),rs.getString("name"));
			glist.add(genre);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Genre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		return glist;
		}
		
	/**
	 *
	 */
	public HashMap<String ,Integer> getGenresMap()
	{
			HashMap<String ,Integer> map = new HashMap<>();
			
			String query = "SELECT * FROM `book_genres`";
			ResultSet rs;
			try {
			PreparedStatement ps = DB.getConnection().prepareStatement(query);
			//ps.getConnection().prepareStatement(query);
			rs=ps.executeQuery();
			
		
			Genre genre;
			
			while(rs.next())
			{
			genre = new Genre(rs.getInt("id"),rs.getString("name"));
			map.put(genre.getName(), genre.getId());
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Genre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
			return map;
		}
	
}
