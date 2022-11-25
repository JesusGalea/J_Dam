package graphic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.Notas;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Piano extends JFrame {
	int xMouse;
	int yMouse;
	private JPanel contentPane;
	private Notas notas = new Notas();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano frame = new Piano();
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
	public Piano() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setOpaque(true);
		lblNewLabel_2_4.setBackground(Color.BLACK);
		lblNewLabel_2_4.setBounds(371, 21, 32, 158);
		contentPane.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setOpaque(true);
		lblNewLabel_2_3.setBackground(Color.BLACK);
		lblNewLabel_2_3.setBounds(304, 21, 32, 158);
		contentPane.add(lblNewLabel_2_3);

		JLabel LA = new JLabel("LA");
		LA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notas.notaLa();
			}
		});
		LA.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		LA.setHorizontalTextPosition(SwingConstants.CENTER);
		LA.setHorizontalAlignment(SwingConstants.CENTER);
		LA.setFont(new Font("Sylfaen", Font.BOLD, 18));
		LA.setVerticalAlignment(SwingConstants.BOTTOM);
		LA.setVerticalTextPosition(SwingConstants.BOTTOM);
		LA.setOpaque(true);
		LA.setBackground(Color.WHITE);
		LA.setBounds(314, 21, 64, 279);
		contentPane.add(LA);

		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setOpaque(true);
		lblNewLabel_2_2.setBackground(Color.BLACK);
		lblNewLabel_2_2.setBounds(239, 21, 32, 158);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setBackground(Color.BLACK);
		lblNewLabel_2_1.setBounds(112, 21, 32, 158);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(46, 21, 32, 158);
		contentPane.add(lblNewLabel_2);

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
		panel.setBounds(0, 0, 450, 21);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setOpaque(true);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setBackground(Color.BLACK);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setBounds(416, 0, 34, 21);
		panel.add(lblNewLabel);

		JLabel DO = new JLabel("DO");
		DO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notas.notaDo();
			}
		});
		DO.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		DO.setVerticalAlignment(SwingConstants.BOTTOM);
		DO.setHorizontalAlignment(SwingConstants.CENTER);
		DO.setFont(new Font("Sylfaen", Font.BOLD, 18));
		DO.setOpaque(true);
		DO.setBackground(new Color(255, 255, 255));
		DO.setBounds(0, 21, 64, 279);
		contentPane.add(DO);

		JLabel MI = new JLabel("MI");
		MI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notas.notaMi();
			}
		});
		MI.setFont(new Font("Sylfaen", Font.BOLD, 18));
		MI.setVerticalTextPosition(SwingConstants.BOTTOM);
		MI.setVerticalAlignment(SwingConstants.BOTTOM);
		MI.setHorizontalTextPosition(SwingConstants.CENTER);
		MI.setHorizontalAlignment(SwingConstants.CENTER);
		MI.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		MI.setOpaque(true);
		MI.setBackground(Color.WHITE);
		MI.setBounds(125, 21, 64, 279);
		contentPane.add(MI);

		JLabel RE = new JLabel("RE");
		RE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notas.notaRe();
			}
		});
		RE.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		RE.setFont(new Font("Sylfaen", Font.BOLD, 18));
		RE.setVerticalAlignment(SwingConstants.BOTTOM);
		RE.setHorizontalTextPosition(SwingConstants.CENTER);
		RE.setHorizontalAlignment(SwingConstants.CENTER);
		RE.setOpaque(true);
		RE.setBackground(Color.WHITE);
		RE.setBounds(63, 21, 64, 279);
		contentPane.add(RE);

		JLabel SOL = new JLabel("SOL");
		SOL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notas.notaSol();
			}
		});
		SOL.setHorizontalTextPosition(SwingConstants.CENTER);
		SOL.setHorizontalAlignment(SwingConstants.CENTER);
		SOL.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		SOL.setFont(new Font("Sylfaen", Font.BOLD, 18));
		SOL.setVerticalTextPosition(SwingConstants.BOTTOM);
		SOL.setVerticalAlignment(SwingConstants.BOTTOM);
		SOL.setOpaque(true);
		SOL.setBackground(Color.WHITE);
		SOL.setBounds(253, 21, 64, 279);
		contentPane.add(SOL);

		JLabel FA = new JLabel("FA");
		FA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notas.notaFa();
			}
		});
		FA.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FA.setHorizontalTextPosition(SwingConstants.CENTER);
		FA.setHorizontalAlignment(SwingConstants.CENTER);
		FA.setFont(new Font("Sylfaen", Font.BOLD, 18));
		FA.setVerticalAlignment(SwingConstants.BOTTOM);
		FA.setVerticalTextPosition(SwingConstants.BOTTOM);
		FA.setOpaque(true);
		FA.setBackground(Color.WHITE);
		FA.setBounds(190, 21, 64, 279);
		contentPane.add(FA);

		JLabel Si = new JLabel("SI");
		Si.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notas.notaSi();
			}
		});
		Si.setFont(new Font("Sylfaen", Font.BOLD, 18));
		Si.setVerticalTextPosition(SwingConstants.BOTTOM);
		Si.setVerticalAlignment(SwingConstants.BOTTOM);
		Si.setHorizontalTextPosition(SwingConstants.CENTER);
		Si.setHorizontalAlignment(SwingConstants.CENTER);
		Si.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Si.setOpaque(true);
		Si.setBackground(Color.WHITE);
		Si.setBounds(381, 21, 64, 279);
		contentPane.add(Si);
	}
}
