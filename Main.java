package java01;
import java.util.*;
import javax.swing.JOptionPane;

public class Main{
	

	
	public static void main(String[] args) {
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
		if (age >=75) {
			JOptionPane.showMessageDialog(null, "ok Boomer");
		}
			
		else if(age>=18) {
			JOptionPane.showMessageDialog(null,"You are an adult!");
		}
		else {
			JOptionPane.showMessageDialog(null,"You are not an adult");
		}
							
		
	}
     		
	
}