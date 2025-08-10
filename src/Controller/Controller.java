package Controller;

import javax.swing.JOptionPane;

public class Controller {
	public static  int Tamanho() {
		 int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tamanho do do Vetor"));
		while (tamanho > 100 || tamanho < 1) {
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("O tamanho do vetor deve ser menor que 100"));

		}
		return tamanho;
	}

	public static int[] preencerVetor (int[] Vetor,int tamanho) {
	for(int i = 0;i<tamanho;i++)
	{
		Vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(" digite o valor " + (i + 1) + " do vetor."));

	}return Vetor;
	}

	public void  Metodo(int[] _Vetor) {
		for (int Vetor : _Vetor) {
			if ((Vetor % 2) != 0) {

				System.out.println(Vetor + " O Valor é Impar ");

			} else if ((Vetor % 2) == 0) {

				int unidade = ((Vetor % 10));
				if (unidade == 0) {
					System.out.println(Vetor + " O Valor é Par e Multiplo de 10 ");
				}
			}

		}

	}
}
