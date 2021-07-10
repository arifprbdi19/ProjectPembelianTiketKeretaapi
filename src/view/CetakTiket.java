package view;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import koneksi.Koneksi;


public class CetakTiket extends JFrame{
    JLabel lJudul = new JLabel("BUKTI CETAK");
    JLabel lNik = new JLabel ("NIK                 :");
    public JLabel tNik = new JLabel("");
    JLabel lNama = new JLabel("Nama             :");
    public JLabel tNama = new JLabel("");
    JLabel lAlamat = new JLabel("Alamat         :");
    public JLabel tAlamat = new JLabel("");
    JLabel lNotlp = new JLabel("NoTlp           :");
    public JLabel tNotlp = new JLabel(" ");
    JLabel lasal = new JLabel("Asal             :");
    public JLabel tasal = new JLabel("");
    JLabel ltujuan = new JLabel("Tujuan         :");
    public JLabel ttujuan = new JLabel("");
    JLabel lkelas = new JLabel("Kelas           :");
    public JLabel tkelas = new JLabel("");
    JLabel ltanggal = new JLabel("Tanggal       :");
    public JLabel ttanggal = new JLabel("");
    JLabel lharga = new JLabel("Harga           :");
    public JLabel tharga = new JLabel("");
    
    public JButton bKembali = new JButton("Kembali");

    Koneksi koneksi = new Koneksi ();
    EditData cetakTiket = new EditData ();
   
    
    public CetakTiket() {
       setTitle("BUKTI CETAK");
        setSize(400,400);
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
       
        lJudul.setBounds(150, 5, 150, 20);
        lNik.setBounds(130, 30, 150, 20);
        tNik.setBounds(210, 30, 150, 20);
        lNama.setBounds(130, 50, 150, 20);
        tNama.setBounds(210, 50, 150, 20);
        lAlamat.setBounds(130, 70, 150, 20);
        tAlamat.setBounds(210, 70, 150, 20);
        lNotlp.setBounds(130, 90, 150, 20);
        tNotlp.setBounds(210, 90, 150, 20);
        lasal.setBounds(130, 120, 150, 20);
        tasal.setBounds(210, 120, 150, 20);
        ltujuan.setBounds(130, 150, 150, 20);
        ttujuan.setBounds(210, 150, 150, 20);
        lkelas.setBounds(130, 180, 150, 20);
        tkelas.setBounds(210, 180, 150, 20);
        ltanggal.setBounds(130, 210, 150, 20);
        ttanggal.setBounds(210, 210, 150, 20);
        lharga.setBounds(130, 240, 150, 20);
        tharga.setBounds(210, 240, 150, 20);
        
        bKembali.setBounds(120, 280, 120, 30);
  
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
}
