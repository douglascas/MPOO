package ExercicioAluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExercicioAluno {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		Random geraRandom = new Random();
		
		System.out.print("Quantos alunos possuem na sala? ");
		int qtd = input.nextInt();

		RepositorioAlunos repositorio = new RepositorioAlunos(qtd); 
		
		int totalAprovados = 0;
		int totalReprovados = 0;
		
		String alunoMaiorNota = null;
		String alunoMenorNota  = null;
		double maiorNota = 0;
		double menorNota = 0;
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Insira o nome do aluno: ");
			Aluno aluno = new Aluno(); 			
			aluno.setNome(input.next());
			System.out.print("Insira a primeira nota do aluno " + aluno.getNome() + ": ");
			aluno.setNota1(checkNota(input.nextInt()));		
			System.out.print("Insira a segunda nota do aluno " + aluno.getNome() + ": ");
			aluno.setNota2(checkNota(input.nextInt()));		
			System.out.print("Insira a terceira nota do aluno " + aluno.getNome() + ": ");
			aluno.setNota3(checkNota(input.nextInt()));		

			double media = aluno.getMedia();
			if (media >= 5) {
				aluno.setStatus("Aprovado");
			} else {
				aluno.setStatus("Reprovado");
			}
			
			repositorio.inserir(aluno);
			System.out.println("");
			
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
			
		
		
//		for (int i = 0; i < qtd; i++) {
//			System.out.println("");
//			
//			
//			System.out.println("Aluno: " + alunos[i]);
//			System.out.println("Primeira nota: " + notas1[i]);
//			System.out.println("Segunda nota: " + notas2[i]);
//			System.out.println("Média: " + media);
//			
//			if (media >= 5) {
//				System.out.println("Status: Aprovado");	
//			} else {
//				System.out.println("Status: Reprovado");
//			}
//		}
//		
//		System.out.println("\n######### RELATÓRIO DETALHADO #########");
//		
//		System.out.println("\n######### ALUNOS APROVADOS #########");
//		for (int i = 0; i < qtd; i++) {
//			System.out.println("");
//			
//			double media = (notas1[i] + notas2[i])/2;
//			if (media > 5) {
//				System.out.println("Aluno: " + alunos[i]);
//				System.out.println("Primeira nota: " + notas1[i]);
//				System.out.println("Segunda nota: " + notas2[i]);
//			}
//		}
//		
//		System.out.println("\n######### ALUNOS REPROVADOS #########");
//		for (int i = 0; i < qtd; i++) {
//			System.out.println("");
//			
//			double media = (notas1[i] + notas2[i])/2;
//			if (media < 5) {
//				System.out.println("Aluno: " + alunos[i]);
//				System.out.println("Primeira nota: " + notas1[i]);
//				System.out.println("Segunda nota: " + notas2[i]);
//			}
//		}
//		
//		System.out.println("\n######### MAIOR NOTA #########");
//		for (int i = 0; i < qtd; i++) {
//			System.out.println("");
//			
//			double media = (notas1[i] + notas2[i])/2;
//			if (media < 5) {
//				System.out.println("Aluno: " + alunos[i]);
//				System.out.println("Primeira nota: " + notas1[i]);
//				System.out.println("Segunda nota: " + notas2[i]);
//			}
//		}
//   
//		System.out.println("\n######### QTD APROVADOS E REPROVADOS #########");
//		for (int i = 0; i < qtd; i++) {
//			double media = (notas1[i] + notas2[i])/2;
//			if (media > 5) {
//				totalAprovados = totalAprovados + 1;
//			} else {
//				totalReprovados = totalReprovados + 1;
//			}
//		}
//		System.out.println("Total de aprovados: " + totalAprovados);
//		System.out.println("Total de reprovados: " + totalReprovados);
//
//		
//		System.out.println("\n######### MAIORES E MENORES NOTAS #########");
//		for (int i = 0; i < qtd; i++) {
//			if (notas1[i] > maiorNota) {
//				maiorNota = notas1[i];
//				alunoMaiorNota = alunos[i];
//			} 
//		}
//		System.out.println(alunoMaiorNota + " teve a maior nota: " + maiorNota);
//		System.out.println(alunoMenorNota + " teve a menor nota: " + menorNota);

		
		
//		LISTA APROVADOS
//		LISTAS REPROVADOS
//		QTD ALUNOS APROVADOS
//		QTD ALUNOS REPROVADOS
//		MAIOR NOTA
//		MENOR NOTA
//		EXIBIR NOME DO ALUNO NA NOTA
//		VALIDAR >= 0 NOTA =< 10		
		
	}
	
	static double checkNota(double nota) {
		while (nota < 0 || nota > 10) {
			System.out.println("Informe uma nota maior que 0 e menor que 10.");
		}
		return nota;
	}

}

