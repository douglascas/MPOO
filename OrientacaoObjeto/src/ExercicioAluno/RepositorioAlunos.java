package ExercicioAluno;

import java.util.ArrayList;

public class RepositorioAlunos {
	
	
	private int totalAprovados = 0;
	private int totalReprovados = 0;
	private ArrayList<Aluno> alunos; 
	
	public RepositorioAlunos (int qtd) {
		this.alunos = new ArrayList<>(qtd);
	}
	
	public void inserir(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Aluno atualizar(Aluno old) {
		Aluno result = old;
		for (Aluno aluno: alunos) {
			if(aluno.getNome().equalsIgnoreCase(old.getNome())) {
				result = old;
			}
		}
		return result; 
	}
	
	public Aluno procurar(String nome) {
		Aluno result = null;
		for (Aluno aluno : alunos) {
			if(aluno.getNome().equalsIgnoreCase(nome)) {
				result = aluno;
			}
		}
		return result;
	}
	
	public int getQtdAlunos() {
		return this.alunos.size();
	}
	
	
	public void delete(String nome) {
		Aluno aluno = this.procurar(nome);
		if (aluno != null) {
			aluno = null;
		}
	}
	
	public void getAlunosReprovadosAprovados() {
		for (Aluno aluno : getAlunos()) {
			if (aluno.getMedia() > 5) {
				totalAprovados = totalAprovados + 1;
			} else {
				totalReprovados = totalReprovados + 1;
			}
		}
		
		System.out.println("Total de aprovados: " + getTotalAprovados());
		System.out.println("Total de reprovados: " + getTotalReprovados());
	}

	public void setTotalAprovados(int totalAprovados) {
		this.totalAprovados = totalAprovados;
	}
	
	public int getTotalAprovados() {
		return totalAprovados;
	}

	public int getTotalReprovados() {
		return totalReprovados;
	}

	public void setTotalReprovados(int totalReprovados) {
		this.totalReprovados = totalReprovados;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public ArrayList<Aluno> getClassificacaoAlunos() {
		// Funciona como um índice para adicionar à lista quando comparado com ele
		Aluno maior = new Aluno();

		ArrayList<Aluno> alunosMaioresMedias = new ArrayList<Aluno>();
		for (Aluno aluno : alunos) {
			if (aluno.getMedia() > maior.getMedia()) {
				alunosMaioresMedias.add(aluno);
			}
		}
		return alunosMaioresMedias;
	}

}
