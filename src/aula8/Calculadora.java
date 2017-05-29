package aula8;

public class Calculadora {

	
	
	public double dividir(double n1, double n2) throws NaoPodeDividirPorZeroException{
		
		
			if (n2==0){
				throw new NaoPodeDividirPorZeroException();
			}
			
			
			return n1/n2;
	}
	
}
