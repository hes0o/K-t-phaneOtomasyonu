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
	
	
public class IssueBook {
	private int book_id;
	private int member_id;
	private String status;
    private String issue_date;
	private String return_date;
	private String note;

	public IssueBook(){}
	
	
	public IssueBook(int _book_id,int _member_id,String _status,String _issue_date,String _return_date,String _note)
	{
		this.book_id= _book_id;
		this.member_id= _member_id;
		this.status= _status;
		this.issue_date= _issue_date;
		this.return_date= _return_date;
		this.note= _note;
	}
	
	public int getBook_id() {
		return book_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public String getStatus() {
		return status;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public String getReturn_date() {
		return return_date;
	}

	public String getNote() {
		return note;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
		public ArrayList<IssueBook> issuelist(String _status)
		{
			ArrayList<IssueBook> issuelist = new ArrayList<>();
			
			MY_Classes.Func_Class func = new MY_Classes.Func_Class();
			String query;
		try {
			
			if(_status.equals(""))
			{
				query = "SELECT * FROM `issue_book`";
			}else
			{
				query = "SELECT * FROM `issue_book` WHERE `status` = '"+_status+"'";
			}
			
			
			ResultSet rs = func.getData(query);
			
			PreparedStatement ps = DB.getConnection().prepareStatement(query);
				IssueBook issbook;
			
			while(rs.next())
			{
			issbook = new IssueBook(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			issuelist.add(issbook);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		return issuelist;
		}
	
	
	
	public void addissue(int _book_id,int _member_id,String _status,String _issue_date,String _return_date,String _note)
	{
	
	String insertQuery ="INSERT INTO `issue_book`(`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`) VALUES (?,?,?,?,?,?)";
			
		try {
			PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
			ps.setInt(1, _book_id );
			ps.setInt(2, _member_id);
			ps.setString(3, _status);
			ps.setString(4, _issue_date);
			ps.setString(5, _return_date);
			ps.setString(6, _note);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"KITAP Alındı","başarlı",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Odunç Alınmadı","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
	public void bookreturn(int _id){
			String deleteQuery ="DELETE FROM `issue_book` WHERE `book_id` =?";
			
	try {
			PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
			
			ps.setInt(1, _id);
			
			
			if(ps.executeUpdate() !=0)
			{
				JOptionPane.showMessageDialog(null,"kitap iade edildi","",1);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"kitap iade edilmedi","HATA",1);
			}
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	}
}
