package ventanas;

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
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ventana_pokemon<E> extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel lblNombre;
	public JLabel lblTipo;
	public JLabel lblImagenTipo;
	public JLabel lblPokemon;
	public JTextArea txtInformacion;
	public JLabel lblEvo1;
	public JLabel lblEvo2;
	public JLabel lblEvo3;
	public JTextField txtxBuscar;
	public JComboBox<?> cbxPokemon;
	public JButton btnPokemon;

	public ventana_pokemon() {
		setResizable(false);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/recursos/icono_pokebola.png")));

			final ImageIcon iconoPokebola = new ImageIcon(getClass().getResource("/recursos/icono_pokebola.png"));
			final ImageIcon iconoLogoPokemon = new ImageIcon(getClass().getResource("/recursos/icono_pokemon.png"));
			final ImageIcon iconoRegresar = new ImageIcon(getClass().getResource("/recursos/icono_regresar.png"));

			final ImageIcon iconoP1 = new ImageIcon(getClass().getResource("/pokemon/1.png"));
			final ImageIcon iconoP2 = new ImageIcon(getClass().getResource("/pokemon/2.png"));
			final ImageIcon iconoP3 = new ImageIcon(getClass().getResource("/pokemon/3.png"));
			final ImageIcon iconoP4 = new ImageIcon(getClass().getResource("/pokemon/4.png"));
			final ImageIcon iconoP5 = new ImageIcon(getClass().getResource("/pokemon/5.png"));
			final ImageIcon iconoP6 = new ImageIcon(getClass().getResource("/pokemon/6.png"));
			final ImageIcon iconoP7 = new ImageIcon(getClass().getResource("/pokemon/7.png"));
			final ImageIcon iconoP8 = new ImageIcon(getClass().getResource("/pokemon/8.png"));
			final ImageIcon iconoP9 = new ImageIcon(getClass().getResource("/pokemon/9.png"));
			final ImageIcon iconoP10 = new ImageIcon(getClass().getResource("/pokemon/10.png"));

			final ImageIcon iconoP11 = new ImageIcon(getClass().getResource("/pokemon/11.png"));
			final ImageIcon iconoP12 = new ImageIcon(getClass().getResource("/pokemon/12.png"));
			final ImageIcon iconoP13 = new ImageIcon(getClass().getResource("/pokemon/13.png"));
			final ImageIcon iconoP14 = new ImageIcon(getClass().getResource("/pokemon/14.png"));
			final ImageIcon iconoP15 = new ImageIcon(getClass().getResource("/pokemon/15.png"));
			final ImageIcon iconoP16 = new ImageIcon(getClass().getResource("/pokemon/16.png"));
			final ImageIcon iconoP17 = new ImageIcon(getClass().getResource("/pokemon/17.png"));
			final ImageIcon iconoP18 = new ImageIcon(getClass().getResource("/pokemon/18.png"));
			final ImageIcon iconoP19 = new ImageIcon(getClass().getResource("/pokemon/19.png"));
			final ImageIcon iconoP20 = new ImageIcon(getClass().getResource("/pokemon/20.png"));

			final ImageIcon iconoP21 = new ImageIcon(getClass().getResource("/pokemon/21.png"));
			final ImageIcon iconoP22 = new ImageIcon(getClass().getResource("/pokemon/22.png"));
			final ImageIcon iconoP23 = new ImageIcon(getClass().getResource("/pokemon/23.png"));
			final ImageIcon iconoP24 = new ImageIcon(getClass().getResource("/pokemon/24.png"));
			final ImageIcon iconoP25 = new ImageIcon(getClass().getResource("/pokemon/25.png"));
			final ImageIcon iconoP26 = new ImageIcon(getClass().getResource("/pokemon/26.png"));
			final ImageIcon iconoP27 = new ImageIcon(getClass().getResource("/pokemon/27.png"));
			final ImageIcon iconoP28 = new ImageIcon(getClass().getResource("/pokemon/28.png"));
			final ImageIcon iconoP29 = new ImageIcon(getClass().getResource("/pokemon/29.png"));
			final ImageIcon iconoP30 = new ImageIcon(getClass().getResource("/pokemon/30.png"));

			final ImageIcon iconoP31 = new ImageIcon(getClass().getResource("/pokemon/31.png"));
			final ImageIcon iconoP32 = new ImageIcon(getClass().getResource("/pokemon/32.png"));
			final ImageIcon iconoP33 = new ImageIcon(getClass().getResource("/pokemon/33.png"));
			final ImageIcon iconoP34 = new ImageIcon(getClass().getResource("/pokemon/34.png"));
			final ImageIcon iconoP35 = new ImageIcon(getClass().getResource("/pokemon/35.png"));
			final ImageIcon iconoP36 = new ImageIcon(getClass().getResource("/pokemon/36.png"));
			final ImageIcon iconoP37 = new ImageIcon(getClass().getResource("/pokemon/37.png"));
			final ImageIcon iconoP38 = new ImageIcon(getClass().getResource("/pokemon/38.png"));
			final ImageIcon iconoP39 = new ImageIcon(getClass().getResource("/pokemon/39.png"));
			final ImageIcon iconoP40 = new ImageIcon(getClass().getResource("/pokemon/40.png"));

			final ImageIcon iconoP41 = new ImageIcon(getClass().getResource("/pokemon/41.png"));
			final ImageIcon iconoP42 = new ImageIcon(getClass().getResource("/pokemon/42.png"));
			final ImageIcon iconoP43 = new ImageIcon(getClass().getResource("/pokemon/43.png"));
			final ImageIcon iconoP44 = new ImageIcon(getClass().getResource("/pokemon/44.png"));
			final ImageIcon iconoP45 = new ImageIcon(getClass().getResource("/pokemon/45.png"));
			final ImageIcon iconoP46 = new ImageIcon(getClass().getResource("/pokemon/46.png"));
			final ImageIcon iconoP47 = new ImageIcon(getClass().getResource("/pokemon/47.png"));
			final ImageIcon iconoP48 = new ImageIcon(getClass().getResource("/pokemon/48.png"));
			final ImageIcon iconoP49 = new ImageIcon(getClass().getResource("/pokemon/49.png"));
			final ImageIcon iconoP50 = new ImageIcon(getClass().getResource("/pokemon/50.png"));

			final ImageIcon iconoP51 = new ImageIcon(getClass().getResource("/pokemon/51.png"));
			final ImageIcon iconoP52 = new ImageIcon(getClass().getResource("/pokemon/52.png"));
			final ImageIcon iconoP53 = new ImageIcon(getClass().getResource("/pokemon/53.png"));
			final ImageIcon iconoP54 = new ImageIcon(getClass().getResource("/pokemon/54.png"));
			final ImageIcon iconoP55 = new ImageIcon(getClass().getResource("/pokemon/55.png"));
			final ImageIcon iconoP56 = new ImageIcon(getClass().getResource("/pokemon/56.png"));
			final ImageIcon iconoP57 = new ImageIcon(getClass().getResource("/pokemon/57.png"));
			final ImageIcon iconoP58 = new ImageIcon(getClass().getResource("/pokemon/58.png"));
			final ImageIcon iconoP59 = new ImageIcon(getClass().getResource("/pokemon/59.png"));
			final ImageIcon iconoP60 = new ImageIcon(getClass().getResource("/pokemon/60.png"));

			final ImageIcon iconoP61 = new ImageIcon(getClass().getResource("/pokemon/61.png"));
			final ImageIcon iconoP62 = new ImageIcon(getClass().getResource("/pokemon/62.png"));
			final ImageIcon iconoP63 = new ImageIcon(getClass().getResource("/pokemon/63.png"));
			final ImageIcon iconoP64 = new ImageIcon(getClass().getResource("/pokemon/64.png"));
			final ImageIcon iconoP65 = new ImageIcon(getClass().getResource("/pokemon/65.png"));
			final ImageIcon iconoP66 = new ImageIcon(getClass().getResource("/pokemon/66.png"));
			final ImageIcon iconoP67 = new ImageIcon(getClass().getResource("/pokemon/67.png"));
			final ImageIcon iconoP68 = new ImageIcon(getClass().getResource("/pokemon/68.png"));
			final ImageIcon iconoP69 = new ImageIcon(getClass().getResource("/pokemon/69.png"));
			final ImageIcon iconoP70 = new ImageIcon(getClass().getResource("/pokemon/70.png"));

			final ImageIcon iconoP71 = new ImageIcon(getClass().getResource("/pokemon/71.png"));
			final ImageIcon iconoP72 = new ImageIcon(getClass().getResource("/pokemon/72.png"));
			final ImageIcon iconoP73 = new ImageIcon(getClass().getResource("/pokemon/73.png"));
			final ImageIcon iconoP74 = new ImageIcon(getClass().getResource("/pokemon/74.png"));
			final ImageIcon iconoP75 = new ImageIcon(getClass().getResource("/pokemon/75.png"));
			final ImageIcon iconoP76 = new ImageIcon(getClass().getResource("/pokemon/76.png"));
			final ImageIcon iconoP77 = new ImageIcon(getClass().getResource("/pokemon/77.png"));
			final ImageIcon iconoP78 = new ImageIcon(getClass().getResource("/pokemon/78.png"));
			final ImageIcon iconoP79 = new ImageIcon(getClass().getResource("/pokemon/79.png"));
			final ImageIcon iconoP80 = new ImageIcon(getClass().getResource("/pokemon/80.png"));

			final ImageIcon iconoP81 = new ImageIcon(getClass().getResource("/pokemon/81.png"));
			final ImageIcon iconoP82 = new ImageIcon(getClass().getResource("/pokemon/82.png"));
			final ImageIcon iconoP83 = new ImageIcon(getClass().getResource("/pokemon/83.png"));
			final ImageIcon iconoP84 = new ImageIcon(getClass().getResource("/pokemon/84.png"));
			final ImageIcon iconoP85 = new ImageIcon(getClass().getResource("/pokemon/85.png"));
			final ImageIcon iconoP86 = new ImageIcon(getClass().getResource("/pokemon/86.png"));
			final ImageIcon iconoP87 = new ImageIcon(getClass().getResource("/pokemon/87.png"));
			final ImageIcon iconoP88 = new ImageIcon(getClass().getResource("/pokemon/88.png"));
			final ImageIcon iconoP89 = new ImageIcon(getClass().getResource("/pokemon/89.png"));
			final ImageIcon iconoP90 = new ImageIcon(getClass().getResource("/pokemon/90.png"));

			final ImageIcon iconoP91 = new ImageIcon(getClass().getResource("/pokemon/91.png"));
			final ImageIcon iconoP92 = new ImageIcon(getClass().getResource("/pokemon/92.png"));
			final ImageIcon iconoP93 = new ImageIcon(getClass().getResource("/pokemon/93.png"));
			final ImageIcon iconoP94 = new ImageIcon(getClass().getResource("/pokemon/94.png"));
			final ImageIcon iconoP95 = new ImageIcon(getClass().getResource("/pokemon/95.png"));
			final ImageIcon iconoP96 = new ImageIcon(getClass().getResource("/pokemon/96.png"));
			final ImageIcon iconoP97 = new ImageIcon(getClass().getResource("/pokemon/97.png"));
			final ImageIcon iconoP98 = new ImageIcon(getClass().getResource("/pokemon/98.png"));
			final ImageIcon iconoP99 = new ImageIcon(getClass().getResource("/pokemon/99.png"));
			final ImageIcon iconoP100 = new ImageIcon(getClass().getResource("/pokemon/100.png"));

			final ImageIcon iconoP101 = new ImageIcon(getClass().getResource("/pokemon/101.png"));
			final ImageIcon iconoP102 = new ImageIcon(getClass().getResource("/pokemon/102.png"));
			final ImageIcon iconoP103 = new ImageIcon(getClass().getResource("/pokemon/103.png"));
			final ImageIcon iconoP104 = new ImageIcon(getClass().getResource("/pokemon/104.png"));
			final ImageIcon iconoP105 = new ImageIcon(getClass().getResource("/pokemon/105.png"));
			final ImageIcon iconoP106 = new ImageIcon(getClass().getResource("/pokemon/106.png"));
			final ImageIcon iconoP107 = new ImageIcon(getClass().getResource("/pokemon/107.png"));
			final ImageIcon iconoP108 = new ImageIcon(getClass().getResource("/pokemon/108.png"));
			final ImageIcon iconoP109 = new ImageIcon(getClass().getResource("/pokemon/109.png"));
			final ImageIcon iconoP110 = new ImageIcon(getClass().getResource("/pokemon/110.png"));

			final ImageIcon iconoP111 = new ImageIcon(getClass().getResource("/pokemon/111.png"));
			final ImageIcon iconoP112 = new ImageIcon(getClass().getResource("/pokemon/112.png"));
			final ImageIcon iconoP113 = new ImageIcon(getClass().getResource("/pokemon/113.png"));
			final ImageIcon iconoP114 = new ImageIcon(getClass().getResource("/pokemon/114.png"));
			final ImageIcon iconoP115 = new ImageIcon(getClass().getResource("/pokemon/115.png"));
			final ImageIcon iconoP116 = new ImageIcon(getClass().getResource("/pokemon/116.png"));
			final ImageIcon iconoP117 = new ImageIcon(getClass().getResource("/pokemon/117.png"));
			final ImageIcon iconoP118 = new ImageIcon(getClass().getResource("/pokemon/118.png"));
			final ImageIcon iconoP119 = new ImageIcon(getClass().getResource("/pokemon/119.png"));
			final ImageIcon iconoP120 = new ImageIcon(getClass().getResource("/pokemon/120.png"));

			final ImageIcon iconoP121 = new ImageIcon(getClass().getResource("/pokemon/121.png"));
			final ImageIcon iconoP122 = new ImageIcon(getClass().getResource("/pokemon/122.png"));
			final ImageIcon iconoP123 = new ImageIcon(getClass().getResource("/pokemon/123.png"));
			final ImageIcon iconoP124 = new ImageIcon(getClass().getResource("/pokemon/124.png"));
			final ImageIcon iconoP125 = new ImageIcon(getClass().getResource("/pokemon/125.png"));
			final ImageIcon iconoP126 = new ImageIcon(getClass().getResource("/pokemon/126.png"));
			final ImageIcon iconoP127 = new ImageIcon(getClass().getResource("/pokemon/127.png"));
			final ImageIcon iconoP128 = new ImageIcon(getClass().getResource("/pokemon/128.png"));
			final ImageIcon iconoP129 = new ImageIcon(getClass().getResource("/pokemon/129.png"));
			final ImageIcon iconoP130 = new ImageIcon(getClass().getResource("/pokemon/130.png"));

			final ImageIcon iconoP131 = new ImageIcon(getClass().getResource("/pokemon/131.png"));
			final ImageIcon iconoP132 = new ImageIcon(getClass().getResource("/pokemon/132.png"));
			final ImageIcon iconoP133 = new ImageIcon(getClass().getResource("/pokemon/133.png"));
			final ImageIcon iconoP134 = new ImageIcon(getClass().getResource("/pokemon/134.png"));
			final ImageIcon iconoP135 = new ImageIcon(getClass().getResource("/pokemon/135.png"));
			final ImageIcon iconoP136 = new ImageIcon(getClass().getResource("/pokemon/136.png"));
			final ImageIcon iconoP137 = new ImageIcon(getClass().getResource("/pokemon/137.png"));
			final ImageIcon iconoP138 = new ImageIcon(getClass().getResource("/pokemon/138.png"));
			final ImageIcon iconoP139 = new ImageIcon(getClass().getResource("/pokemon/139.png"));
			final ImageIcon iconoP140 = new ImageIcon(getClass().getResource("/pokemon/140.png"));

			final ImageIcon iconoP141 = new ImageIcon(getClass().getResource("/pokemon/141.png"));
			final ImageIcon iconoP142 = new ImageIcon(getClass().getResource("/pokemon/142.png"));
			final ImageIcon iconoP143 = new ImageIcon(getClass().getResource("/pokemon/143.png"));
			final ImageIcon iconoP144 = new ImageIcon(getClass().getResource("/pokemon/144.png"));
			final ImageIcon iconoP145 = new ImageIcon(getClass().getResource("/pokemon/145.png"));
			final ImageIcon iconoP146 = new ImageIcon(getClass().getResource("/pokemon/146.png"));
			final ImageIcon iconoP147 = new ImageIcon(getClass().getResource("/pokemon/147.png"));
			final ImageIcon iconoP148 = new ImageIcon(getClass().getResource("/pokemon/148.png"));
			final ImageIcon iconoP149 = new ImageIcon(getClass().getResource("/pokemon/149.png"));
			final ImageIcon iconoP150 = new ImageIcon(getClass().getResource("/pokemon/150.png"));
			final ImageIcon iconoP151 = new ImageIcon(getClass().getResource("/pokemon/151.png"));
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent evt) {
				cerrar();
			}
		});
		setContentPane(contentPane);
		contentPane.setLayout(null);

		cbxPokemon = new JComboBox<>();
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
		cbxPokemon.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		cbxPokemon.setBackground(Color.WHITE);
		cbxPokemon.setBounds(572, 11, 202, 34);
		contentPane.add(cbxPokemon);
		cbxPokemon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxPokemon.getSelectedItem().equals("1\t Bulbasaur")) {
					ImageIcon icono1 = new ImageIcon(iconoP1.getImage().getScaledInstance(lblPokemon.getWidth(),
							lblPokemon.getHeight(), Image.SCALE_DEFAULT));
					lblPokemon.setIcon(icono1);
				}else {
					if (cbxPokemon.getSelectedItem().equals("2\t Ivysaur")) {
						ImageIcon icono2 = new ImageIcon(iconoP2.getImage().getScaledInstance(lblPokemon.getWidth(),
								lblPokemon.getHeight(), Image.SCALE_DEFAULT));
						lblPokemon.setIcon(icono2);
					}
				}

				
			}
		});
		

		JLabel lblBuscandoA = new JLabel("Elegir:");
		lblBuscandoA.setForeground(Color.BLACK);
		lblBuscandoA.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblBuscandoA.setBounds(505, 11, 88, 34);
		contentPane.add(lblBuscandoA);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(10, 56, 338, 544);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		lblPokemon = new JLabel("");
		lblPokemon.setBounds(10, 73, 318, 312);
		panel_1.add(lblPokemon);
		ImageIcon icono0 = new ImageIcon(iconoPokebola.getImage().getScaledInstance(lblPokemon.getWidth(),
				lblPokemon.getHeight(), Image.SCALE_DEFAULT));
		lblPokemon.setIcon(icono0);

		

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 318, 51);
		panel_1.add(panel);
		panel.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre del pokémon");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNombre.setBounds(10, 11, 298, 28);
		panel.add(lblNombre);
		
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(10, 422, 318, 111);
				panel_1.add(panel_2);
				panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				panel_2.setLayout(null);
				
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setBounds(10, 11, 298, 89);
						panel_2.add(scrollPane);
						
								JTextArea txtInformacion_1 = new JTextArea();
								scrollPane.setViewportView(txtInformacion_1);

		JLabel lblIcono = new JLabel("");
		lblIcono.setBounds(10, 11, 38, 34);
		contentPane.add(lblIcono);
		ImageIcon iconoPokemon1 = new ImageIcon(iconoRegresar.getImage().getScaledInstance(lblIcono.getWidth(),
				lblIcono.getHeight(), Image.SCALE_DEFAULT));
		lblIcono.setIcon(iconoPokemon1);
		lblIcono.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regresar();

			}
		});
		

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.WHITE);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(358, 56, 616, 544);
		contentPane.add(panel_1_1);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBounds(10, 334, 596, 199);
		panel_1_1.add(panel_2_1);
		panel_2_1.setLayout(null);

		lblEvo1 = new JLabel("");
		lblEvo1.setBounds(10, 11, 186, 177);
		panel_2_1.add(lblEvo1);
		final ImageIcon icono1 = new ImageIcon(iconoPokebola.getImage().getScaledInstance(lblEvo1.getWidth(),
				lblEvo1.getHeight(), Image.SCALE_DEFAULT));
		lblEvo1.setIcon(icono1);

		lblEvo2 = new JLabel("");
		lblEvo2.setBounds(206, 11, 186, 177);
		panel_2_1.add(lblEvo2);
		final ImageIcon icono2 = new ImageIcon(iconoPokebola.getImage().getScaledInstance(lblEvo2.getWidth(),
				lblEvo2.getHeight(), Image.SCALE_DEFAULT));
		lblEvo2.setIcon(icono2);
		
		JLabel lblEvo3 = new JLabel("");
		lblEvo3.setBounds(402, 11, 186, 177);
		panel_2_1.add(lblEvo3);
		final ImageIcon icono3 = new ImageIcon(iconoPokebola.getImage().getScaledInstance(lblEvo3.getWidth(),
				lblEvo3.getHeight(), Image.SCALE_DEFAULT));
		lblEvo3.setIcon(icono3);

		JLabel lblInformacinEvolutivaDel = new JLabel("LÍNEA EVOLUTIVA DEL POKÉMON");
		lblInformacinEvolutivaDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacinEvolutivaDel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblInformacinEvolutivaDel.setBounds(10, 262, 596, 28);
		panel_1_1.add(lblInformacinEvolutivaDel);

		JLabel lblTipo_1 = new JLabel("Pokémon 1");
		lblTipo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblTipo_1.setBounds(10, 301, 182, 28);
		panel_1_1.add(lblTipo_1);

		JLabel lblTipo_1_1 = new JLabel("Pokémon 2");
		lblTipo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblTipo_1_1.setBounds(224, 301, 182, 28);
		panel_1_1.add(lblTipo_1_1);
		
		JLabel lblTipo_2 = new JLabel("INFORMACIÓN DEL POKÉMON");
		lblTipo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblTipo_2.setBounds(10, 11, 596, 28);
		panel_1_1.add(lblTipo_2);
		
		JLabel lblTipo_1_1_1 = new JLabel("Pokémon 2");
		lblTipo_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblTipo_1_1_1.setBounds(424, 301, 182, 28);
		panel_1_1.add(lblTipo_1_1_1);

		JLabel lblBuscandoA_1 = new JLabel("Buscar:");
		lblBuscandoA_1.setForeground(Color.BLACK);
		lblBuscandoA_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblBuscandoA_1.setBounds(76, 11, 107, 34);
		contentPane.add(lblBuscandoA_1);

		txtxBuscar = new JTextField();
		txtxBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		txtxBuscar.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		txtxBuscar.setBounds(146, 11, 202, 34);
		contentPane.add(txtxBuscar);
		txtxBuscar.setColumns(10);

		btnPokemon = new JButton("");
		btnPokemon.setBounds(359, 11, 136, 34);
		contentPane.add(btnPokemon);
		final ImageIcon iconop = new ImageIcon(iconoLogoPokemon.getImage().getScaledInstance(btnPokemon.getWidth(),
				btnPokemon.getHeight(), Image.SCALE_DEFAULT));
		btnPokemon.setIcon(iconop);
	}

	private void cerrar() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar la pokedex?", "Pokémon Game By EmmanWayne",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	private void regresar() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea regresar inicio del Pokémon Game?",
				"Shiny Counter By EmmanWayne", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			ventana_pokedex inicial = new ventana_pokedex();
			inicial.setVisible(true);
			inicial.setLocationRelativeTo(null);
			dispose();
		}
	}
}
