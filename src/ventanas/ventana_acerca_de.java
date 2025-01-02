package ventanas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.KeyListener;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSeparator;

public class ventana_acerca_de extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public float n1;
	public float n2;
	public String num1;
	public String num2;
	public String operador;

	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JTextArea txtInformacion;
	private JButton btnWhatsApp;
	private JButton btnTitulo2;
	private JButton btnFoto;

	public ventana_acerca_de() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/recursos/icono_pokebola.png")));
		final ImageIcon logo = new ImageIcon(getClass().getResource("/recursos/pokedex.png"));
		final ImageIcon logoW = new ImageIcon(getClass().getResource("/recursos/whatsapp.png"));
		final ImageIcon titulo = new ImageIcon(getClass().getResource("/recursos/titulo.png"));
		final ImageIcon regresar = new ImageIcon(getClass().getResource("/recursos/icono_regresar.png"));
		final ImageIcon foto = new ImageIcon(getClass().getResource("/recursos/foto.jpg"));
		
		setBounds(100, 100, 496, 706);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent evt) {
				close();
			}

		});
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(260, 289, 157, 17);
		contentPane.add(separator);
		
		btnFoto = new JButton("");
		btnFoto.setBackground(Color.WHITE);
		btnFoto.setBounds(274, 295, 132, 95);
		contentPane.add(btnFoto);
		final ImageIcon foto1 = new ImageIcon(foto.getImage().getScaledInstance(btnFoto.getWidth(),
				btnFoto.getHeight(), Image.SCALE_DEFAULT));
		btnFoto.setIcon(foto1);

		lbl1 = new JLabel("ACERCA DE.");
		lbl1.setForeground(Color.BLACK);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Forte", Font.BOLD, 30));
		lbl1.setBounds(8, 27, 462, 41);
		contentPane.add(lbl1);

		lbl3 = new JLabel("by Lic. Emmanuel Díaz");
		lbl3.setForeground(Color.BLACK);
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Forte", Font.PLAIN, 25));
		lbl3.setBounds(8, 184, 462, 30);
		contentPane.add(lbl3);

		lbl2 = new JLabel("");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 30));
		lbl2.setBounds(44, 61, 386, 113);
		contentPane.add(lbl2);
		final ImageIcon icono = new ImageIcon(
				titulo.getImage().getScaledInstance(lbl2.getWidth(), lbl2.getHeight(), Image.SCALE_DEFAULT));
		lbl2.setIcon(icono);

		btnWhatsApp = new JButton("");
		btnWhatsApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goToURL("https://wa.me/50488839089?text=%C2%A1Hola%20mucho%20gusto!%20estoy%20interesad@%20en%20tu%20trabajo,%20%C2%BFpodemos%20hablar%20un%20poco?");
			}
		});
		btnWhatsApp.setFont(new Font("Franklin Gothic Heavy", Font.BOLD | Font.ITALIC, 25));
		btnWhatsApp.setBackground(Color.WHITE);
		btnWhatsApp.setBounds(369, 583, 51, 51);
		contentPane.add(btnWhatsApp);
		final ImageIcon icono11 = new ImageIcon(logoW.getImage().getScaledInstance(btnWhatsApp.getWidth(),
				btnWhatsApp.getHeight(), Image.SCALE_DEFAULT));
		btnWhatsApp.setIcon(icono11);

		txtInformacion = new JTextArea();
		txtInformacion.setBackground(Color.WHITE);
		txtInformacion.setForeground(Color.BLACK);
		txtInformacion.setText(
				"             Todos los derechos reservados a:\r\n                  Programador y Diseñador:\r\n                     Lic. Cristian Emmanuel \r\n                          Díaz Rodríguez\r\n_________________________________________\r\n  Contacto: krizemandiaz11@gmail.com\r\n  Teléfono: +504 8883-9089 \r\n  El Paraíso, El Paraíso - Honduras 2020.\r\n");
		txtInformacion.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		txtInformacion.setEditable(false);
		txtInformacion.setBounds(44, 481, 386, 161);
		contentPane.add(txtInformacion);

		JLabel lblRegresar = new JLabel("");
		lblRegresar.setBounds(8, 11, 59, 51);
		contentPane.add(lblRegresar);
		lblRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana_pokedex pokedex = new ventana_pokedex();
				pokedex.setLocationRelativeTo(null);
				pokedex.setVisible(true);
				dispose();
			}
		});
		final ImageIcon iconoAtras = new ImageIcon(regresar.getImage().getScaledInstance(lblRegresar.getWidth(),
				lblRegresar.getHeight(), Image.SCALE_DEFAULT));
		lblRegresar.setIcon(iconoAtras);
		
		btnTitulo2 = new JButton("");
		btnTitulo2.setBackground(Color.WHITE);
		btnTitulo2.setFont(new Font("Forte", Font.PLAIN, 20));
		btnTitulo2.setBounds(75, 308, 132, 41);
		contentPane.add(btnTitulo2);
		final ImageIcon tit = new ImageIcon(titulo.getImage().getScaledInstance(btnTitulo2.getWidth(),
				btnTitulo2.getHeight(), Image.SCALE_DEFAULT));
		btnTitulo2.setIcon(tit);
		
				JLabel lblLogo_1 = new JLabel("");
				lblLogo_1.setBounds(44, 225, 386, 233);
				contentPane.add(lblLogo_1);
				final ImageIcon icono2 = new ImageIcon(
						logo.getImage().getScaledInstance(lblLogo_1.getWidth(), lblLogo_1.getHeight(), Image.SCALE_DEFAULT));
				lblLogo_1.setIcon(icono2);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setForeground(Color.BLACK);
				separator_1.setBounds(263, 389, 157, 17);
				contentPane.add(separator_1);

	}

	public void goToURL(String URL) {
		if (java.awt.Desktop.isDesktopSupported()) {
			java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

			if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
				try {
					java.net.URI uri = new java.net.URI(URL);
					desktop.browse(uri);
				} catch (URISyntaxException | IOException ex) {
					Logger.getLogger(ventana_acerca_de.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
	}

	private void close() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar el programa?", "",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
