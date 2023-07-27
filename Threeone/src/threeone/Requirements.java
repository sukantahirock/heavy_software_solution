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
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t1;
	JTextField t0;
	JTextField t2;

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
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(347, 212, 141, 38);
		contentPane.add(t3);
		
		JLabel lblNewLabel_1 = new JLabel("(in GB)");
		lblNewLabel_1.setBounds(199, 225, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRom = new JLabel("ROM");
		lblRom.setToolTipText("");
		lblRom.setForeground(new Color(64, 0, 64));
		lblRom.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRom.setBounds(154, 273, 167, 32);
		contentPane.add(lblRom);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(347, 273, 141, 38);
		contentPane.add(t4);
		
		JLabel lblNewLabel_1_1 = new JLabel("(in GB)");
		lblNewLabel_1_1.setBounds(199, 286, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblGpu = new JLabel("GPU");
		lblGpu.setToolTipText("");
		lblGpu.setForeground(new Color(64, 0, 64));
		lblGpu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpu.setBounds(154, 334, 167, 32);
		contentPane.add(lblGpu);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(347, 334, 146, 38);
		contentPane.add(t5);
		
		JLabel lblNewLabel_1_2 = new JLabel("(in GB)");
		lblNewLabel_1_2.setBounds(199, 347, 45, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnAnotherCheck = new JButton("Another Check");
		btnAnotherCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
				Project p=new Project();
				p.setVisible(true);
			
			}
		});
		btnAnotherCheck.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAnotherCheck.setBounds(154, 396, 167, 47);
		contentPane.add(btnAnotherCheck);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(342, 84, 141, 38);
		contentPane.add(t1);
		
		t0 = new JTextField();
		t0.setColumns(10);
		t0.setBounds(342, 23, 141, 38);
		contentPane.add(t0);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(342, 145, 146, 38);
		contentPane.add(t2);
		
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
		btnFinishCheck.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnFinishCheck.setBounds(386, 396, 158, 47);
		contentPane.add(btnFinishCheck);
	}
}
