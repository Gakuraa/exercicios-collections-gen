package CollectionsArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<String>();
		
		for (int i=0;i<5;i++) {
			System.out.println("\nDigite a " + (i+1) + "º cor que quer adicionar: \n");
			String cor = sc.nextLine();
			lista.add(cor);	
		}
		
		System.out.println("\nAs cores da lista são: \n" + lista);
		System.out.println();
		Collections.sort(lista);
		System.out.println("\nAs cores da lista na ordem crescente: \n" + lista);
		sc.close();
		
	}
}
