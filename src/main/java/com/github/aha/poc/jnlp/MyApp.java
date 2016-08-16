package com.github.aha.poc.jnlp;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyApp extends JFrame {

	private static final long serialVersionUID = 4968624166243565348L;

	public MyApp() {
		super("Jave Web Start Example");
		this.setSize(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
	}

	public int addButtons(String text, int y) {
		JLabel label = new JLabel(text);
		label.setSize(450, 30);
		y += 20; 
		label.setLocation(10, y);
		this.getContentPane().add(label);
		return y;
	}

	public static void main(String[] args) {
		MyApp exp = new MyApp();
		int y = 0;
		y = exp.addButtons("System params:", y) + 15;
		y = exp.addButtons(String.format("- Java version=%s (%s bit)", System.getProperty("java.version"), System.getProperty("sun.arch.data.model")), y);
		y = exp.addButtons(String.format("- Java Home=%s", System.getProperty("java.home")), y);
		y = exp.addButtons(String.format("- Java Specification=%s", System.getProperty("java.specification.version")), y);
		
		exp.setVisible(true);
	}

}
