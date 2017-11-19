package vn.fpt.edu.assht.Project.program_view;

import java.awt.BorderLayout;

public final class FormNhapHang extends JFrame {

	private JFrame frame;
	JPanel pnlMain = new JPanel();
	JPanel pnlTop = new JPanel();
	JPanel pnlBottom = new JPanel();
	//
	JButton btnThem = new JButton("Thêm");
	JButton btnSua = new JButton("Sửa");
	JButton btnXoa = new JButton("Xóa");
	JButton btnTim = new JButton("Tìm");
	//
	JTextArea taHanghoa = new JTextArea();
	//
	JTextField txtTim = new JTextField(10);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormNhapHang window = new FormNhapHang();
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
	public FormNhapHang() {
		
		pnlMain.setLayout(new BorderLayout());
		pnlTop.setLayout(new GridBagLayout());
		pnlBottom.setLayout(new BorderLayout());
		//
		pnlTop.add(btnThem, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		//
		pnlTop.add(btnSua, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		//
		pnlTop.add(btnXoa, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		//
		pnlTop.add(txtTim, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		//
		pnlTop.add(btnTim, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
		//
		pnlMain.add(pnlTop, BorderLayout.NORTH);
		pnlMain.add(pnlBottom, BorderLayout.SOUTH);
		//
		this.add(pnlMain);
		//
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		frame = new JFrame();
		frame.setTitle("Phần mềm bán hàng siêu thị mini");
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
