package codigo;

import java.util.Objects;

public class Conta {

	private String identificador;
	private String titular;
	private double saldo;

	public Conta(String identificador, String titular) {
		this.identificador = identificador;
		this.titular = titular;
		this.saldo = 0;
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(identificador, other.identificador);
	}
	
	

}
