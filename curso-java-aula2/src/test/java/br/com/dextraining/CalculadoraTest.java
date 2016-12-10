package br.com.dextraining;
import org.junit.Assert;
import org.junit.Test;

import calculadora.Calculadora;

public class CalculadoraTest {
	Calculadora calculadora = new Calculadora();
	
	@Test
	public void testarSoma(){
		double resultado = 	calculadora.somar(10, 15);
		Assert.assertEquals(Double.valueOf(25),Double.valueOf(resultado));	
	}
	
	
	@Test
	public void testarSubtracao(){
		double resultado = calculadora.subtrair(50, 30);
		Assert.assertEquals(Double.valueOf(20),Double.valueOf(resultado));	
	}
	
	
	@Test
	public void testarDivisao(){
		double resultado = calculadora.dividir(50, 2);
		Assert.assertEquals(Double.valueOf(25),Double.valueOf(resultado));	
	}
	
	
	@Test
	public void testarMultiplicacao(){
		double resultado = calculadora.multiplicacao(10, 10);
    	Assert.assertEquals(Double.valueOf(100),Double.valueOf(resultado));	
	}
	
	
	

}
