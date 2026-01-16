package ventanas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import clases.clase_pokemon;
import conexion.conexion;

public class ventana_pokemon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txtBuscar;

	public JScrollPane barra;
	public JTable tabla;
	public JButton btnEditar;

	public TableRowSorter<TableModel> filtro;
	public DefaultTableModel modelo = new DefaultTableModel();

	public JLabel lblId;
	public JLabel lblNombre;
	public JTextField lblDatos;

	public JButton btnPokemon;
	public JButton btnPokemon1;
	public JButton btnPokemon2;
	public JButton btnPokemon3;

	public JLabel lblTipo1;
	public JLabel lblTipo2;

	public JLabel lblEvo1;
	public JLabel lblEvo2;
	public JLabel lblEvo3;
	private JLabel lblLneaEvolutiva;
	private JLabel lblTiposDePoder;

	public JPanel panelPokemon;
	private JButton btnRegresar;

	public ventana_pokemon() {
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 754);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new LineBorder(new Color(255, 165, 0), 3));
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/recursos/iconos/logo.png")));
		final ImageIcon titulo = new ImageIcon(getClass().getResource("/recursos/iconos/titulo.png"));
		final ImageIcon pokeball = new ImageIcon(getClass().getResource("/recursos/iconos/logo.png"));

		setTitle("Ventana - Pokédex Primera Generación");
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

		panelPokemon = new JPanel();
		panelPokemon.setBorder(new LineBorder(new Color(255, 165, 0), 3, true));
		panelPokemon.setBackground(new Color(47, 79, 79));
		panelPokemon.setBounds(10, 10, 590, 694);
		contentPane.add(panelPokemon);
		panelPokemon.setLayout(null);

		lblId = new JLabel("-");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(new Color(255, 165, 0));
		lblId.setFont(new Font("Ubuntu", Font.BOLD, 25));
		lblId.setBounds(10, 10, 50, 50);
		panelPokemon.add(lblId);

		JLabel lblTituloRegistro = new JLabel("Información del pokémon");
		lblTituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloRegistro.setForeground(Color.WHITE);
		lblTituloRegistro.setFont(new Font("Ubuntu", Font.BOLD, 25));
		lblTituloRegistro.setBounds(10, 10, 570, 33);
		panelPokemon.add(lblTituloRegistro);

		btnPokemon = new JButton("");
		btnPokemon.setBounds(192, 83, 200, 200);
		panelPokemon.add(btnPokemon);
		btnPokemon.setForeground(Color.WHITE);
		btnPokemon.setFont(new Font("Ubuntu", Font.BOLD, 25));
		btnPokemon.setBackground(Color.WHITE);
		final ImageIcon icono = new ImageIcon(pokeball.getImage().getScaledInstance(btnPokemon.getWidth(),
				btnPokemon.getHeight(), Image.SCALE_DEFAULT));
		btnPokemon.setIcon(icono);

		lblNombre = new JLabel("-");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(new Color(255, 165, 0));
		lblNombre.setFont(new Font("Ubuntu", Font.BOLD, 25));
		lblNombre.setBounds(10, 39, 570, 45);
		panelPokemon.add(lblNombre);

		lblTipo1 = new JLabel("-");
		lblTipo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo1.setForeground(new Color(255, 165, 0));
		lblTipo1.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblTipo1.setBounds(129, 406, 150, 30);
		panelPokemon.add(lblTipo1);

		lblTipo2 = new JLabel("-");
		lblTipo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo2.setForeground(new Color(255, 165, 0));
		lblTipo2.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblTipo2.setBounds(309, 406, 150, 30);
		panelPokemon.add(lblTipo2);

		lblEvo1 = new JLabel("-");
		lblEvo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvo1.setForeground(new Color(255, 165, 0));
		lblEvo1.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblEvo1.setBounds(37, 652, 150, 30);
		panelPokemon.add(lblEvo1);

		lblEvo2 = new JLabel("-");
		lblEvo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvo2.setForeground(new Color(255, 165, 0));
		lblEvo2.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblEvo2.setBounds(217, 652, 150, 30);
		panelPokemon.add(lblEvo2);

		lblEvo3 = new JLabel("-");
		lblEvo3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvo3.setForeground(new Color(255, 165, 0));
		lblEvo3.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblEvo3.setBounds(396, 652, 150, 30);
		panelPokemon.add(lblEvo3);

		btnPokemon1 = new JButton("");
		btnPokemon1.setForeground(Color.WHITE);
		btnPokemon1.setFont(new Font("Ubuntu", Font.BOLD, 25));
		btnPokemon1.setBackground(Color.WHITE);
		btnPokemon1.setBounds(37, 491, 150, 150);
		panelPokemon.add(btnPokemon1);

		btnPokemon2 = new JButton("");
		btnPokemon2.setForeground(Color.WHITE);
		btnPokemon2.setFont(new Font("Ubuntu", Font.BOLD, 25));
		btnPokemon2.setBackground(Color.WHITE);
		btnPokemon2.setBounds(217, 491, 150, 150);
		panelPokemon.add(btnPokemon2);

		btnPokemon3 = new JButton("");
		btnPokemon3.setForeground(Color.WHITE);
		btnPokemon3.setFont(new Font("Ubuntu", Font.BOLD, 25));
		btnPokemon3.setBackground(Color.WHITE);
		btnPokemon3.setBounds(396, 491, 150, 150);
		panelPokemon.add(btnPokemon3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 294, 509, 62);
		panelPokemon.add(scrollPane);

		lblDatos = new JTextField("-");
		lblDatos.setBackground(new Color(47, 79, 79));
		scrollPane.setViewportView(lblDatos);
		lblDatos.setEditable(false);
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setForeground(new Color(255, 165, 0));
		lblDatos.setFont(new Font("Ubuntu", Font.BOLD, 15));

		lblLneaEvolutiva = new JLabel("Línea evolutiva:");
		lblLneaEvolutiva.setHorizontalAlignment(SwingConstants.CENTER);
		lblLneaEvolutiva.setForeground(Color.WHITE);
		lblLneaEvolutiva.setFont(new Font("Ubuntu", Font.BOLD, 25));
		lblLneaEvolutiva.setBounds(10, 447, 570, 33);
		panelPokemon.add(lblLneaEvolutiva);

		lblTiposDePoder = new JLabel("Tipos de poder:");
		lblTiposDePoder.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiposDePoder.setForeground(Color.WHITE);
		lblTiposDePoder.setFont(new Font("Ubuntu", Font.BOLD, 25));
		lblTiposDePoder.setBounds(10, 362, 570, 33);
		panelPokemon.add(lblTiposDePoder);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 165, 0), 3, true));
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(610, 10, 864, 694);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblTituloTabla = new JLabel("Pokedex registrada (Primera Generación).");
		lblTituloTabla.setBounds(10, 7, 844, 35);
		panel_1.add(lblTituloTabla);
		lblTituloTabla.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloTabla.setForeground(Color.WHITE);
		lblTituloTabla.setFont(new Font("Ubuntu", Font.BOLD, 25));

		barra = new JScrollPane();
		barra.setBounds(10, 99, 844, 583);
		panel_1.add(barra);
		tabla = new JTable();
		tabla.getTableHeader().setReorderingAllowed(false);
		barra.setViewportView(tabla);
		tabla.setModel(modelo);
		tabla.setRowSorter(filtro);

		tabla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					cargarPokemonDesdeFilaSeleccionada();
				}
			}
		});

		btnEditar = new JButton("");
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnEditar.setBackground(new Color(255, 165, 0));
		btnEditar.setBounds(596, 47, 124, 41);
		panel_1.add(btnEditar);
		final ImageIcon iconot = new ImageIcon(
				titulo.getImage().getScaledInstance(btnEditar.getWidth(), btnEditar.getHeight(), Image.SCALE_DEFAULT));
		btnEditar.setIcon(iconot);
		btnEditar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cargarPokemonDesdeFilaSeleccionada();
			}

		});

		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		lblBuscar.setForeground(Color.WHITE);
		lblBuscar.setFont(new Font("Ubuntu", Font.BOLD, 25));
		lblBuscar.setBounds(10, 47, 89, 41);
		panel_1.add(lblBuscar);

		txtBuscar = new JTextField();
		txtBuscar.setBackground(Color.WHITE);
		txtBuscar.setForeground(new Color(160, 82, 45));
		txtBuscar.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(101, 47, 485, 41);
		panel_1.add(txtBuscar);

		btnRegresar = new JButton("Regresar");
		btnRegresar.setBackground(new Color(255, 165, 0));
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana_pokedex pokedex = new ventana_pokedex();
				pokedex.setLocationRelativeTo(null);
				pokedex.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnRegresar.setBounds(730, 47, 124, 41);
		panel_1.add(btnRegresar);

	}

	public void construirTabla() {

		String titulos[] = { "N°", "Nombre", "Datos", "Tipo 1", "Tipo 2", "Evo 1", "Evo 2", "Evo 3" };
		String informacion[][] = obtenerMatriz();

		DefaultTableModel modelo = new DefaultTableModel(informacion, titulos) {

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tabla.setModel(modelo);

		filtro = new TableRowSorter<>(modelo);

		// 👇 ESTE ES EL FIX REAL
		filtro.setComparator(0, (o1, o2) -> {
			Integer n1 = Integer.parseInt(o1.toString());
			Integer n2 = Integer.parseInt(o2.toString());
			return n1.compareTo(n2);
		});

		tabla.setRowSorter(filtro);

		List<RowSorter.SortKey> sortKeys = new ArrayList<>();
		sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
		filtro.setSortKeys(sortKeys);
		filtro.sort();

		aplicarEstiloTabla();
	}

	public static ArrayList<clase_pokemon> buscarUsuariosConMatriz() {
		conexion conex = new conexion();
		ArrayList<clase_pokemon> miLista = new ArrayList<>();
		clase_pokemon pokemons;
		try {
			Statement estatuto = conex.conectar().createStatement();
			ResultSet rs = estatuto.executeQuery("select * from pokemon");

			while (rs.next()) {
				pokemons = new clase_pokemon();
				pokemons.setId_pokemon(Integer.parseInt(rs.getString("id_pokemon")));
				pokemons.setNombre_pokemon(rs.getString("nombre_pokemon"));
				pokemons.setDescripcion_pokemon(rs.getString("descripcion_pokemon"));
				pokemons.setTipo1_pokemon(rs.getString("tipo1_pokemon"));
				pokemons.setTipo2_pokemon(rs.getString("tipo2_pokemon"));
				pokemons.setEvo1_pokemon(rs.getString("evo1_pokemon"));
				pokemons.setEvo2_pokemon(rs.getString("evo2_pokemon"));
				pokemons.setEvo3_pokemon(rs.getString("evo3_pokemon"));
				miLista.add(pokemons);
			}
			rs.close();
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al consultar", "Error", JOptionPane.ERROR_MESSAGE);

		}
		return miLista;
	}

	public static String[][] obtenerMatriz() {
		ArrayList<clase_pokemon> miLista = buscarUsuariosConMatriz();
		String matrizInfo[][] = new String[miLista.size()][8];
		for (int i = 0; i < miLista.size(); i++) {
			matrizInfo[i][0] = miLista.get(i).getId_pokemon() + "";
			matrizInfo[i][1] = miLista.get(i).getNombre_pokemon() + "";
			matrizInfo[i][2] = miLista.get(i).getDescripcion_pokemon() + "";
			matrizInfo[i][3] = miLista.get(i).getTipo1_pokemon() + "";
			matrizInfo[i][4] = miLista.get(i).getTipo2_pokemon() + "";
			matrizInfo[i][5] = miLista.get(i).getEvo1_pokemon() + "";
			matrizInfo[i][6] = miLista.get(i).getEvo2_pokemon() + "";
			matrizInfo[i][7] = miLista.get(i).getEvo3_pokemon() + "";
		}
		return matrizInfo;
	}

	public void Limpiar() {
		lblNombre.setText("");
		txtBuscar.setText("");
		lblId.setText("");
	}

	public void aplicarEstiloTabla() {
		tabla.setRowHeight(28);
		JTableHeader header = tabla.getTableHeader();
		header.setForeground(new Color(139, 69, 19));
		header.setBackground(new Color(92, 64, 51));
		header.setFont(new Font("Ubuntu", Font.BOLD, 15));
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				setFont(new Font("Ubuntu", Font.PLAIN, 15));
				setForeground(new Color(139, 69, 19));
				if (!isSelected) {
					setBackground(row % 2 == 0 ? new Color(255, 248, 220) : Color.WHITE);
				} else {
					setBackground(new Color(205, 133, 63));
					setForeground(Color.WHITE);
				}
				return this;
			}
		};

		for (int i = 0; i < tabla.getColumnCount(); i++) {
			tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
		}
	}

	public void aplicarImagenPokemon() {
		String id = lblId.getText().trim();

		if (id.isEmpty())
			return;

		String ruta = "/recursos/pokemon/" + id + ".png";

		URL url = getClass().getResource(ruta);

		if (url == null) {
			JOptionPane.showMessageDialog(null, "No existe la imagen del Pokémon " + id);
			return;
		}

		ImageIcon icono = new ImageIcon(url);
		Image img = icono.getImage().getScaledInstance(btnPokemon.getWidth(), btnPokemon.getHeight(),
				Image.SCALE_SMOOTH);

		btnPokemon.setIcon(new ImageIcon(img));
	}

	private void aplicarImagenEvolucion(JButton boton, String nombrePokemon) {

		if (nombrePokemon == null || nombrePokemon.trim().isEmpty() || nombrePokemon.equalsIgnoreCase("NT")) {
			boton.setIcon(null);
			boton.setEnabled(false);
			return;
		}

		boton.setEnabled(true);

		String ruta = "/recursos/evoluciones/" + nombrePokemon + ".png";
		URL url = getClass().getResource(ruta);

		if (url == null) {
			boton.setIcon(null);
			System.out.println("Imagen no encontrada: " + ruta);
			return;
		}

		ImageIcon icono = new ImageIcon(url);
		Image img = icono.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH);

		boton.setIcon(new ImageIcon(img));
	}

	public void buscarEnTabla(JTextField txtBuscar) {

		txtBuscar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				String texto = txtBuscar.getText().trim();

				if (texto.isEmpty()) {
					filtro.setRowFilter(null);
				} else {
					filtro.setRowFilter(RowFilter.regexFilter("(?i)" + texto));
				}
			}
		});
	}

	private void cargarPokemonDesdeFilaSeleccionada() {

		int filaVista = tabla.getSelectedRow();

		if (filaVista == -1) {
			JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
			return;
		}

		int filaModelo = tabla.convertRowIndexToModel(filaVista);

		String id = tabla.getModel().getValueAt(filaModelo, 0).toString();
		String nombre = tabla.getModel().getValueAt(filaModelo, 1).toString();
		String datos = tabla.getModel().getValueAt(filaModelo, 2).toString();
		String tipo1 = tabla.getModel().getValueAt(filaModelo, 3).toString();
		String tipo2 = tabla.getModel().getValueAt(filaModelo, 4).toString();
		String evo1 = tabla.getModel().getValueAt(filaModelo, 5).toString();
		String evo2 = tabla.getModel().getValueAt(filaModelo, 6).toString();
		String evo3 = tabla.getModel().getValueAt(filaModelo, 7).toString();

		lblId.setText(id);
		lblNombre.setText(nombre);
		lblDatos.setText(datos);
		lblTipo1.setText(tipo1);
		lblTipo2.setText(tipo2);
		lblEvo1.setText(evo1);
		lblEvo2.setText(evo2);
		lblEvo3.setText(evo3);

		aplicarImagenPokemon();
		aplicarImagenEvolucion(btnPokemon1, evo1);
		aplicarImagenEvolucion(btnPokemon2, evo2);
		aplicarImagenEvolucion(btnPokemon3, evo3);
	}

	private void close() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Deseas salir del programa?", "Salir del programa",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}