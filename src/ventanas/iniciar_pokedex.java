package ventanas;

import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

public class iniciar_pokedex {

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
					ventana_pokedex pokedex = new ventana_pokedex();
					pokedex.setLocationRelativeTo(null);
					pokedex.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
