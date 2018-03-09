package ExercicioConta;

public class Aluno {

	private String nome;
	
	private double ap1;
	
	private double ap2;
	
	private double ap3;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return ap1;
	}

	public void setNota1(double nota1) {
		this.ap1 = nota1;
	}
	
	public double getNota2() {
		return ap2;
	}

	public void setNota2(double nota2) {
		this.ap2 = nota2;
	}
	
	public double getMedia(double ap1, double ap2, double ap3) {
		return ((ap1*0.30) + (ap2*0.30) + (ap3*0.40)) / 3;
	}

	private void constructor(String nome) {
		this.nome = nome;
	}
}
