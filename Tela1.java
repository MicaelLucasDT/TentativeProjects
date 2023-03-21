import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;
	private JTextField tfCed2Resultado;
	private JTextField tfCed5Resultado;
	private JTextField tfCed10Resultado;
	private JTextField tfCed20Resultado;
	private JTextField tfCed100Resultado;
	private JTextField tfCed50Resultado;
	private JTextField tfMoed005Resultado;
	private JTextField tfMoed010Resultado;
	private JTextField tfMoed025Resultado;
	private JTextField tfMoed050Resultado;
	private JTextField tfMoed100Resultado;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Program Files (x86)\\MenuAlpha\\Backgrounds\\home_house_10811.png"));
		setResizable(false);
		setTitle("CalcTroco");
		setBounds(550, 200, 278, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor da compra:");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 145, 14);
		contentPane.add(lblNewLabel);
		
		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNum1.setBounds(163, 39, 88, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dinheiro dado:");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 42, 123, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNum2.setBounds(163, 8, 88, 20);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1;
				double num2;
				double resultado;
				
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				resultado = num1 - num2;
				
				tfResultado.setText("" + resultado);
				
				
				double Ced2Resul = resultado / 2;
				double Ced5Resul = resultado / 5;
				double Ced10Resul = resultado / 10;
				double Ced20Resul = resultado / 20;
				double Ced50Resul = resultado / 50;
				double Ced100Resul = resultado / 100;
				
				
				tfCed2Resultado.setText("" + Ced2Resul);
				tfCed5Resultado.setText("" + Ced5Resul);
				tfCed10Resultado.setText("" + Ced10Resul);
				tfCed20Resultado.setText("" + Ced20Resul);
				tfCed50Resultado.setText("" + Ced50Resul);
				tfCed100Resultado.setText("" + Ced100Resul);
				
				double Moed005Resul = resultado / 0.05;
				double Moed010Resul = resultado / 0.10;
				double Moed025Resul = resultado / 0.25;
				double Moed050Resul = resultado / 0.50;
				double Moed100Resul = resultado / 1;
				
				tfMoed005Resultado.setText("" + Moed005Resul);
				tfMoed010Resultado.setText("" + Moed010Resul);
				tfMoed025Resultado.setText("" + Moed025Resul);
				tfMoed050Resultado.setText("" + Moed050Resul);
				tfMoed100Resultado.setText("" + Moed100Resul);
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(128, 70, 91, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Troco:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2.setBounds(79, 119, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		tfResultado = new JTextField();
		tfResultado.setBackground(new Color(255, 255, 255));
		tfResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfResultado.setBounds(145, 116, 106, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		tfCed2Resultado = new JTextField();
		tfCed2Resultado.setBounds(10, 202, 36, 20);
		contentPane.add(tfCed2Resultado);
		tfCed2Resultado.setColumns(10);
		
		tfCed5Resultado = new JTextField();
		tfCed5Resultado.setColumns(10);
		tfCed5Resultado.setBounds(10, 258, 36, 20);
		contentPane.add(tfCed5Resultado);
		
		tfCed10Resultado = new JTextField();
		tfCed10Resultado.setColumns(10);
		tfCed10Resultado.setBounds(99, 202, 36, 20);
		contentPane.add(tfCed10Resultado);
		
		tfCed20Resultado = new JTextField();
		tfCed20Resultado.setColumns(10);
		tfCed20Resultado.setBounds(99, 258, 36, 20);
		contentPane.add(tfCed20Resultado);
		
		tfCed100Resultado = new JTextField();
		tfCed100Resultado.setColumns(10);
		tfCed100Resultado.setBounds(183, 258, 36, 20);
		contentPane.add(tfCed100Resultado);
		
		JLabel lblNewLabel_3 = new JLabel("Cédulas");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Wide Latin", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(61, 157, 128, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("R$ 2,00");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 187, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("R$ 5,00");
		lblNewLabel_4_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setBounds(10, 243, 46, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("R$ 10,00");
		lblNewLabel_4_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_2.setBounds(99, 187, 60, 14);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("R$ 20,00");
		lblNewLabel_4_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_3.setBounds(99, 243, 60, 14);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("R$ 50,00");
		lblNewLabel_4_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_4.setBounds(183, 187, 68, 14);
		contentPane.add(lblNewLabel_4_4);
		
		tfCed50Resultado = new JTextField();
		tfCed50Resultado.setColumns(10);
		tfCed50Resultado.setBounds(183, 202, 36, 20);
		contentPane.add(tfCed50Resultado);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("R$ 100,00");
		lblNewLabel_4_4_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_4_1.setBounds(183, 243, 68, 14);
		contentPane.add(lblNewLabel_4_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Moédas");
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Wide Latin", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(61, 289, 128, 20);
		contentPane.add(lblNewLabel_3_1);
		
		tfMoed005Resultado = new JTextField();
		tfMoed005Resultado.setBounds(10, 351, 36, 20);
		contentPane.add(tfMoed005Resultado);
		tfMoed005Resultado.setColumns(10);
		
		tfMoed010Resultado = new JTextField();
		tfMoed010Resultado.setColumns(10);
		tfMoed010Resultado.setBounds(57, 351, 36, 20);
		contentPane.add(tfMoed010Resultado);
		
		tfMoed025Resultado = new JTextField();
		tfMoed025Resultado.setColumns(10);
		tfMoed025Resultado.setBounds(103, 351, 32, 20);
		contentPane.add(tfMoed025Resultado);
		
		tfMoed050Resultado = new JTextField();
		tfMoed050Resultado.setColumns(10);
		tfMoed050Resultado.setBounds(153, 351, 32, 20);
		contentPane.add(tfMoed050Resultado);
		
		tfMoed100Resultado = new JTextField();
		tfMoed100Resultado.setColumns(10);
		tfMoed100Resultado.setBounds(195, 351, 32, 20);
		contentPane.add(tfMoed100Resultado);
		
		lblNewLabel_5 = new JLabel("R$0,05");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(10, 333, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("R$0.10");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(56, 333, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("R$0.25");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(103, 333, 42, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("R$0.50");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(154, 333, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("R$1.00");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(195, 333, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Program Files (x86)\\MenuAlpha\\Backgrounds\\pexels-sergei-starostin-6590636_resized.jpg"));
		lblNewLabel_10.setBounds(0, 0, 262, 395);
		contentPane.add(lblNewLabel_10);
	}
}
