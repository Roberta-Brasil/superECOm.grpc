package ds.Service2;


import java.awt.EventQueue;

import ds.Client.*;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ds.Service2.service2Grpc.service2BlockingStub;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class NewGUIApplication {

	private static service2BlockingStub blockingStub;	
	
	private JFrame frame;
	private JTextField textName1;
	private JTextField textName2;
	private JTextArea textResponse ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//overide the run method of runnable
			public void run() {
				try {
					NewGUIApplication window = new NewGUIApplication();
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
	public NewGUIApplication() {
		

		int port = 50052;
		String host = "localhost";
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = service2Grpc.newBlockingStub(channel);
		
		initialize();
		/*
		try {
			channel.shutdown().awaitTermination(50, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//Jframe is a window with a title bar
		frame.setTitle("SuperECOm - Monitoring Air / Water Quality");
		//set bounds can be done for frames panels and buttons
		frame.setBounds(100, 100, 500, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Box layout determines how components are laid out in the panel
		//Layout vertically in a col - box layout doesn't wrap
		//See: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		//Create JPanel
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		//Flow layout - items retain their size, are laid out horizontally and wrap

		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Create new label and add it to the panel
		JLabel lblNewLabel_1 = new JLabel(" Start Date : ");
		panel_service_1.add(lblNewLabel_1);
		
		//Input textbox
		textName1 = new JTextField();
		// add it to the panel
		panel_service_1.add(textName1);
		//How wide should input box be? - doesn't effect number that can be entered
		textName1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" End Date : ");
		panel_service_1.add(lblNewLabel_2);
		
		textName2 = new JTextField();
		panel_service_1.add(textName2);
		textName2.setColumns(10);
		
			
		//Set Up Button ....
		JButton btnSend = new JButton("Send the period to consult");
		
		//Add an action listener to our button
		btnSend.addActionListener(new ActionListener() {
			
			//implement action performed method
			//This will happen when the button is clicked
			public void actionPerformed(ActionEvent e) {

				//Retrieve data from GUI
				String name1 = textName1.getText();
				String name2 = textName2.getText();

				
				//Do some logic with our index or send it over
				
				String NaturalResourceRegistered = name1 + " and " + name2;
				
				
				//* This is the only gRPC in this method*/
				// we need to call the server from inside the button code

				
				resourceType request = resourceType.newBuilder().setMyResourceType(NaturalResourceRegistered).build();
				
				//populate the JTextArea in the panel

				registrationTypeResponse response = blockingStub.enterNaturalResourcetype(request);

				System.out.println("Response: " + response.getNaturalResourceRegistered());
				
								

			}
		}); //End of setup button
		
		//Add button to the panel
		panel_service_1.add(btnSend);
		
		
		textResponse = new JTextArea(3, 20);
		textResponse .setLineWrap(true);
		textResponse.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponse);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_1.add(scrollPane);
	}
		
		//====================================================================================
		
				
		private void initialize2() {
			
		
			frame = new JFrame();
			//Jframe is a window with a title bar
			frame.setTitle("SuperECOm - Please enter the period to consult");
			//set bounds can be done for frames panels and buttons
			frame.setBounds(100, 100, 500, 300);
			//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//Box layout determines how components are laid out in the panel
			//Layout vertically in a col - box layout doesn't wrap
			//See: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
			BoxLayout b2 = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
			
			frame.getContentPane().setLayout(b2);
			
		
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);
		
	
		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Create new label and add it to the panel
		JLabel lblNewLabel_21 = new JLabel(" Start Date : ");
		panel_service_2.add(lblNewLabel_21);
		
		//Input textbox
		textName1 = new JTextField();
		// add it to the panel
		panel_service_2.add(textName1);
		//How wide should input box be? - doesn't effect number that can be entered
		textName1.setColumns(10);
		
		JLabel lblNewLabel_211 = new JLabel(" End Date : ");
		panel_service_2.add(lblNewLabel_211);
		
		textName2 = new JTextField();
		panel_service_2.add(textName2);
		textName2.setColumns(10);
		
			
		//Set Up Button ....
		JButton btnSend2 = new JButton("Send the period to consult");
		
		//Add an action listener to our button
		btnSend2.addActionListener(new ActionListener() {
			
			//implement action performed method
			//This will happen when the button is clicked
			public void actionPerformed(ActionEvent e) {

				//Retrieve data from GUI
				String name1 = textName1.getText();
				String name2 = textName2.getText();

				
				//Do some logic with our index or send it over
				
				String NaturalResourceRegistered = name1 + " and " + name2;
				
				
				//* This is the only gRPC in this method*/
				// we need to call the server from inside the button code

				
				resourceType request = resourceType.newBuilder().setMyResourceType(NaturalResourceRegistered).build();
				
				//populate the JTextArea in the panel

				registrationTypeResponse response = blockingStub.enterNaturalResourcetype(request);

				System.out.println("Response: " + response.getNaturalResourceRegistered());
				
								

			}
		}); //End of setup button
		
		//Add button to the panel
		panel_service_2.add(btnSend2);
		
		
		textResponse = new JTextArea(3, 20);
		textResponse .setLineWrap(true);
		textResponse.setWrapStyleWord(true);
		
		JScrollPane scrollPane2 = new JScrollPane(textResponse);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_2.add(scrollPane2);
		
		
		//====================================================================================
		
		/*JPanel panel_service_3 = new JPanel();
		frame.getContentPane().add(panel_service_3);
			*/
		
	}

}
