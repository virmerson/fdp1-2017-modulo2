package aula04;

public class ValidacaoUtil {

	public static boolean validaCPF(String cpf) {
		if (cpf.length() != 11) {
			return false;
		} else {
			return true;
		}

	}
	
	
	public static boolean validaCPF(long cpfLong) {
		String cpf= String.valueOf(cpfLong);
		return validaCPF(cpf);

	}
	

	
	public static void main(String[] args) {
		System.out.println(ValidacaoUtil.validaCPF(9090090));
		
		System.out.println(ValidacaoUtil.validaCPF("9090090"));
	}

}
