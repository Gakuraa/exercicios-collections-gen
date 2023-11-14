package CollectionsSetList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> listaSet = new HashSet<Integer>();
		
		listaSet.add(5);
		listaSet.add(10);
		listaSet.add(15);
		listaSet.add(20);
		listaSet.add(25);
		listaSet.add(30);
		listaSet.add(35);
		listaSet.add(40);
		listaSet.add(45);
		listaSet.add(50);
		
		System.out.println("Digite o número que você deseja encontrar: \n");
		int numDesejado = sc.nextInt();
		
		if(listaSet.contains(numDesejado)) {
			System.out.println("\nO número " + numDesejado + " foi encontrado!");
		} else {
			System.out.println("\nO número " + numDesejado + " não foi encontrado!");
		}
		
		sc.close();
		
	}
}
