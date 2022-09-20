package br.com.interface_grafica;

import javax.swing.JOptionPane;

public class SaidaValoresInteiros {
  public static void main(String[] args) throws NumberFormatException {
    int valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A:"));
    int valorB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B:"));

    int resultado = valorA * valorB;

    JOptionPane.showMessageDialog(null, "Resultado final:" + resultado, "Resultado", 1);
  }
}
