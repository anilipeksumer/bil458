import javax.swing.JOptionPane;

public class StringToLong {
    public static void main(String[] args) {
        String stringInput = JOptionPane.showInputDialog(null, "Enter a string to convert to long integer:");
        
        	long longInt = 0;
            if (stringInput.matches("[0-9]+")) {
            	longInt = Long.parseLong(stringInput);
                if (!(longInt < Long.MIN_VALUE) || !(longInt > Long.MAX_VALUE)) {
                	JOptionPane.showMessageDialog(null, "The long integer value is: " + longInt);
                } 
            } 
            else {
                JOptionPane.showMessageDialog(null,"Invalid input string. Please enter a valid string consisting of digits only." );
            }
            JOptionPane.showMessageDialog(null,"Anıl İpeksümer - 21995548 \n BIL458 Homework #1" );

        }
       
    }

