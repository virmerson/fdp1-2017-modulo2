package aula04;

public class ProgramaPrincipalEquals {

	public static void main(String[] args) {
		

			Cliente c1 = new Cliente();
			c1.setCpf("999888");
			
			Cliente c2 = new Cliente();
			c2.setCpf("999");
			
			System.out.println(c1.equals(c2));

	}

}
