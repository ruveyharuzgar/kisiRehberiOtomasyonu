
package odev2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class Odev2 extends javax.swing.JFrame
{

    //Array sınıfı vector int veri tipleriyle işimiz olduğu için kullanıyoruz
    //işimiz nesnelerle
    Vector<Kisi> Kisiler = new Vector<Kisi>();
    
    public Odev2() 
    {
        initComponents();
       dosyadan_oku();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rehber_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        duzenle_table = new javax.swing.JTable();
        duzenle_ara_btn = new javax.swing.JButton();
        duzenle_txt = new javax.swing.JTextField();
        duzenle_kaydet_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ekle_btn = new javax.swing.JButton();
        ekle_isim_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ekle_numara_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ekle_numara2_txt = new javax.swing.JTextField();
        ekle_email_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sil_btn = new javax.swing.JButton();
        sil_isimnumara_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane2FocusGained(evt);
            }
        });

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        rehber_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İsim", "Numara", "Numara 2", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rehber_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Rehber", jPanel1);

        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
        });
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });

        duzenle_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İsim", "Numara", "Numara 2", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(duzenle_table);

        duzenle_ara_btn.setText("ARA");
        duzenle_ara_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duzenle_ara_btnActionPerformed(evt);
            }
        });

        duzenle_kaydet_btn.setText("KAYDET");
        duzenle_kaydet_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duzenle_kaydet_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(duzenle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duzenle_ara_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(duzenle_kaydet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duzenle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duzenle_ara_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duzenle_kaydet_btn)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Numara Duzenle", jPanel2);

        ekle_btn.setText("EKLE");
        ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_btnActionPerformed(evt);
            }
        });

        ekle_isim_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_isim_txtActionPerformed(evt);
            }
        });

        jLabel2.setText("İsim");

        jLabel3.setText("Numara");

        jLabel4.setText("Numara 2");

        jLabel5.setText("Email");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ekle_isim_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ekle_numara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ekle_numara2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ekle_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 438, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekle_isim_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekle_numara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekle_numara2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekle_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(ekle_btn)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Numara Ekle", jPanel3);

        sil_btn.setText("SİL");
        sil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_btnActionPerformed(evt);
            }
        });

        sil_isimnumara_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_isimnumara_txtActionPerformed(evt);
            }
        });

        jLabel6.setText("İsim / Numara");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(571, Short.MAX_VALUE)
                .addComponent(sil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sil_isimnumara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sil_isimnumara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(sil_btn)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Numara Sil", jPanel4);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rehber Otomasyon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekle_isim_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_isim_txtActionPerformed

    }//GEN-LAST:event_ekle_isim_txtActionPerformed

    private void sil_isimnumara_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_isimnumara_txtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_sil_isimnumara_txtActionPerformed

    private void jTabbedPane2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane2FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jTabbedPane2FocusGained

    private void ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_btnActionPerformed
                // TODO add your handling code here:
        if(ekle_isim_txt.getText().length() == 0 || ekle_numara_txt.getText().length() == 0)
        {
            //isim ve numara eklememiz gerekiyor boş geçilemez
            javax.swing.JFrame frame = new javax.swing.JFrame("Message");
            javax.swing.JOptionPane.showMessageDialog(frame,"İsim ve Numara Boş Bırakılamaz.","HATALI",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(bu_numara_kayitlimi(ekle_numara_txt.getText()) == true)
            {
                 javax.swing.JFrame frame = new javax.swing.JFrame("Message");
            javax.swing.JOptionPane.showMessageDialog(frame,"Bu numara daha onceden kayıt edilmis.","HATA",javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
            }
            javax.swing.JFrame frame = new javax.swing.JFrame("Message");
            javax.swing.JOptionPane.showMessageDialog(frame,"Başarıyla Eklendi.","BAŞARILI",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Kisiler.add(new Kisi(ekle_isim_txt.getText(),ekle_numara_txt.getText(),ekle_numara2_txt.getText(),ekle_email_txt.getText()));

            dosyaya_yaz();
        }
    }//GEN-LAST:event_ekle_btnActionPerformed
    protected boolean bu_numara_kayitlimi(String numara)
    {
        for (int i = 0; i < Kisiler.size(); i++) {
            if(numara.equals(Kisiler.get(i).numara) == true)
            {
                return true;
            }
        }
        return false;
    }
    private void sil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_btnActionPerformed
                int silinen = 0;
        for (int i = 0; i < Kisiler.size(); i++) {
            if(sil_isimnumara_txt.getText().equals(Kisiler.get(i).isim)== true || sil_isimnumara_txt.getText().equals(Kisiler.get(i).numara)== true || sil_isimnumara_txt.getText().equals(Kisiler.get(i).numara2)== true)
            {
                silinen++;
                Kisiler.removeElementAt(i);
                i = -1;
              
            }
        }
        if(silinen > 0)
        {
             javax.swing.JFrame frame = new javax.swing.JFrame("Message");
            javax.swing.JOptionPane.showMessageDialog(frame,"Başarıyla " + silinen + " Kişi Silindi.","BAŞARILI",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
             javax.swing.JFrame frame = new javax.swing.JFrame("Message");
            javax.swing.JOptionPane.showMessageDialog(frame,"Kişi Bulunamadı.","HATA",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sil_btnActionPerformed

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained

    }//GEN-LAST:event_jPanel2FocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
                 DefaultTableModel model = (DefaultTableModel) rehber_table.getModel();
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {
            model.removeRow(i);
        }
        for (int i = 0; i < Kisiler.size(); i++) {
             
              Vector row = new Vector();
                row.add(Kisiler.get(i).isim);
                row.add(Kisiler.get(i).numara);
                row.add(Kisiler.get(i).numara2);
                row.add(Kisiler.get(i).email);
             model.addRow(row);
        }
    }//GEN-LAST:event_jPanel1ComponentShown

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown
        DefaultTableModel model = (DefaultTableModel) duzenle_table.getModel();
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {
            model.removeRow(i);
        }
        for (int i = 0; i < Kisiler.size(); i++) {
             
              Vector row = new Vector();
                row.add(Kisiler.get(i).isim);
                row.add(Kisiler.get(i).numara);
                row.add(Kisiler.get(i).numara2);
                row.add(Kisiler.get(i).email);
             model.addRow(row);
        }
    }//GEN-LAST:event_jPanel2ComponentShown

    private void duzenle_ara_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duzenle_ara_btnActionPerformed
       DefaultTableModel model = (DefaultTableModel) duzenle_table.getModel();
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {
            model.removeRow(i);
        }
        for (int i = 0; i < Kisiler.size(); i++) {
            if(Kisiler.get(i).isim.indexOf(duzenle_txt.getText()) != -1 || 
               Kisiler.get(i).email.indexOf(duzenle_txt.getText()) != -1 ||
               Kisiler.get(i).numara.indexOf(duzenle_txt.getText()) != -1 ||
               Kisiler.get(i).numara2.indexOf(duzenle_txt.getText()) != -1)
            {
                           Vector row = new Vector();
                row.add(Kisiler.get(i).isim);
                row.add(Kisiler.get(i).numara);
                row.add(Kisiler.get(i).numara2);
                row.add(Kisiler.get(i).email);
             model.addRow(row);   
            }

        }
    }//GEN-LAST:event_duzenle_ara_btnActionPerformed

    private void duzenle_kaydet_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duzenle_kaydet_btnActionPerformed
        boolean kayit = false;
        DefaultTableModel model = (DefaultTableModel) duzenle_table.getModel();
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {
            String num = model.getValueAt(i, 1).toString();
            Kisi temp = kisiyi_bul(num);
            if(temp != null)
            {
                temp.isim = model.getValueAt(i, 0).toString();
                temp.numara2 = model.getValueAt(i, 2).toString();
                temp.email = model.getValueAt(i, 3).toString(); 
                kayit = true;
            }
        }
        if(kayit)
        {
              javax.swing.JFrame frame = new javax.swing.JFrame("Message");
            javax.swing.JOptionPane.showMessageDialog(frame,"Başarılı bir şekilde update edildi.","BAŞARILI",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            dosyaya_yaz();
        }
    }//GEN-LAST:event_duzenle_kaydet_btnActionPerformed
    private Kisi kisiyi_bul(String numara)
    {
       for (int i = 0; i < Kisiler.size(); i++) {
           if(Kisiler.get(i).numara.equals(numara))
               return Kisiler.get(i);
                   
        }
       return null;
    }
    
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
            java.util.logging.Logger.getLogger(Odev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Odev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Odev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Odev2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Odev2().setVisible(true);
            }
        });
    }
    public void dosyaya_yaz()
    {
        try{
            FileWriter writer = new FileWriter("datas.txt",false);

            for (int i = 0; i < Kisiler.size(); i++) {
                writer.write(Kisiler.get(i).isim);
                 writer.write("o_O");
                 writer.write(Kisiler.get(i).numara);
                  writer.write("o_O");
                  writer.write(Kisiler.get(i).numara2);
                   writer.write("o_O");
                   writer.write(Kisiler.get(i).email);
                    writer.write("\r\n");
                    
            }
             writer.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public void dosyadan_oku()
    {
        try
        {
            FileReader reader = new FileReader("Datas.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
            Kisiler.clear();
            while ((line = bufferedReader.readLine()) != null) 
            {
                String[] parts = line.split("o_O");
                Kisiler.add(new Kisi(parts[0], parts[1], parts[2], parts[3]));
            }
            reader.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton duzenle_ara_btn;
    public javax.swing.JButton duzenle_kaydet_btn;
    public javax.swing.JTable duzenle_table;
    public javax.swing.JTextField duzenle_txt;
    private javax.swing.JButton ekle_btn;
    public javax.swing.JTextField ekle_email_txt;
    public javax.swing.JTextField ekle_isim_txt;
    public javax.swing.JTextField ekle_numara2_txt;
    public javax.swing.JTextField ekle_numara_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTable rehber_table;
    private javax.swing.JButton sil_btn;
    public javax.swing.JTextField sil_isimnumara_txt;
    // End of variables declaration//GEN-END:variables
}
