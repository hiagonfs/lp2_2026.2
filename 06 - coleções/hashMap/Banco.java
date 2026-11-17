package codigo;

import java.util.HashMap;

public class Banco {

	private HashMap<String, Conta> contas;

	public Banco() {
		this.contas = new HashMap<String, Conta>();
	}

	public void addConta(String titular, String identificador) {
		Conta minhaConta = new Conta(identificador, titular);
		contas.put(identificador, minhaConta);
	}

	public Conta pesquisarContaPeloIdentificador(String identificador) {
		return contas.get(identificador);
	}

	public void removerConta(String identificador) {
		contas.remove(identificador); 
	}

	public int getTamanhoDaLista() {
		return contas.size();
	}

}
