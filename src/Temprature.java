import java.io.*;
public class Temprature {
    // function to convert temperature
    // from degree Celsius to Kelvin
    static float Celsius_to_Kelvin(float C) {
        return (float) (C + 273.15);
    }
    // Function to convert temperature
    // from degree Fahrenheit to Kelvin
    static float Fahrenheit_to_Kelvin( float F )
    {
        return 273.5f + ((F - 32.0f) * (5.0f/9.0f));
    }

    // Driver function
    public static void main(String[] args) {
        // variable to hold the
        // temperature in Celsius
        float C = 100;

        System.out.println("Temperature in Kelvin ( K ) = "
                + Celsius_to_Kelvin(C));

        float F = 100;
        System.out.print("Temperature in Kelvin ( K ) = "
                + (Math.round(Fahrenheit_to_Kelvin( F )
                *1000.0)/1000.0)) ;
    }
}
