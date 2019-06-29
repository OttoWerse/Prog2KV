/**
 * 
 */
package aids;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import eierlegendeWollmilchSau.EineGUI;

/**
 * @author Otto Werse
 *
 */
public class EineAndereGUI extends JFrame {
	// start of attributes

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// JButtons erstellen
	private JPanel einJPanel;
	private JTextField einTextField = new JTextField("Hello World!", 10);
	private JButton einJButton = new JButton("clear");
	private JButton einAndererJButton = new JButton("text");

	// end of attributes

	private class eineInnereKlasse implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			einTextField.setText("");
		}
	}

	// start of constructors

	/**
	 * Create the frame.
	 */
	public EineAndereGUI() {

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
		einJPanel.setLayout(new FlowLayout());

		// JButtons auf JPanelHinzufügen
		einJPanel.add(einTextField);
		einJPanel.add(einJButton);
		einJPanel.add(einAndererJButton);

		// Action Listener als Member Klasse / innere Klasse hinzufügen
		einJButton.addActionListener(new eineInnereKlasse());

		// Action Listener als anonyme Klasse hinzufügen
		einAndererJButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				einTextField.setText("Hello World!");
			}
		});
	}

	// end of constructors

	// start of methods

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EineAndereGUI frame = new EineAndereGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// end of methods
}
