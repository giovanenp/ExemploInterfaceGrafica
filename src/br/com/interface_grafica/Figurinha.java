package br.com.interface_grafica;

import javax.swing.JOptionPane;

public class Figurinha {
  public static void main(String[] args) {
    String nome[] = new String[2];
    int idade[] = new int[2];
    String selecao[] = new String[2];

    int sumIdade = 0, mediaIdade = 0;

    for (int i = 0; i < nome.length; i++) {
      nome[i] = JOptionPane.showInputDialog("Informe o nome do jogador da figurinha");
      idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do jogador? "));
      selecao[i] = JOptionPane.showInputDialog("Em qual seleção este jogador joga? ");
    }

    for (int i = 0; i < idade.length; i++) {
      if (nome[i].equals("Marquinhos")) {
        JOptionPane.showMessageDialog(null, "Marquinhos vai levantar a taça do Hexa", "Ops!",
            JOptionPane.INFORMATION_MESSAGE);
      } else if (nome[i].equals("Hulk")) {
        JOptionPane.showMessageDialog(null, "Dessa vez não vai dar para você " + nome[i] + "!", "Ops",
            JOptionPane.INFORMATION_MESSAGE);
      }
      if (selecao[i].equals("Argentina")) {
        JOptionPane.showMessageDialog(null, "Adeus los hermanos!!!", "Ops!", JOptionPane.INFORMATION_MESSAGE);
      }
      sumIdade = sumIdade + idade[i];
    }
    mediaIdade = (sumIdade / idade.length);
    JOptionPane.showMessageDialog(null, "A copa do mundo possui média de idade " + mediaIdade,
        "Média de idade na copa do mundo", JOptionPane.INFORMATION_MESSAGE);
  }
}
