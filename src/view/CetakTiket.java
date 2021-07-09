/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import koneksi.Koneksi;
/**
 *
 * @author lenovo
 */
public class CetakTiket extends JFrame{
//   JLabel kelas;
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
   
  String DBurl = "jdbc:mysql://localhost/kereta";
  String DBusername = "root";
  String DBpassword = "";  
  Connection koneksi;
  Statement statement;
  ResultSet rs;
  String sql;
  //String ID;
 
   public CetakTiket() {
	setTitle("Pembelian Tiket Pesawat");
	setDefaultCloseOperation(3);
        
        lNik = new JLabel ("");
        lNama = new JLabel ("");
        lAlamat = new JLabel ("");
        lNotlp = new JLabel ("");
        lasal = new JLabel ("");
        ltujuan = new JLabel ("");
        lkelas = new JLabel ("");
        ltanggal = new JLabel ("");
        lharga = new JLabel ("");
	setSize(750,300);            
        
	setLayout(null);
        add(lNik);
        add(lNama);
        add(lAlamat);
	add(lNama);
	add(lNotlp);
        add(lasal);
	add(ltujuan);
        add(lkelas);
	add(lharga);
        add(ltanggal);

        ltujuan.setFont(new java.awt.Font("Couture", Font.ITALIC, 12));
        lasal.setFont(new java.awt.Font("Couture", Font.ITALIC, 12));

        ltujuan.setForeground(Color.orange);
        lasal.setForeground(Color.orange);

        lNik.setBounds(310,50,100,20);
        lNik.setBounds(380,50,200,20);
        lNama.setBounds(310,70,100,20);
        lNama.setBounds(380,70,200,20);
        lAlamat.setBounds(310,90,100,20);
        lAlamat.setBounds(380,90,200,20);
        lNotlp.setBounds(310,110,100,20);
        lNotlp.setBounds(380,130,200,20);
        
        ltanggal.setBounds(70,190,100,20);
	ltanggal.setBounds(70,210,100,20);
        lharga.setBounds(580,190,100,20);
        lharga.setBounds(580,210,100,20);
	ltujuan.setBounds(510,210,100,20);
        lasal.setBounds(140,55,100,20);
	lasal.setBounds(140,70,100,20);
        ltujuan.setBounds(140,130,100,20);

   }
}
