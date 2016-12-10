package br.com.dextraining;


import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.monitor.Monitor;



public class MonitorTest {
	Monitor monitor;
	
	@Test
	public void testarCriacaoMonitor(){
		
		monitor.cor = "preta";
		monitor.polegadas = 20;
		monitor.numeroSerie = "123abc";
		System.out.println(monitor);
		Assert.assertNotNull(monitor);
		
	}

}
