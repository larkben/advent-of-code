import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class

import java.util.*; // Allows Character.isDigit()
import java.lang.*; 

class One {
    public static void main(String[] args) {
        // Array List of Calibration Values
        ArrayList<String> calibStrings = new ArrayList<String>();

        Scanner myInput = new Scanner(System.in);
        for (int i = 0; i < 4; i++) { // Loops 4 Values
            System.out.println("Enter calibration value: ");

            String userInput = myInput.nextLine(); // Reads Line of Input
            //System.out.println("You entered: " + userInput); // Debugging
            calibStrings.add(userInput);
        }
        
        for (int x = 0; x < calibStrings.size(); x++) 
        { // Loop calib values
            String tempCalib = calibStrings.get(x);
            for (int y = 0; y < tempCalib.length(); y++) 
            { // Check individual calib values
                char letter = tempCalib.charAt(y);
                if (Character.isDigit(letter)) 
                {
                    System.out.println("Number Found: " + letter);
                }
            }
        }
        
    }
}