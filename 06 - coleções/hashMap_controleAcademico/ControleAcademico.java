package codigo;

import java.util.HashMap;

public class ControleAcademico {

	private HashMap<String, Aluno> alunos;

	public ControleAcademico() {
		this.alunos = new HashMap<String, Aluno>();
	}
	
	public void adicionarAluno(String matricula, String nome) {
		Aluno meuAluno = new Aluno(matricula, nome); 
		alunos.put(matricula, meuAluno); 
	}

	public Aluno buscarAluno(String matricula) {
		return alunos.get(matricula); 
	}
	
	public void removerAluno(String matricula) {
		alunos.remove(matricula); 
	}
	
	public void exibeAlunoMapa() {
		for(String matricula : alunos.keySet()) {
			System.out.println(matricula);
			System.out.println(alunos.get(matricula));
		}
	}
	
	public int qtdAlunosMatriculados() {
		return alunos.size(); 
	}
}
 