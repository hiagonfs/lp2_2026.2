package codigo;

public class Main {
	
	public static void main(String[] args) {
		
		Rifa minhaRifa = new Rifa(); 
		
		minhaRifa.adicionarBilhete("17", "Kamilly");
		
		minhaRifa.adicionarBilhete("22", "Kamilly");
		
		minhaRifa.adicionarBilhete("13", "Kamilly");
		
		minhaRifa.adicionarBilhete("14", "Kamilly");
		
		minhaRifa.adicionarBilhete("17", "Kamilly");
		
		minhaRifa.adicionarBilhete("17", "Kamilly");
		
		minhaRifa.adicionarBilhete("17", "Kamilly");
		
		System.out.println(minhaRifa.bilhetesDaRifa());
		
		minhaRifa.removerBilhete("22");
		
		System.out.println("-------------------------");
		
		System.out.println(minhaRifa.bilhetesDaRifa());
	}

}
