package aula07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import aula06.Cliente;


public class ProgramaPrincipalSet {

	public static void main(String[] args) {
		
		Set<Cliente> clientes = new HashSet<>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Jão");
		
		Cliente c4 = new Cliente();
		c4.setNome("Jão");
		
		Cliente c2 = new Cliente();
		c2.setNome("Zé");
		
		Cliente c3 = new Cliente();
		c3.setNome("Maria");
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		
		for (Cliente c: clientes){
			System.out.println(c.getNome());
		}
		
		System.out.println(clientes.size());
		
		
	}
}
