package CollectionsArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> listaNum = new ArrayList<Integer>();
		
		listaNum.add(5);
		listaNum.add(10);
		listaNum.add(15);
		listaNum.add(20);
		listaNum.add(25);
		listaNum.add(30);
		listaNum.add(35);
		listaNum.add(40);
		listaNum.add(45);
		listaNum.add(50);
		
		System.out.println("\nDigite o número que você deseja encontrar: \n");
		int numDesejado = sc.nextInt();
		int posicao = listaNum.indexOf(numDesejado);
		
		if(posicao != -1) {
			System.out.println("\nO número " + numDesejado + " está localizado na posição: " + posicao);
		} else {
			System.out.println("\nO número " + numDesejado + " não foi encontrado!");
		}
		
		sc.close();
		
	}

}
