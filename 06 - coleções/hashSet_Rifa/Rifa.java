package codigo;

import java.util.HashSet;

public class Rifa {

	private HashSet<Bilhete> bilhetes;

	public Rifa() {
		this.bilhetes = new HashSet<Bilhete>();
	}

	public boolean adicionarBilhete(String numero, String nome) {
		Bilhete novoBilhete = new Bilhete(numero, nome);
		return bilhetes.add(novoBilhete);
	}

	public String bilhetesDaRifa() {
		String infos = "";
		for (Bilhete meuBilhete : bilhetes) {
			infos += meuBilhete.toString() + "\n";
		}
		return infos;
	}

	public int totalDeBilhetes() {
		return bilhetes.size();
	}

	public void removerBilhete(String numero) {
		for (Bilhete bilheteParaRemover : bilhetes) {
			if (bilheteParaRemover.getNumeroBilhete().equals(numero)) {
				bilhetes.remove(bilheteParaRemover);
			}
		}

	}

}
