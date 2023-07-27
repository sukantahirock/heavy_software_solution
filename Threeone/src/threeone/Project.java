package threeone;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.EventQueue;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Project extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
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
	public Project() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("a.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 210, 232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Software");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(205, 23, 167, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblOperatingSystem = new JLabel("Operating System");
		lblOperatingSystem.setToolTipText("");
		lblOperatingSystem.setForeground(new Color(64, 0, 64));
		lblOperatingSystem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOperatingSystem.setBounds(205, 84, 167, 32);
		contentPane.add(lblOperatingSystem);
		
		
		
		JLabel lblCpuType = new JLabel("Cpu Type");
		lblCpuType.setToolTipText("");
		lblCpuType.setForeground(new Color(64, 0, 64));
		lblCpuType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCpuType.setBounds(205, 145, 167, 32);
		contentPane.add(lblCpuType);
		
		
		
		JLabel lblRam = new JLabel("RAM");
		lblRam.setToolTipText("");
		lblRam.setForeground(new Color(64, 0, 64));
		lblRam.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRam.setBounds(205, 206, 167, 32);
		contentPane.add(lblRam);
		
		t1 = new JTextField();
		t1.setBounds(398, 206, 141, 38);
		contentPane.add(t1);
		t1.setColumns(10);
		 
		
		
		JLabel lblNewLabel_1 = new JLabel("(in GB)");
		lblNewLabel_1.setBounds(250, 219, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRom = new JLabel("ROM");
		lblRom.setToolTipText("");
		lblRom.setForeground(new Color(64, 0, 64));
		lblRom.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRom.setBounds(205, 267, 167, 32);
		contentPane.add(lblRom);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(398, 267, 141, 38);
		contentPane.add(t2);
		

		
		JLabel lblNewLabel_1_1 = new JLabel("(in GB)");
		lblNewLabel_1_1.setBounds(250, 280, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblGpu = new JLabel("GPU");
		lblGpu.setToolTipText("");
		lblGpu.setForeground(new Color(64, 0, 64));
		lblGpu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpu.setBounds(205, 328, 167, 32);
		contentPane.add(lblGpu);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(398, 328, 146, 38);
		contentPane.add(t3);
		
		

		
		JLabel lblNewLabel_1_2 = new JLabel("(in GB)");
		lblNewLabel_1_2.setBounds(250, 341, 45, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("State");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String s_name = textField_2.getText();
				String OS_form=textField_1.getText();
				String OS;
				String cpu_f=textField.getText();
				String cpu;
				String ram_f=t1.getText();
				String ram;
				String rom_f=t2.getText();
				String rom;
				String gpu_f=t3.getText();
				String gpu;
				if(s_name.isEmpty() || OS_form.isEmpty() || cpu_f.isEmpty() || ram_f.isEmpty() || rom_f.isEmpty() || gpu_f.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"please fill up all the box\nor try the requirements button");
				}
				else
				{
				int x=0;
				 try {
			            Class.forName("oracle.jdbc.OracleDriver");
			            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "user name", "password");
			            String q1 = "select * from table where s_name=?";
			            PreparedStatement stmt = con.prepareStatement(q1);
			            stmt.setString(1, textField_2.getText());
			            ResultSet rs = stmt.executeQuery();

			            if (rs.next()) {
			                System.out.println("Found");
			                OS=rs.getString("OS");
			                cpu=rs.getString("CPU"); 
			                ram=rs.getString("RAM");
			                rom=rs.getString("ROM");
			                gpu=rs.getString("GPU");
			                System.out.println(""+OS+" "+cpu+" "+ram+" "+rom+" "+gpu);
			                if (OS==null)
			                {
			                	
			                }
			                else
			                {
			                	if (OS.equalsIgnoreCase(OS_form)) 
			                	{
			                        
			                    }
			                	else
			                	{
			                		x=x+1;
			                	}
			                }
			                
			                if (cpu==null)
			                {
			                	
			                }
			                else
			                {
			                	if (cpu.equalsIgnoreCase(cpu_f)) 
			                	{
			                       
			                    }
			                	else
			                	{
			                		x=x+1;
			                	}
			                }
			                
			                if (ram==null)
			                {
			                	
			                }
			                else
			                {
			                	if (ram.equalsIgnoreCase(ram_f)) 
			                	{
			                   
			                	}
			                	else
			                	{
			                		x=x+1;
			                	}
			                }
			                
			                if (rom==null)
			                {
			                	
			                }
			                else
			                {
			                	if (rom.equalsIgnoreCase(rom_f)) 
			                	{
			                       
			                    }
			                	else
			                	{
			                		x=x+1;
			                	}
			                }
			                
			                if (gpu==null)
			                {
			                	
			                }
			                else
			                {
			                	if (gpu.equalsIgnoreCase(gpu_f)) 
			                	{
			                        
			                    }
			                	else
			                	{
			                		x=x+1;
			                	}
			                }
			            }
			            
			            else
			            {
			                System.out.println("Data not found\nsoon we will update our database\nstay connected with us\n");
			            }
			          System.out.print(x);
			            con.close();
			        } catch (Exception ex) {
			            System.out.println(ex);
			        }

				
				String link;
				if(x!=0)
				{
					try {
			            Class.forName("oracle.jdbc.OracleDriver");
			            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "username", "password");
			            String q1 = "select * from table2 where s_name=?";
			            PreparedStatement stmt = con.prepareStatement(q1);
			            stmt.setString(1, s_name);
			            ResultSet rs = stmt.executeQuery();

			            if (rs.next()) {
			                System.out.println("Found");
			                link=rs.getString("LINK");
			                Ending p=new Ending();
			                dispose();
			                p.j1.setText(""+link);
							p.setVisible(true);
							JOptionPane.showMessageDialog(null,""+s_name+" cant run in your pc\nfollow the link to do same work");
							
			            }
			            else
			            {
			            	Ending p=new Ending();
			            	System.out.println("cant provide alternate link");
			            	dispose();
			            	p.j1.setText("cant find your software");
							p.setVisible(true);
			            }
			            con.close();
				}
					catch (Exception ex) {
			            System.out.println(ex);
			        }
					
					
					
				
			}
				else
				{
					Ending p=new Ending();
					p.j1.setText(""+s_name+" can run in your pc");
					p.setVisible(true);
					dispose();
				}
			
		   }
			} 
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(334, 394, 106, 47);
		contentPane.add(btnNewButton);
		
		JButton btnRequirements = new JButton("Requirements");
		btnRequirements.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_name = textField_2.getText();
				String OS;
				String cpu;
				String ram;
				String rom;
				String gpu;
				if(s_name.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"please write down the software name on the first box");
				}
				else
				{
					try {
			            Class.forName("oracle.jdbc.OracleDriver");
			            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "user name", "password");
			            String q1 = "select * from table where s_name=?";
			            PreparedStatement stmt = con.prepareStatement(q1);
			            stmt.setString(1, textField_2.getText());
			            ResultSet rs = stmt.executeQuery();

			            if (rs.next()) {
			                System.out.println("Found");
			                OS=rs.getString("OS");
			                cpu=rs.getString("CPU"); 
			                ram=rs.getString("RAM");
			                rom=rs.getString("ROM");
			                gpu=rs.getString("GPU");
			                System.out.println(""+OS+" "+cpu+" "+ram+" "+rom+" "+gpu);
			                dispose();
							Requirements r=new Requirements();
							r.t0.setText(s_name);
							r.t1.setText(OS);
							r.t2.setText(cpu);
							r.t3.setText(ram);
							r.t4.setText(rom);
							r.t5.setText(gpu);
							r.setVisible(true);
			            }
			            else
			            {
			            	System.out.println("this is not in our data base");
			            	JOptionPane.showMessageDialog(null,"we are sorry\nThis software information is missing in our database\nwe will soon  update our data base");
			            	
			            }
			            con.close();
					}
					catch (Exception ex) {
			            System.out.println(ex);
			        }
					
					
				}
				
			}
		});
		btnRequirements.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRequirements.setBounds(303, 451, 174, 47);
		contentPane.add(btnRequirements);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(398, 145, 141, 38);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(398, 84, 141, 38);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(398, 23, 141, 38);
		contentPane.add(textField_2);
	}
}
