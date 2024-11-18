package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class ArvoreEx04Principal {

public static void main (String[] args) {
		
		int[] vetor = {7, 8, 3, 4,2, 1, 6, 5};
		int tamanhovet = vetor.length;
		
		ArvoreInt arvoreint = new ArvoreInt();
		
		for (int i = 0; i < tamanhovet; i ++) {
			arvoreint.insert(vetor[i]);
		}
		
		arvoreint.remove(7);
		arvoreint.remove(6);
		
		try {
			arvoreint.prefixSearch();
			System.out.println();
			arvoreint.infixSearch();
			System.out.println();
			arvoreint.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
