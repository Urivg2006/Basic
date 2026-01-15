import java.util.Scanner;
public class preu {
     public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Quants productes has comprat?");
        int productes =teclat.nextInt();
        System.out.print("Quan val cada producte?");
        double preu = teclat.nextDouble();
        System.out.print("Quin descompte aplicarem? (%)");
        int descompte= teclat.nextInt();
        double preuTotal = productes * preu * (1 - descompte / 100.0);
        System.out.println("El valor a pagar serà:" + preuTotal + "€" );
        
        
        
     }
    }