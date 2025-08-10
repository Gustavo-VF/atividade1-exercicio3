package Controller;

public class Controller {

	public void Metodo(int[] _Vetor) {
		for (int Vetor : _Vetor) {
			if ((Vetor % 2) != 0) {

				System.out.println(Vetor + " O Valor é Impar ");

			} else if ((Vetor % 2) == 0) {
				
				int unidade = ((Vetor % 10));
				if(unidade ==0) {
				System.out.println(Vetor + " O Valor é Par e Multiplo de 10 ");
				}
			}

		}

	}
}
