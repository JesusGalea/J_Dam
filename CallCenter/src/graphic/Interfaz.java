package graphic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 600, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setBackground(new Color(220, 20, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0, 0, 38, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Call center");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_5.setBounds(58, 6, 101, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Clientes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(28, 55, 106, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Proveedores");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(328, 55, 137, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Pedidos por tramitar");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(28, 334, 176, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Devoluciones por tramitar\r\n");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(328, 334, 221, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setBounds(31, 79, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(31, 127, 106, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setBounds(31, 177, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(31, 225, 106, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(28, 287, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.setBounds(127, 287, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID pedido");
		lblNewLabel_2_1.setBounds(28, 359, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(28, 397, 106, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.setBounds(28, 454, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Usuario");
		lblNewLabel_2_2.setBounds(328, 80, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(328, 127, 106, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_3_2 = new JLabel("Contraseña");
		lblNewLabel_3_2.setBounds(328, 177, 63, 14);
		contentPane.add(lblNewLabel_3_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(328, 225, 106, 20);
		contentPane.add(textField_5);
		
		JButton btnNewButton_3 = new JButton("Login");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(328, 287, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("ID Devolucion");
		lblNewLabel_2_3.setBounds(328, 359, 89, 14);
		contentPane.add(lblNewLabel_2_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(328, 397, 106, 20);
		contentPane.add(textField_6);
		
		JButton btnNewButton_4 = new JButton("Login");
		btnNewButton_4.setBounds(328, 454, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Interfaz.class.getResource("/resources/4344834.jpg")));
		lblNewLabel_4.setBounds(475, 11, 156, 160);
		contentPane.add(lblNewLabel_4);
	}
}
