package br.com.dextraining;

import java.util.Scanner;

import pessoa.Pessoa;

public class PessoaTest {
	public static void main(String[] args){
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Informe o nome da pessoa: ");
	    String nomePessoa = scanner.nextLine();
	    
	    
	    System.out.println("Informe o rg : ");
	    String nomeRG = scanner.nextLine();
	    
	    
	    System.out.println("Informe o cpf: ");
	    String nomeCpf = scanner.nextLine();
	    
	    
	    
	    Pessoa pessoa = new Pessoa(nomePessoa,nomeRG,nomeCpf);
	    System.out.println(pessoa);
	    
	    scanner.close();
	    
	
		
	}

}
