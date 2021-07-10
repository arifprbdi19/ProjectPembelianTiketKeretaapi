package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EditData extends JFrame{
    JLabel lJudul = new JLabel("Edit Data");
    JLabel lNik = new JLabel("NIK");
    public JTextField tNik = new JTextField(30);
    JLabel lNama = new JLabel("Nama");
    public JTextField tNama = new JTextField(30);
    JLabel lAlamat = new JLabel("Alamat");
    public JTextField tAlamat = new JTextField(30);
    JLabel lNotlp = new JLabel("NoTlp");
    public JTextField tNotlp = new JTextField(30);
    JLabel lasal = new JLabel("Asal");
    public JTextField tasal = new JTextField(30);
    JLabel ltujuan = new JLabel("Tujuan");
    public JTextField ttujuan = new JTextField(30);
    JLabel lkelas = new JLabel("Kelas");
    public JTextField tkelas = new JTextField(30);
    JLabel ltanggal = new JLabel("Tanggal");
    public JTextField ttanggal = new JTextField(30);
    JLabel lharga = new JLabel("Harga");
    public JTextField tharga = new JTextField(30);
    
    public JButton bKembali = new JButton("Kembali");
    public JButton bHapus = new JButton("Hapus");
    public JButton bEdit = new JButton("Edit");
    public JButton bCetak = new JButton("Cetak");
    
    public EditData(){
        setTitle("Edit Data");
        setSize(300, 250);
        setLayout(null);
        add(lJudul);
        add(lNik);
        add(tNik);
        add(lNama);
        add(tNama);
        add(lAlamat);
        add(tAlamat);
        add(lNotlp);
        add(tNotlp);
        add(lasal);
        add(tasal);
        add(ltujuan);
        add(ttujuan);
        add(lkelas);
        add(tkelas);
        add(ltanggal);
        add(ttanggal);
        add(lharga);
        add(tharga);
        add(bKembali);
        add(bHapus);
        add(bEdit);
        add(bCetak);
        
        lJudul.setBounds(15, 5, 150, 20);
        lNik.setBounds(15, 30, 150, 20);
        tNik.setBounds(70, 30, 150, 20);
        lNama.setBounds(15, 50, 150, 20);
        tNama.setBounds(70, 50, 150, 20);
        lAlamat.setBounds(15, 70, 150, 20);
        tAlamat.setBounds(70, 70, 150, 20);
        lNotlp.setBounds(15, 90, 150, 20);
        tNotlp.setBounds(70, 90, 150, 20);
        
        bEdit.setBounds(15, 120, 100, 20);
        bHapus.setBounds(155, 120, 100, 20);
        bKembali.setBounds(15, 150, 100, 20);
        bCetak.setBounds(155, 150, 100, 20);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
        
    }
    
    public String getNik(){
        return tNik.getText();
    }
    public String getNama(){
        return tNama.getText();
    }
    public String getAlamat(){
        return tAlamat.getText();
    }
    public String getNotlp(){
        return tNotlp.getText();
    }
    public String getAsal(){
        return tasal.getText();
    }
    public String getTujuan(){
        return ttujuan.getText();
    }
    public String getKelas(){
        return tkelas.getText();
    }
    public String getTanggal(){
        return ttanggal.getText();
    }
    public String getHarga(){
        return tharga.getText();
    }
}
