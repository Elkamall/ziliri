/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ziliriproject;

import java.util.logging.Level;

/**
 *
 * @author user
 */
public class opsibelice2 extends javax.swing.JFrame {
    totalbelanja Totalbelanja;
    int count4ce = 0;
    int count5ce = 0;
    int count6ce = 0;
    int harga4ce;
    int harga5ce;
    int harga6ce;
    String nama4ce;
    String nama5ce;
    String nama6ce;
    

    /**
     * Creates new form opsibelice2
     */
    public opsibelice2() {
        initComponents();
        Totalbelanja = new totalbelanja();
    }
    public opsibelice2 (totalbelanja Totalbelanja) {
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        plus4 = new javax.swing.JButton();
        plus5 = new javax.swing.JButton();
        plus6 = new javax.swing.JButton();
        min5 = new javax.swing.JButton();
        min4 = new javax.swing.JButton();
        min6 = new javax.swing.JButton();
        hasil4 = new javax.swing.JLabel();
        hasil5 = new javax.swing.JLabel();
        hasil6 = new javax.swing.JLabel();
        balik3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        keranjang1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        keranjang2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        keranjang3 = new javax.swing.JButton();
        kekeranjang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(196, 79, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ziliriproject/bonekace.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ziliriproject/snackce.jpg"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ziliriproject/bungace.jpg"))); // NOI18N
        jLabel5.setText("jLabel3");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));

        plus4.setBackground(new java.awt.Color(255, 204, 255));
        plus4.setForeground(new java.awt.Color(196, 79, 130));
        plus4.setText("+");
        plus4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus4ActionPerformed(evt);
            }
        });

        plus5.setBackground(new java.awt.Color(255, 204, 255));
        plus5.setForeground(new java.awt.Color(196, 79, 130));
        plus5.setText("+");
        plus5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus5ActionPerformed(evt);
            }
        });

        plus6.setBackground(new java.awt.Color(255, 204, 255));
        plus6.setForeground(new java.awt.Color(196, 79, 130));
        plus6.setText("+");
        plus6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus6ActionPerformed(evt);
            }
        });

        min5.setBackground(new java.awt.Color(255, 204, 255));
        min5.setForeground(new java.awt.Color(196, 79, 130));
        min5.setText("-");
        min5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min5ActionPerformed(evt);
            }
        });

        min4.setBackground(new java.awt.Color(255, 204, 255));
        min4.setForeground(new java.awt.Color(196, 79, 130));
        min4.setText("-");
        min4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min4ActionPerformed(evt);
            }
        });

        min6.setBackground(new java.awt.Color(255, 204, 255));
        min6.setForeground(new java.awt.Color(196, 79, 130));
        min6.setText("-");
        min6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min6ActionPerformed(evt);
            }
        });

        hasil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasil4.setText("0");

        hasil5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasil5.setText("0");

        hasil6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasil6.setText("0");

        balik3.setBackground(new java.awt.Color(255, 204, 255));
        balik3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        balik3.setForeground(new java.awt.Color(196, 79, 130));
        balik3.setText(" back");
        balik3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        balik3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balik3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("Bouquet Snack - 50k");

        keranjang1.setBackground(new java.awt.Color(255, 204, 255));
        keranjang1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        keranjang1.setForeground(new java.awt.Color(196, 79, 130));
        keranjang1.setText("Tambah ke keranjang");
        keranjang1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keranjang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keranjang1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 204, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("Bouquet Bunga - 100k");

        keranjang2.setBackground(new java.awt.Color(255, 204, 255));
        keranjang2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        keranjang2.setForeground(new java.awt.Color(196, 79, 130));
        keranjang2.setText("Tambah ke keranjang");
        keranjang2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keranjang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keranjang2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jLabel7.setText("Bouquet Boneka - 70k");

        keranjang3.setBackground(new java.awt.Color(255, 204, 255));
        keranjang3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        keranjang3.setForeground(new java.awt.Color(196, 79, 130));
        keranjang3.setText("Tambah ke keranjang");
        keranjang3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keranjang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keranjang3ActionPerformed(evt);
            }
        });

        kekeranjang.setBackground(new java.awt.Color(255, 204, 255));
        kekeranjang.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        kekeranjang.setForeground(new java.awt.Color(196, 79, 130));
        kekeranjang.setText("Lihat Keranjang");
        kekeranjang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kekeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kekeranjangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(plus5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(plus4)
                                .addComponent(min4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(min5)
                                    .addComponent(hasil5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(min6)
                                            .addComponent(plus6)
                                            .addComponent(hasil6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hasil4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                        .addComponent(kekeranjang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(balik3)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(keranjang2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(keranjang1)
                            .addComponent(keranjang3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(plus4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hasil4)
                                .addGap(10, 10, 10))
                            .addComponent(keranjang2))
                        .addGap(16, 16, 16)
                        .addComponent(min4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plus5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasil5)
                                .addGap(18, 18, 18)
                                .addComponent(min5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(keranjang3)
                                .addGap(14, 14, 14)))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(plus6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hasil6)
                            .addComponent(keranjang1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(min6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kekeranjang)
                    .addComponent(balik3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus4ActionPerformed
        // TODO add your handling code here:
        count4ce++;
        hasil4.setText(count4ce + "");
    }//GEN-LAST:event_plus4ActionPerformed

    private void plus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus5ActionPerformed
        // TODO add your handling code here:
        count5ce++;
        hasil5.setText(count5ce + "");
    }//GEN-LAST:event_plus5ActionPerformed

    private void plus6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus6ActionPerformed
        // TODO add your handling code here:
        count6ce++;
        hasil6.setText(count6ce + "");
    }//GEN-LAST:event_plus6ActionPerformed

    private void min5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min5ActionPerformed
        // TODO add your handling code here:
        count5ce--;
        hasil5.setText(count5ce + "");
    }//GEN-LAST:event_min5ActionPerformed

    private void min4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min4ActionPerformed
        // TODO add your handling code here:
        count4ce--;
        hasil4.setText(count4ce + "");
    }//GEN-LAST:event_min4ActionPerformed

    private void min6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min6ActionPerformed
        // TODO add your handling code here:
        count6ce--;
        hasil6.setText(count6ce + "");
    }//GEN-LAST:event_min6ActionPerformed

    private void balik3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balik3ActionPerformed
        // TODO add your handling code here:
        opsice oce = new opsice();
        oce.setLocationRelativeTo(null);
        oce.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_balik3ActionPerformed

    private void keranjang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keranjang1ActionPerformed
        // TODO add your handling code here:
        nama4ce = "Bouquet Snack (wanita)";
        harga4ce = count4ce * 50000;
        if(count4ce != 0){
            Totalbelanja.nama.add(nama4ce);
            Totalbelanja.total.add(harga4ce);
        }
    }//GEN-LAST:event_keranjang1ActionPerformed

    private void keranjang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keranjang2ActionPerformed
        // TODO add your handling code here:
        nama5ce = "Bouquet Boneka (wanita)";
        harga5ce = count5ce * 70000;
        if(count5ce != 0){
            Totalbelanja.nama.add(nama5ce);
            Totalbelanja.total.add(harga5ce);
        }
    }//GEN-LAST:event_keranjang2ActionPerformed

    private void keranjang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keranjang3ActionPerformed
        // TODO add your handling code here:
        nama6ce = "Bouquet Bunga (wanita)";
        harga6ce = count6ce * 100000;
        if(count6ce != 0){
            Totalbelanja.nama.add(nama6ce);
            Totalbelanja.total.add(harga6ce);
        }
    }//GEN-LAST:event_keranjang3ActionPerformed

    private void kekeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kekeranjangActionPerformed
        // TODO add your handling code here:
        totalbelanja tb = new totalbelanja();
        tb.setLocationRelativeTo(null);
        tb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kekeranjangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                opsibelice2 obce2 = new opsibelice2();
                obce2.setLocationRelativeTo(null);
                obce2.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balik3;
    private javax.swing.JLabel hasil4;
    private javax.swing.JLabel hasil5;
    private javax.swing.JLabel hasil6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kekeranjang;
    private javax.swing.JButton keranjang1;
    private javax.swing.JButton keranjang2;
    private javax.swing.JButton keranjang3;
    private javax.swing.JButton min4;
    private javax.swing.JButton min5;
    private javax.swing.JButton min6;
    private javax.swing.JButton plus4;
    private javax.swing.JButton plus5;
    private javax.swing.JButton plus6;
    // End of variables declaration//GEN-END:variables
}
