import java.util.Scanner;
public class preu {
     public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        /*Catalan*/System.out.print("Quants productes has comprat?");
        /*English*/ /*System.out.print("How many products did you buy?");*/
        int productes =teclat.nextInt();
        /*Catalan*/System.out.print("Quan val cada producte?");
        /*English*/ /*System.out.print("How much does each product cost?");*/
        double preu = teclat.nextDouble();
        /*Catalan*/System.out.print("Quin descompte aplicarem? (%)");
        /*English*/ /*System.out.print("What discount will we apply? (%)");*/
        int descompte= teclat.nextInt();
        double preuTotal = productes * preu * (1 - descompte / 100.0);
        /*Catalan*/System.out.println("El valor a pagar serà:" + preuTotal + "€" );
        /*English*/ /*System.out.println("The value to pay will be:" + preuTotal + "€" );*/
        
        
        
     }
    }