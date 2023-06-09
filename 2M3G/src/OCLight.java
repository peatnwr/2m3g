import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.swing.SwingConstants;
import com.fazecast.jSerialComm.*;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

public class OCLight extends JFrame {
	
	// ------------------------------ // ------------------------------ //
	// - - - - - - - - - - - - - Set Variable - - - - - - - - - - - - - //
	// ------------------------------ // ------------------------------ //
	
	private SerialPort comPort;
	private String comPortName = "COM7";
	private int baudRate = 9600;
	static PrintWriter outPut;
	private JFrame frmOclight;
	
	protected static int led1 = 0;
	protected static int led2 = 0;
	protected static int led3 = 0;
	protected static int led4 = 0;
	protected static int led5 = 0;
	protected static int led6 = 0;
	protected static int led7 = 0;
	protected static int led8 = 0;
	protected static int led9 = 0;
	protected static int led10 = 0;
	protected static int led11 = 0;

	// ------------------------------ // ------------------------------ //
	// - - - - - - - - - - - Launch Application - - - - - - - - - - - - //
	// ------------------------------ // ------------------------------ //
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OCLight frmOclight = new OCLight();
					frmOclight.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// ------------------------------ // ------------------------------ //
	// - - - - - - - - - - - - Send data Method - - - - - - - - - - - - //
	// ------------------------------ // ------------------------------ //
	
	public void sendData(char... data) {
		try {
			for (int i = 0; i < data.length; i++)
				System.out.println((int) data[i]);
			for (int n = 0; n < data.length; n++)
				outPut.print(data[n]);
				outPut.flush();
		}
		catch (Exception sendData) {
			System.out.println(sendData);
		}
	}
	
	// ------------------------------ // ------------------------------ //
	// - - - - - - - - - - Create the application - - - - - - - - - - - //
	// ------------------------------ // ------------------------------ //
	
