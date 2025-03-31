package exs;

import java.util.Scanner;

public class vet {
   public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("Digite a quantidade de vetores: ");
    int qtd = read.nextInt();

    double numeros [] = new double[qtd];
    double saldo = 0, valor = 0, media = 0;
    int contador = 0;

    while (contador < qtd) {
        System.out.println("Digite um valor: ");
        numeros [contador] = read.nextDouble();

        saldo += numeros [contador];
        contador += 1;
    }
     
    media = saldo / contador;
    contador = 0;

    System.out.println("Os valores são: ");
    while (contador < qtd) {
        System.out.println(numeros[contador]);
        contador ++;
    }

    System.out.println(String.format("A média é %.2f", media));

   } 
}
