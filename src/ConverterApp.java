import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConverterApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtFCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterApp window = new ConverterApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConverterApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	
		frame.setTitle("Conversor Celcius");

		textField = new JTextField();
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		txtFCelsius = new JTextField();
		txtFCelsius.setBounds(67, 50, 114, 27);
		frame.getContentPane().add(txtFCelsius);
		txtFCelsius.setColumns(10);

		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setBounds(221, 52, 60, 17);
		frame.getContentPane().add(lblCelsius);

		JButton btnConverter = new JButton("Converter");

		JLabel lblConvertido = new JLabel("Valor convertido");
		lblConvertido.setBounds(67, 95, 114, 27);
		frame.getContentPane().add(lblConvertido);
//		lblConvertido = lblCelsius;

		btnConverter.addActionListener(ev-> {
			float cls = Float.parseFloat(txtFCelsius.getText());
			float fht = (float)(9.0/5.0)*(cls)+32;
//			lblCelsius.setText(fht + "");
			lblConvertido.setText(String.format("%.2f", fht));
			
			});


		btnConverter.setBounds(12, 147, 114, 27);
		frame.getContentPane().add(btnConverter);

		JLabel lblFahrenheit = new JLabel("Fahrenheit");
		lblFahrenheit.setBounds(221, 104, 81, 17);
		frame.getContentPane().add(lblFahrenheit);
		
		JButton btnClose = new JButton("Deixar Tela");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(283, 147, 105, 27);
		frame.getContentPane().add(btnClose);
		
		JButton btnClear = new JButton("Zerar Valor");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFCelsius.setText("");
				lblConvertido.setText("Valor Zerado");
			}
		});
		btnClear.setBounds(149, 147, 114, 27);
		frame.getContentPane().add(btnClear);

	}
}
