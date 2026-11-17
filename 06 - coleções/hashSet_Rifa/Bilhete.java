package codigo;

import java.util.Objects;

public class Bilhete {

	private String numeroBilhete;
	private String nomeDoComprador;

	public Bilhete(String numeroBilhete, String nomeDoComprador) {
		this.numeroBilhete = numeroBilhete;
		this.nomeDoComprador = nomeDoComprador;
	}

	public String getNumeroBilhete() {
		return numeroBilhete;
	}

	public String getNomeDoComprador() {
		return nomeDoComprador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroBilhete);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bilhete other = (Bilhete) obj;
		return Objects.equals(numeroBilhete, other.numeroBilhete);
	}

	@Override
	public String toString() {
		return "Numero Do Bilhete = " + numeroBilhete + ", Nome do Comprador= " + nomeDoComprador;
	}

}
