import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class GradeProgramas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeProgramas frame = new GradeProgramas();
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
	public GradeProgramas() {
		setTitle("Menu");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Program Files (x86)\\MenuAlpha\\Backgrounds\\home_house_10811.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\Micael\\Programas criados por mim\\MenuDeProjetos\\MenuDeProjetos\\MenuAlpha\\Backgrounds\\cash_icon-icons.com_51090_resized.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela1 obj = new Tela1();
				obj.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(31, 36, 35, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("CalcTroco");
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 74, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\Micael\\Programas criados por mim\\MenuDeProjetos\\MenuDeProjetos\\MenuAlpha\\Backgrounds\\business-color_calculator_icon-icons.com_53466_resized.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calculadora obj = new Calculadora();
				obj.setVisible(true);
				
			
			}
		});
		btnNewButton_1.setBounds(121, 36, 35, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Calculadora");
		lblNewLabel_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(100, 11, 94, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(225, 36, 35, 40);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Sem função");
		lblNewLabel_2.setForeground(new Color(210, 105, 30));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(204, 11, 96, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(331, 36, 35, 40);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Sem função");
		lblNewLabel_3.setForeground(new Color(210, 105, 30));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(310, 11, 88, 25);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(121, 112, 35, 40);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sem função");
		lblNewLabel_1_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(100, 87, 94, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sem função");
		lblNewLabel_2_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(204, 87, 96, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBounds(225, 112, 35, 40);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setBounds(331, 112, 35, 40);
		contentPane.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Sem função");
		lblNewLabel_3_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(310, 87, 88, 25);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setBounds(121, 195, 35, 40);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sem função");
		lblNewLabel_1_2.setForeground(new Color(210, 105, 30));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(100, 170, 94, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Sem função");
		lblNewLabel_2_2.setForeground(new Color(210, 105, 30));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(204, 170, 96, 25);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setBounds(225, 195, 35, 40);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("");
		btnNewButton_3_2.setBounds(331, 195, 35, 40);
		contentPane.add(btnNewButton_3_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Sem função");
		lblNewLabel_3_2.setForeground(new Color(210, 105, 30));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(310, 170, 88, 25);
		contentPane.add(lblNewLabel_3_2);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setBounds(31, 112, 35, 40);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sem função");
		lblNewLabel_1_1_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 87, 94, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.setBounds(31, 195, 35, 40);
		contentPane.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Sem função");
		lblNewLabel_1_2_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(10, 170, 94, 25);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Program Files (x86)\\MenuAlpha\\Backgrounds\\pexels-eberhard-grossgasteiger-1612351_resized (1).jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_4);
	}
}
