package number.java;

import javax.swing.JOptionPane;

public class GuessNumber {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Think of a number 1-10");

		JOptionPane.showMessageDialog(null,"The number is "+

		(1 + (int)(Math.random() * 10)));

	}

}
