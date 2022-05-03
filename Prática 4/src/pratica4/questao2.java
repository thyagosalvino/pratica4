package pratica4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField textSeletores;
	private JTextField textClasses;
	private JTextField textTags;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questao2 frame = new questao2();
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
	public questao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qtd de Seletores IDS");
		lblNewLabel.setBounds(43, 33, 183, 14);
		contentPane.add(lblNewLabel);
		
		textSeletores = new JTextField();
		textSeletores.setBounds(43, 58, 86, 20);
		contentPane.add(textSeletores);
		textSeletores.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Qtd de Seletores Classes");
		lblNewLabel_1.setBounds(43, 107, 158, 14);
		contentPane.add(lblNewLabel_1);
		
		textClasses = new JTextField();
		textClasses.setBounds(43, 132, 86, 20);
		contentPane.add(textClasses);
		textClasses.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Qtd Seletores de Tags");
		lblNewLabel_2.setBounds(46, 182, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		textTags = new JTextField();
		textTags.setBounds(43, 208, 86, 20);
		contentPane.add(textTags);
		textTags.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int classe = Integer.parseInt(textClasses.getText());
				int ism = Integer.parseInt(textSeletores.getText());
				int tg = Integer.parseInt(textTags.getText());
				int c,id, Total;
				
				c=classe*10;
				id=ism *100;
				Total = (id+c+tg);
				
				JOptionPane.showMessageDialog(null, "A Quantidade total de pontos é: " + Total + "\n IDs = " + id + "\nClasses = " + c + "\nTags = " + tg);
				 
			}
		});
		btnCalcular.setBounds(264, 131, 89, 23);
		contentPane.add(btnCalcular);
	}
}
