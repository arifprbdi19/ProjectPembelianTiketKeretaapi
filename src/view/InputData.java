package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import koneksi.Koneksi;
import control.ControlTiket;


public class InputData extends JFrame{
    
    String kelas;
    
    JLabel Judul = new JLabel(" PEMESANAN TIKET KERETA");
    
    JLabel lnik = new JLabel("NIK");
    JTextField tnik = new JTextField(30);
    JLabel lnama = new JLabel("Nama");
    JTextField tnama = new JTextField(30);
    JLabel lalamat = new JLabel("Alamat");
    JTextField talamat = new JTextField(30);
    JLabel lnotlp = new JLabel("NoTlp");
    JTextField tnotlp = new JTextField(30);
    JTextField fharga = new JTextField(10);
    
    JLabel lasal = new JLabel("DARI");
    String[] namaasal =
            {"-Pilih Asal-", "Yogyakarta"};
    JComboBox cmbasal = new JComboBox(namaasal);
    JLabel ltujuan = new JLabel("TUJUAN");
    String[] namatujuan =
            {"-Pilih Tujuan-", "Jakarta"};
    JComboBox cmbtujuan = new JComboBox(namatujuan);
    
    JLabel lKelas = new JLabel("Kelas");
    JRadioButton rb1 = new JRadioButton("Business ");
    JRadioButton rb2 = new JRadioButton("Economy ");
    
    JLabel Tanggal = new JLabel("Tanggal ");
    String[] tanggal =
            {"-Pilih Tanggal-","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",};
    JComboBox Cbtanggal = new JComboBox(tanggal);
    JLabel Bulan = new JLabel("Bulan ");
    String[] bulan =
            {"-Pilih Bulan-"," Januari "," Februari "," Maret "," April "," Mei "," Juni "," Juli "," Agustus "," September "," Oktober "," November "," Desember ",};
    JComboBox Cbbulan = new JComboBox(bulan);
    JLabel Tahun=new JLabel("Tahun");
    String[] tahun=
            {"-Pilih Tahun-","2020","2021",};
    JComboBox CbTahun=new JComboBox(tahun);
    JLabel harga=new JLabel("Harga");
    JLabel harga1;
    
    public JButton btnBeli = new JButton("Beli");
    public JButton bKembali = new JButton("Kembali");
    
    public InputData(){
        harga1 = new JLabel ("");
        Cbtanggal.getSelectedItem();
        Cbbulan.getSelectedItem();
        CbTahun.getSelectedItem();
        ButtonGroup group=new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        
        setTitle("Pemesanan Tiket Kereta");
        setSize(750,300);
        setVisible(true);
        setLayout(null);
        add(Judul);
        add(lnik);
        add(tnik);
        add(lnama);
        add(tnama);
        add(lalamat);
        add(talamat);
        add(lnotlp);
        add(tnotlp);
	add(harga1);
        add(harga);
        add(Tanggal);
        add(Cbtanggal);
        add(Bulan);
        add(Cbbulan);
        add(Tahun);
        add(CbTahun);
	add(lKelas);
	add(rb1);
	add(rb2);
	add(lasal);
	add(cmbasal);
        add(ltujuan);
	add(cmbtujuan);
	add(btnBeli);
        add(bKembali);
        
        Judul.setFont(new java.awt.Font("Couture", 2, 24));
        Judul.setForeground(Color.orange);
	Judul.setBounds(170,2,420,40);
        lnik.setBounds(20,70,150,20);
        tnik.setBounds(70,70,150,20);
        lnama.setBounds(20,90,150,20);
        tnama.setBounds(70,90,150,20);
        lalamat.setBounds(20,110,150,20);
        talamat.setBounds(70,110,150,20);
        lnotlp.setBounds(20,130,150,20);
        tnotlp.setBounds(70,130,150,20);
        harga.setBounds(310,190,120,20);
	harga1.setBounds(430,190,120,20);
        Cbtanggal.setBounds(310,160,120,20);
        Tanggal.setBounds(310,140,80,20);
        Cbbulan.setBounds(445,160,120,20);
        Bulan.setBounds(445,140,120,20);
        CbTahun.setBounds(580,160,120,20);
        Tahun.setBounds(580,140,120,20);
	fharga.setBounds(580,190,100,20);
	lasal.setBounds(310,70,120,20);
	cmbasal.setBounds(430,70,150,20);
        ltujuan.setBounds(310,90,150,20);
	cmbtujuan.setBounds(430,90,150,20);
	lKelas.setBounds(310,115,120,20);
	rb1.setBounds(430,115,100,20);
	rb2.setBounds(560,115,90,20);
	btnBeli.setBounds(400,220,120,20);
        bKembali.setBounds(10,200,100,50);
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                kelas= rb1.getText();
            }
        });
        rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               kelas= rb2.getText();
            }
        });
        cmbtujuan.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               tampilin();
            }
       });
  
    }
    
    public String getNik(){
        return tnik.getText();
    }
    public String getNama(){
        return tnama.getText();
    }
    public String getAlamat(){
        return talamat.getText();
    }
    public String getNotlp(){
        return tnotlp.getText();
    }
    public String getAsal(){
        return cmbasal.getSelectedItem().toString();
    }
    public String getTujuan(){
        return cmbtujuan.getSelectedItem().toString();
    }
    public String getKelas(){
        return kelas;
    }
    public String getTanggal(){
        return Cbtanggal.getSelectedItem().toString()+Cbbulan.getSelectedItem()+CbTahun.getSelectedItem();
    }
    public String getHarga(){
        return harga1.getText();
    }
    
    public void tampilin(){
      try {
        Koneksi koneksi = new Koneksi();
        String sql = "select harga from perjalanan where tujuan='"+cmbtujuan.getSelectedItem()+"' and asal='"+cmbasal.getSelectedItem()+"'";
        koneksi.statement = koneksi.koneksi.createStatement();
        ResultSet rs = koneksi.statement.executeQuery(sql);
        
        while(rs.next()){
            Object[] ob = new Object[1];
            ob[0]=  rs.getString(1);                     
            harga1.setText((String) ob[0]);
           // fungsi ini bertugas menampung isi dari database 
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}
