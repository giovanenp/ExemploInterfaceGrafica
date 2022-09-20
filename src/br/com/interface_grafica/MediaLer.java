package br.com.interface_grafica;

import javax.swing.JOptionPane;

public class MediaLer {
  public static void main(String[] args) {
    float nota1, nota2, calculaMedia;

    nota1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a primeira nota"));
    nota2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a segunda nota"));
    calculaMedia = (nota1 + nota2) / 2;

    JOptionPane.showMessageDialog(null, "Resultado da média: " + calculaMedia, "Resultado", 1);
  }
}
