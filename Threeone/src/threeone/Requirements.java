package threeone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Requirements extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Requirements frame = new Requirements();
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
	public Requirements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Software");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(154, 29, 167, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblOperatingSystem = new JLabel("Operating System");
		lblOperatingSystem.setToolTipText("");
		lblOperatingSystem.setForeground(new Color(64, 0, 64));
		lblOperatingSystem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOperatingSystem.setBounds(154, 90, 167, 32);
		contentPane.add(lblOperatingSystem);
		
		JLabel lblCpuType = new JLabel("Cpu Type");
		lblCpuType.setToolTipText("");
		lblCpuType.setForeground(new Color(64, 0, 64));
		lblCpuType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCpuType.setBounds(154, 151, 167, 32);
		contentPane.add(lblCpuType);
		
		JLabel lblRam = new JLabel("RAM");
		lblRam.setToolTipText("");
		lblRam.setForeground(new Color(64, 0, 64));
		lblRam.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRam.setBounds(154, 212, 167, 32);
		contentPane.add(lblRam);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(347, 212, 141, 38);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("(in GB)");
		lblNewLabel_1.setBounds(199, 225, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRom = new JLabel("ROM");
		lblRom.setToolTipText("");
		lblRom.setForeground(new Color(64, 0, 64));
		lblRom.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRom.setBounds(154, 273, 167, 32);
		contentPane.add(lblRom);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(347, 273, 141, 38);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("(in GB)");
		lblNewLabel_1_1.setBounds(199, 286, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblGpu = new JLabel("GPU");
		lblGpu.setToolTipText("");
		lblGpu.setForeground(new Color(64, 0, 64));
		lblGpu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpu.setBounds(154, 334, 167, 32);
		contentPane.add(lblGpu);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(347, 334, 146, 38);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("(in GB)");
		lblNewLabel_1_2.setBounds(199, 347, 45, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnAnotherCheck = new JButton("Another Check");
		btnAnotherCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Project p=new Project();
				p.setVisible(true);
			
			}
		});
		btnAnotherCheck.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAnotherCheck.setBounds(154, 396, 151, 47);
		contentPane.add(btnAnotherCheck);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(342, 84, 141, 38);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(342, 23, 141, 38);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(342, 145, 146, 38);
		contentPane.add(textField_5);
		
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
					Project p=new Project();
					p.setVisible(true);
				}
			
			}
		});
		btnFinishCheck.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnFinishCheck.setBounds(352, 396, 141, 47);
		contentPane.add(btnFinishCheck);
	}
}
