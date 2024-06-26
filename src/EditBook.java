/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import MY_Classes.Func_Class;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;



/**
 *
 * @author Hassan
 */
	
public class EditBook extends javax.swing.JFrame {

	MY_Classes.Book book = new MY_Classes.Book();
	MY_Classes.Genre genre = new MY_Classes.Genre();
	MY_Classes.Func_Class func = new Func_Class();
	HashMap<String,Integer> genresmap = genre.getGenresMap();
	String imagePath ="";
	public EditBook() {
		initComponents();
		this.setLocationRelativeTo(this);
		Border p = BorderFactory.createMatteBorder(5, 5,5,5,new Color(20,108,148));
		jPanel1.setBorder(p);
		filljcombowithgenres();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_adi = new javax.swing.JTextField();
        jTextField_yaza = new javax.swing.JTextField();
        jTextField_isbn = new javax.swing.JTextField();
        jTextField_fiyat = new javax.swing.JTextField();
        jTextField_yayimci = new javax.swing.JTextField();
        jComboBox = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel_foto = new javax.swing.JLabel();
        jLabel_path = new javax.swing.JLabel();
        jButton_fotosec = new javax.swing.JButton();
        jButton_sil = new javax.swing.JButton();
        jButton_duzxenle = new javax.swing.JButton();
        jLabelgenres = new javax.swing.JLabel();
        jLabel_author = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton_sts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(20, 108, 148));

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel13.setText("KITAP DUZENLE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
        );

        jLabel1.setBackground(new java.awt.Color(20, 108, 148));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ISBN:");

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("YAZAR:");

        jLabel4.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ADI:");

        jLabel5.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MIKTAR:");

        jLabel6.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("YAYIMCI:");

        jLabel7.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TUR:");

        jLabel8.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("TARIH:");

        jLabel9.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("FIYAT:");

        jLabel10.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ID:");

        jLabel11.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("KITAP KAPAIGI:");

