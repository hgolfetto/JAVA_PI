package poo;

import javax.swing.JOptionPane;


public class Media {
    public double lerN1(){
        double n1;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1:"));
        return n1;
    }

    public double lerN2(){
        double n2;
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2:"));
        return n2;
    }

    public double getMedia(double n1, double n2) {
        return ((n1 + n2) / 2);
    }

    public void exibir(double media){
        String status;
    
        if(media < 6){
            status = "Aluno reprovado! Média: " + String.format("%.2f", media);
        } else {
            status = "Aluno Aprovado! Média:" + String.format("%.2f", media);
        }
        JOptionPane.showMessageDialog(null, status);
    }


        public void controle(){
        double nota1 = 0, nota2 = 0, media = 0;
        String linhasMenu = "";
        int itemMenu = 0;
    
        linhasMenu = "***Menu de Controle***\n 1 Ler Notas...";
        linhasMenu += "\n 2 Calcular média...\n 3 Mostrar status e média...";
        linhasMenu += "\n 4 Sair...";
    
        while (true) {
            itemMenu = Integer.parseInt(JOptionPane.showInputDialog(null, linhasMenu));
    
            switch (itemMenu) {
                case 1 -> {nota1 = lerN1();
                          nota2 = lerN2();  
                    }
    
                case 2 -> {media = getMedia(nota1, nota2);
                           JOptionPane.showMessageDialog(null, "Média calculada!");  
                  }
                
                case 3 -> exibir(media);
    
                case 4 -> System.exit(0);
            }
        }
    
    }
    public static void main(String[] args) {
        Media Cmedia = new Media();
        Cmedia.controle();
    }
    
}







