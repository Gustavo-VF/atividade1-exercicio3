package view;

import javax.swing.JOptionPane;

import Controller.Controller;

public class Principal {
	public static void main(String[] Args) {
		Controller op = new Controller();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tamanho do do Vetor"));

		while (tamanho > 100 || tamanho < 1) {
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("O tamanho do vetor deve ser menor que 100"));

		}
		int[] Vetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			Vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(" digite o valor " + (i + 1) + " do vetor."));

		}
		op.Metodo(Vetor);
	}

}
