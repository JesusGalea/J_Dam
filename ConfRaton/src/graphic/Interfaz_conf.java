package graphic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;

public class Interfaz_conf extends JFrame {

	int xMouse;
	int yMouse;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_conf frame = new Interfaz_conf();
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
	public Interfaz_conf() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (40,40,40));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 550, 23);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setForeground(new Color (121,239,40));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.BLACK);
				lblNewLabel.setBackground(new Color (121,239,40));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(121,239,40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setBounds(520, 0, 30, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Configuración del Ratón");
		lblNewLabel_4.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_4.setForeground(new Color(121,239,40));
		lblNewLabel_4.setBounds(10, 5, 140, 14);
		panel.add(lblNewLabel_4);
		
		JProgressBar Progreso = new JProgressBar();
		Progreso.setForeground(new Color(127, 255, 0));
		Progreso.setBackground(Color.WHITE);
		Progreso.setString("");
		Progreso.setMaximum(50);
		Progreso.setBounds(10, 137, 157, 23);
		contentPane.add(Progreso);
		
		JComboBox Combo = new JComboBox();
		Combo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Progreso.setValue((int)Combo.getSelectedItem());
				
			}
		});
		Combo.setIgnoreRepaint(true);
		Combo.setAutoscrolls(true);
		Combo.setForeground(new Color( 121,239,40));
		Combo.setBackground(Color.DARK_GRAY);
		Combo.setBounds(38, 74, 94, 22);
		contentPane.add(Combo);
		Combo.addItem(0);
		Combo.addItem(25);
		Combo.addItem(50);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Interfaz_conf.class.getResource("/resources/logo.png")));
		lblNewLabel_1.setBounds(412, 32, 128, 128);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sensibilidad del ratón");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(new Color(121,239,40));
		lblNewLabel_2.setBounds(25, 49, 157, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Interfaz_conf.class.getResource("/resources/izquierda.png")));
		lblNewLabel_3.setBounds(140, 139, 301, 300);
		contentPane.add(lblNewLabel_3);
		
		JComboBox Combo2 = new JComboBox();
		Combo2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indx = Combo2.getSelectedIndex();
				if(indx == 0) {
					lblNewLabel_3.setIcon(new ImageIcon(Interfaz_conf.class.getResource("/resources/izquierda.png")));
				} else {
					lblNewLabel_3.setIcon(new ImageIcon(Interfaz_conf.class.getResource("/resources/derecha.png")));
				}
			}
		});
		Combo2.setIgnoreRepaint(true);
		Combo2.setForeground(new Color(121, 239, 40));
		Combo2.setBackground(Color.DARK_GRAY);
		Combo2.setAutoscrolls(true);
		Combo2.setBounds(244, 74, 94, 22);
		contentPane.add(Combo2);
		Combo2.addItem("Izquierda");
		Combo2.addItem("Derecha");
		
		JLabel lblNewLabel_2_1 = new JLabel("Botón principal del ratón");
		lblNewLabel_2_1.setForeground(new Color(121, 239, 40));
		lblNewLabel_2_1.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(219, 49, 157, 14);
		contentPane.add(lblNewLabel_2_1);
		
		
	}
}