	public OCLight() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Windows\\Desktop\\project aria\\2M3G\\icon\\icon_light.png"));
		setTitle("OCLight : Main Program");
		getContentPane().setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		setBackground(Color.DARK_GRAY);
		setBounds(100, 100, 700, 630);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		initialize();
		
	}
	
	// ------------------------------ // ----------------------------- //
	// - - - - - - - - - - - - - Create Object - - - - - - - - - - - - //
	// ------------------------------ // ----------------------------- //

	private void initialize() {
		
		// ------------------------------ // ----------------------------- //
		// - - - - - - - - - - - - Create panelAnalog  - - - - - - - - - - //
		// ------------------------------ // ----------------------------- //
		
			JPanel panelAnalog = new JPanel();
			panelAnalog.setBackground(Color.DARK_GRAY);
			panelAnalog.setForeground(Color.BLACK);
			panelAnalog.setBounds(299, 99, 275, 414);
			getContentPane().add(panelAnalog);
			panelAnalog.setLayout(null);
			
			JLabel lblSlide1 = new JLabel("0");
			lblSlide1.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide1.setForeground(Color.WHITE);
			lblSlide1.setBounds(244, 8, 21, 23);
			panelAnalog.add(lblSlide1);
			
			JSlider slider1 = new JSlider();
			slider1.setValue(0);
			slider1.setMaximum(255);
			slider1.setBackground(Color.DARK_GRAY);
			slider1.setBounds(10, 8, 230, 23);
			panelAnalog.add(slider1);
	
			JLabel lblSlide2 = new JLabel("0");
			lblSlide2.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide2.setForeground(Color.WHITE);
			lblSlide2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide2.setBounds(244, 42, 21, 23);
			panelAnalog.add(lblSlide2);
			
			JSlider slider2 = new JSlider();
			slider2.setValue(0);
			slider2.setMaximum(255);
			slider2.setBackground(Color.DARK_GRAY);
			slider2.setBounds(10, 42, 230, 23);
			panelAnalog.add(slider2);
			
			JLabel lblSlide3 = new JLabel("0");
			lblSlide3.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide3.setForeground(Color.WHITE);
			lblSlide3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide3.setBounds(244, 76, 21, 23);
			panelAnalog.add(lblSlide3);
			
			JSlider slider3 = new JSlider();
			slider3.setValue(0);
			slider3.setMaximum(255);
			slider3.setBackground(Color.DARK_GRAY);
			slider3.setBounds(10, 76, 230, 23);
			panelAnalog.add(slider3);
			
			JLabel lblSlide4 = new JLabel("0");
			lblSlide4.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide4.setForeground(Color.WHITE);
			lblSlide4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide4.setBounds(244, 110, 21, 23);
			panelAnalog.add(lblSlide4);
			
			JSlider slider4 = new JSlider();
			slider4.setValue(0);
			slider4.setMaximum(255);
			slider4.setBackground(Color.DARK_GRAY);
			slider4.setBounds(10, 110, 230, 23);
			panelAnalog.add(slider4);
			
			JLabel lblSlide5 = new JLabel("0");
			lblSlide5.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide5.setForeground(Color.WHITE);
			lblSlide5.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide5.setBounds(244, 144, 21, 23);
			panelAnalog.add(lblSlide5);
			
			JSlider slider5 = new JSlider();
			slider5.setValue(0);
			slider5.setMaximum(255);
			slider5.setBackground(Color.DARK_GRAY);
			slider5.setBounds(10, 144, 230, 23);
			panelAnalog.add(slider5);
			
			JLabel lblSlide6 = new JLabel("0");
			lblSlide6.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide6.setForeground(Color.WHITE);
			lblSlide6.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide6.setBounds(244, 178, 21, 23);
			panelAnalog.add(lblSlide6);
			
			JSlider slider6 = new JSlider();
			slider6.setValue(0);
			slider6.setMaximum(255);
			slider6.setBackground(Color.DARK_GRAY);
			slider6.setBounds(10, 178, 230, 23);
			panelAnalog.add(slider6);
			
			JLabel lblSlide7 = new JLabel("0");
			lblSlide7.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide7.setForeground(Color.WHITE);
			lblSlide7.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide7.setBounds(244, 212, 21, 23);
			panelAnalog.add(lblSlide7);
			
			JSlider slider7 = new JSlider();
			slider7.setValue(0);
			slider7.setMaximum(255);
			slider7.setBackground(Color.DARK_GRAY);
			slider7.setBounds(10, 212, 230, 23);
			panelAnalog.add(slider7);
			
			JLabel lblSlide8 = new JLabel("0");
			lblSlide8.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide8.setForeground(Color.WHITE);
			lblSlide8.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide8.setBounds(244, 246, 21, 23);
			panelAnalog.add(lblSlide8);
			
			JSlider slider8 = new JSlider();
			slider8.setValue(0);
			slider8.setMaximum(255);
			slider8.setBackground(Color.DARK_GRAY);
			slider8.setBounds(10, 246, 230, 23);
			panelAnalog.add(slider8);
			
			JLabel lblSlide9 = new JLabel("0");
			lblSlide9.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide9.setForeground(Color.WHITE);
			lblSlide9.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide9.setBounds(244, 280, 21, 23);
			panelAnalog.add(lblSlide9);
			
			JSlider slider9 = new JSlider();
			slider9.setValue(0);
			slider9.setMaximum(255);
			slider9.setBackground(Color.DARK_GRAY);
			slider9.setBounds(10, 280, 230, 23);
			panelAnalog.add(slider9);
			
			JLabel lblSlide10 = new JLabel("0");
			lblSlide10.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide10.setForeground(Color.WHITE);
			lblSlide10.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide10.setBounds(244, 314, 21, 23);
			panelAnalog.add(lblSlide10);
			
			JSlider slider10 = new JSlider();
			slider10.setValue(0);
			slider10.setMaximum(255);
			slider10.setBackground(Color.DARK_GRAY);
			slider10.setBounds(10, 314, 230, 23);
			panelAnalog.add(slider10);
			
			JLabel lblSlide11 = new JLabel("0");
			lblSlide11.setHorizontalAlignment(SwingConstants.CENTER);
			lblSlide11.setForeground(Color.WHITE);
			lblSlide11.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSlide11.setBounds(244, 348, 21, 23);
			panelAnalog.add(lblSlide11);
			
			JSlider slider11 = new JSlider();
			slider11.setValue(0);
			slider11.setMaximum(255);
			slider11.setBackground(Color.DARK_GRAY);
			slider11.setBounds(10, 348, 230, 23);
			panelAnalog.add(slider11);
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - addAction panelAnalog - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //			
			
			lblSlide1.setLabelFor(slider1);
			slider1.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led1 = slider1.getValue();
					lblSlide1.setText(""+led1);
				}
			});
			
			slider2.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led2 = slider2.getValue();
					lblSlide2.setText(""+led2);
				}
			});
			
			slider3.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led3 = slider3.getValue();
					lblSlide3.setText(""+led3);
				}
			});
			
			slider4.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led4 = slider4.getValue();
					lblSlide4.setText(""+led4);
				}
			});
			
			slider5.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led5 = slider5.getValue();
					lblSlide5.setText(""+led5);
				}
			});
			
			slider6.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led6 = slider6.getValue();
					lblSlide6.setText(""+led6);
				}
			});
			
			slider7.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led7 = slider7.getValue();
					lblSlide7.setText(""+led7);
				}
			});
			
			slider8.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led8 = slider8.getValue();
					lblSlide8.setText(""+led8);
				}
			});
			
			slider9.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led9 = slider9.getValue();
					lblSlide9.setText(""+led9);
				}
			});
			
			slider10.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led10 = slider10.getValue();
					lblSlide10.setText(""+led10);
				}
			});
			
			slider11.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					led11 = slider11.getValue();
					lblSlide11.setText(""+led11);
				}
			});
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - - Create panelCommand - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //
			
			JPanel panelCommand = new JPanel();
			panelCommand.setBackground(Color.DARK_GRAY);
			panelCommand.setBounds(10, 99, 275, 414);
			getContentPane().add(panelCommand);
			panelCommand.setLayout(null);
			
			JLabel lbl1stGarage = new JLabel("1st garage");
			lbl1stGarage.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl1stGarage.setForeground(Color.WHITE);
			lbl1stGarage.setBounds(57, 11, 57, 14);
			panelCommand.add(lbl1stGarage);
			
			JToggleButton tglbtn1 = new JToggleButton("Click to turn on");
			tglbtn1.setBounds(124, 8, 141, 23);
			panelCommand.add(tglbtn1);
			
			JLabel lbl2ndGarage = new JLabel("2nd garage");
			lbl2ndGarage.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl2ndGarage.setForeground(Color.WHITE);
			lbl2ndGarage.setBounds(54, 45, 60, 14);
			panelCommand.add(lbl2ndGarage);
			
			JToggleButton tglbtn2 = new JToggleButton("Click to turn on");
			tglbtn2.setBounds(124, 42, 141, 23);
			panelCommand.add(tglbtn2);
			
			JLabel lblKitchen = new JLabel("Kitchen");
			lblKitchen.setForeground(Color.WHITE);
			lblKitchen.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblKitchen.setBounds(74, 79, 40, 14);
			panelCommand.add(lblKitchen);
			
			JToggleButton tglbtn3 = new JToggleButton("Click to turn on");
			tglbtn3.setBounds(124, 76, 141, 23);
			panelCommand.add(tglbtn3);
			
			JLabel lbl1stBath = new JLabel("1st bath");
			lbl1stBath.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl1stBath.setForeground(Color.WHITE);
			lbl1stBath.setBounds(66, 113, 48, 14);
			panelCommand.add(lbl1stBath);
			
			JToggleButton tglbtn4 = new JToggleButton("Click to turn on");
			tglbtn4.setBounds(124, 110, 141, 23);
			panelCommand.add(tglbtn4);
			
			JLabel lbl2ndBath = new JLabel("2nd bath");
			lbl2ndBath.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl2ndBath.setForeground(Color.WHITE);
			lbl2ndBath.setBounds(64, 147, 50, 14);
			panelCommand.add(lbl2ndBath);
			
			JToggleButton tglbtn5 = new JToggleButton("Click to turn on");
			tglbtn5.setBounds(124, 144, 141, 23);
			panelCommand.add(tglbtn5);
			
			JLabel lbl1stFloor1 = new JLabel("1st floor 1");
			lbl1stFloor1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl1stFloor1.setForeground(Color.WHITE);
			lbl1stFloor1.setBounds(58, 181, 56, 14);
			panelCommand.add(lbl1stFloor1);
			
			JToggleButton tglbtn6 = new JToggleButton("Click to turn on");
			tglbtn6.setBounds(124, 178, 141, 23);
			panelCommand.add(tglbtn6);
			
			JLabel lbl1stFloor2 = new JLabel("1st floor 2");
			lbl1stFloor2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl1stFloor2.setForeground(Color.WHITE);
			lbl1stFloor2.setBounds(59, 215, 55, 14);
			panelCommand.add(lbl1stFloor2);
			
			JToggleButton tglbtn7 = new JToggleButton("Click to turn on");
			tglbtn7.setBounds(124, 212, 141, 23);
			panelCommand.add(tglbtn7);
			
			JLabel lblStair = new JLabel("Stair");
			lblStair.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblStair.setForeground(Color.WHITE);
			lblStair.setBounds(88, 249, 26, 14);
			panelCommand.add(lblStair);
			
			JToggleButton tglbtn8 = new JToggleButton("Click to turn on");
			tglbtn8.setBounds(124, 246, 141, 23);
			panelCommand.add(tglbtn8);
			
			JLabel lbl1stBedroom = new JLabel("1st bedroom");
			lbl1stBedroom.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl1stBedroom.setForeground(Color.WHITE);
			lbl1stBedroom.setBounds(44, 283, 70, 14);
			panelCommand.add(lbl1stBedroom);
			
			JToggleButton tglbtn9 = new JToggleButton("Click to turn on");
			tglbtn9.setBounds(124, 280, 141, 23);
			panelCommand.add(tglbtn9);
			
			JLabel lbl2ndBedroom1 = new JLabel("2nd bed room 1");
			lbl2ndBedroom1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl2ndBedroom1.setForeground(Color.WHITE);
			lbl2ndBedroom1.setBounds(25, 317, 89, 14);
			panelCommand.add(lbl2ndBedroom1);
			
			JToggleButton tglbtn10 = new JToggleButton("Click to turn on");
			tglbtn10.setBounds(124, 314, 141, 23);
			panelCommand.add(tglbtn10);
			
			JLabel lbl2ndBedroom2 = new JLabel("2nd bed room 2");
			lbl2ndBedroom2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl2ndBedroom2.setForeground(Color.WHITE);
			lbl2ndBedroom2.setBounds(25, 351, 89, 14);
			panelCommand.add(lbl2ndBedroom2);
			
			JToggleButton tglbtn11 = new JToggleButton("Click to turn on");
			tglbtn11.setBounds(124, 348, 141, 23);
			panelCommand.add(tglbtn11);
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - -  addAction panelCommand - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //
			
			tglbtn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn1.isSelected()) {
							slider1.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn1.setText("Click to turn off");
						} else {
							slider1.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn1.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn2.isSelected()) {
							slider2.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn2.setText("Click to turn off");
						} else {
							slider2.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn2.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn3.isSelected()) {
							slider3.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn3.setText("Click to turn off");
						} else {
							slider3.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn3.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn4.isSelected()) {
							slider4.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn4.setText("Click to turn off");
						} else {
							slider4.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn4.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn5.isSelected()) {
							slider5.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn5.setText("Click to turn off");
						} else {
							slider5.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn5.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn6.isSelected()) {
							slider6.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn6.setText("Click to turn off");
						} else {
							slider6.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn6.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn7.isSelected()) {
							slider7.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn7.setText("Click to turn off");
						} else {
							slider7.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn7.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn8.isSelected()) {
							slider8.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn8.setText("Click to turn off");
						} else {
							slider8.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn8.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn9.isSelected()) {
							slider9.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn9.setText("Click to turn off");
						} else {
							slider9.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn9.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn10.isSelected()) {
							slider10.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn10.setText("Click to turn off");
						} else {
							slider10.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn10.setText("Click to turn on");
						}
					}
				}
			});
			
			tglbtn11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn11.isSelected()) {
							slider11.setValue(255);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn11.setText("Click to turn off");
						} else {
							slider11.setValue(0);
							led1 = slider1.getValue();
							led2 = slider2.getValue();
							led3 = slider3.getValue();
							led4 = slider4.getValue();
							led5 = slider5.getValue();
							led6 = slider6.getValue();
							led7 = slider7.getValue();
							led8 = slider8.getValue();
							led9 = slider9.getValue();
							led10 = slider10.getValue();
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4,(char) led5, (char) led6, (char) led7, (char) led8,(char) led9, (char) led10, (char) led11);
							tglbtn11.setText("Click to turn on");
						}
					}
				}
			});
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - - Create panelApply - - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //
			
			JPanel panelApply = new JPanel();
			panelApply.setBounds(584, 99, 90, 414);
			getContentPane().add(panelApply);
			panelApply.setBackground(Color.DARK_GRAY);
			panelApply.setLayout(null);
			
			JButton btnApply1 = new JButton("Apply");
			btnApply1.setBounds(10, 8, 70, 23);
			panelApply.add(btnApply1);
			
			JButton btnApply2 = new JButton("Apply");
			btnApply2.setBounds(10, 42, 70, 23);
			panelApply.add(btnApply2);
			
			JButton btnApply3 = new JButton("Apply");
			btnApply3.setBounds(10, 76, 70, 23);
			panelApply.add(btnApply3);
			
			JButton btnApply4 = new JButton("Apply");
			btnApply4.setBounds(10, 110, 70, 23);
			panelApply.add(btnApply4);
			
			JButton btnApply5 = new JButton("Apply");
			btnApply5.setBounds(10, 144, 70, 23);
			panelApply.add(btnApply5);
			
			JButton btnApply6 = new JButton("Apply");
			btnApply6.setBounds(10, 178, 70, 23);
			panelApply.add(btnApply6);
			
			JButton btnApply7 = new JButton("Apply");
			btnApply7.setBounds(10, 212, 70, 23);
			panelApply.add(btnApply7);
			
			JButton btnApply8 = new JButton("Apply");
			btnApply8.setBounds(10, 246, 70, 23);
			panelApply.add(btnApply8);
			
			JButton btnApply9 = new JButton("Apply");
			btnApply9.setBounds(10, 280, 70, 23);
			panelApply.add(btnApply9);
			
			JButton btnApply10 = new JButton("Apply");
			btnApply10.setBounds(10, 314, 70, 23);
			panelApply.add(btnApply10);
			
			JButton btnApply11 = new JButton("Apply");
			btnApply11.setBounds(10, 348, 70, 23);
			panelApply.add(btnApply11);
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - -  addAction panelApply - - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //	
			
			btnApply1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn1.isSelected()) {
							led1 = slider1.getValue();
							sendData((char) led1);
							if (led1 == 0) {
								tglbtn1.setSelected(false);
								tglbtn1.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn2.isSelected()) {
							led2 = slider2.getValue();
							sendData((char) led2);
							if (led2 == 0) {
								tglbtn2.setSelected(false);
								tglbtn2.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn3.isSelected()) {
							led3 = slider3.getValue();
							sendData( (char) led3);
							if (led3 == 0) {
								tglbtn3.setSelected(false);
								tglbtn3.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn4.isSelected()) {	
							led4 = slider4.getValue();
							sendData((char) led4);
							if (led4 == 0) {
								tglbtn4.setSelected(false);
								tglbtn4.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn5.isSelected()) {
							led5 = slider5.getValue();
							sendData((char) led5);
							if (led5 == 0) {
								tglbtn5.setSelected(false);
								tglbtn5.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn6.isSelected()) {
							led6 = slider6.getValue();
							sendData((char) led6);
							if (led6 == 0) {
								tglbtn6.setSelected(false);
								tglbtn6.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn7.isSelected()) {
							led7 = slider7.getValue();
							sendData((char) led7);
							if (led7 == 0) {
								tglbtn7.setSelected(false);
								tglbtn7.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn8.isSelected()) {
							led8 = slider8.getValue();
							sendData((char) led8);
							if (led8 == 0) {
								tglbtn8.setSelected(false);
								tglbtn8.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn9.isSelected()) {
							led9 = slider9.getValue();
							sendData((char) led9);
							if (led9 == 0) {
								tglbtn9.setSelected(false);
								tglbtn9.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn10.isSelected()) {
							led10 = slider10.getValue();
							sendData((char) led10);
							if (led10 == 0) {
								tglbtn10.setSelected(false);
								tglbtn10.setText("Click to turn on");
							}
						}
					}
				}
			});

			btnApply11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						if (tglbtn11.isSelected()) {
							led11 = slider11.getValue();
							sendData((char) led11);
							if (led11 == 0) {
								tglbtn11.setSelected(false);
								tglbtn11.setText("Click to turn on");
							}
						}
					}
				}
			});
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - Create panelAllCommand  - - - - - - - - - //
			// ------------------------------ // ----------------------------- //			
			
			JPanel panelAllCommand = new JPanel();
			panelAllCommand.setBackground(Color.DARK_GRAY);
			panelAllCommand.setBounds(10, 523, 664, 53);
			getContentPane().add(panelAllCommand);
			panelAllCommand.setLayout(null);
			
			JButton btnOn = new JButton("Press to turn on all lights");
			btnOn.setBackground(new Color(168,248,159));
			btnOn.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnOn.setBounds(10, 11, 310, 28);
			panelAllCommand.add(btnOn);
			
			JButton btnOff = new JButton("Press to turn off all lights");
			btnOff.setBackground(new Color(245,125,119));
			btnOff.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnOff.setBounds(344, 11, 310, 28);
			panelAllCommand.add(btnOff);
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - addAction panelAllCommand - - - - - - - - - //
			// ------------------------------ // ----------------------------- //				
			
			btnOn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comPort.isOpen() == true) {
						slider1.setValue(255);
						led1 = slider1.getValue();
						slider2.setValue(255);
						led2 = slider2.getValue();
						slider3.setValue(255);
						led3 = slider3.getValue();
						slider4.setValue(255);
						led4 = slider4.getValue();
						slider5.setValue(255);
						led5 = slider5.getValue();
						slider6.setValue(255);
						led6 = slider6.getValue();
						slider7.setValue(255);
						led7 = slider7.getValue();
						slider8.setValue(255);
						led8 = slider8.getValue();
						slider9.setValue(255);
						led9 = slider9.getValue();
						slider10.setValue(255);
						led10 = slider10.getValue();
						slider11.setValue(255);
						led11 = slider11.getValue();
						sendData((char) led1, (char) led2, (char) led3, (char) led4, (char) led5, (char) led6, (char) led7, (char) led8, (char) led9, (char) led10, (char) led11);
						tglbtn1.setSelected(true);
						tglbtn1.setText("Click to turn off");
						tglbtn2.setSelected(true);
						tglbtn2.setText("Click to turn off");
						tglbtn3.setSelected(true);
						tglbtn3.setText("Click to turn off");
						tglbtn4.setSelected(true);
						tglbtn4.setText("Click to turn off");
						tglbtn5.setSelected(true);
						tglbtn5.setText("Click to turn off");
						tglbtn6.setSelected(true);
						tglbtn6.setText("Click to turn off");
						tglbtn7.setSelected(true);
						tglbtn7.setText("Click to turn off");
						tglbtn8.setSelected(true);
						tglbtn8.setText("Click to turn off");
						tglbtn9.setSelected(true);
						tglbtn9.setText("Click to turn off");
						tglbtn10.setSelected(true);
						tglbtn10.setText("Click to turn off");
						tglbtn11.setSelected(true);
						tglbtn11.setText("Click to turn off");
					}
				}
			});
			
			btnOff.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					try {
						if (comPort.isOpen() == true) {
							slider1.setValue(0);
							led1 = slider1.getValue();
							slider2.setValue(0);
							led2 = slider2.getValue();
							slider3.setValue(0);
							led3 = slider3.getValue();
							slider4.setValue(0);
							led4 = slider4.getValue();
							slider5.setValue(0);
							led5 = slider5.getValue();
							slider6.setValue(0);
							led6 = slider6.getValue();
							slider7.setValue(0);
							led7 = slider7.getValue();
							slider8.setValue(0);
							led8 = slider8.getValue();
							slider9.setValue(0);
							led9 = slider9.getValue();
							slider10.setValue(0);
							led10 = slider10.getValue();
							slider11.setValue(0);
							led11 = slider11.getValue();
							sendData((char) led1, (char) led2, (char) led3, (char) led4, (char) led5, (char) led6, (char) led7, (char) led8, (char) led9, (char) led10, (char) led11);
							tglbtn1.setSelected(false);
							tglbtn1.setText("Click to turn on");
							tglbtn2.setSelected(false);
							tglbtn2.setText("Click to turn on");
							tglbtn3.setSelected(false);
							tglbtn3.setText("Click to turn on");
							tglbtn4.setSelected(false);
							tglbtn4.setText("Click to turn on");
							tglbtn5.setSelected(false);
							tglbtn5.setText("Click to turn on");
							tglbtn6.setSelected(false);
							tglbtn6.setText("Click to turn on");
							tglbtn7.setSelected(false);
							tglbtn7.setText("Click to turn on");
							tglbtn8.setSelected(false);
							tglbtn8.setText("Click to turn on");
							tglbtn9.setSelected(false);
							tglbtn9.setText("Click to turn on");
							tglbtn10.setSelected(false);
							tglbtn10.setText("Click to turn on");
							tglbtn11.setSelected(false);
							tglbtn11.setText("Click to turn on");
						}
					} catch (Exception OffCatch) {
						System.out.println("An error has occurred");	
				}}
			});
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - - Create panelStatus  - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //		
			
			JPanel panelStatus = new JPanel();
			panelStatus.setBackground(Color.DARK_GRAY);
			panelStatus.setBounds(10, 11, 664, 77);
			getContentPane().add(panelStatus);
			panelStatus.setLayout(null);
			
			JButton btnDisconnect = new JButton("Disconnect");
			btnDisconnect.setBackground(new Color(245,125,119));
			btnDisconnect.setForeground(Color.BLACK);
			btnDisconnect.setBounds(344, 11, 310, 28);
			panelStatus.add(btnDisconnect);
			btnDisconnect.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JButton btnConnect = new JButton("Connect");
			btnConnect.setBackground(new Color(168,248,159));
			btnConnect.setForeground(Color.BLACK);
			btnConnect.setBounds(10, 11, 310, 28);
			panelStatus.add(btnConnect);
			btnConnect.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblStatus = new JLabel("Status :");
			lblStatus.setForeground(Color.WHITE);
			lblStatus.setBounds(10, 50, 624, 15);
			panelStatus.add(lblStatus);
			lblStatus.setHorizontalAlignment(SwingConstants.LEFT);
			lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - -  addAction panelStatus  - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //
			
			btnDisconnect.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(comPort.isOpen() == true) {
						slider1.setValue(0);
						led1 = slider1.getValue();
						slider2.setValue(0);
						led2 = slider2.getValue();
						slider3.setValue(0);
						led3 = slider3.getValue();
						slider4.setValue(0);
						led4 = slider4.getValue();
						slider5.setValue(0);
						led5 = slider5.getValue();
						slider6.setValue(0);
						led6 = slider6.getValue();
						slider7.setValue(0);
						led7 = slider7.getValue();
						slider8.setValue(0);
						led8 = slider8.getValue();
						slider9.setValue(0);
						led9 = slider9.getValue();
						slider10.setValue(0);
						led10 = slider10.getValue();
						slider11.setValue(0);
						led11 = slider11.getValue();
						sendData((char) led1, (char) led2, (char) led3, (char) led4, (char) led5, (char) led6, (char) led7, (char) led8, (char) led9, (char) led10, (char) led11);
						btnConnect.setEnabled(true);
						btnDisconnect.setEnabled(false);
						setBounds(100, 100, 700, 130);
						dispose();
						MainFrame LoginPage = new MainFrame();
						LoginPage.setVisible(true);
						try {
							comPort.closePort();
							System.out.println("Disconnected to Arduino successful.");
							lblStatus.setText("Status : Disconnected");
						}
						catch (Exception SerialPortDisConnection) {
							System.out.println(SerialPortDisConnection);
				}}}
			});
			
			btnConnect.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comPort = SerialPort.getCommPort(comPortName);
					comPort.setBaudRate(baudRate);
					if(comPort.isOpen() == false) {
						btnDisconnect.setEnabled(true);
						btnConnect.setEnabled(false);
						panelAnalog.setVisible(true);
						panelCommand.setVisible(true);
						panelAllCommand.setVisible(true);
						setBounds(450, 150, 700, 630);
						try {
							comPort.openPort();
							Thread.sleep(1000);
							outPut = new PrintWriter(comPort.getOutputStream());
						}
						catch (Exception SerialPortConnection) {
							System.out.println(SerialPortConnection);
						}
						System.out.println("Connection to Arduino successful.");
						lblStatus.setText("Status : Connected");
					} else {
						System.out.println("Error opening port");
						lblStatus.setText("Status : Opening USB failed");
					}
				}
			});

			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - - -  Create panel - - - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.GRAY);
			panel.setForeground(Color.WHITE);
			panel.setBounds(0, 0, 686, 604);
			getContentPane().add(panel);
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - - - Set Visible - - - - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //
			
			btnDisconnect.setEnabled(false);
			panelAllCommand.setVisible(false);
			panelAnalog.setVisible(false);
			panelCommand.setVisible(false);
			setBounds(100, 100, 700, 135);
		
	}
}
