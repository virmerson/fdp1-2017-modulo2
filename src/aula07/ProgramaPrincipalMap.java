package aula07;

import java.util.HashMap;
import java.util.Map;

import aula06.Cliente;

public class ProgramaPrincipalMap {

	
	public static void main(String[] args) {
		
		/* Map<String, String> map =  new HashMap<>();
		
		map.put("java", "n n no no non  n on o");
		map.put("php", "bllbalblallalvca");
		
		
		System.out.println(map.get("php")); */
		
		
		/* Map<Integer, Cliente> clientesMap =  new HashMap<>();
		
		
		Cliente c1 = new Cliente();
		c1.setNome("Jão");
		
		Cliente c2 = new Cliente();
		c2.setNome("Zé");
		
		
		clientesMap.put(new Integer(1),c1);

		clientesMap.put(new Integer(2),c2);
		
		
		System.out.println(clientesMap.get(1).getNome());
		System.out.println(clientesMap.get(2).getNome());*/
		
		
		Map<Cliente, Cliente> indicacao  = new HashMap<>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Jão");
		
		
		Cliente c2 = new Cliente();
		c2.setNome("Zé");
		
		
		indicacao.put(c1, c2);
		
		
		System.out.println(indicacao.get(c1).getNome() );
		
		
	}
}
