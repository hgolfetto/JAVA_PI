package exs;

public class inc {
    public static void main(String[] args) {
        int contador = 0, diminuir = 20, numero = 10;

        while(contador < numero){
            contador += 1;
            diminuir -= 5;
        }

        System.out.println("Contagem = " + contador);
        System.out.println("Decremento = " + diminuir);
    }
}
