package threeone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private static JLabel j1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

				Welcome frame = new Welcome();
				frame.setVisible(true);
				try {

					Thread.sleep(3000);
					frame.dispose();
					Project p=new Project();
					p.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
	}

	/**
	 * Create the frame.
	 */
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 673);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel j1 = new JLabel("Heavy Software Solution");
		j1.setHorizontalAlignment(SwingConstants.CENTER);
		j1.setFont(new Font("Tahoma", Font.BOLD, 30));
		j1.setBounds(111, 90, 594, 168);
		contentPane.add(j1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setIcon(new ImageIcon("D:\\new downloads\\Picsart_23-05-26_19-43-41-331.png"));
		lblNewLabel.setBounds(29, -55, 771, 681);
		contentPane.add(lblNewLabel);
	}
}
