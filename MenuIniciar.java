import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class MenuIniciar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuIniciar frame = new MenuIniciar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuIniciar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Program Files (x86)\\MenuAlpha\\Backgrounds\\home_house_10811.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 450, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Entre aqui!");
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				GradeProgramas obj = new GradeProgramas();
				obj.setVisible(true);
				
	
			}
		});
		btnNewButton.setBounds(10, 219, 147, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("DE");
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 184, 35, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblProgramas = new JLabel("PROGRAMAS ");
		lblProgramas.setForeground(new Color(210, 105, 30));
		lblProgramas.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgramas.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblProgramas.setBounds(10, 196, 124, 23);
		contentPane.add(lblProgramas);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setForeground(new Color(210, 105, 30));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblMenu.setBounds(10, 168, 61, 17);
		contentPane.add(lblMenu);
		
		JLabel lblNewLabel_2 = new JLabel("Version: 1.2");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2.setBounds(354, 242, 80, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Program Files (x86)\\MenuAlpha\\Backgrounds\\pexels-eberhard-grossgasteiger-1612351_resized (1).jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 257);
		contentPane.add(lblNewLabel_1);
	}
}
