
/**
 * 
 */

package eierlegendeWollmilchSau;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Otto Werse
 *
 */
public class EineGUI extends JFrame {
	// start of attributes

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel einJPanel;

	// end of attributes

	// start of constructors

	/**
	 * Create the frame.
	 */
	public EineGUI() {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// EInstellungen für den Inhalt
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		einJPanel = new JPanel();
		einJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(einJPanel);
		einJPanel.setLayout(new GridLayout(3, 3, 0, 0));

		// JButtons erstellen
		JButton einJButton = new JButton("Ich bin ein Button!");
		JButton einAndererJButton = new JButton("Ich bin ein anderer Button!");
		JButton einGanzAndererJButton = new JButton("Ich bin ein ganz anderer Button!");

		// JButtons auf JPanelHinzufügen
		einJPanel.add(einJButton);
		einJPanel.add(einAndererJButton);
		einJPanel.add(einGanzAndererJButton);

		// Action Listener als Member Klasse / innere Klasse hinzufügen
		einJButton.addActionListener(new eineInnereKlasse());

		// Action Listener als anonyme Klasse hinzufügen
		einAndererJButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eineMethode();
			}
		});

		// Action Listener als Lambda Ausdruck hinzufügen
		einGanzAndererJButton.addActionListener((ActionEvent e) -> eineMethode());
	}

	private class eineInnereKlasse implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			eineMethode();
		}
	}

	// end of constructors

	// start of methods

	private void eineMethode() {
		// Some Code
		System.out.println("Test");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EineGUI frame = new EineGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// end of methods
}
