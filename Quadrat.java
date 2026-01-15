import java.util.Scanner;
public class Quadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entra el valor del costat per teclat!!
        Scanner teclat = new Scanner(System.in);
        System.out.print("Fica la longitut del cuadrat: ");
        int costat =teclat.nextInt();
        int perimetre = costat*4;
        int area = costat*costat;
        System.out.print("El perimetre del quadrat es de " + perimetre + " metres." );
        System.out.print("L'Area del quadrat es de " + area + " metres." );
        
        // mostrar el perímetre i l'àrea del quadrat.
        
    }
}