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
import javax.swing.border.LineBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class ventana_pokedex extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnAcercaDe;
	ImageIcon iconoLogoPokemon = new ImageIcon(getClass().getResource("/recursos/iconos/titulo.png"));
	ImageIcon pokedex = new ImageIcon(getClass().getResource("/recursos/iconos/pokedex.png"));

	ImageIcon p1 = new ImageIcon(getClass().getResource("/recursos/iconos/p1.gif"));
	ImageIcon p2 = new ImageIcon(getClass().getResource("/recursos/iconos/p2.gif"));
	ImageIcon p3 = new ImageIcon(getClass().getResource("/recursos/tipos/Electrico.png"));
	ImageIcon p4 = new ImageIcon(getClass().getResource("/recursos/tipos/titulo_electrico.png"));

	public ventana_pokedex() {
		setResizable(false);
		setBounds(100, 100, 600, 518);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new LineBorder(new Color(255, 165, 0), 3));
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/recursos/iconos/logo.png")));
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent evt) {
				cerrar();
			}
		});

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton lblPok3 = new JButton("");
		lblPok3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URL sonido = getClass().getResource("/recursos/sonidos/pikachu.wav");
					if (sonido == null)
						return;

					AudioInputStream audio = AudioSystem.getAudioInputStream(sonido);
					Clip clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception ea) {
					System.out.println("Error sonido: " + ea.getMessage());
				}

			}
		});
		lblPok3.setBackground(Color.ORANGE);
		lblPok3.setBounds(85, 253, 61, 78);
		contentPane.add(lblPok3);
		final ImageIcon p03 = new ImageIcon(
				p3.getImage().getScaledInstance(lblPok3.getWidth(), lblPok3.getHeight(), Image.SCALE_DEFAULT));
		lblPok3.setIcon(p03);

		JLabel lblTitulo1 = new JLabel("");
		lblTitulo1.setBounds(59, 11, 466, 145);
		contentPane.add(lblTitulo1);
		final ImageIcon iconoPokemonImagen1 = new ImageIcon(iconoLogoPokemon.getImage()
				.getScaledInstance(lblTitulo1.getWidth(), lblTitulo1.getHeight(), Image.SCALE_DEFAULT));
		lblTitulo1.setIcon(iconoPokemonImagen1);

		JButton btnPokedex = new JButton("Pokedex");
		btnPokedex.setForeground(Color.WHITE);
		btnPokedex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_pokemon pokemon = new ventana_pokemon();
				pokemon.setLocationRelativeTo(null);
				pokemon.setVisible(true);
				pokemon.construirTabla();
				pokemon.buscarEnTabla(pokemon.txtBuscar);
				dispose();
			}
		});
		btnPokedex.setBackground(new Color(255, 165, 0));
		btnPokedex.setFont(new Font("Ubuntu", Font.BOLD, 25));
		btnPokedex.setBounds(334, 260, 178, 71);
		contentPane.add(btnPokedex);

		btnAcercaDe = new JButton("Acerca De.");
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
		btnAcercaDe.setBounds(334, 340, 178, 25);
		contentPane.add(btnAcercaDe);

		JButton lblPok1 = new JButton("");
		lblPok1.setBounds(150, 249, 101, 100);
		contentPane.add(lblPok1);
		final ImageIcon p01 = new ImageIcon(
				p1.getImage().getScaledInstance(lblPok1.getWidth(), lblPok1.getHeight(), Image.SCALE_DEFAULT));
		lblPok1.setIcon(p01);

		JLabel lblPokedex = new JLabel("");
		lblPokedex.setHorizontalAlignment(SwingConstants.CENTER);
		lblPokedex.setBounds(44, 167, 495, 285);
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
