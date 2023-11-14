package CollectionsSetList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> setLista = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite o " + (i+1) + "º valor inteiro: \n");
			int num = sc.nextInt();
			setLista.add(num);
		}
		
		Iterator<Integer> iSetLista = setLista.iterator();
		
		while(iSetLista.hasNext()) {
			System.out.println(iSetLista.next());
		}
		
		sc.close();

	}
}
