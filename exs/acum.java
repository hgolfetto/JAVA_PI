package exs;

import java.util.Scanner;

public class acum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String resp = "sim";
        int valor = 0;
        double saldo = 0;

        while (resp.equals("sim")) {
            System.out.println("Digite o valor: ");
            valor = read.nextInt();

            saldo += valor;

            System.out.println("Deseja continuar? ");
            resp = read.next();
        }

        System.out.println("Saldo acumulado: " + saldo);
    }
}
