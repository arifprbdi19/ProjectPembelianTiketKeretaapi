package model;

import koneksi.Koneksi;
import view.InputData;


public interface ITiket {   
    public String[][] readPenumpang();
    public int getBanyakData();
    public void insert(String nik, String nama, String alamat, String notelp, String asal, String tujuan, String kelas, String tanggal, String harga);
    public void edit(String nik, String nama, String alamat, String notelp, String asal, String tujuan, String kelas, String tanggal, String harga);
    public void hapus(String nik);
    public void cetak(String nik, String nama, String alamat, String notelp, String asal, String tujuan, String kelas, String tanggal, String harga);
}
