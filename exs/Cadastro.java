package exs;

import java.util.Scanner;

public class Cadastro {
    // Vetores para guardar os dados
    String[] nomes = new String[3];
    int[] idades = new int[3];
    double[] salarios = new double[3];
    double[] novoSalarios = new double[3];

    Scanner sc = new Scanner(System.in);

    // Método para ler os dados do teclado
    public void lerDados() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.print("Digite a idade: ");
            idades[i] = Integer.parseInt(sc.nextLine());

            System.out.print("Digite o salário: ");
            salarios[i] = Double.parseDouble(sc.nextLine());

            // Calcular novo salário com base na idade
            if (idades[i] > 18) {
                novoSalarios[i] = salarios[i] * 1.15; // aumento de 15%
            } else {
                novoSalarios[i] = salarios[i] * 1.08; // aumento de 8%
            }
            System.out.println();
        }
    }
    // Método para mostrar os dados na tela
    public void mostrarDados() {
        System.out.println("\n--- Dados Cadastrados ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Salário original: R$" + salarios[i]);
            System.out.println("Novo salário: R$" + String.format("%.2f", novoSalarios[i]));
            System.out.println();
        }
    }
    // Menu para o usuário escolher o que fazer
    public void menu() {
        int opcao;
        do {
            System.out.println("1 - Cadastrar dados");
            System.out.println("2 - Mostrar dados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                lerDados();
            } else if (opcao == 2) {
                mostrarDados();
            } else if (opcao == 0) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente de novo.");
            }
            System.out.println();
        } while (opcao != 0);
    }
    // Método principal
    public static void main(String[] args) {
        Cadastro sc = new Cadastro();
        sc.menu();
    }
}

