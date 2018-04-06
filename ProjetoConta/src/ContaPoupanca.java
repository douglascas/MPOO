public class ContaPoupanca extends Conta {

	public ContaPoupanca(String numero, String agencia) {
		super(numero, agencia, TipoConta.POUPANCA);
	}
	
	protected double rendimento;
	
	public void gerarRendimento(double valor) {
		this.rendimento += valor *0.05;
	}
	
}
