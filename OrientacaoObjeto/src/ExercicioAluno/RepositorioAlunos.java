package ExercicioAluno;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAlunos {
	
	private ArrayList<Aluno> alunos; 
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

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
	

	
}
