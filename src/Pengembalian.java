import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pengembalian extends javax.swing.JFrame {

    java.sql.Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    String tanggal_rental, tanggal_kembali_rental;
    int lamaa;
    
    public Pengembalian() {
        initComponents();
        Connection DB = new Connection();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        update.setEnabled(false);
        delete.setEnabled(false);
        tanggal.setEnabled(false);
        load_table();
        clear.setEnabled(false);
        this.tanggal_rental = tanggal_rental;
        this.tanggal_kembali_rental = tanggal_kembali_rental;
        this.lamaa = lamaa;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama_penyewa = new javax.swing.JTextField();
        nama_sepeda = new javax.swing.JTextField();
        sepeda = new javax.swing.JTextField();
        perental = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tanggal = new com.toedter.calendar.JDateChooser();
        kode_kembali = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rental = new javax.swing.JTextField();
        tgl_kembali = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lama_rental = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Pengembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Rental", "Kode Pengembalian", "Kode Penyewa", "Kode Sepeda", "Lama Rental", "Total Bayar"
            }
        ));
        jScrollPane1.setViewportView(table);

        save.setBackground(new java.awt.Color(0, 153, 102));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 153, 102));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 153, 102));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 153, 102));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        kembali.setBackground(new java.awt.Color(0, 153, 102));
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("Back");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        jLabel2.setText("Kode Perental");

        jLabel3.setText("Kode Sepeda");

        jLabel4.setText("Nama Sepeda");

        jLabel5.setText("Nama Penyewa");

        sepeda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sepedaKeyReleased(evt);
            }
        });

        perental.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                perentalKeyReleased(evt);
            }
        });

        jLabel10.setText("Harga Total");

        jLabel12.setText("Kode Kembali");

        jLabel13.setText("Jadwal Rental");

        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });

        kode_kembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kode_kembaliKeyReleased(evt);
            }
        });

        jLabel14.setText("Kode Rental");

        rental.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rentalKeyReleased(evt);
            }
        });

        tgl_kembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgl_kembaliPropertyChange(evt);
            }
        });

        jLabel15.setText("Jadwal Kembali");

        jLabel16.setText("Lama Rental");

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selesai" }));

        jLabel17.setText("Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel12)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(223, 223, 223)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(kode_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(rental, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                                .addComponent(jLabel15)))))
                                .addGap(18, 18, 18)
                                .addComponent(tgl_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(perental, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sepeda, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nama_sepeda, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(86, 86, 86)
                                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(147, 147, 147)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(27, 27, 27)
                                                .addComponent(lama_rental))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(55, 55, 55)
                                                .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nama_penyewa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142)
                                        .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(44, 44, 44)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembali, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(perental, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sepeda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16)
                    .addComponent(lama_rental, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_sepeda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(save)
                                .addGap(21, 21, 21)
                                .addComponent(update))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(delete)
                                .addGap(18, 18, 18)
                                .addComponent(kembali)))
                        .addGap(18, 18, 18)
                        .addComponent(clear))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tgl_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nama_penyewa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(rental, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(kode_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jMenu1.setText("Menu Utama");

        jMenuItem1.setText("Menu Utama");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        jMenuItem2.setText("Rental Sepeda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Pengembalian");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Data Sepeda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Data Penyewa");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Keluar");

        jMenuItem6.setText("Keluar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitung_lama(){
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date tanggalrental = format.parse(tanggal_rental);
            Date tanggalkembali = format.parse(tanggal_kembali_rental);
            int tanggalpinjam = (int) tanggalrental.getTime();
            int tanggalkembali1 = (int) tanggalkembali.getTime();
            int diff = tanggalkembali1 - tanggalpinjam;
            lamaa = diff / (24 * 60 * 60 * 1000);
            lama_rental.setText(String.valueOf(lamaa));
            rs=stat.executeQuery("SELECT `harga_rental` FROM `tb_sepeda` WHERE id_sepeda LIKE '%"+sepeda.getText()+"%'");
                if(rs.next()){
                    int hargas = Integer.parseInt(rs.getString("harga_rental"));
                    int harga_tot = hargas*lamaa;
                    harga.setText(String.valueOf(harga_tot));
                }
            
        } catch (ParseException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            hitung_lama();
            JOptionPane.showMessageDialog(null, "Lama Pinjaman: "+lamaa);
            String qsl = "INSERT INTO `tb_pengembalian`(`id_pengembalian`, `id_rental`, `id_penyewa`, `id_sepeda`, `tgl_rental`, `tgl_kembali`, `lama`, `total_bayar`, `Status`) VALUES('"+kode_kembali.getText()+"','"+rental.getText()+"','"+perental.getText()+"','"+sepeda.getText()+"','"+tanggal_rental+"','"+tanggal_kembali_rental+"','"+lamaa+"','"+harga.getText()+"','"+status.getSelectedItem()+"')";
            java.sql.PreparedStatement spt=con.prepareStatement(qsl);
            spt.execute();
            JOptionPane.showMessageDialog(null, "Peminjaman Berhasil");
            load_table();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_saveActionPerformed

    private void sepedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sepedaKeyReleased
        String kode_sepeda = sepeda.getText();
        int banyak = evt.getKeyCode();
        if (banyak==10){
            try{
                //            save.setEnabled(false);
                clear.setEnabled(true);
                update.setEnabled(true);
                delete.setEnabled(true);
                rs=stat.executeQuery("SELECT `id_sepeda`, `nama_sepeda`, `merk_sepeda`, `bm_sepeda`, `harga_rental`, `Status` FROM `tb_sepeda` WHERE id_sepeda LIKE '%"+sepeda.getText()+"%'");
                if(rs.next()){
                    sepeda.setText(rs.getString("id_sepeda"));
                    nama_sepeda.setText(rs.getString("nama_sepeda"));
                    harga.setText(rs.getString("harga_rental"));
                }else{
                    JOptionPane.showMessageDialog(null, "Data Tidak Tersedia!");
                    cancel();
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_sepedaKeyReleased

    public void load_table(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Rental");
        model.addColumn("Kode Pengembalian");
        model.addColumn("Kode Penyewa");
        model.addColumn("Kode Sepeda");
        model.addColumn("Lama Rental");
        model.addColumn("Harga");
        
       try {
        String sql = "SELECT `id_rental`,`id_pengembalian`,  `id_penyewa`, `id_sepeda`, `lama`, `total_bayar` FROM `tb_pengembalian`";
        rs = stat.executeQuery(sql);
        while(rs.next()){
            model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
        }
        table.setModel(model);
        } catch (SQLException ex) {
        Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cancel(){
        sepeda.setText("");
        nama_sepeda.setText("");
        harga.setText("");
        kode_kembali.setText("");
        rental.setText("");
        perental.setText("");
        sepeda.setText("");
        nama_sepeda.setText("");
        nama_penyewa.setText("");
        harga.setText("");
        lama_rental.setText("");
    }
    private void perentalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perentalKeyReleased
        String kode_perental = perental.getText();
        int banyak = evt.getKeyCode();
        if (banyak==10){
            try{
                clear.setEnabled(true);
                update.setEnabled(true);
                delete.setEnabled(true);
                rs=stat.executeQuery("SELECT `id_penyewa`, `nama_penyewa`, `alamat`, `no_hp`, `no_kto`, `Status` FROM `tb_penyewa` WHERE `id_penyewa` LIKE '%"+perental.getText()+"%'");
                if(rs.next()){
                    perental.setText(rs.getString("id_penyewa"));
                    nama_penyewa.setText(rs.getString("nama_penyewa"));
                }else{
                    JOptionPane.showMessageDialog(null, "Data Tidak Tersedia!");
                    cancel();
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_perentalKeyReleased

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
        if(tanggal.getDate()!=null){
                
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            tanggal_rental = date.format(tanggal.getDate());
           
        }
    }//GEN-LAST:event_tanggalPropertyChange

    private void tgl_kembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgl_kembaliPropertyChange
        if(tgl_kembali.getDate()!=null){
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            tanggal_kembali_rental = date.format(tgl_kembali.getDate());
            hitung_lama();
        }
    }//GEN-LAST:event_tgl_kembaliPropertyChange

    private void rentalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rentalKeyReleased
        int banyak = evt.getKeyCode();
        if (banyak==10){
            try{
                clear.setEnabled(true);
                update.setEnabled(true);
                delete.setEnabled(true);
                rs=stat.executeQuery("SELECT `id_rental`, `id_penyewa`, `id_sepeda`, `nama_penyewa`, `nama_sepeda`, `harga_rental`, `tgl_rental`, `Status` FROM tb_rental WHERE `id_rental` LIKE '%"+rental.getText()+"%'");
                if(rs.next()){
                    rental.setText(rs.getString("id_rental"));
                    perental.setText(rs.getString("id_penyewa"));
                    sepeda.setText(rs.getString("id_sepeda"));
                    nama_sepeda.setText(rs.getString("nama_sepeda"));
                    nama_penyewa.setText(rs.getString("nama_penyewa"));
                    harga.setText(rs.getString("harga_rental"));
                    
                    tanggal.setDate(java.sql.Date.valueOf(rs.getString("tgl_rental")));
                }else{
                    JOptionPane.showMessageDialog(null, "Data Tidak Tersedia!");
                    cancel();
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_rentalKeyReleased

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            sql = "UPDATE `tb_pengembalian` SET `id_rental`='"+rental.getText()+"',`id_penyewa`='"+perental.getText()+"',`id_sepeda`='"+sepeda.getText()+"',`tgl_rental`='"+tanggal_rental+"',`tgl_kembali`='"+tanggal_kembali_rental+"',`lama`='"+lama_rental.getText()+"',`total_bayar`='"+harga.getText()+"',`Status`='"+status.getSelectedItem()+"' WHERE id_pengembalian = '"+kode_kembali.getText()+"'";
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Mengupdate Data Pengembalian!");
            cancel();
            load_table();
        } catch (SQLException ex) {
            Logger.getLogger(Sepeda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            sql = "DELETE FROM `tb_pengembalian` WHERE id_pengembalian = '"+kode_kembali.getText()+"'";
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus Data Pengembalian!");
            cancel();
            load_table();
        } catch (SQLException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void kode_kembaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kode_kembaliKeyReleased
        int banyak = evt.getKeyCode();
        if (banyak==10){
            try{
                clear.setEnabled(true);
                update.setEnabled(true);
                delete.setEnabled(true);
                rs=stat.executeQuery("SELECT `id_pengembalian`, nama_sepeda, nama_penyewa, `id_rental`, tb_pengembalian.`id_penyewa`, tb_pengembalian.`id_sepeda`, tb_pengembalian.`tgl_rental`, `tgl_kembali`, `lama`, `total_bayar`, tb_pengembalian.`Status` FROM `tb_pengembalian` JOIN tb_penyewa ON tb_penyewa.id_penyewa=tb_pengembalian.id_penyewa JOIN tb_sepeda ON tb_sepeda.id_sepeda=tb_pengembalian.id_sepeda WHERE `id_pengembalian` LIKE '%"+kode_kembali.getText()+"%'");
                if(rs.next()){
                    rental.setText(rs.getString("id_rental"));
                    perental.setText(rs.getString("id_penyewa"));
                    sepeda.setText(rs.getString("id_sepeda"));
                    nama_sepeda.setText(rs.getString("nama_sepeda"));
                    nama_penyewa.setText(rs.getString("nama_penyewa"));
                    harga.setText(rs.getString("total_bayar"));
                    lama_rental.setText(rs.getString("lama"));
                    kode_kembali.setText(rs.getString("id_pengembalian"));
                    tgl_kembali.setDate(java.sql.Date.valueOf(rs.getString("tgl_kembali")));
                    tanggal.setDate(java.sql.Date.valueOf(rs.getString("tgl_rental")));
                }else{
                    JOptionPane.showMessageDialog(null, "Data Tidak Tersedia!");
                    cancel();
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_kode_kembaliKeyReleased

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        new Rental().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        new Sepeda().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
        new Penyewa().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Menu().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        cancel();
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField kode_kembali;
    private javax.swing.JTextField lama_rental;
    private javax.swing.JTextField nama_penyewa;
    private javax.swing.JTextField nama_sepeda;
    private javax.swing.JTextField perental;
    private javax.swing.JTextField rental;
    private javax.swing.JButton save;
    private javax.swing.JTextField sepeda;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable table;
    private com.toedter.calendar.JDateChooser tanggal;
    private com.toedter.calendar.JDateChooser tgl_kembali;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
