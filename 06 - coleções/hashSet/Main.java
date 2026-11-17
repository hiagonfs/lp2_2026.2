package codigo;

import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		
		// conjunto
		HashSet<String> palavras = new HashSet<String>();
		
		palavras.add("Hiago");
		palavras.add("Hiago");
		palavras.add("mais uma");
		palavras.add("Hiago");
		palavras.add("Hiago");
		palavras.add("outra");
		palavras.add("Hiago");
		
		for(String p : palavras) {
			System.out.println(p);
		}
		
		System.out.println(palavras.size());
		
	}

}
