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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ventana_contador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txtCantidadContador;
	public JLabel lblTitulo;
	public JLabel lblPokemonNormal;
	private JTextField textField;

	public ventana_contador() {
		setResizable(false);
		setBounds(100, 100, 710, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/recursos/icono_pokedex.jpg")));
		final ImageIcon iconoPokebola = new ImageIcon(getClass().getResource("/recursos/imagenPokebola.png"));
		final ImageIcon iconoRegresar = new ImageIcon(getClass().getResource("/recursos/regresar.png"));
		final ImageIcon iconoEliminar = new ImageIcon(getClass().getResource("/recursos/eliminar.png"));
		final ImageIcon iconoGuardar = new ImageIcon(getClass().getResource("/recursos/guardar.png"));
		final ImageIcon iconoLogoPokemon = new ImageIcon(getClass().getResource("/recursos/logoPokemon.png"));
		final ImageIcon iconoP1 = new ImageIcon(getClass().getResource("/pokedex_p/1.png"));
		final ImageIcon iconoPS1 = new ImageIcon(getClass().getResource("/pokedex_s/1.png"));
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent evt) {
				cerrar();
			}
		});

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnContador = new JButton("+");
		btnContador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantidadContador = Integer.parseInt(txtCantidadContador.getText().toString());
				if (cantidadContador == 999999999) {
					JOptionPane.showMessageDialog(null, "No esta permitido contar más de 999,999,999");
				} else {
					int agregarContador = cantidadContador + 1;
					txtCantidadContador.setText(String.valueOf(agregarContador));
				}
			}
		});

		JComboBox cbxPokemon = new JComboBox();
		cbxPokemon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxPokemon.getSelectedItem().equals("1\t Bulbasaur")) {

					final ImageIcon icono1 = new ImageIcon(iconoP1.getImage().getScaledInstance(lblPokemonNormal.getWidth(),
							lblPokemonNormal.getHeight(), Image.SCALE_DEFAULT));
					lblPokemonNormal.setIcon(icono1);

					final ImageIcon icono1_1 = new ImageIcon(iconoPS1.getImage().getScaledInstance(
							lblTitulo.getWidth(), lblTitulo.getHeight(), Image.SCALE_DEFAULT));
					lblTitulo.setIcon(icono1_1);

				}
			}
		});
		cbxPokemon.setModel(new DefaultComboBoxModel(new String[] { "Elige un Pokémon", "1\t Bulbasaur", "2\t Ivysaur",
				"3\t Venusaur\t", "4\t Charmander", "5\t Charmeleon", "6\t Charizard", "7\t Squirtle", "8\t Wartortle",
				"9\t Blastoise", "10\t Caterpie", "11\t Metapod", "12\t Butterfree", "13\t Weedle", "14\t Kakuna",
				"15\t Beedrill", "16\t Pidgey", "17\t Pidgeotto", "18\t Pidgeot\t", "19\t Rattata", "20\t Raticate",
				"21\t Spearow", "22\t Fearow", "23\t Ekans", "24\t Arbok", "25\t Pikachu", "26\t Raichu",
				"27\t Sandshrew", "28\t Sandslash", "29\t Nidoran (Hembra)", "30\t Nidorina", "31\t Nidoqueen",
				"32\t Nidoran (Macho)", "33\t Nidorino", "34\t Nidoking", "35\t Clefairy", "36\t Clefable",
				"37\t Vulpix", "38\t Ninetales", "39\t Jigglypuff", "40\t Wigglytuff", "41\t Zubat", "42\t Golbat",
				"43\t Oddish", "44\t Gloom", "45\t Vileplume", "46\t Paras", "47\t Parasect", "48\t Venonat",
				"49\t Venomoth", "50\t Diglett", "51\t Dugtrio", "52\t Meowth", "53\t Persian", "54\t Psyduck",
				"55\t Golduck", "56\t Mankey", "57\t Primeape", "58\t Growlithe", "59\t Arcanine", "60\t Poliwag",
				"61\t Poliwhirl", "62\t Poliwrath", "63\t Abra", "64\t Kadabra", "65\t Alakazam", "66\t Machop",
				"67\t Machoke", "68\t Machamp", "69\t Bellsprout", "70\t Weepinbell", "71\t Victreebel",
				"72\t Tentacool", "73\t Tentacruel", "74\t Geodude", "75\t Graveler", "76\t Golem", "77\t Ponyta",
				"78\t Rapidash", "79\t Slowpoke", "80\t Slowbro", "81\t Magnemite", "82\t Magneton", "83\t Farfetch'd",
				"84\t Doduo", "85\t Dodrio", "86\t Seel", "87\t Dewgong", "88\t Grimer", "89\t Muk", "90\t Shellder",
				"91\t Cloyster", "92\t Gastly", "93\t Haunter", "94\t Gengar", "95\t Onix", "96\t Drowzee",
				"97\t Hypno", "98\t Krabby", "99\t Kingler", "100\t Voltorb", "101\t Electrode", "102\t Exeggcute",
				"103\t Exegutor", "104\t Cubone", "105\t Marowak", "106\t Hitmonlee", "107\t Hitonchan",
				"108\t Lickitung", "109\t Koffing", "110\t Weezing", "111\t Rhyhorn", "112\t Rhydon", "113\t Chansey",
				"114\t Tangela", "115\t Kangaskhan", "116\t Horsea", "117\t Seadra", "118\t Goldeen", "119\t Seaking",
				"120\t Staryu", "121\t Starmie\t", "122\t Mr. Mime", "123\t Scyther", "124\t Jynx", "125\t Electabuzz",
				"126\t Magmar", "127\t Pinsir", "128\t Tauros\t", "129\t Magikarp", "130\t Gyarados", "131\t Lapras",
				"132\t Ditto", "133\t Eevee", "134\t Vaporeon", "135\t Jolteon", "136\t Flareon", "137\t Porygon",
				"138\t Omanyte", "139\t Omastar", "140\t Kabuto", "141\t Kabutops", "142\t Aerodactyl", "143\t Snorlax",
				"144\t Articuno", "145\t Zapdos", "146\t Moltres", "147\t Dratini", "148\t Dragonair",
				"149\t Dragonite", "150\t Mewtwo", "151\t Mew" }));
		cbxPokemon.setForeground(Color.BLACK);
		cbxPokemon.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		cbxPokemon.setBackground(Color.WHITE);
		cbxPokemon.setBounds(175, 11, 213, 34);
		contentPane.add(cbxPokemon);

		JLabel lblBuscandoA = new JLabel("Eligir:");
		lblBuscandoA.setForeground(Color.BLACK);
		lblBuscandoA.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblBuscandoA.setBounds(108, 11, 57, 34);
		contentPane.add(lblBuscandoA);

		JButton btnContador_1 = new JButton("-");
		btnContador_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantidadContador = Integer.parseInt(txtCantidadContador.getText().toString());
				if (cantidadContador <= 0) {
					JOptionPane.showMessageDialog(null, "No esta permitido contar menos de 0");
				} else {
					int agregarContador = cantidadContador - 1;
					txtCantidadContador.setText(String.valueOf(agregarContador));
				}

			}
		});
		btnContador_1.setForeground(Color.WHITE);
		btnContador_1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.BOLD, 25));
		btnContador_1.setBackground(new Color(178, 34, 34));
		btnContador_1.setBounds(10, 462, 98, 88);
		contentPane.add(btnContador_1);
		btnContador.setBackground(new Color(0, 128, 0));
		btnContador.setForeground(Color.WHITE);
		btnContador.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.BOLD, 25));
		btnContador.setBounds(586, 462, 98, 88);
		contentPane.add(btnContador);

		txtCantidadContador = new JTextField();
		txtCantidadContador.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCantidadContador.getText().length() == 9)
					e.consume();

				char car = e.getKeyChar();
				if (Character.isDigit(car)) {

				} else {
					e.consume();
					getToolkit().beep();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

		});
		txtCantidadContador.setFont(new Font("OCR A Extended", Font.BOLD, 40));
		txtCantidadContador.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidadContador.setText("0");
		txtCantidadContador.setBounds(118, 462, 458, 43);
		contentPane.add(txtCantidadContador);
		txtCantidadContador.setColumns(10);

		JButton btnloTengo = new JButton("¡Lo tengo!");
		btnloTengo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnloTengo.setForeground(Color.WHITE);
		btnloTengo.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
		btnloTengo.setBackground(new Color(0, 128, 0));
		btnloTengo.setBounds(118, 507, 458, 43);
		contentPane.add(btnloTengo);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(10, 56, 674, 395);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		lblTitulo = new JLabel("");
		lblTitulo.setBounds(161, 6, 347, 84);
		panel_1.add(lblTitulo);
		final ImageIcon iconoPokemonImagen = new ImageIcon(iconoLogoPokemon.getImage()
				.getScaledInstance(lblTitulo.getWidth(), lblTitulo.getHeight(), Image.SCALE_DEFAULT));
		lblTitulo.setIcon(iconoPokemonImagen);

		lblPokemonNormal = new JLabel("");
		lblPokemonNormal.setBounds(10, 81, 308, 303);
		panel_1.add(lblPokemonNormal);
		final ImageIcon icono1 = new ImageIcon(iconoPokebola.getImage().getScaledInstance(lblPokemonNormal.getWidth(),
				lblPokemonNormal.getHeight(), Image.SCALE_DEFAULT));
		lblPokemonNormal.setIcon(icono1);

		JLabel lblEliminar = new JLabel("");
		lblEliminar.setBounds(624, 6, 40, 40);
		panel_1.add(lblEliminar);
		final ImageIcon iconoE= new ImageIcon(iconoEliminar.getImage().getScaledInstance(lblEliminar.getWidth(),
				lblEliminar.getHeight(), Image.SCALE_DEFAULT));
		lblEliminar.setIcon(iconoE);
	

		JLabel lblGuardar = new JLabel("");
		lblGuardar.setBounds(10, 11, 35, 35);
		panel_1.add(lblGuardar);
		final ImageIcon iconoG1= new ImageIcon(iconoGuardar.getImage().getScaledInstance(lblGuardar.getWidth(),
				lblGuardar.getHeight(), Image.SCALE_DEFAULT));
		lblGuardar.setIcon(iconoG1);
		
		JLabel lblPokemonShiny = new JLabel("");
		lblPokemonShiny.setBounds(356, 81, 308, 303);
		panel_1.add(lblPokemonShiny);
		final ImageIcon icono2 = new ImageIcon(iconoPokebola.getImage().getScaledInstance(lblPokemonShiny.getWidth(),
				lblPokemonShiny.getHeight(), Image.SCALE_DEFAULT));
		lblPokemonShiny.setIcon(icono2);

		JLabel lblIcono = new JLabel("");
		lblIcono.setBounds(10, 11, 38, 34);
		contentPane.add(lblIcono);
		lblIcono.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regresar();

			}
		});
		final ImageIcon iconoPokemon1 = new ImageIcon(iconoRegresar.getImage().getScaledInstance(lblIcono.getWidth(),
				lblIcono.getHeight(), Image.SCALE_DEFAULT));
		lblIcono.setIcon(iconoPokemon1);
		
		JLabel lblBusca = new JLabel("Buscar:");
		lblBusca.setForeground(Color.BLACK);
		lblBusca.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblBusca.setBounds(398, 11, 107, 34);
		contentPane.add(lblBusca);
		
		textField = new JTextField();
		textField.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField.setBounds(471, 11, 213, 34);
		contentPane.add(textField);
		textField.setColumns(10);
	}


	private void cerrar() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar Pokémon Game?", "Pokémon Game By EmmanWayne",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	private void regresar() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea regresar inicio del Shiny Counter?",
				"Shiny Counter By EmmanWayne", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			ventana_pokedex inicial = new ventana_pokedex();
			inicial.setVisible(true);
			inicial.setLocationRelativeTo(null);
			dispose();
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
							UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
				} catch (UnsupportedLookAndFeelException e) {
					// handle exception
				} catch (ClassNotFoundException e) {
					// handle exception
				} catch (InstantiationException e) {
					// handle exception
				} catch (IllegalAccessException e) {
					// handle exception
				}

				try {
					ventana_contador contador = new ventana_contador();
					contador.setVisible(true);
					contador.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
