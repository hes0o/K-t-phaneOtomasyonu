
import javax.swing.JOptionPane;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hassan
 */
public class ReturnBookForm extends javax.swing.JFrame {

	/**
	 * Creates new form ReturnBookForm
	 */
	boolean kitapexist=false;
	boolean uyeixist= false;
	MY_Classes.Book book = new MY_Classes.Book();
	MY_Classes.Members member = new MY_Classes.Members();
	MY_Classes.IssueBook issuebook = new MY_Classes.IssueBook();
	public ReturnBookForm() {
		initComponents();
		this.setLocationRelativeTo(this);
		populateJtableWithIssues("");
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jButton_kitap = new javax.swing.JButton();
        jLabel_kitapism = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_uye = new javax.swing.JTextField();
        jButton_uye = new javax.swing.JButton();
        jLabel_uyeadi = new javax.swing.JLabel();
        jButton_al = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Oduç ver");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel3.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("KITAP ID :");

        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jButton_kitap.setText("KITABA ARA");
        jButton_kitap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_kitapActionPerformed(evt);
            }
        });

        jLabel_kitapism.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_kitapism.setText("Kitap ismi");

        jLabel7.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("uye no:");

        jTextField_uye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_uyeActionPerformed(evt);
            }
        });

        jButton_uye.setText("UYE ARA");
        jButton_uye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_uyeActionPerformed(evt);
            }
        });

        jLabel_uyeadi.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_uyeadi.setText("Uye adi_soyadi");

        jButton_al.setText("KITAP IADE ET");
        jButton_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_kitapism, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_uye, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton_kitap)
                                            .addComponent(jButton_uye, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel_uyeadi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_al, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_kitapism))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_kitap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_uyeadi)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_uye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_uye, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7))
                        .addGap(100, 100, 100)
                        .addComponent(jButton_al, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(250, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
       	int index = jTable.getSelectedRow();
		
		String id = jTable.getValueAt(index,0).toString();
		String member = jTable.getValueAt(index,1).toString();
		
		String not = jTable.getValueAt(index, 4).toString();
		
		jLabel_kitapism.setText(id);
		jLabel_uyeadi.setText(member);
		
       
    }//GEN-LAST:event_jTableMouseClicked

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jButton_kitapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_kitapActionPerformed
        // TODO add your handling code here:

        int bookid = Integer.parseInt(jTextField_id.getText());

        try
        {
            MY_Classes.Book selectedbook = book.getBookById(bookid);

            if(selectedbook!=null)
            {
                jLabel_kitapism.setText(selectedbook.getName());
                kitapexist=true;

            }else
            {
                JOptionPane.showMessageDialog(null, "oyle bir kitap yok");
                kitapexist=false;
            }
        }catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,"kitap numarasi tekrar girin");
		}

        try {
            MY_Classes.Book selectedbook = book.getBookById(bookid);
        } catch (SQLException ex) {
            //Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"HATALI BIR KITAP NO");
        }catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null, "Geçerli Kitap Seçin"+ex.getMessage());
        }
    }//GEN-LAST:event_jButton_kitapActionPerformed

    private void jTextField_uyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_uyeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_uyeActionPerformed
public void populateJtableWithIssues(String _status)
	{
		MY_Classes.IssueBook aot = new MY_Classes.IssueBook();
		ArrayList<MY_Classes.IssueBook> issuelist = aot.issuelist("");
		
		String[] colNames = {"KITAP-ID","UYE-ID","HALE","ALMAK-TARIH","VERMEK-TARIH","NOT"};

		Object[][] rows = new Object[issuelist.size()][colNames.length];
		
		for(int i =0;i <issuelist.size();i++)
		{
			rows[i][0] = issuelist.get(i).getBook_id();
			rows[i][1] = issuelist.get(i).getMember_id();
			rows[i][2] = issuelist.get(i).getStatus();
			rows[i][3] = issuelist.get(i).getIssue_date();
			rows[i][4] = issuelist.get(i).getReturn_date();
			rows[i][5] = issuelist.get(i).getNote();
			
		}
		DefaultTableModel model = new DefaultTableModel(rows,colNames);
		jTable.setModel(model);
		
	}
    private void jButton_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alActionPerformed
        // TODO add your handling code here:
	MY_Classes.IssueBook issue = new MY_Classes.IssueBook();
		try{
			int id = Integer.valueOf(jLabel_kitapism.getText());
			int confirm = JOptionPane.showConfirmDialog(null,"SEÇİLEN KITAP IADE ETMEYE EMİN MİSİNİZ?","KITAP numarasi: "+id,JOptionPane.YES_NO_OPTION);
			if(confirm==JOptionPane.YES_OPTION)
			{
				issue.bookreturn(id);
			populateJtableWithIssues("");
			}else
			{
				JOptionPane.showMessageDialog(null, "KITAP IADE ETMEYE IPTAL EDILDI");
			}
			
		}catch(NumberFormatException ex)
		{
			JOptionPane.showMessageDialog(null,"hata olustu"+ex.getMessage(),"",2);
		}
    }//GEN-LAST:event_jButton_alActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
		this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton_uyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_uyeActionPerformed
        // TODO add your handling code here:
        int uyuid = Integer.parseInt(jTextField_uye.getText());
        try {
            MY_Classes.Members selecteduye = member.getMemberById(uyuid);
            if(selecteduye!=null)
            {
                jLabel_uyeadi.setText(selecteduye.getFirstName()+" "+selecteduye.getLastName());
                uyeixist=true;
            }else
            {
                JOptionPane.showMessageDialog(null, "oyle bir uye numarasi yok");
                uyeixist=false;
            }

        } catch (Exception ex) {
            //Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"HATALI BIR UYE NO");
        }
    }//GEN-LAST:event_jButton_uyeActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ReturnBookForm().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_al;
    private javax.swing.JButton jButton_kitap;
    private javax.swing.JButton jButton_uye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_kitapism;
    private javax.swing.JLabel jLabel_uyeadi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_uye;
    // End of variables declaration//GEN-END:variables
}
