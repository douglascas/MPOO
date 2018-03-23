package ExercicioAluno;

import java.util.Random;
import java.util.Scanner;

public class ExercicioAluno {

	private static Scanner input;
	private static Random random = new Random();

	public static void main(String[] args) throws Exception {
		
		// Vai gerar notas aleatórias de 0 a 10. Não está gerando em double. Somente inteiros.		
		random = new Random();
		
		RepositorioAlunos repositorio = new RepositorioAlunos(); 

		for (int i = 0; i < 5; i++) {
			Aluno aluno = new Aluno("Aluno" + i, random.nextInt(10), random.nextInt(10), random.nextInt(10)); 	
			repositorio.inserir(aluno);
		}
		
		System.out.println("\n######### RELATÓRIO #########\n");
		for (Aluno aluno : repositorio.getAlunos()) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Primeira nota: " + aluno.getNota1()); 
			System.out.println("Segunda nota: " + aluno.getNota2()); 
			System.out.println("Terceira nota: " + aluno.getNota3());
			System.out.println("O aluno está " + aluno.getStatus() + " com média: " + aluno.getMedia());
			System.out.println();
		}
		
		System.out.println("######### RELATÓRIO DETALHADO #########\n");
		
		alunosAprovados(repositorio);
		
		alunosReprovados(repositorio);
		
		melhoresMedias(repositorio);
		
	}
	
	static void alunosAprovados(RepositorioAlunos repositorio) {
		System.out.println("- ALUNOS APROVADOS\n ");
		int countAprovados = 0; 
		int count = 0; // Permite que a mensagem só seja executada a partir do segundo loop
		
		for (Aluno aluno : repositorio.getAlunos()) {
			if (aluno.getStatus() == "Aprovado") {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Média: " + aluno.getMedia());
				countAprovados++;
				System.out.println();
			} 
			count++;
		}
		if (count > 0 && countAprovados == 0) {
				System.out.println("Não há alunos aprovados.\n");
		}
	}
	
	static void alunosReprovados(RepositorioAlunos repositorio) {
		
		System.out.println("- ALUNOS REPROVADOS\n");
		int countReprovados = 0;
		int count = 0; // Permite que a mensagem só seja executada a partir do segundo loop
		
		for (Aluno aluno : repositorio.getAlunos()) {
			if (aluno.getStatus() == "Reprovado") {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Média: " + aluno.getMedia());
				countReprovados++;
				System.out.println();
			}
			count++;
		}
		if (count > 0 && countReprovados == 0) {
			System.out.println("Não há alunos reprovados.\n");
			
		} 
	}
	
	static void melhoresMedias(RepositorioAlunos repositorio) {
		System.out.println("- MELHORES MÉDIAS\n");
		for (Aluno aluno: repositorio.getClassificacaoAlunos()) {
			System.out.println(aluno.getNome() + " - " + aluno.getMedia());;	
		}
		
		System.out.println("\n######### QTD APROVADOS E REPROVADOS #########\n");
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
