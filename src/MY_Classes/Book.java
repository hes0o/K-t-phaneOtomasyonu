/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MY_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Hassan
 */

public class Book {
	
	private Integer id;
	private String isbn;
	private String name;
	private Integer author_id;
	private Integer genres_id;
	private Integer quantity;
	private String publisher;
	private double price;
	private String dateofrec;
	private String aboutbook;
	private byte[] cover;
	
	
	public Book(){}
	MY_Classes.Func_Class func = new Func_Class();
	public Book(Integer _id,String _isbn,String _name,Integer _author_id,Integer _genres_id,Integer _quantity,String _publisher,double _price,String _dateofrec,String _aboutbook,byte[] _cover)
	{
		this.id=_id;
		this.isbn=_isbn;
		this.name=_name;
		this.author_id=_author_id;
		this.genres_id=_genres_id;
		this.quantity=_quantity;
		this.publisher=_publisher;
		this.price=_price;
		this.dateofrec=_dateofrec;
		this.aboutbook=_aboutbook;
		this.cover=_cover;
		
	}
	public Integer getid() {
		return id;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public Integer getAuthor_id() {
		return author_id;
	}

	public Integer getGenres_id() {
		return genres_id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getPrice() {
		return price;
	}

	public String getDateofrec() {
		return dateofrec;
	}

	public String getAboutbook() {
		return aboutbook;
	}

	public byte[] getCover() {
		return cover;
	}
	public void setid(Integer id) {
		this.id=id;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}

	public void setGenres_id(Integer genres_id) {
		this.genres_id = genres_id;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDateofrec(String dateofrec) {
		this.dateofrec = dateofrec;
	}

	public void setAboutbook(String aboutbook) {
		this.aboutbook = aboutbook;
	}

	public void setCover(byte[] cover) {
		this.cover = cover;
	}
	public void addbook(String _isbn,String _name,Integer _author_id,Integer _genres_id,Integer _quantity,String _publisher,double _price,String _dateofrec,String _aboutbook,byte[] _cover){
		
			String insertQuery ="INSERT INTO `books`(`isbn`, `name`, `author_id`, `genre_id`,`_quantity`, `publisher`, `price`, `date_recieved`, `about`, `cover_image`) VALUES (?,?,?,?,?,?,?,?,?,?)";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
			ps.setString(1, _isbn);
			ps.setString(2, _name);
			ps.setInt(3, _author_id);
			ps.setInt(4, _genres_id);
			ps.setInt(5, _quantity);
			ps.setString(6, _publisher);
			ps.setDouble(7, _price);
			ps.setString(8, _dateofrec);
			ps.setString(9, _aboutbook);
			ps.setBytes(10, _cover);
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"KITAP eklendi","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Eklenmedi Eklenmedi","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
	public void editbook(int _id,String _name,Integer _author_id,Integer _genres_id,Integer _quantity,String _publisher,double _price,String _dateofrec,String _aboutbook,byte[] _cover){
																		//id, name, authorid,genresid,quantity,publisher,price,Daterc,about,img
			String updateQuery;
			PreparedStatement ps;
		try {	

			if(_cover!=null)
			{
				updateQuery ="UPDATE `books` SET `name`= ?,`author_id`=?,`genre_id`=?,`_quantity`=?,`publisher`=?,`price`=?,`date_recieved`=?,`about`=?,`cover_image`=? WHERE `id`=?";
				ps= DB.getConnection().prepareStatement(updateQuery);
				
				ps.setString(1, _name);
			ps.setInt(2, _author_id);
			ps.setInt(3, _genres_id);
			ps.setInt(4, _quantity);
			ps.setString(5, _publisher);
			ps.setDouble(6, _price);
			ps.setString(7, _dateofrec);
			ps.setString(8, _aboutbook);
			ps.setBytes(9, _cover);
			ps.setInt(10,_id);
			}else
			{
				updateQuery ="UPDATE `books` SET `name`= ?,`author_id`=?,`genre_id`=?,`_quantity`=?,`publisher`=?,`price`=?,`date_recieved`=?,`about`=?  WHERE `id`=?";

				
				ps= DB.getConnection().prepareStatement(updateQuery);
				
			ps.setString(1, _name);
			ps.setInt(2, _author_id);
			ps.setInt(3, _genres_id);
			ps.setInt(4, _quantity);
			ps.setString(5, _publisher);
			ps.setDouble(6, _price);
			ps.setString(7, _dateofrec);
			ps.setString(8, _aboutbook);
			ps.setInt(9,_id);	
			}
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"KITAP DUZENLENDI","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"KITAP DEZENLENMEDI ","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
	public void deletebook(int _id){
			String deleteQuery ="DELETE FROM `books` WHERE `id` =?";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
			
			 
			ps.setInt(1, _id);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null," KITAP Silendi","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"KITAP Silenmedi","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
	public boolean isisbnexist(String _isbn)
	{
		String query="SELECT * FROM `books` WHERE `isbn`='"+_isbn+"'";
		Func_Class func = new Func_Class();
		ResultSet rs = func.getData(query);
		try {
			if(rs.next())
			{
				return true;
			}else
				return false;
		} catch (SQLException ex) {
			Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
		}
		return true;
	}
	
	
	public Book searchbyidorisbn(int _id, String _isbn)
	{
		String query="SELECT * FROM `books` WHERE `id`="+_id+" or `isbn`='"+_isbn+"'";
		Func_Class func = new Func_Class();
		Book book = null;
		ResultSet rs = func.getData(query);
		
		try {
			if(rs.next())
			{
			book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),
					        rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getDouble(8),rs.getString(9), rs.getString(10),rs.getBytes(11));
			}else
			{
				return null;
			}
				
		} catch (SQLException ex) {
			Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
		}
		return book;
	}
	public ArrayList<Book> bookList(String query)
		{
			ArrayList<Book> blist = new ArrayList<>();
			
			MY_Classes.Func_Class func = new MY_Classes.Func_Class();
			
		try {
			
			if(query.equals(""))
			{
				query = "SELECT * FROM `books`";
			}
			
			
			ResultSet rs = func.getData(query);
			
			PreparedStatement ps = DB.getConnection().prepareStatement(query);
			//ps.getConnection().prepareStatement(query);
			//rs=ps.executeQuery();
			
		
			Book book;
			
			while(rs.next())
			{
			book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),
					        rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getDouble(8),rs.getString(9), rs.getString(10),rs.getBytes(11));
			blist.add(book);
			//(`isbn`, `name`, `author_id`, `genre_id`,`_quantity`, `publisher`, `price`, `date_recieved`, `about`, `cover_image`)
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		return blist;
		}
	public Book getBookById(Integer _id) throws SQLException
	{
		Func_Class func = new Func_Class();
		String query = "SELECT * FROM `books` WHERE `id` = "+_id;
		
		ResultSet rs = func.getData(query);
	 
	 if(rs.next())
	 {
		return new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),
					        rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getDouble(8),rs.getString(9), rs.getString(10),rs.getBytes(11));
	 }
			                 							
	 {
	  return null;	 
	 }
		
	}
	
	public void displaybookcovers(JLabel[] label)
	{
		
		
		
	    ResultSet rs;
		java.sql.Statement st;
		int i = 0;
		
		try { 
			 st = DB.getConnection().createStatement();
			 rs =st.executeQuery("SELECT `cover_image` FROM `books` LIMIT 5");
			 byte[] image;
			 while(rs.next())
			{
			image = rs.getBytes("cover_image");
			func.displayImage(label[i].getWidth(),label[i].getHeight(), image, name, label[i]);
			i++;
			
			}
		} catch (SQLException ex) {
			Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
		}
	
		
		
	}
	
	
}
