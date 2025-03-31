package quiz;

import javax.swing.JOptionPane;

public class quiz {
    public static void main(String[] args) {

        String jogador1, jogador2, respostaJogador1, respostaJogador2, resultado, pergunta, respostaCorreta;
        int pontosJogador1 = 0, pontosJogador2 = 0;
  
   JOptionPane.showMessageDialog(null, "Bem-vindo ao Jogo de Quiz!", "Quiz", JOptionPane.INFORMATION_MESSAGE);

   jogador1 = JOptionPane.showInputDialog(null,"Qual é o seu nome, Jogador 1?",  "Usuário", JOptionPane.QUESTION_MESSAGE);
   jogador2 = JOptionPane.showInputDialog(null,"Qual é o seu nome, Jogador 2?",  "Usuário", JOptionPane.QUESTION_MESSAGE);
   
   String[][] perguntas = {
       {"Qual palavra-chave é usada para definir uma classe em Java?", "class"},
      
   };
   
   for (int i = 0; i < perguntas.length; i++) {
       pergunta = perguntas[i][0];
       respostaCorreta = perguntas[i][1];
       
       respostaJogador1 = JOptionPane.showInputDialog(null, jogador1 + ", " + pergunta, "Pergunta", JOptionPane.QUESTION_MESSAGE);
       if (respostaJogador1 != null && respostaJogador1.trim().equalsIgnoreCase(respostaCorreta)) {
           pontosJogador1++;
       }
       
       respostaJogador2 = JOptionPane.showInputDialog(null, jogador2 + ", " + pergunta, "Pergunta", JOptionPane.QUESTION_MESSAGE);
       if (respostaJogador2 != null && respostaJogador2.trim().equalsIgnoreCase(respostaCorreta)) {
           pontosJogador2++;
       }
   }

   resultado = "Pontuação Final:\n";
   resultado += jogador1 + ": " + pontosJogador1 + " pontos\n";
   resultado += jogador2 + ": " + pontosJogador2 + " pontos\n";
   
   if (pontosJogador1 > pontosJogador2) {
       resultado += jogador1 + " é o vencedor!";
   } else if (pontosJogador2 > pontosJogador1) {
       resultado += jogador2 + " é o vencedor!";
   } else {
       resultado += "É um empate!";
   }
   
   JOptionPane.showMessageDialog(null, resultado, "Vencedor", JOptionPane.INFORMATION_MESSAGE);
    
  }
}
