import java.util.Scanner;
public class ConvertirTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrar valor per teclat! 
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra una temperatura en Farenheit amb decimals: ");
        double temperatureF=teclat.nextDouble();
        
        // convertir temp graus Fahrenheit i els converteixi en graus Celcius.
        double TemperatureC = ((temperatureF -32)*5)/9;
        String resultat = String.format("%.2f", TemperatureC);
        System.out.println("La temperatura en graus celcius: " + resultat + "ºC.");
    }
}