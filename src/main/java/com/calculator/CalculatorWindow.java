package com.calculator;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Frame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSpinner;
import javax.swing.border.CompoundBorder;

/**
 * @author ulrich Takoukam
 */
public class CalculatorWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField oOperationTextField;
	private JPanel panel_1;
	private JTextField oOperationResultField;
	
	
	
	
	
	CalculatorWindow(String iStrWindow, Dimension iODimension){
		super(iStrWindow);
		getContentPane().setBackground(new Color(36, 31, 49));
		setBackground(new Color(36, 31, 49));
		setTitle("Calculator");
		setResizable(false);
		setSize(new Dimension(600, 300));
		//this.setSize(iODimension);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(53, 132, 228));
		toolBar.setPreferredSize(new Dimension(15, 80));
		toolBar.setOrientation(SwingConstants.VERTICAL);
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
		oOperationTextField = new JTextField();
		oOperationTextField.setBorder(null);
		oOperationTextField.setAlignmentY(Component.TOP_ALIGNMENT);
		oOperationTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
		oOperationTextField.setPreferredSize(new Dimension(13, 30));
		oOperationTextField.setBackground(new Color(53, 132, 228));
		oOperationTextField.setToolTipText("write your operation");
		oOperationTextField.setText("s");
		oOperationTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBar.add(oOperationTextField);
		oOperationTextField.setColumns(60);
		
		oOperationResultField = new JTextField();
		oOperationResultField.setBorder(null);
		oOperationResultField.setToolTipText("write your operation");
		oOperationResultField.setPreferredSize(new Dimension(13, 40));
		oOperationResultField.setHorizontalAlignment(SwingConstants.RIGHT);
		oOperationResultField.setColumns(60);
		oOperationResultField.setBackground(new Color(53, 132, 228));
		oOperationResultField.setAlignmentY(0.0f);
		oOperationResultField.setAlignmentX(0.0f);
		toolBar.add(oOperationResultField);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 31, 49));
		panel.setPreferredSize(new Dimension(300, 10));
		getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(36, 31, 49));
		panel_1.setPreferredSize(new Dimension(300, 35));
		panel.add(panel_1);
		
		JButton oButtonCancel = new JButton("Annuler");
		oButtonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				oOperationTextField.setText("");
			}
		});
		oButtonCancel.setBackground(new Color(210, 180, 140));
		
		JButton oButtonClean = new JButton("Effacer");
		oButtonClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					StringBuffer strNewOperation = new StringBuffer(oOperationTextField.getText());
					strNewOperation.deleteCharAt(strNewOperation.length() - 1);
					oOperationTextField.setText( strNewOperation.toString() );
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("empty operation");
				}
				
			}
		});
		oButtonClean.setBackground(new Color(165, 29, 45));
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		panel_1.add(oButtonCancel);
		panel_1.add(oButtonClean);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(36, 31, 49));
		panel_3.setPreferredSize(new Dimension(250, 100));
		panel_3.setMinimumSize(new Dimension(10, 300));
		panel.add(panel_3);
		
		JButton oButtonMinus = new JButton("-");
		oButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					oOperationTextField.setText(oOperationTextField.getText() + "-");
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("empty operation");
					oOperationTextField.setText(oOperationTextField.getText() + "-");
				}
			}
		});
		
		JButton oButtonPlus = new JButton("+");
		oButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					oOperationTextField.setText(oOperationTextField.getText() + "+");
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("empty operation");
					oOperationTextField.setText(oOperationTextField.getText() + "+");
				}
			}
		});
		
		JButton oButtonMultiplication = new JButton("*");
		oButtonMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					oOperationTextField.setText(oOperationTextField.getText() + "*");
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("empty operation");
					oOperationTextField.setText(oOperationTextField.getText() + "*");
				}
			}
		});
		
		JButton oButtonPercentage = new JButton("%");
		oButtonPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					oOperationTextField.setText(oOperationTextField.getText() + "%");
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("empty operation");
					oOperationTextField.setText(oOperationTextField.getText() + "%");
				}
			}
		});
		
		JButton oButtonMPlus = new JButton("M+");
		oButtonMPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Operations.appendToMemory(Operations.getOperationResult(oOperationTextField.getText()));
			}
		});
		
		JButton oButtonMR = new JButton("MR");
		oButtonMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				oOperationTextField.setText(oOperationTextField.getText() + new Double(Operations.getFromMemory()).toString()); ;
			}
		});
		
		JButton oButtonEqual = new JButton("=");
		oButtonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				oOperationTextField.setText(new Double(Operations.getOperationResult(oOperationTextField.getText())).toString() );
			}
		});
		oButtonEqual.setBackground(new Color(60, 179, 113));
		panel_3.setLayout(new GridLayout(0, 4, 0, 0));
		panel_3.add(oButtonMinus);
		panel_3.add(oButtonPlus);
		panel_3.add(oButtonMultiplication);
		
		JButton oButtonRatio = new JButton("/");
		oButtonRatio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					oOperationTextField.setText(oOperationTextField.getText() + "/");
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("empty operation");
					oOperationTextField.setText(oOperationTextField.getText() + "/");
				}
			}
		});
		panel_3.add(oButtonRatio);
		panel_3.add(oButtonPercentage);
		
		JButton oButtonSqrt = new JButton("√");
		oButtonSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					oOperationTextField.setText(oOperationTextField.getText() + "√");
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("empty operation");
					oOperationTextField.setText(oOperationTextField.getText() + "√");
				}
			}
		});
		panel_3.add(oButtonSqrt);
		panel_3.add(oButtonMPlus);
		panel_3.add(oButtonMR);
		
		JButton oButtonMS = new JButton("MC");
		oButtonMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Operations.resetMemory();
			}
		});
		panel_3.add(oButtonMS);
		panel_3.add(oButtonEqual);
		
		JPanel panel_2 = new JPanel();
		panel_2.setSize(new Dimension(300, 0));
		panel_2.setPreferredSize(new Dimension(300, 300));
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton oButtonNine = new JButton("9");
		panel_2.add(oButtonNine);
		
		JButton oButtonHeight = new JButton("8");
		panel_2.add(oButtonHeight);
		
		JButton oButtonSeven = new JButton("7");
		panel_2.add(oButtonSeven);
		
		JButton oButtonSix = new JButton("6");
		panel_2.add(oButtonSix);
		
		JButton oButtonFive = new JButton("5");
		panel_2.add(oButtonFive);
		
		JButton oButtonFour = new JButton("4");
		panel_2.add(oButtonFour);
		
		JButton oButtonthree = new JButton("3");
		panel_2.add(oButtonthree);
		
		JButton oButtonTwo = new JButton("2");
		panel_2.add(oButtonTwo);
		
		JButton oButtonOne = new JButton("1");
		panel_2.add(oButtonOne);
		
		JButton oButtonZero = new JButton("0");
		panel_2.add(oButtonZero);
		
		JButton oButtonMinusAndPlus = new JButton("+/-");
		panel_2.add(oButtonMinusAndPlus);
		
		JButton oButtonPoint = new JButton(".");
		panel_2.add(oButtonPoint);
		
		JLabel label = new JLabel("");
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("");
		panel_2.add(label_1);
		
	}
	
	public static void main(String ...args) {
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CalculatorWindow oCalculatorWindow = new CalculatorWindow("Calculator", new Dimension(600,400));
		oCalculatorWindow.setVisible(true);
	}

}
