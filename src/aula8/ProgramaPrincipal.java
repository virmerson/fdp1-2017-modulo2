package aula8;

public class ProgramaPrincipal {

	
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		try {
			
			double n= c.dividir(19, 0);
			System.out.println(n);
			
		} catch (NaoPodeDividirPorZeroException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
