package aula05;

public class ProgramaPrincipalConta {

	public static void main(String[] args) {
		
		
		Conta contaPoupanca =  new ContaPoupanca(5000.0, new Correntista(1, "Zé", "0900909"));
		contaPoupanca.atualizarSaldo();
		System.out.println(contaPoupanca);
		
		
		Conta contaCorrente =  new ContaCorrente(6000.0, new Correntista(2, "Jão", "909090888"));
		contaCorrente.atualizarSaldo();
		System.out.println(contaCorrente);
		
		

	}

}
