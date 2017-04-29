package aula04;

public class Cachorro extends Animal{
		public Cachorro() {
			this("fifi");
			System.out.println("Construindo Padrao cachorro.");
		}
		
		public Cachorro(String nome){
			super(nome);
			System.out.println("Construindo Sobrecarregado cachorro.");
				
		}
}
