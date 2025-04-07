package exs;

import java.util.Scanner;

public class sall {
    static final int n=3;
    static int linha = -1;
    static double sal[] = new double [n];
    static int [] ida = new int[n];

        public static void novaLinha(Scanner leitor) {
            linha+=1;
            System.out.println( "\nDigite salário e idade:" );
            sal[ linha ] = leitor.nextDouble();
            ida[ linha ] = leitor.nextInt(); 
        }
        public static void main ( String args[] ) {
            Scanner leitor = new Scanner(System.in);
            double aux, itemmenu;
            
            while (true) {
                System.out.print( "\n1 Ler\n2 Mostrar\n3 Sair\nitem:");
                itemmenu = leitor.nextInt();

            if (itemmenu == 1) { 
                novaLinha(leitor); 
            }
             else if (itemmenu == 2){ 
                for ( int i=0; i<=linha; i++){ 
                    aux = sal[i] * 1.1; // aumento de 10%
                    System.out.println(String.format( "%.1f",sal[i])+" "+aux+" - "+ida[i]);
                }
                } else if (itemmenu == 3) break;
 } System.exit( 0); }
}
