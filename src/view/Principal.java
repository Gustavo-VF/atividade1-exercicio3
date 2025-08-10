package view;

import javax.swing.JOptionPane;

import Controller.Controller;

public class Principal {
	public static void main(String[] Args) {
		Controller op = new Controller();
		int tamanho = op.Tamanho();

		int[] Vetor = new int[tamanho];
		op.preencerVetor(Vetor,tamanho);
		
		op.Metodo(Vetor);
	}

}
// entrada 47, 12, 80, 59, 30, 71, 28, 90 