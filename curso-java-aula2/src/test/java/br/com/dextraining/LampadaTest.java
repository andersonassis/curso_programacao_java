package br.com.dextraining;

import lampada.Lampada;

import org.junit.Assert;
import org.junit.Test;

public class LampadaTest {
	
	@Test
	public void testarLigar() {
		Lampada lampada = new Lampada("Philips", 60);
         Interrupitor interruptor = new Interrupitor(lampada);
			interruptor.apertar();
	
			Assert.assertTrue(lampada.estaLigada());
		}
	
		@Test
		public void testarDesligar() {
			Lampada lampada = new Lampada("Philips", 60);
			Interrupitor interruptor = new Interrupitor(lampada);
			interruptor.apertar();
			Assert.assertTrue(lampada.estaLigada());
			interruptor.apertar();
			Assert.assertFalse(lampada.estaLigada());
		}
	   
		
	}


