package ex18.base;
import java.util.Scanner;
/*
Exercise 18 - Temperature Converter
You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.

The formulas are

C = (F − 32) × 5 / 9
and

F = (C × 9 / 5) + 32
Example Output
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.
Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Break the program into functions that perform the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
Modify the program so it also supports the Kelvin scale.
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        String conv = myApp.readConv();
        String output = myApp.convMath(conv);
        myApp.displayOutput(output);
    }
    private String readConv(){
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.print("Press F to convert from Celsius to Fahrenheit.\n");
        System.out.print("Your choice: ");

        String conv = in.nextLine();
        conv = conv.toLowerCase();
        if(conv.equals("c") || conv.equals("f"))
            return conv;

        return "";
    }
    private String convMath(String conv){
        double temp;
        if(conv.equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double inputTemp = in.nextDouble();
            temp = (inputTemp- 32)*5/9;
            return "The temperature in Celsius is " + (int)temp + ".";
        }
        else if(conv.equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            double inputTemp = in.nextDouble();
            temp = (inputTemp * 9/5) + 32;

            return "The temperature in Fahrenheit is " + (int)temp + ".";

        }
      return "Error calculating, invalid conversion type";
    }
    private void displayOutput(String output){
        System.out.println(output);
    }
}
