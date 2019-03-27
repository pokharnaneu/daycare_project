package edu.neu.csye6200;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class DayCareApp {

	private JFrame frame;
	private HibernateSessionFactory hibernateSessionFactory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayCareApp window = new DayCareApp();
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
	public DayCareApp() {
		initialize();
		startDb();
	}
	
	private void startDb() {
		
		hibernateSessionFactory = new HibernateSessionFactory();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