        jLabel12.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("KITAP HAKKINDA:");

        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jTextField_adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_adiActionPerformed(evt);
            }
        });

        jTextField_yaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_yazaActionPerformed(evt);
            }
        });

        jTextField_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_isbnActionPerformed(evt);
            }
        });

        jTextField_fiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fiyatActionPerformed(evt);
            }
        });

        jTextField_yayimci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_yayimciActionPerformed(evt);
            }
        });

        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel_foto.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_foto.setOpaque(true);

        jLabel_path.setText("PATH");

        jButton_fotosec.setText("FOTO SEC ");
        jButton_fotosec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_fotosecActionPerformed(evt);
            }
        });

        jButton_sil.setText("SIL");
        jButton_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_silActionPerformed(evt);
            }
        });

        jButton_duzxenle.setText("KITAP DIZENLE");
        jButton_duzxenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_duzxenleActionPerformed(evt);
            }
        });

        jLabelgenres.setText("ID");

        jLabel_author.setText("ID");

        jButton4.setText("YAZAR SEC");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton_sts.setText("ID YADA ISBN ILE ARA");
        jButton_sts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_path, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_fotosec)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_isbn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_yaza))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_author, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4))
                                            .addComponent(jLabelgenres, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jButton_sts))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_yayimci, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_duzxenle)
                .addGap(18, 18, 18)
                .addComponent(jButton_sil)
                .addGap(348, 348, 348))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_sts))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_yaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jLabel_author)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelgenres))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField_yayimci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel_path)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton_fotosec)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_duzxenle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       this.dispose();
		// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jTextField_adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_adiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_adiActionPerformed

    private void jTextField_yazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_yazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_yazaActionPerformed

    private void jTextField_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_isbnActionPerformed

    private void jTextField_fiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fiyatActionPerformed

    private void jTextField_yayimciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_yayimciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_yayimciActionPerformed

    private void jButton_fotosecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_fotosecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_fotosecActionPerformed

    private void jButton_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_silActionPerformed
        // TODO add your handling code here:
		jTextArea1.setText("");
		//jTextField1.setText("");
		jTextField_isbn.setText("");
		jTextField_adi.setText("");
		jTextField_fiyat.setText("");
		jComboBox.setSelectedIndex(0);
		jTextField_yayimci.setText("");
		jTextField_yaza.setText("");
		jDateChooser1.setDate(new java.util.Date());
		jSpinner1.setValue(0);
		jLabel5.setText("ID");
		jLabel6.setText("ID");
		jTextField_id.setText("");
		
		jLabel_foto.setIcon(null);
		jLabel_path.setText("foto path");
		
    }//GEN-LAST:event_jButton_silActionPerformed

    private void jButton_duzxenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_duzxenleActionPerformed
        // TODO add your handling code here:
			MY_Classes.Book book = new MY_Classes.Book();
		String isbn = jTextField_isbn.getText();
		if(!verif())
		{
			JOptionPane.showMessageDialog(null,"ALANLARIN BOŞ BIRAKILMAZ","",1);
		}
		/*else if(book.isisbnexist(isbn))
		{
			JOptionPane.showMessageDialog(null,"bu kitap zaten eklenmiş","",1);
		}
		*/
		
		else{
			
		try {
				
				int id = Integer.parseInt(jTextField_id.getText());
			
				String name = jTextField_adi.getText();
				String publisher = jTextField_yayimci.getText();
				String about = jTextArea1.getText();
		
				Integer authorid = Integer.parseInt(jLabel_author.getText());
				Integer genresid = Integer.parseInt(jLabelgenres.getText());
				Integer quantity = Integer.parseInt(jSpinner1.getValue().toString());
		
		
				Double price =Double.parseDouble(jTextField_fiyat.getText());
		
				SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
				
				String Daterc = dateformat.format(jDateChooser1.getDate());
				Path path = Paths.get(imagePath);
				
				
				try
				{
					byte[] img = Files.readAllBytes(path);
					book.editbook(id, name, authorid,genresid,quantity,publisher,price,Daterc,about,img);
				}catch(IOException ex)
				{
					book.editbook(id, name, authorid,genresid,quantity,publisher,price,Daterc,about,null);
				}
					
		
				
	            
		}catch (NumberFormatException ex) {
			Logger.getLogger(EditBook.class.getName()).log(Level.SEVERE, null, ex);
		}catch (NullPointerException ex) {
			Logger.getLogger(EditBook.class.getName()).log(Level.SEVERE, null, ex);
		}
				
		}
    }//GEN-LAST:event_jButton_duzxenleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
	
	 AuthorsListForm authorslist = new AuthorsListForm();
	authorslist.formType = "edit";
			
	 authorslist.setVisible(true);
	
		
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton_stsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stsActionPerformed
        // TODO add your handling code here:
		
		if(jTextField_id.getText().equals("") && jTextField_isbn.getText().equals(""))
		{
		JOptionPane.showMessageDialog(rootPane, "ID YADA ISBN BOS");
		}
		else{
		try
		{
			String isbn = jTextField_isbn.getText();
			int id =0;
			MY_Classes.Book selectedbook = null;
			try{
				id = Integer.parseInt(jTextField_id.getText());
				selectedbook = book.searchbyidorisbn(id, isbn);
			}catch(NumberFormatException ex)
			{
				//JOptionPane.showMessageDialog(rootPane, "Sadece numara girebilirsiniz");
			selectedbook = book.searchbyidorisbn(id, isbn);
			}
			
		
		
		
		jComboBox.setSelectedItem(selectedbook.getGenres_id());
		jSpinner1.setValue(selectedbook.getQuantity());
		jTextField_fiyat.setText(String.valueOf(selectedbook.getPrice()));
		jTextArea1.setText(String.valueOf(selectedbook.getAboutbook()));
		jTextField_id.setText(String.valueOf(selectedbook.getid()));
		jTextField_isbn.setText(selectedbook.getIsbn());
		jTextField_adi.setText(selectedbook.getName());
		jSpinner1.setValue(selectedbook.getQuantity());
		jTextField_yaza.setText(String.valueOf(selectedbook.getAuthor_id()));
		jTextField_yayimci.setText(selectedbook.getPublisher());
		jComboBox.setSelectedItem(selectedbook.getGenres_id());
		jLabelgenres.setText(String.valueOf(selectedbook.getGenres_id()));
		
		for(Map.Entry<String,Integer> entry : genresmap.entrySet())
		{
			if(Objects.equals(selectedbook.getGenres_id(),entry.getValue()))
			{
				jComboBox.setSelectedItem(entry.getKey());
			}
		}
		
		
		
		
		
		byte[] image = selectedbook.getCover();
		
		
		Date daterec = new SimpleDateFormat("yyyy-MM-dd").parse(selectedbook.getDateofrec());
		jDateChooser1.setDate(daterec);
		
		
		
		func.displayImage(jLabel_foto.getWidth(), jLabel_foto.getHeight(), image, "",jLabel_foto);
			
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(rootPane,"OYLE BIR KIAP YOK","KITAP BULUNMADI",1);
		}
		}
		
    }//GEN-LAST:event_jButton_stsActionPerformed
		
		public boolean verif()
	{
		if(jTextField_isbn.getText().equals("")|| jTextField_adi.getText().equals("")||jTextField_yaza.getText().equals("")||
				jTextField_fiyat.getText().equals("")||jLabelgenres.getText().equals(""))
		{
			//JOptionPane.showConfirmDialog(null,"ALANLARIN BAZILARI BOŞ","",1);
			return false;
		}else
		{
		return true;	
		}
	}
	
	
	public static void DisplayAuthorData(int id,String fullname)
	{
		
		jTextField_yaza.setText(fullname);
		

		jLabel_author.setText(String.valueOf(id));
		
		
	}
		public void filljcombowithgenres()
	{
		for(String genreName: genresmap.keySet()){
			jComboBox.addItem(genreName);
		}
	}
    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
		try{
		int genreId = genresmap.get(jComboBox.getSelectedItem().toString());
		jLabelgenres.setText(String.valueOf(genreId));
		}catch(Exception ex)
		{
			
		}
		
    }//GEN-LAST:event_jComboBoxActionPerformed
	
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
			java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EditBook().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_duzxenle;
    private javax.swing.JButton jButton_fotosec;
    private javax.swing.JButton jButton_sil;
    private javax.swing.JButton jButton_sts;
    private javax.swing.JComboBox<String> jComboBox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_author;
    private javax.swing.JLabel jLabel_foto;
    private javax.swing.JLabel jLabel_path;
    private javax.swing.JLabel jLabelgenres;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_adi;
    private javax.swing.JTextField jTextField_fiyat;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_isbn;
    private javax.swing.JTextField jTextField_yayimci;
    private static javax.swing.JTextField jTextField_yaza;
    // End of variables declaration//GEN-END:variables
}
