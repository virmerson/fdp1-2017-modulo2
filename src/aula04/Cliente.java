package aula04;

public class Cliente {
	private String cpf;
	private static int contador=0;
	public Cliente(){
		super();
		contador++;
	}
	public static int getContator(){
		return contador;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente c = (Cliente)obj;

		 if ( this.cpf.equals(  c.getCpf()  ) ) {
			 return true;
		 }else {
			 return false;
		 }
		//return this.cpf.equals( ((Cliente)obj).getCpf()  ); 
	}
	
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		if (ValidacaoUtil.validaCPF("99999999999")){
			c1.setCpf("99999999999");
		}else {
			System.out.println("invalido");
		}
		
		Cliente c2 =new Cliente();
		Cliente c3 =new Cliente();
		Cliente c4 =new Cliente();
		
		System.out.println(Cliente.getContator());
		
		int n = Integer.parseInt("10");
		
		String nome =  "jao";  //String nome = new String("jao")
		
		String numero = String.valueOf(10);
	}
	
	
}
