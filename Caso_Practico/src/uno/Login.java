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

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtIntroduzcaSuUsuario;

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
		panel.setBounds(0, 0, 540, 298);
		contentPane.add(panel);
		panel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBounds(40, 166, 189, 20);
		panel.add(passwordField);
		
		JLabel JL2 = new JLabel("Contraseña:");
		JL2.setFont(new Font("Roboto", Font.PLAIN, 15));
		JL2.setBounds(40, 129, 161, 30);
		panel.add(JL2);
		
		JLabel JL1 = new JLabel("Usuario:");
		JL1.setFont(new Font("Roboto", Font.PLAIN, 15));
		JL1.setBounds(40, 51, 94, 25);
		panel.add(JL1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBounds(0, 0, 325, 208);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtIntroduzcaSuUsuario = new JTextField();
		txtIntroduzcaSuUsuario.setName("");
		txtIntroduzcaSuUsuario.setText("Introduzca su usuario\r\n");
		txtIntroduzcaSuUsuario.setCaretColor(Color.LIGHT_GRAY);
		txtIntroduzcaSuUsuario.setBorder(null);
		txtIntroduzcaSuUsuario.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtIntroduzcaSuUsuario.setForeground(Color.LIGHT_GRAY);
		txtIntroduzcaSuUsuario.setToolTipText("Introduzca su usuario\r\n");
		txtIntroduzcaSuUsuario.setBounds(37, 85, 190, 20);
		panel_1.add(txtIntroduzcaSuUsuario);
		txtIntroduzcaSuUsuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/image/fondo.jpg")));
		lblNewLabel.setBounds(325, 202, 232, 219);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/image/pinterest_profile_image.png")));
		lblNewLabel_2.setBounds(265, 0, 275, 208);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/image/fondo.jpg")));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(325, 66, 215, 159);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(40, 264, 89, 23);
		panel.add(btnNewButton);
	}
}
