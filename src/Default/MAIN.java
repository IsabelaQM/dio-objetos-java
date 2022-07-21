package Default;

public class MAIN {
	
	public static void main(String[] args) {
		Cliente isabela = new Cliente();
		isabela.setNome("Isabela");
		Conta cc = new ContaCorrente(isabela);
		Conta poupanca = new ContaPoupanca(isabela);
		cc.depositar(100);
		cc.transferir(100, cc);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
