package threeone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Ending extends JFrame {

	private JPanel contentPane;
	JLabel j1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ending frame = new Ending();
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
	public Ending() {
		setForeground(new Color(128, 128, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setForeground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		j1 = new JLabel("");
		j1.setForeground(new Color(64, 0, 64));
		j1.setLabelFor(j1);
		j1.setHorizontalAlignment(SwingConstants.CENTER);
		j1.setBackground(new Color(255, 255, 255));
		j1.setFont(new Font("Tahoma", Font.BOLD, 20));
		j1.setBounds(105, 78, 556, 103);
		j1.setOpaque(true);
		contentPane.add(j1);
		
		JButton btnNewButton = new JButton("Another Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Project p=new Project();
				p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(277, 220, 211, 52);
		btnNewButton.setOpaque(true);
		contentPane.add(btnNewButton);
		
		JButton btnFinishCheck = new JButton("Finish Check");
		btnFinishCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int y=JOptionPane.showConfirmDialog(null,"are you sure to exit","exit",JOptionPane.YES_NO_OPTION);
				if(JOptionPane.YES_OPTION==y)
				{
					System.exit(y);
				}
				else
				{
					dispose();
					Project p=new Project();
					p.setVisible(true);
				}
			}
		});
		btnFinishCheck.setOpaque(true);
		btnFinishCheck.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFinishCheck.setBackground(Color.RED);
		btnFinishCheck.setBounds(277, 302, 211, 52);
		contentPane.add(btnFinishCheck);
	}
}
