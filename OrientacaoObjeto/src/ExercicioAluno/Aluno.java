package ExercicioAluno;

public class Aluno {

	private String nome;
	
	private double nota1;
	
	private double nota2;
	
	private double nota3;
	
	private Livro livro;
	
	public Aluno() { }
	
	public Aluno(String nome, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) throws Exception {
		this.nota1 = checkNota(nota1);
	}
	
	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
		
	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}	

	public String getStatus() {
		if (this.getMedia() >= 5) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

	public double getMedia() {
		double media = (((this.getNota1()*1.3) + (this.getNota2()*1.3) + (this.getNota3()*1.4)) / 3); 
		return Double.valueOf(media).shortValue();
	}
	
	public double checkNota(double nota) throws Exception {
		if (nota < 0 || nota > 10 ) {
			throw new Exception("Nota Inválida.");
		}
		
		return nota;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
