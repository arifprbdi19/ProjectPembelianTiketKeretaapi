/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import control.ControlTiket;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import koneksi.Koneksi;
import view.InputData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import view.EditData;
import view.RiwayatPerjalanan;

/**
 *
 * @author Eka Pryhananto
 */
public class ModelTiket implements ITiket{
    
    Koneksi koneksi = new Koneksi();
    
    @Override
    public String[][] readPenumpang() {
        try{
            int jumlah = 0;
            
            String data[][] = new String[getBanyakData()][9]; 
            
            String query = "SELECT * FROM penumpang"; 
            ResultSet resultSet = koneksi.statement.executeQuery(query);
            while (resultSet.next()){
                data[jumlah][0] = resultSet.getString("NIK"); 
                data[jumlah][1] = resultSet.getString("Nama");                
                data[jumlah][2] = resultSet.getString("Alamat");
                data[jumlah][3] = resultSet.getString("Telfon");
                data[jumlah][4] = resultSet.getString("asal");
                data[jumlah][5] = resultSet.getString("tujuan");
                data[jumlah][6] = resultSet.getString("kelas");
                data[jumlah][7] = resultSet.getString("tanggal");
                data[jumlah][8] = resultSet.getString("harga");
                jumlah++;
                
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    @Override
    public int getBanyakData() {
        int jmlData = 0;
        try{
            koneksi.statement = koneksi.koneksi.createStatement();
            String query = "SELECT * FROM penumpang";
            ResultSet resultSet = koneksi.statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    @Override
    public void insert(String nik, String nama, String alamat, String notelp, String asal, String tujuan, String kelas, String tanggal, String harga) {
        try {
            String sql = "INSERT INTO penumpang VALUES('"+nik+"','"+nama+"','"+alamat+"','"+notelp+"','"+asal+"','"+tujuan+"','"+kelas+"','"+tanggal+"','"+harga+"')";
            koneksi.statement =(Statement) koneksi.koneksi.createStatement();
            koneksi.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void edit(String nik, String nama, String alamat, String notelp, String asal, String tujuan, String kelas, String tanggal, String harga) {
        try {
            String sql = "UPDATE penumpang SET NIK='"+nik+"', Nama='"+nama+"', Alamat='"+alamat+"', Telfon='"+notelp+"', asal='"+asal+"', tujuan='"+tujuan+"', kelas='"+kelas+"', tanggal='"+tanggal+"', harga='"+harga+"' WHERE Nik='"+nik+"';";
            koneksi.statement = koneksi.koneksi.createStatement();
            koneksi.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
            RiwayatPerjalanan rp = new RiwayatPerjalanan();
            ModelTiket mt = new ModelTiket();
            EditData ed = new EditData();
            ed.dispose();
            InputData id = new InputData();
            id.dispose();
            ControlTiket ct = new ControlTiket(mt, ed, id, rp);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    @Override
    public void hapus(String nik) {
        try {
            String sql = "DELETE FROM penumpang WHERE NIK = '"+nik+"'";
            koneksi.statement = koneksi.koneksi.createStatement();
            koneksi.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
            RiwayatPerjalanan rp = new RiwayatPerjalanan();
            ModelTiket mt = new ModelTiket();
            EditData ed = new EditData();
            ed.dispose();
            InputData id = new InputData();
            id.dispose();
            ControlTiket ct = new ControlTiket(mt, ed, id, rp);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }   
    
    @Override
    public void cetak(String nik, String nama, String alamat, String notelp, String asal, String tujuan, String kelas, String tanggal, String harga) {
        try {
            String sql = "SELECT * FROM penumpang WHERE NIK = '"+nik+"'";
            koneksi.statement =(Statement) koneksi.koneksi.createStatement();
            koneksi.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil dicetak");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }   
}
