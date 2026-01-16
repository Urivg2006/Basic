import java.util.Scanner;
public class HoresMinutsSegons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        /*Catalan*/System.out.print("Afegeix uns segons: ");
        /*English*/ /*System.out.print("Add seconds: ");*/
        int segons;  // Exemple:   41668;
        segons=teclat.nextInt();
        double hores=segons/3600;
        double residu=segons % 3600;
        double minuts= residu/60;
        double residu_2=segons%60;
        double segons_def=residu_2%60;
        /*Catalan*/System.out.print("Això son: " + hores + " hores amb " + minuts + " minut i " + segons_def + " segons.");
        /*English*//*System.out.print("This is: " + hores + " hours with " + minuts + " minutes and " + segons_def + " seconds.");*/
        
    }
}