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
    System.out.println("Saldo: " + saldo);
   } 
}
