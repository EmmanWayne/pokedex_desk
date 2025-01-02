package ventanas;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ventana_pokedex extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ImageIcon iconoLogoPokemon = new ImageIcon(getClass().getResource("/recursos/titulo.png"));
	ImageIcon pokedex = new ImageIcon(getClass().getResource("/recursos/pokedex.png"));

	ImageIcon p1 = new ImageIcon(getClass().getResource("/recursos/p1.gif"));
	ImageIcon p2 = new ImageIcon(getClass().getResource("/recursos/p2.gif"));
	ImageIcon p3 = new ImageIcon(getClass().getResource("/tipos/Electrico.png"));
	ImageIcon p4 = new ImageIcon(getClass().getResource("/tipos/titulo_electrico.png"));

	public ventana_pokedex() {
		setResizable(false);
		setBounds(100, 100, 500, 503);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/recursos/icono_pokebola.png")));
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent evt) {
				cerrar();
			}
		});

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnPokedex_1 = new JButton("");
		btnPokedex_1.setForeground(Color.WHITE);
		btnPokedex_1.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		btnPokedex_1.setBackground(new Color(0, 100, 0));
		btnPokedex_1.setBounds(283, 264, 168, 54);
		contentPane.add(btnPokedex_1);
		final ImageIcon iconoPokemonImagen = new ImageIcon(iconoLogoPokemon.getImage()
				.getScaledInstance(btnPokedex_1.getWidth(), btnPokedex_1.getHeight(), Image.SCALE_DEFAULT));
		btnPokedex_1.setIcon(iconoPokemonImagen);

		JButton lblPok3 = new JButton("");
		lblPok3.setBackground(Color.ORANGE);
		lblPok3.setBounds(51, 267, 51, 51);
		contentPane.add(lblPok3);
		final ImageIcon p03 = new ImageIcon(
				p3.getImage().getScaledInstance(lblPok3.getWidth(), lblPok3.getHeight(), Image.SCALE_DEFAULT));
		lblPok3.setIcon(p03);

		JLabel lblTitulo1 = new JLabel("");
		lblTitulo1.setBounds(10, 11, 464, 145);
		contentPane.add(lblTitulo1);
		final ImageIcon iconoPokemonImagen1 = new ImageIcon(iconoLogoPokemon.getImage()
				.getScaledInstance(lblTitulo1.getWidth(), lblTitulo1.getHeight(), Image.SCALE_DEFAULT));
		lblTitulo1.setIcon(iconoPokemonImagen1);

		JButton btnPokedex = new JButton("Ver Pokedex");
		btnPokedex.setForeground(Color.WHITE);
		btnPokedex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_pokemon pokemon = new ventana_pokemon();
				pokemon.setLocationRelativeTo(null);
				pokemon.setVisible(true);
				dispose();
			}
		});
		btnPokedex.setBackground(new Color(0, 100, 0));
		btnPokedex.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		btnPokedex.setBounds(33, 398, 117, 36);
		contentPane.add(btnPokedex);

		JButton btnAcercaDe = new JButton("Acerca De.");
		btnAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_acerca_de acercade = new ventana_acerca_de();
				acercade.setLocationRelativeTo(null);
				acercade.setVisible(true);
				dispose();
			}
		});
		btnAcercaDe.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		btnAcercaDe.setBackground(Color.WHITE);
		btnAcercaDe.setBounds(283, 329, 168, 31);
		contentPane.add(btnAcercaDe);

		JButton lblPok1 = new JButton("");
		lblPok1.setBounds(112, 256, 87, 86);
		contentPane.add(lblPok1);
		final ImageIcon p01 = new ImageIcon(
				p1.getImage().getScaledInstance(lblPok1.getWidth(), lblPok1.getHeight(), Image.SCALE_DEFAULT));
		lblPok1.setIcon(p01);

		JLabel lblPokedex = new JLabel("");
		lblPokedex.setHorizontalAlignment(SwingConstants.CENTER);
		lblPokedex.setBounds(10, 167, 464, 285);
		contentPane.add(lblPokedex);
		final ImageIcon pokedex1 = new ImageIcon(pokedex.getImage().getScaledInstance(lblPokedex.getWidth(),
				lblPokedex.getHeight(), Image.SCALE_DEFAULT));
		lblPokedex.setIcon(pokedex1);
	}

	private void cerrar() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar Pokémon Game?", "Pokémon Game By EmmanWayne",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
