package br.com.interface_grafica;

import javax.swing.JOptionPane;

public class SaidaNomeJOptionPane {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Digite o nome: ");
    String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");

    String nomeCompleto = nome + " " + sobreNome;

    JOptionPane.showMessageDialog(null, "Nome completo: " + nomeCompleto, "Informação: ", 1);
  }
}
