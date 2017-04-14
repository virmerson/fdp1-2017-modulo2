package aula01;

public class ProgramaPrincipalCidade {

	public static void main(String[] args) {
		
		Cidade c1 = new Cidade();
		c1.setNome("Campo Grande");
		
		c1.getEstado().setUf("MS");
		c1.getEstado().setNome("Mato Grosso do Sul");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getEstado().getUf());
		System.out.println(c1.getEstado().getNome());
		
		
	}

}