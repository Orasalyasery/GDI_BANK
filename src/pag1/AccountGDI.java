package pag1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AccountGDI {

	private JFrame frm;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountGDI window = new AccountGDI();
					window.frm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AccountGDI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm = new JFrame();
		frm.setBounds(100, 100, 450, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(253, 245, 230));
		frm.getContentPane().add(panel1, "name_86928757264304");
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(154, 205, 50));
		frm.getContentPane().add(panel2, "name_86940183531279");
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(240, 230, 140));
		frm.getContentPane().add(panel3, "name_86937273513015");
		panel3.setLayout(null);
		
		JLabel label_2 = new JLabel("\u0623\u064A\u062F\u0627\u0639");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_2.setBounds(171, 11, 153, 49);
		panel3.add(label_2);
		
		txt2 = new JTextField();
		txt2.setBounds(102, 90, 153, 20);
		panel3.add(txt2);
		txt2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u0627\u0644\u0645\u0628\u0644\u063A \u0627\u0644\u0645\u0631\u0627\u062F \u0627\u064A\u062F\u0627\u0639\u0647");
		label_3.setFont(new Font("Dialog", Font.BOLD, 16));
		label_3.setBounds(289, 84, 135, 27);
		panel3.add(label_3);
		
		JButton btn7 = new JButton("\u0646\u0641\u0630");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = Integer.parseInt(txt2.getText());
				int m = 10000 +k;
				JOptionPane.showMessageDialog(null,"Your Balancs =" + m );
			txt2.setText(null);
			}

			
		});
		btn7.setBounds(166, 153, 89, 23);
		panel3.add(btn7);
		
		JButton btnNewButton = new JButton("\u0631\u062C\u0648\u0639");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel3.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 223, 89, 27);
		panel3.add(btnNewButton);
		
		
		JLabel lbl1 = new JLabel("\u0645\u0631\u062D\u0628\u0627 \u0628\u0643 \u0641\u064A \u0627\u0644\u0628\u0631\u0646\u0627\u0645\u062C \u0627\u0644\u0645\u0635\u0631\u0641\u064A");
		lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl1.setBackground(Color.LIGHT_GRAY);
		lbl1.setForeground(Color.BLUE);
		lbl1.setBounds(101, 0, 359, 94);
		panel1.add(lbl1);
		
		JButton btn1 = new JButton("\u0623\u0633\u062A\u0639\u0644\u0627\u0645 \u0639\u0646 \u0627\u0644\u0631\u0635\u064A\u062F");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Your Balancs = 10000" );
			}
		});
		btn1.setForeground(new Color(128, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(233, 123, 191, 23);
		panel1.add(btn1);
		
		JButton btn2 = new JButton("\u0633\u062D\u0628");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
			}
			
		});
		btn2.setForeground(Color.RED);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(115, 123, 108, 23);
		panel1.add(btn2);
		
		JButton btn3 = new JButton("\u0627\u064A\u062F\u0627\u0639");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel3.setVisible(true);
				
			}
		});
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(10, 123, 95, 23);
		panel1.add(btn3);
		
		JButton btn4 = new JButton("\u062E\u0631\u0648\u062C");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(178, 207, 89, 23);
		panel1.add(btn4);
		
		
		
		JLabel label = new JLabel("\u0623\u0644\u0633\u062D\u0628");
		label.setForeground(new Color(0, 0, 205));
		label.setFont(new Font("Tahoma", Font.BOLD, 23));
		label.setBounds(149, 11, 275, 54);
		panel2.add(label);
		
		JLabel label_1 = new JLabel("\u0623\u062F\u062E\u0644 \u0627\u0644\u0645\u0628\u0644\u063A \u0627\u0644\u0645\u0631\u0627\u062F \u0633\u062D\u0628\u0647");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(277, 94, 181, 44);
		panel2.add(label_1);
		
		txt1 = new JTextField();
		txt1.setBounds(115, 108, 152, 20);
		panel2.add(txt1);
		txt1.setColumns(10);
		
		JButton btn5 = new JButton("\u0646\u0641\u0630");
		btn5.setForeground(new Color(25, 25, 112));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(txt1.getText());
				if (x > 10000) {
					JOptionPane.showMessageDialog(null,"Sorry..Your Dont Have enough Balancs"  );
					txt1.setText(null);
				}
				else {
				int y =  10000 - x;
				JOptionPane.showMessageDialog(null,"Your Balancs =" + y );}
				txt1.setText(null);
			}
		});
		btn5.setBounds(154, 163, 89, 23);
		panel2.add(btn5);
		
		JButton btn6 = new JButton("\u0631\u062C\u0648\u0639");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
				
			}
		});
		btn6.setBounds(10, 227, 89, 23);
		panel2.add(btn6);
		
		
	}
}
