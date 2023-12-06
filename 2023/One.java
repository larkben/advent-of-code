import java.util.ArrayList; // import the ArrayList class

// Made by Benjamin Larkey

// https://adventofcode.com/2023/day/1

class One {
    public static void main(String[] args) {
        // Array List of Calibration Values
        ArrayList<String> calibStrings = new ArrayList<String>();
        ArrayList<Character> calibValues = new ArrayList<Character>();

        calibStrings.add("1abc2");    // 2 1
        calibStrings.add("pqr3stu8vwx");        // 6 6
        calibStrings.add("a1b2c3d4e5f");   // 3 9
        calibStrings.add("treb7uchet");        // 4 6
        
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
                    for (int k = tempCalib.length() - 1; k >= 0; k--)  
                    { // Check individual calib values
                        char lettertwo = tempCalib.charAt(k);
                        //System.out.println(letter);
                        if (Character.isDigit(lettertwo)) 
                        {
                            //System.out.println("Number Found: " + letter);
                            calibValues.add(lettertwo);
                            break;
                        }
                    }
                    break;
                }
            }
        }

        int totalValue = 0;

        // Convert to Integer and Add
        for (int w = 0; w < calibValues.size(); w = w + 2) {
            char numOne = calibValues.get(w);
            char numTwo = calibValues.get(w + 1);
            // merge two chars to one number

            int mergedNumber = Integer.parseInt("" + numOne + numTwo);

            totalValue += mergedNumber;
        }

        System.out.println(totalValue);
    }
}