package codigo;

import java.util.HashSet;

public class Banco {

	private HashSet<Conta> contas;

	public Banco() {
		this.contas = new HashSet<Conta>();
	}

	public void addConta(String titular, String identificador) {
		Conta minhaConta = new Conta(identificador, titular);
		contas.add(minhaConta);
	}

	public Conta pesquisarContaPeloIdentificador(String identificador) {
		for (Conta minhaConta : contas) {
			if (minhaConta.getIdentificador().equals(identificador)) {
				return minhaConta;
			}
		}
		return null;
	}

	public void removerConta(String identificador) {
		for (Conta minhaConta : contas) {
			if (minhaConta.getIdentificador().equals(identificador)) {
				contas.remove(minhaConta);
			}
		}
	}

	public int getTamanhoDaLista() {
		return contas.size();
	}

}
