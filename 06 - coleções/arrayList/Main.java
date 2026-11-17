package codigo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> palavras = new ArrayList<>();

		Scanner leitor = new Scanner(System.in);
		
		palavras.add("Hiago");
		palavras.add("palavra");
		palavras.add("lista");
		
		palavras.add(1, "final"); 
		
		// for de indices
		for (int i = 0; i < palavras.size(); i++) {
			System.out.println(palavras.get(i));
		}

		// for each, utilizado sem indices
		for (String p : palavras) {
			System.out.println(p);
		}
		
		System.out.println(palavras.size());

	}

}
