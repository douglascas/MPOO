
public class Teste {

	public static void main(String[] args) {

//		Conta c1 = new Conta("1234-5", "1234");
		Conta c2 = new ContaBonificada("2345-6", "1123");
		Conta c3 = new ContaPoupanca("3456-7", "1224");
		
//		c1.exibirConta();
//		c1.creditar(50.0);
//		c1.exibirConta();

		c2.exibirConta();
		c2.creditar(50.0);
		((ContaBonificada)c2).creditarRendimentos();
		c2.exibirConta();

		c3.exibirConta();
		(c3).creditar(50.0);
		c3.exibirConta();
	}

}
