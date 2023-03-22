// Implemente um programa para cadastro de alunos de uma disciplina utilizando a linguagem Java, seguindo os seguintes critérios: 

// Criar uma estrutura heterogênea (array) do tipo string para cadastrar o nome de 25 alunos; 
// Garantir que a estrutura seja totalmente preenchida. 

// Após implementar o programa e preencher o array com o nome dos alunos, cadastre mais 5 novos alunos.  

// Qual a dificuldade de inserir os novos alunos nessa estrutura de dados? Justifique a sua resposta direcionando aos conceitos de gerenciamento de memória. 

// Resposta:

// A dificuldade que encontrei em inserir os 5 novos alunos foi que como o vetor já estava cheio e a estrutura utilizada era uma estrutura estatíca não foi possível realizar tal processo, pois o vetor tem um tamanho fixo que já estava preenchido. 
// Nestes casos pode-se adicionar mais alunos de dinâmica, ou seja,  classes Collections ou vetores infinitos podem alocar mais espaço na memória sem ter um limite fixo e evitando estouro de memoria EOF, ou também pode de adicionar uma tratativa verificando se o vetor já contém 25 nomes. 

public class Alunos { 

	public static void main(String[] args) { 

		String[] nomeAlunos = new String[25]; 

		for (int i = 0; i < 25; i++) {

			 nomeAlunos[i] = "Aluno: " + i; 

			System.out.println("Aluno" + nomeAlunos[i]); 

		} 

		for (int i = 25; i < 30; i++) { 

			nomeAlunos[i] = "Aluno Erro: " + i;

		//Nota-se que aqui não será mais exibido, onde o erro já aconteceu

			System.out.println("Adicionando erro" + nomeAlunos[i]); 

		}

	 } 

}

