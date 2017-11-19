package vn.fpt.edu.assht.Project.program_view;
import Connect.Connect;
/*
 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import com.toedter.calendar.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;

/**
 *
 * @author admin
 */
public class FormBaoCao extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//jpanel
    JPanel pnlMain = new JPanel();
    JPanel pnlTieude = new JPanel();
    JPanel pnlTop = new JPanel();
    JPanel pnlTopB= new JPanel();
    JPanel pnlBottom= new JPanel();
    JLabel lblTungay = new JLabel("Từ ngày");
    JLabel lblDenngay = new JLabel("Đến ngày");
    
    //jbutton
    JButton btnLoc = new JButton("Tìm Kiếm");
    private final JComboBox comboBox = new JComboBox();
    private final JButton btnInBoCo = new JButton("In Báo cáo");
    private final JDateChooser dateChooser = new JDateChooser();
    private final JDateChooser dateChooser_1 = new JDateChooser();

    public FormBaoCao(){
        pnlMain.setLayout(new BorderLayout());
        pnlTieude.setLayout(new FlowLayout());
        GridBagLayout gbl_pnlTopB = new GridBagLayout();
        gbl_pnlTopB.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0};
        gbl_pnlTopB.columnWidths = new int[]{122, 0, 0, 0, 0, 0};
        gbl_pnlTopB.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0};
        pnlTopB.setLayout(gbl_pnlTopB);
        pnlTop.setLayout(new BorderLayout());
        pnlBottom.setLayout(new BorderLayout());
        
        GridBagConstraints gbc_comboBox = new GridBagConstraints();
        gbc_comboBox.insets = new Insets(0, 0, 5, 5);
        gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox.gridx = 0;
        gbc_comboBox.gridy = 1;
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Xuất", "Nhập"}));
        comboBox.setSelectedIndex(2);
        pnlTopB.add(comboBox, gbc_comboBox);
        
        pnlTopB.add(lblTungay, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 5, 5), 0, 0));
        
        GridBagConstraints gbc_dateChooser = new GridBagConstraints();
        gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
        gbc_dateChooser.fill = GridBagConstraints.BOTH;
        gbc_dateChooser.gridx = 2;
        gbc_dateChooser.gridy = 1;
        pnlTopB.add(dateChooser, gbc_dateChooser);
        pnlTopB.add(lblDenngay, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 5, 5), 0, 0));
        
        GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
        gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
        gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
        gbc_dateChooser_1.gridx = 4;
        gbc_dateChooser_1.gridy = 1;
        pnlTopB.add(dateChooser_1, gbc_dateChooser_1);
      
        pnlTopB.add(btnLoc, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 5, 0), 0, 0));
       
     //table
        JTable table = new JTable();
        DefaultTableModel dftb = new DefaultTableModel();
        Vector data = new Vector();
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ HĐ");
        header.add("Ngày xuất");
        header.add("Người bán");
        header.add("Trị giá");
        
        Connection cn=
        table.setPreferredScrollableViewportSize(new Dimension(1000, 230));
        Statement st = null;
        ResultSet rs = null;
        String sql = "Select * FROM NHANVIEN";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            int i = 1;
            while (rs.next()) {
                Vector data1 = new Vector();

                data1.add(i);
                data1.add(rs.getString(1));
                data1.add(rs.getString(2));
                data1.add(rs.getString(3));
                data1.add(rs.getString(4));
               
                // data.add(rs.getString(8));
                data.add(data1);
                table.setModel(new DefaultTableModel(data, header));
                i++;

            }

        } catch (Exception e) {
        }
        JScrollPane scrDanhsach = new JScrollPane(table);
        table.setModel(new DefaultTableModel(data, header));

                table.setPreferredScrollableViewportSize(new Dimension(1000, 350));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        // JScrollPane scrDanhsach = new JScrollPane(table);
        lblDenngay.setForeground(Color.red);
        lblTungay.setForeground(Color.red);
        //
        pnlMain.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlTop.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,5));
        pnlTopB.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        pnlTieude.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pnlTop.add(pnlTieude, BorderLayout.NORTH);
        pnlTop.add(pnlTopB, BorderLayout.CENTER);
        
        GridBagConstraints gbc_btnInBoCo = new GridBagConstraints();
        gbc_btnInBoCo.insets = new Insets(0, 0, 0, 5);
        gbc_btnInBoCo.gridx = 2;
        gbc_btnInBoCo.gridy = 3;
        btnInBoCo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showConfirmDialog(null, "đã in báo cáo");
        	}
        });
        
         pnlTopB.add(btnInBoCo, gbc_btnInBoCo);
        
        pnlBottom.add(scrDanhsach, BorderLayout.CENTER);
        
        pnlMain.add(pnlTop,  BorderLayout.NORTH);
        pnlMain.add(pnlBottom,  BorderLayout.CENTER);
        
        
        getContentPane().add(pnlMain);
    }
    
//    public static void main(String[] args) {
//        Baocaodoanhthungaythang B = new Baocaodoanhthungaythang();
//        B.setSize(900, 550);
//        B.setLocationRelativeTo(null);
//        B.setVisible(true);
//        
//    }
}
