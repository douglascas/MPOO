public class Conta {
	
	private String conta;
	private String agencia;
	private TipoConta tipo; 
	private double saldo;
	
	public Conta(String conta, String agencia) {
		this.conta = conta;
		this.agencia = agencia;
	}
	
	public Conta(String conta, String agencia, TipoConta tipo) {
		this.conta = conta;
		this.agencia = agencia;
		this.tipo = tipo;
	}
	
	public void creditar(double valor) {
		System.out.println("Creditar da classe Conta");
		this.saldo = saldo + valor;
	}
	
	public void exibirConta() {
		System.out.println(this.getNumero());
		System.out.println(this.getSaldo());
		System.out.println(this.getTipo().getId());
		System.out.println();
	}
	
	public String getNumero() {
		return conta;
	}
	public void setNumero(String numero) {
		this.conta = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
}
