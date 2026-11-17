package codigo;

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

}
