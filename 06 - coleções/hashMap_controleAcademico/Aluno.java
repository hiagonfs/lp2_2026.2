package codigo;

import java.util.Objects;

public class Aluno {

	private String matricula;
	private String nome;

	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "[matricula=" + matricula + ", nome=" + nome + "]";
	}
	
	

}
