import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Program Files (x86)\\MenuAlpha\\Backgrounds\\home_house_10811.png"));
		setBounds(550, 200, 291, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.BOLD, 17));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(7, 27, 258, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("<-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(77, 100, 57, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				
			}
		});
		btnNewButton_2.setBounds(141, 100, 57, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "+");
				
			}
		});
		btnNewButton_3.setBounds(208, 100, 57, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText(textField.getText() + "7");
			
			}
		});
		btnNewButton_4.setBounds(10, 151, 57, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "8");
				
			}
		});
		btnNewButton_1_1.setBounds(77, 151, 57, 40);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "9");
				
			}
		});
		btnNewButton_2_1.setBounds(141, 151, 57, 40);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("-");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "-");
				
			}
		});
		btnNewButton_3_1.setBounds(208, 151, 57, 40);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "4");
				
			}
		});
		btnNewButton_5.setBounds(10, 202, 57, 40);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "5");
				
			}
		});
		btnNewButton_1_2.setBounds(77, 202, 57, 40);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "6");
				
			}
		});
		btnNewButton_2_2.setBounds(141, 202, 57, 40);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("*");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "*");
				
			}
		});
		btnNewButton_3_2.setBounds(208, 202, 57, 40);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.setBounds(10, 310, 57, 40);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton(".");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + ".");
				
			}
		});
		btnNewButton_1_3.setBounds(77, 310, 57, 40);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_3_3 = new JButton("=");
		btnNewButton_3_3.setBounds(141, 310, 124, 40);
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_2_1 = new JButton("/");
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "/");
				
			}
		});
		btnNewButton_3_2_1.setBounds(208, 253, 57, 40);
		contentPane.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_2_2_1 = new JButton("3");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "3");
				
			}
		});
		btnNewButton_2_2_1.setBounds(141, 253, 57, 40);
		contentPane.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_1_2_1 = new JButton("2");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "2");
				
			}
		});
		btnNewButton_1_2_1.setBounds(77, 253, 57, 40);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_5_1 = new JButton("1");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "1");
				
			}
		});
		btnNewButton_5_1.setBounds(10, 253, 57, 40);
		contentPane.add(btnNewButton_5_1);
	}
}
