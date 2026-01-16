import java.util.Scanner;
public class ConvertirTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrar valor per teclat! 
        // Enter value by keyboard!
        Scanner teclat = new Scanner(System.in);
        /*Catalan*/ System.out.println("Entra una temperatura en Farenheit amb decimals: ");
        /*English*/ /*System.out.println("Enter a temperature in Fahrenheit with decimals: ");*/
        double temperatureF=teclat.nextDouble();
        
        // convertir temp graus Fahrenheit i els converteixi en graus Celcius.
        // Convert temp degrees Fahrenheit and convert them to degrees Celsius.
        double TemperatureC = ((temperatureF -32)*5)/9;
        String resultat = String.format("%.2f", TemperatureC);
        /*Catalan*/ System.out.println("La temperatura en graus celcius: " + resultat + "ºC.");
        /*English*/ /*System.out.println("The temperature in Celsius: " + resultat + "ºC.");*/
    }
}