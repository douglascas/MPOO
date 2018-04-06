public class ContaBonificada extends Conta {
	
	public ContaBonificada(String numero, String agencia) {
		super(numero, agencia, TipoConta.CONTA_BONIFICADA);
	}
	
	private double rendimento;
	
	public void creditar(double valor) {
		System.out.println("Creditar da classe Conta Bonificada");
		super.creditar(valor);
		rendimento += valor * 0.02;
	}
	
	public void creditarRendimentos() {
		super.creditar(this.rendimento);
		this.rendimento = 0;
	}

			
}
