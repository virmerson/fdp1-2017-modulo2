package aula8;

public class ExercicioMain {

	public static void main(String[] args) {
		
		try {
			Validacao.validaCpf("99999999999");
			System.out.println("Valido");
		} catch (CPFInvalidoException e) {
			System.out.println(e.getMessage());
		}

	}

}
