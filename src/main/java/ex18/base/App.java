package ex18.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 William Weatherlow
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
