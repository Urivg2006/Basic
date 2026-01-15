import java.util.Scanner;
public class HoresMinutsSegons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Afegeix uns segons: ");
        int segons;  // Exemple:   41668;
        segons=teclat.nextInt();
        double hores=segons/3600;
        double residu=segons % 3600;
        double minuts= residu/60;
        double residu_2=segons%60;
        double segons_def=residu_2%60;
        System.out.print("Això son: " + hores + " hores amb " + minuts + " i " + segons_def);
        // posa el teu codi aquí sota
        // Entra primer el valor dels segons per teclat
        
    }
}