package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class ventana_acerca_de extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public JButton btnAtras;
	public JButton btnLogo;
	public JButton btnCreador;

	public ventana_acerca_de() {
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 752);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new LineBorder(new Color(255, 165, 0), 3));
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/recursos/iconos/logo.png")));
		final ImageIcon logo = new ImageIcon(getClass().getResource("/recursos/iconos/p2.gif"));
		final ImageIcon creador = new ImageIcon(getClass().getResource("/recursos/iconos/creador.jpg"));
		setTitle("Ventana - Información");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent evt) {
				close();
			}
		});

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 165, 0), 3, true));
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(10, 10, 390, 693);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTituloRegistro = new JLabel("Acerca de.");
		lblTituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloRegistro.setForeground(Color.WHITE);
		lblTituloRegistro.setFont(new Font("Ubuntu", Font.BOLD, 25));
		lblTituloRegistro.setBounds(10, 10, 370, 33);
		panel.add(lblTituloRegistro);

		JLabel lblInformacinDelUsuario = new JLabel("Pokédex");
		lblInformacinDelUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacinDelUsuario.setForeground(new Color(255, 165, 0));
		lblInformacinDelUsuario.setFont(new Font("Ubuntu", Font.BOLD, 30));
		lblInformacinDelUsuario.setBounds(10, 40, 370, 41);
		panel.add(lblInformacinDelUsuario);

		btnLogo = new JButton("");
		btnLogo.setBounds(102, 84, 190, 160);
		panel.add(btnLogo);
		btnLogo.setForeground(Color.WHITE);
		btnLogo.setFont(new Font("Ubuntu", Font.BOLD, 25));
		btnLogo.setBackground(new Color(255, 165, 0));
		final ImageIcon icono1 = new ImageIcon(
				logo.getImage().getScaledInstance(btnLogo.getWidth(), btnLogo.getHeight(), Image.SCALE_DEFAULT));
		btnLogo.setIcon(icono1);

		btnAtras = new JButton("Atras");
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnAtras.setBackground(new Color(255, 165, 0));
		btnAtras.setBounds(102, 638, 180, 33);
		panel.add(btnAtras);
		btnAtras.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_pokedex principal = new ventana_pokedex();
				principal.setLocationRelativeTo(null);
				principal.setVisible(true);
				dispose();
			}
		});

		JLabel lblDesarrolladoPor = new JLabel("Desarrollado por:");
		lblDesarrolladoPor.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesarrolladoPor.setForeground(Color.WHITE);
		lblDesarrolladoPor.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblDesarrolladoPor.setBounds(10, 248, 370, 33);
		panel.add(lblDesarrolladoPor);

		JLabel lblMscCristianEmmanuel = new JLabel("MSc. Cristian Emmanuel Díaz Rodríguez");
		lblMscCristianEmmanuel.setHorizontalAlignment(SwingConstants.CENTER);
		lblMscCristianEmmanuel.setForeground(Color.WHITE);
		lblMscCristianEmmanuel.setFont(new Font("Ubuntu", Font.ITALIC, 15));
		lblMscCristianEmmanuel.setBounds(10, 458, 370, 33);
		panel.add(lblMscCristianEmmanuel);

		JLabel lblKrizemandiazgmailcom = new JLabel("krizemandiaz11@gmail.com");
		lblKrizemandiazgmailcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblKrizemandiazgmailcom.setForeground(new Color(255, 165, 0));
		lblKrizemandiazgmailcom.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		lblKrizemandiazgmailcom.setBounds(10, 531, 370, 33);
		panel.add(lblKrizemandiazgmailcom);

		JLabel lblDesarrolladoPor_2_1 = new JLabel("Todos los derechos reservados (Pokédex 2026).");
		lblDesarrolladoPor_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesarrolladoPor_2_1.setForeground(Color.WHITE);
		lblDesarrolladoPor_2_1.setFont(new Font("Ubuntu", Font.ITALIC, 15));
		lblDesarrolladoPor_2_1.setBounds(10, 594, 370, 33);
		panel.add(lblDesarrolladoPor_2_1);

		JLabel lblDesarrolladoPor_1_1 = new JLabel("8883-9089");
		lblDesarrolladoPor_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesarrolladoPor_1_1.setForeground(new Color(255, 165, 0));
		lblDesarrolladoPor_1_1.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		lblDesarrolladoPor_1_1.setBounds(10, 561, 370, 33);
		panel.add(lblDesarrolladoPor_1_1);

		JLabel lblInformacinDeContacto = new JLabel("Información de contacto:");
		lblInformacinDeContacto.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacinDeContacto.setForeground(Color.WHITE);
		lblInformacinDeContacto.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblInformacinDeContacto.setBounds(10, 502, 370, 33);
		panel.add(lblInformacinDeContacto);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 165, 0), 3));
		panel_1.setBounds(100, 287, 195, 160);
		panel.add(panel_1);
		panel_1.setLayout(null);

		btnCreador = new JButton("");
		btnCreador.setBounds(10, 11, 175, 138);
		panel_1.add(btnCreador);
		btnCreador.setForeground(Color.WHITE);
		btnCreador.setFont(new Font("Ubuntu", Font.BOLD, 25));
		btnCreador.setBackground(new Color(139, 69, 19));
		final ImageIcon icono2 = new ImageIcon(creador.getImage().getScaledInstance(btnCreador.getWidth(),
				btnCreador.getHeight(), Image.SCALE_DEFAULT));
		btnCreador.setIcon(icono2);

	}

	private void close() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Deseas salir del programa?", "Salir del programa",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
