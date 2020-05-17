/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerBerasan;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class pesanan extends javax.swing.JFrame {
    private void kosongkan(){
        TxtJumlah.setText(null);
        TxtBeras.setText(null);
        TxtPembeli.setText(null);
        TxtAlamat.setText(null);
    }
    
    private void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Kode pesanan");
        model.addColumn("Jumlah Pembelian");        
        model.addColumn("Tanggal Transaksi");
        model.addColumn("Kode Beras");
        model.addColumn("ID Pembeli");
        model.addColumn("Alamat");
        model.addColumn("Status Bayar");
        
        try{
            int no = 1,kode=100;
            String sql = "SELECT * FROM pesanan";
            java.sql.Connection conn = (Connection)tokoberas.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
            }
            TabelPesanan.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Error!"+e.getMessage());
        }
    }
    /**
     * Creates new form pesanan
     */
    public pesanan() {
        initComponents();
        tampilkan_data();
        kosongkan();
        
        //mengatur agar jendela di tengah
        //mendapat ukuran dari layar
        Dimension Layar =Toolkit.getDefaultToolkit().getScreenSize();
        
        //mengatur titik x dan titik y
        int x= Layar.width/2 - this.getSize().width/2;
        int y= Layar.height/2 - this.getSize().height/2;
        
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtJumlah = new javax.swing.JTextField();
        TxtAlamat = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelPesanan = new javax.swing.JTable();
        TbTambah = new javax.swing.JButton();
        TbSimpan = new javax.swing.JButton();
        TbHapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TxtPembeli = new javax.swing.JTextField();
        TxtBeras = new javax.swing.JTextField();
        txtHargaaa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TbBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tbStat = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesanan");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tabel Pesanan");

        jLabel3.setText("Jumlah beli (dalam karung)");

        jLabel4.setText("Alamat Pengiriman");

        jLabel5.setText("Kode Beras");

        TxtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtJumlahActionPerformed(evt);
            }
        });

        TxtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAlamatActionPerformed(evt);
            }
        });

        TabelPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPesananMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelPesanan);

        TbTambah.setText("Tambah");
        TbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbTambahActionPerformed(evt);
            }
        });

        TbSimpan.setText("Simpan");
        TbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbSimpanActionPerformed(evt);
            }
        });

        TbHapus.setText("Hapus");
        TbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbHapusActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Pembeli");

        TxtBeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBerasActionPerformed(evt);
            }
        });

        txtHargaaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaaaActionPerformed(evt);
            }
        });

        jLabel6.setText("Status Pembayaran");

        jLabel8.setText("Harga per karung");

        TbBack.setText("Back");
        TbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1)
                        .addGap(0, 308, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHargaaa, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(TxtPembeli)
                    .addComponent(TxtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(TxtBeras, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(TxtJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(tbStat))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TbTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TbSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TbHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TbBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TbTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TbSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TbHapus)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtBeras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TbBack)
                    .addComponent(TxtPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tbStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(txtHargaaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAlamatActionPerformed

    private void TxtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtJumlahActionPerformed

    private void TbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbTambahActionPerformed
        // TODO add your handling code here:
        kosongkan();
    }//GEN-LAST:event_TbTambahActionPerformed

    private void TbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String hargaperKarung = txtHargaaa.getText();
            String jumlah = TxtJumlah.getText();
             int intHarga = Integer.parseInt(hargaperKarung);
            String sql = "INSERT INTO pesanan (jumlah_pembelian, tgl_transaksi, kode_beras, id_pembeli, alamat_kirim, Status_pembayaran) VALUES('"+TxtJumlah.getText()+"',NOW(),'"+TxtBeras.getText()+"','"+TxtPembeli.getText()+"','"+TxtAlamat.getText()+"','"+tbStat.getText()+"')"; 
            String sql2 = "UPDATE gudang SET stok=stok - "+TxtJumlah.getText()+" WHERE kode_beras='"+TxtBeras.getText()+"'";
            java.sql.Connection conn =  (Connection)tokoberas.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            java.sql.PreparedStatement psvm = conn.prepareStatement(sql2);
            pstm.execute();
            psvm.execute();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            tampilkan_data();
            kosongkan();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_TbSimpanActionPerformed

    private void TabelPesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPesananMouseClicked
        // TODO add your handling code here:
        int baris = TabelPesanan.rowAtPoint (evt.getPoint());
              
        String Jumlah = TabelPesanan.getValueAt(baris, 2).toString();
        TxtJumlah.setText(Jumlah);
        
        String Beras = TabelPesanan.getValueAt(baris, 4).toString();
        TxtBeras.setText(Beras);
        
        String Pembeli = TabelPesanan.getValueAt(baris, 5).toString();
        TxtPembeli.setText(Pembeli);
        
        String Alamat = TabelPesanan.getValueAt(baris, 6).toString();
        TxtAlamat.setText(Alamat);
        
    }//GEN-LAST:event_TabelPesananMouseClicked

    private void TbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM pesanan";
            java.sql.Connection conn =  (Connection)tokoberas.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan();
    }//GEN-LAST:event_TbHapusActionPerformed

    private void TxtBerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBerasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBerasActionPerformed

    private void txtHargaaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaaaActionPerformed

    private void TbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbBackActionPerformed
        // kembali ke menu
        this.setVisible(false);
        new BERAS().setVisible(true);
    }//GEN-LAST:event_TbBackActionPerformed

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
            java.util.logging.Logger.getLogger(pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelPesanan;
    private javax.swing.JButton TbBack;
    private javax.swing.JButton TbHapus;
    private javax.swing.JButton TbSimpan;
    private javax.swing.JButton TbTambah;
    private javax.swing.JTextField TxtAlamat;
    private javax.swing.JTextField TxtBeras;
    private javax.swing.JTextField TxtJumlah;
    private javax.swing.JTextField TxtPembeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tbStat;
    private javax.swing.JTextField txtHargaaa;
    // End of variables declaration//GEN-END:variables
}
