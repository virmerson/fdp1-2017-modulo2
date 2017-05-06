package aula05;

public class ContaPoupanca extends Conta {

	
	public static final double PERC_RENDIMENTO_CONTA_POUPANCA= 1;
	
	public ContaPoupanca(double saldo, Correntista correntista) {
		setSaldo(saldo);
		setCorrentista(correntista);
	}

	@Override
	public void atualizarSaldo() {
		double perc =  PERC_RENDIMENTO_CONTA_POUPANCA/100;
		double percSaldo = getSaldo()* perc; 
		double novoSaldo = getSaldo() + percSaldo;
		
		setSaldo(novoSaldo);
		
		//setSaldo(  (  PERC_RENDIMENTO_CONTA_POUPANCA/100  * getSaldo()  )  + getSaldo()   ); 
	}

	
	
}
