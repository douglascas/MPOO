package ExercicioConta;

public class Conta {

	private String conta;
	
	private double saldo;
	
	
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void creditar(double valor) {
		double credito = this.getSaldo() + valor;
		this.setSaldo(credito);
	}
	
	public void debitar(double valor) {
		double debito = this.getSaldo() - valor;
		this.setSaldo(debito);
	}
		
}
