package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import koneksi.Koneksi;
import model.ITiket;
import model.ModelTiket;
import view.EditData;
import view.InputData;
import view.Menu;
import view.RiwayatPerjalanan;
import view.CetakTiket;


public class ControlTiket {
    ModelTiket model;
    EditData edit;
    InputData input;
    RiwayatPerjalanan rp;
    ITiket iTiket;
    CetakTiket cetak;
    
    public ControlTiket(ModelTiket modell, EditData editt, InputData inputt, RiwayatPerjalanan rpe){
        this.model = modell;
        this.edit = editt;
        this.input = inputt;
        this.rp = rpe;
        iTiket = new ModelTiket();
        
        if (model.getBanyakData() != 0) {
            String dataPenumpang[][] = model.readPenumpang();
            rp.tabel.setModel((new JTable(dataPenumpang, rp.kolom)).getModel());

        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        input.btnBeli.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nik = input.getNik();
                String nama = input.getNama();
                String alamat = input.getAlamat();
                String notlp = input.getNotlp();
                String asal = input.getAsal();
                String tujuan = input.getTujuan();
                String kelas = input.getKelas();
                String tanggal = input.getTanggal();
                String harga = input.getHarga();
                
                model.insert(nik, nama, alamat, notlp, asal, tujuan, kelas, tanggal, harga);
                String dataPenumpang[][] = model.readPenumpang();
                rp.tabel.setModel((new JTable(dataPenumpang, rp.kolom)).getModel());
            }
        });
        
        input.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                input.dispose();
                Menu menu = new Menu();
            }
        });
        
        rp.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                rp.dispose();
                Menu menu = new Menu();
            }
        });
        
        rp.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                super.mousePressed(me);
                int baris = rp.tabel.getSelectedRow();
                
                String nik = rp.tabel.getValueAt(baris, 0).toString();
                String nama = rp.tabel.getValueAt(baris, 1).toString();
                String alamat = rp.tabel.getValueAt(baris, 2).toString();
                String notlp = rp.tabel.getValueAt(baris, 3).toString();
                String asal = rp.tabel.getValueAt(baris, 4).toString();
                String tujuan = rp.tabel.getValueAt(baris, 5).toString();
                String kelas = rp.tabel.getValueAt(baris, 6).toString();
                String tanggal = rp.tabel.getValueAt(baris, 7).toString();
                String harga = rp.tabel.getValueAt(baris, 8).toString();
                
                rp.dispose();
                EditData ed = new EditData();
                ed.tNik.setText(nik);
                ed.tNama.setText(nama);
                ed.tAlamat.setText(alamat);
                ed.tNotlp.setText(notlp);
                ed.tasal.setText(asal);
                ed.ttujuan.setText(tujuan);
                ed.tkelas.setText(kelas);
                ed.ttanggal.setText(tanggal);
                ed.tharga.setText(harga);
                RiwayatPerjalanan rp = new RiwayatPerjalanan();
                rp.dispose();
                ModelTiket mt = new ModelTiket();
                InputData id = new InputData();
                id.dispose();
                ControlTiket ct = new ControlTiket(mt, ed, id, rp);
            }
        });
        
        edit.bEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nik = edit.getNik();
                String nama = edit.getNama();
                String alamat = edit.getAlamat();
                String notlp = edit.getNotlp();
                String asal = edit.getAsal();
                String tujuan = edit.getTujuan();
                String kelas = edit.getKelas();
                String tanggal = edit.getTanggal();
                String harga = edit.getHarga();
                model.edit(nik, nama, alamat, notlp, asal, tujuan, kelas, tanggal, harga);
                edit.dispose();
            }
        });
        
        edit.bCetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             
             CetakTiket cetak = new CetakTiket();
            }
        });
        
        edit.bHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nik = edit.getNik();
                model.hapus(nik);
                edit.dispose();
            }
        });
        
        edit.bCetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nik = edit.getNik();
                String nama = edit.getNama();
                String alamat = edit.getAlamat();
                String notlp = edit.getNotlp();
                String asal = edit.getAsal();
                String tujuan = edit.getTujuan();
                String kelas = edit.getKelas();
                String tanggal = edit.getTanggal();
                String harga = edit.getHarga();
                edit.dispose();
                CetakTiket cti = new CetakTiket();
                
                cti.tNik.setText(nik);
                cti.tNama.setText(nama);
                cti.tAlamat.setText(alamat);
                cti.tNotlp.setText(notlp);
                cti.tasal.setText(asal);
                cti.ttujuan.setText(tujuan);
                cti.tkelas.setText(kelas);
                cti.ttanggal.setText(tanggal);
                cti.tharga.setText(harga);

                RiwayatPerjalanan rp = new RiwayatPerjalanan();
                rp.dispose();
                ModelTiket mt = new ModelTiket();
                InputData id = new InputData();
                id.dispose();
                EditData ed = new EditData();
                ed.dispose();
                ControlTiket ct = new ControlTiket(mt, ed, id, rp);
                
            }
        });
    }
}
