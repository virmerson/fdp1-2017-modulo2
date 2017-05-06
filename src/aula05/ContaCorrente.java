package aula05;

public class ContaCorrente extends Conta {

	
	public static double JUROS_CONTA_CORRENTE =10;
	
	
	public ContaCorrente(double saldo, Correntista correntista) {
			setSaldo(saldo);
			setCorrentista(correntista);
	}

	@Override
	public void atualizarSaldo() {
		setSaldo (   getSaldo()  -  (JUROS_CONTA_CORRENTE/100 * getSaldo())   );
		
	}

}
