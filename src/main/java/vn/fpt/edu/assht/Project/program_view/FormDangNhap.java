package vn.fpt.edu.assht.Project.program_view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormDangNhap extends JFrame {

	private JFrame frame;
	JLabel ID= new JLabel("Tài Khoản");
	JLabel PASS= new JLabel("Mật Khẩu");
	JTextField txtID= new JTextField(20);
	JPasswordField txtPASS= new JPasswordField(20);
	Button btnDangnhap = new Button("Đăng Nhập");
	Button btnThoat = new Button("Thoát");

	JPanel pnlTong = new JPanel();
	JPanel pnlTrong = new JPanel();
	JPanel pnlBottom = new JPanel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormDangNhap window = new FormDangNhap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormDangNhap() {
		initialize();
		
		
		setTitle("Đăng nhập vào hệ thống!");
		pnlTong.setLayout(new BorderLayout());
		pnlTrong.setLayout(new GridBagLayout());
		pnlBottom.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		pnlTrong.add(ID, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		
		pnlTrong.add(txtID, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		
		pnlTrong.add(PASS, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		
		pnlTrong.add(txtPASS, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		
		
		pnlBottom.add(btnDangnhap);
		pnlBottom.add(btnThoat);
		
		
		pnlTong.add(pnlTrong);
		pnlTong.add(pnlBottom);
		
		this.add(pnlTong);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
