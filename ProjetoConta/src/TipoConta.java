
public enum TipoConta {

	POUPANCA ("Poupança"), 
	CONTA_BONIFICADA ("Conta Bonificada");
	
	private String id;
	
	TipoConta(String tipo) {
		this.id = tipo;
	}

	public String getId() {
		return id;
	}
	
}
