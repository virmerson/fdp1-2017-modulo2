package aula07;

import java.util.ArrayList;
import java.util.List;

import aula06.Cliente;


public class ProgramaPrincipalList {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Jão");
		
		Cliente c2 = new Cliente();
		c2.setNome("Zé");
		
		Cliente c3 = new Cliente();
		c3.setNome("Maria");
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		for (Cliente c: clientes){
			System.out.println(c.getNome());
		}
		
		System.out.println(clientes.size());
		
		
	}
}
