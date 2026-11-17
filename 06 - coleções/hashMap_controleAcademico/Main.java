package codigo;

public class Main {
	
	public static void main(String[] args) {
		
		ControleAcademico controle = new ControleAcademico();
		
		controle.adicionarAluno("132131", "Ana");
		controle.adicionarAluno("132131", "Kamilly");
		controle.adicionarAluno("13215454", "Felipe");
		controle.adicionarAluno("13213221", "Adriano");
		
		controle.exibeAlunoMapa();
		
		System.out.println(controle.qtdAlunosMatriculados());
		
	}

}
