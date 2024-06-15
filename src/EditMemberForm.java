
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hassan
 */
public class EditMemberForm extends javax.swing.JFrame {
	/**
	 * Creates new form MemberEditForm
	 * 
	 */
		String imagePath = null;
		
		MY_Classes.Members members = new MY_Classes.Members();
		MY_Classes.Func_Class func = new MY_Classes.Func_Class();
		
	public EditMemberForm() {
		
		
		initComponents();
		this.setLocationRelativeTo(this);
		   jLabel_uyenoh.setVisible(false);
		   jLabel_uyeteleh.setVisible(false);
		   jLabel_uyeadih.setVisible(false);
		   jLabel_uyesoyh.setVisible(false);
		   
		   Border p = BorderFactory.createMatteBorder(5,5,5,5,new Color(96,114,116));
		   jPanel_p.setBorder(p);

	}
	


	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_p = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_uye_no = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_gender = new javax.swing.JComboBox<>();
        jLabel_epath = new javax.swing.JLabel();
        jTextField_uye_foto = new javax.swing.JLabel();
        jButtonedit = new javax.swing.JButton();
        jButtonara = new javax.swing.JButton();
        jButton_fotosec = new javax.swing.JButton();
        jTextField_uye_adi = new javax.swing.JTextField();
        jTextField_uye_soy = new javax.swing.JTextField();
        jTextField_uye_email = new javax.swing.JTextField();
        jTextField_uye_tele = new javax.swing.JTextField();
        jLabel_uyenoh = new javax.swing.JLabel();
        jLabel_uyeadih = new javax.swing.JLabel();
        jLabel_uyesoyh = new javax.swing.JLabel();
        jLabel_uyeteleh = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_p.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(96, 114, 116));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ÜYE  DÜZENLE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("üye NO:");

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("SOYADI:");

        jLabel4.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ADI:");

        jLabel5.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("EMAIL:");

        jLabel6.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CİNSİYET:");

        jLabel7.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TELFON:");

        jComboBox_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ERKEK", "KADIN" }));

        jLabel_epath.setFont(new java.awt.Font("Unispace", 0, 8)); // NOI18N
        jLabel_epath.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_epath.setText("HESAP RESIMI:");

        jTextField_uye_foto.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_uye_foto.setOpaque(true);

        jButtonedit.setText("DÜZENLE");
        jButtonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditActionPerformed(evt);
            }
        });

        jButtonara.setText("ARA");
        jButtonara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaraActionPerformed(evt);
            }
        });

        jButton_fotosec.setText("RESIM SEÇ");
        jButton_fotosec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_fotosecActionPerformed(evt);
            }
        });

        jTextField_uye_adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_uye_adiActionPerformed(evt);
            }
        });

        jTextField_uye_soy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_uye_soyActionPerformed(evt);
            }
        });

        jTextField_uye_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_uye_emailActionPerformed(evt);
            }
        });

        jTextField_uye_tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_uye_teleActionPerformed(evt);
            }
        });

        jLabel_uyenoh.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_uyenoh.setText("üye NO   BOS OLMAZ*");

        jLabel_uyeadih.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_uyeadih.setText("ADI  BOS OLMAZ*");

        jLabel_uyesoyh.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_uyesoyh.setText("SOYADI  BOS OLMAZ*");

        jLabel_uyeteleh.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_uyeteleh.setText("NUMARA BOS OLMAZ*");

        jLabel8.setBackground(new java.awt.Color(96, 114, 116));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_pLayout = new javax.swing.GroupLayout(jPanel_p);
        jPanel_p.setLayout(jPanel_pLayout);
        jPanel_pLayout.setHorizontalGroup(
            jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_pLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_pLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_uye_email))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_pLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField_uye_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton_fotosec)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel_pLayout.createSequentialGroup()
                        .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_gender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_epath, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_pLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_uye_no, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonara)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_uyenoh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_pLayout.createSequentialGroup()
                        .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_pLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_uye_adi))
                            .addGroup(jPanel_pLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_uye_soy, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_uyeadih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_uyesoyh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_pLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_uye_tele, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_uyeteleh, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_pLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButtonedit, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_pLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_pLayout.setVerticalGroup(
            jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_pLayout.createSequentialGroup()
                .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_uye_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonara)
                    .addComponent(jLabel_uyenoh))
                .addGap(18, 18, 18)
                .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_uye_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_uyeadih))
                .addGap(14, 14, 14)
                .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_uye_soy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_uyesoyh))
                .addGap(18, 18, 18)
                .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_uye_tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_uyeteleh))
                .addGap(14, 14, 14)
                .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_uye_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_epath)
                .addGroup(jPanel_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_pLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton_fotosec)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_pLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_uye_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButtonedit, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaraActionPerformed
// TODO add your handling code here:
				
