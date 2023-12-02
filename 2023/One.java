import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class

import java.util.*; // Allows Character.isDigit()
import java.lang.*;
import java.lang.reflect.Array; 

class One {
    public static void main(String[] args) {
        // Array List of Calibration Values
        ArrayList<String> calibStrings = new ArrayList<String>();
        ArrayList<Character> calibValues = new ArrayList<Character>();

        calibStrings.add("a2b5j1a");    // 2 1
        calibStrings.add("a6f");        // 6 6
        calibStrings.add("bh3j6k9a");   // 3 9
        calibStrings.add("4n6");        // 4 6
        
        // Start -> Finish
        for (int x = 0; x < calibStrings.size(); x++) 
        { // Loop calib values
            String tempCalib = calibStrings.get(x);
            for (int y = 0; y < tempCalib.length(); y++) 
            { // Check individual calib values
                char letter = tempCalib.charAt(y);
                if (Character.isDigit(letter)) 
                {
                    //System.out.println("Number Found: " + letter);
                    calibValues.add(letter);
                    break;
                }
            }
        }

        for (int x = 0; x < calibStrings.size(); x++) 
        { // Loop calib values
            String tempCalib = calibStrings.get(x);
            //System.out.println(tempCalib);
            for (int y = tempCalib.length(); y == 0; y--) 
            { // Check individual calib values
                char letter = tempCalib.charAt(y);
                System.out.println(letter);
                if (Character.isDigit(letter)) 
                {
                    //System.out.println("Number Found: " + letter);
                    calibValues.add(letter);
                    break;
                }
            }
        }

        for (int w = 0; w < calibValues.size(); w++) 
        {
            System.out.println(calibValues.get(w));
        }
    }
}