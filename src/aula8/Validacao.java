package aula8;

public class Validacao {

	public static void validaCpf(String cpf) throws CPFInvalidoException {
		if (cpf!=null && cpf.length()!=11){
			throw new CPFInvalidoException();
		}
		
	}

}
