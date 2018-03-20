package ExercicioAluno;

import java.util.Scanner;

public class ExercicioAluno {

	private static Scanner input;

	public static void main(String[] args) throws Exception {
		
		input = new Scanner(System.in);
		
		System.out.print("Quantos alunos possuem na sala? ");
		int qtd = input.nextInt();

		RepositorioAlunos repositorio = new RepositorioAlunos(qtd); 

		for (int i = 0; i < qtd; i++) {
			System.out.print("Insira o nome do aluno: ");
			Aluno aluno = new Aluno(); 			
			aluno.setNome(input.next());
			System.out.print("Insira a primeira nota do aluno " + aluno.getNome() + ": ");
			aluno.setNota1(checkNota(aluno));		
			System.out.print("Insira a segunda nota do aluno " + aluno.getNome() + ": ");
			aluno.setNota2(checkNota(aluno));
			System.out.print("Insira a terceira nota do aluno " + aluno.getNome() + ": ");
			aluno.setNota3(checkNota(aluno));		

			if (aluno.getMedia() >= 5) {
				aluno.setStatus("Aprovado");
			} else {
				aluno.setStatus("Reprovado");
			}
			
			repositorio.inserir(aluno);
						
		}
		
		System.out.println("\n######### RELATÓRIO #########");
		for (Aluno aluno : repositorio.getAlunos()) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Primeira nota: " + aluno.getNota1());
			System.out.println("Segunda nota: " + aluno.getNota2());
			System.out.println("Terceira nota: " + aluno.getNota3());
			System.out.println("Média do aluno: " + aluno.getMedia());
			System.out.println("Aluno está: " + aluno.getStatus() + "\n");
		}
		
		System.out.println("\n######### RELATÓRIO DETALHADO #########");
		
		System.out.println("\n - ALUNOS APROVADOS");
		for (Aluno aluno : repositorio.getAlunos()) {
			if (aluno.getMedia() >= 5) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Média: " + aluno.getMedia());
				System.out.println("Status: " + aluno.getStatus());
			} 
		}
		
		System.out.println("\n - ALUNOS REPROVADOS");
		for (Aluno aluno : repositorio.getAlunos()) {
			if (aluno.getMedia() < 5) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Média: " + aluno.getMedia());
				System.out.println("Status: " + aluno.getStatus());
			}
		}

		System.out.println("\n - MELHORES MÉDIAS");
		for (Aluno aluno: repositorio.getClassificacaoAlunos()) {
			System.out.println(aluno.getNome() + " - " + aluno.getMedia());;	
		}
		
		System.out.println("\n######### QTD APROVADOS E REPROVADOS #########");
		repositorio.getAlunosReprovadosAprovados();
		
	}

	
	// Verifica se 0 > nota < 10; Caso esteja fora do range, levanta mensagem de erro 
	static double checkNota(Aluno aluno) throws Exception {
		input = new Scanner(System.in);
		double notaEntrada = 0D;
		// Permite que a mensagem de erro só seja executada a partir da segunda chamada de input
		int counter = 0;
		
		do {
			if (counter > 0) {
				System.out.print("Nota inválida. Informe uma nota válida: ");
			}
			notaEntrada = input.nextDouble();
			counter++;
		}
		while (notaEntrada < 0 || notaEntrada > 10);
		return notaEntrada;
	}

}
