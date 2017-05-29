package aula8;

public class ExceptionUnchecked {

	
	public static void main(String[] args) {
		
				
			Calculadora c = new Calculadora();
			
			c =null;
			
			try {
				c.dividir(1, 1);
			} catch (NaoPodeDividirPorZeroException e) {
				System.out.println(e.getMessage());
			}catch (NullPointerException e) {
				System.out.println("Ponteiro Nulo");
			}finally {
				System.out.println("Finalizando recursos.");
			}
			
			
			
			System.out.println("mensagem final do main");
	}	
}
