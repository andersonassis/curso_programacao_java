package conta;

import java.util.Scanner;

public class Conta {
	double valorConta = 0;
	double saque = 0;
	Scanner scanner =  new Scanner(System.in);
	
	public double  saque(double sacar){
		
		if(sacar > valorConta){
			System.out.println("valor insufucinte");
			
		}else{
			
		}
	
		return sacar;
	}
	
	public double saldo(){
		double saldo = 0;
		System.out.println(saldo);
		return saldo;
	}
	
	
	public double depositar(Double depo){
		System.out.println(depo);
		return depo;
	}
	
	

}
