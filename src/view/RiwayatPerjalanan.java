package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


public class RiwayatPerjalanan extends JFrame{
    JFrame frame = new JFrame("JDBC");
    public JTable tabel;
    DefaultTableModel model;
    JScrollPane scrollPane;
    public Object kolom[] = {"NIK", "Nama", "Alamat", "NoTelfon", "asal", "tujuan", "kelas", "tanggal", "Harga"};
    public JButton bKembali = new JButton("Kembali");
    
    public RiwayatPerjalanan(){
        model = new DefaultTableModel(kolom, 0);
        tabel = new JTable(model);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Riwayat Perjalanan");
        setSize(500, 300);
        setVisible(true);
        setLayout(null);
        add(scrollPane);
        add(bKembali);
        
        scrollPane.setBounds(40, 35, 400, 100);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        bKembali.setBounds(40, 150, 100, 30);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
}
