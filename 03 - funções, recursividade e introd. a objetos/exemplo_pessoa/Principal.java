import java.util.Scanner;

public class Principal {

    static Pessoa[] aumentarVetor(Pessoa[] pessoas) {
        Pessoa[] vetorAuxiliar = new Pessoa[pessoas.length + 1];

        for (int i = 0; i < pessoas.length; i++) {
            vetorAuxiliar[i] = pessoas[i];
        }

        return vetorAuxiliar;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Pessoa[] pessoasCadastradas = new Pessoa[0];

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            pessoasCadastradas = aumentarVetor(pessoasCadastradas);

            Pessoa pessoa = new Pessoa();

            System.out.print("Nome: ");
            pessoa.nome = leitor.nextLine();

            System.out.print("Idade: ");
            pessoa.idade = leitor.nextInt();

            System.out.print("Altura: ");
            pessoa.altura = leitor.nextDouble();
            leitor.nextLine();

            pessoasCadastradas[pessoasCadastradas.length - 1] = pessoa;

            System.out.print("Deseja cadastrar mais uma pessoa? (S/N): ");
            continuar = leitor.nextLine();
        }

        System.out.println("Pessoas cadastradas:");

        for (int i = 0; i < pessoasCadastradas.length; i++) {
            System.out.println(
                "Nome: " + pessoasCadastradas[i].nome
                + " | Idade: " + pessoasCadastradas[i].idade
                + " | Altura: " + pessoasCadastradas[i].altura
            );
        }

        leitor.close();
    }
}
