import java.util.Scanner;
public class Quadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entra el valor del costat per teclat!!
        // Enter the value of the side by keyboard!!
        Scanner teclat = new Scanner(System.in);
        /*Catalan*/System.out.print("Fica la longitut del cuadrat: ");
        /*English*/ /*System.out.print("Enter the length of the square: ");*/
        int costat =teclat.nextInt();
        int perimetre = costat*4;
        int area = costat*costat;
        /*Catalan*/System.out.print("El perimetre del quadrat es de " + perimetre + " metres." );
        /*English*/ /*System.out.print("The perimeter of the square is " + perimetre + " metres." );*/
        /*Catalan*/System.out.print("L'Area del quadrat es de " + area + " metres." );
        /*English*/ /*System.out.print("The area of the square is " + area + " metres." );*/
        
        // mostrar el perímetre i l'àrea del quadrat.
        // Display the perimeter and area of the square.
    }
}