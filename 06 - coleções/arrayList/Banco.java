package codigo;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<Conta>();
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
		for(int i = 0; i < contas.size(); i++) {
			if(contas.get(i).getIdentificador().equals(identificador)) {
				contas.remove(i); 
			}
		}
	}
	
	public void removerContaSemIndice(String identificador) {
		for(Conta minhaConta : contas) {
			if(minhaConta.getIdentificador().equals(identificador)) {
				contas.remove(minhaConta); 
			}
		}
	}
	
	public int getTamanhoDaLista() {
		return contas.size(); 
	}

}
