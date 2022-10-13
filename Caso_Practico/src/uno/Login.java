package uno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPass;
	private JTextField txtUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setUndecorated(true);
		setBackground(Color.DARK_GRAY);
		setLocationByPlatform(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/image/icon.jpg")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 556, 337);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBorder(null);
		panel_1.setBounds(0, 0, 325, 248);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			txtUser.setText("");
			txtUser.setForeground(Color.BLACK);
			txtPass.setText("********");
			txtPass.setForeground(Color.LIGHT_GRAY);
			}
		});
		txtUser.setText("Introduzca su usuario");
		txtUser.setName("");
		txtUser.setCaretColor(Color.LIGHT_GRAY);
		txtUser.setBorder(null);
		txtUser.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtUser.setForeground(Color.LIGHT_GRAY);
		txtUser.setToolTipText("Introduzca su usuario\r\n");
		txtUser.setBounds(37, 95, 190, 20);
		panel_1.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel JL1 = new JLabel("Usuario:");
		JL1.setBounds(37, 59, 94, 25);
		panel_1.add(JL1);
		JL1.setFont(new Font("Roboto", Font.PLAIN, 15));
		
		txtPass = new JPasswordField();
		txtPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtPass.setText("");
				txtPass.setForeground(Color.BLACK);
				txtUser.setText("Introduzca su usuario");
				txtUser.setForeground(Color.LIGHT_GRAY);
			}
		});
		txtPass.setForeground(Color.LIGHT_GRAY);
		txtPass.setText("********");
		txtPass.setBounds(38, 178, 189, 20);
		panel_1.add(txtPass);
		txtPass.setBorder(null);
		
		JLabel JL2 = new JLabel("Contraseña:");
		JL2.setBounds(37, 137, 161, 30);
		panel_1.add(JL2);
		JL2.setFont(new Font("Roboto", Font.PLAIN, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Iniciar Sesión");
		lblNewLabel_3.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(37, 30, 194, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/image/fondo.jpg")));
		lblNewLabel.setBounds(325, 202, 232, 219);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/image/pinterest_profile_image.png")));
		lblNewLabel_2.setBounds(282, 17, 275, 208);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/image/fondo.jpg")));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(325, 66, 215, 159);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Iniciar ");
		btnNewButton.setBounds(40, 282, 114, 23);
		panel.add(btnNewButton);
	}
}