try {
			
	 
		Integer id = Integer.parseInt(jTextField_uye_no.getText());
			
			//Members selectedmembers = (Members) members.getMemberById(id);
			MY_Classes.Members selectedmembers = (MY_Classes.Members) members.getMemberById(id);
			
			
			if(selectedmembers != null)
			{
			jTextField_uye_no.setText(String.valueOf(selectedmembers.getId()));
			jTextField_uye_adi.setText(selectedmembers.getFirstName());
			jTextField_uye_soy.setText(selectedmembers.getLastName());
			jTextField_uye_tele.setText(selectedmembers.getPhone());
			jTextField_uye_email.setText(selectedmembers.getEmail());
			//jTextField_uye_foto.setText(selectedmembers.getPicture());
			jComboBox_gender.setSelectedItem(selectedmembers.getGender());
			
			byte[] image = selectedmembers.getPicture();
			
			func.displayImage(jTextField_uye_foto.getWidth(), jTextField_uye_foto.getHeight(), image,"", jTextField_uye_foto);
			
			}else
			{
				JOptionPane.showMessageDialog(null, "BU IDYE SAHİP ÜYE BULUNAMADI","",1);
			}
			
		
		} catch (SQLException | NumberFormatException ex) {
			//Logger.getLogger(MemberEditForm.class.getName()).log(Level.SEVERE, null, ex);
			jLabel_uyenoh.setVisible(true);
			
		}
    }//GEN-LAST:event_jButtonaraActionPerformed

    private void jButton_fotosecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_fotosecActionPerformed
        // TODO add your handling code here:
		JFileChooser filechooser = new JFileChooser();
		filechooser.setDialogTitle("Dosya yada fofo secin");
		
		filechooser.setCurrentDirectory(new File("C:\\Users\\Hassan\\Pictures"));
		
		FileNameExtensionFilter fxf = new FileNameExtensionFilter("image",".png",".jpg","jepg");
		
		filechooser.addChoosableFileFilter(fxf);
		
		int filestate = filechooser.showSaveDialog(null);
		
		if(filestate ==JFileChooser.APPROVE_OPTION)
		{
			String path = filechooser.getSelectedFile().getAbsolutePath();
			jLabel_epath.setText(path);
			
			imagePath = path;
			
			func.displayImage(jTextField_uye_foto.getWidth(),jTextField_uye_foto.getHeight(), null, imagePath, jTextField_uye_foto);
		}
    }//GEN-LAST:event_jButton_fotosecActionPerformed

    private void jTextField_uye_adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_uye_adiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_uye_adiActionPerformed

    private void jTextField_uye_soyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_uye_soyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_uye_soyActionPerformed

    private void jTextField_uye_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_uye_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_uye_emailActionPerformed

    private void jTextField_uye_teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_uye_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_uye_teleActionPerformed

    private void jButtoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditActionPerformed
        // TODO add your handling code here:
		
	       String fname = jTextField_uye_adi.getText();
			String lname = jTextField_uye_soy.getText();
			String phone = jTextField_uye_tele.getText();
			String email = jTextField_uye_email.getText();
			String gender = jComboBox_gender.getSelectedItem().toString();
			
			if(fname.isEmpty())
			{
			jLabel_uyeadih.setVisible(true);
			}else if(lname.isEmpty())
			{
			jLabel_uyesoyh.setVisible(true);
			}else if(phone.isEmpty())
			{
			jLabel_uyeteleh.setVisible(true);
			}else
			{
			byte[] img = null;
			if(imagePath!=null)
			{
				
				try {
					
					Integer id = Integer.parseInt(jTextField_uye_no.getText());
					Path path = Paths.get(imagePath);
					img = Files.readAllBytes(path);
					members.editmember(id,fname, lname, phone, email, gender, img);
					
				} catch (IOException ex) {
					Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
				}
			}else{
				JOptionPane.showMessageDialog(null,"üye DÜZENLEMEDI","HATA",1);
			}
			
			}
			
    }//GEN-LAST:event_jButtoneditActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
		this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
			java.util.logging.Logger.getLogger(EditMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(EditMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(EditMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(EditMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EditMemberForm().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_fotosec;
    private javax.swing.JButton jButtonara;
    private javax.swing.JButton jButtonedit;
    private javax.swing.JComboBox<String> jComboBox_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_epath;
    private javax.swing.JLabel jLabel_uyeadih;
    private javax.swing.JLabel jLabel_uyenoh;
    private javax.swing.JLabel jLabel_uyesoyh;
    private javax.swing.JLabel jLabel_uyeteleh;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_p;
    private javax.swing.JTextField jTextField_uye_adi;
    private javax.swing.JTextField jTextField_uye_email;
    private javax.swing.JLabel jTextField_uye_foto;
    private javax.swing.JTextField jTextField_uye_no;
    private javax.swing.JTextField jTextField_uye_soy;
    private javax.swing.JTextField jTextField_uye_tele;
    // End of variables declaration//GEN-END:variables
}
