package aula04;

public class Animal {
	private String nome;
	//Construtor padrão
	public Animal(){
		System.out.println("Construtor Padrao Animal");
	}
	//Construtor Sobrecarregado
	public Animal(String nome){
		System.out.println("Construindo Sobrecarregado Animal ");
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
