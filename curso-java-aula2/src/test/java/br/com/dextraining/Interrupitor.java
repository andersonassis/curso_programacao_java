package br.com.dextraining;

import lampada.Lampada;

public class Interrupitor {
	public boolean tipoLampada;
	
	public Lampada lampada;
	
		public Interrupitor(Lampada lampada) {
			this.lampada = lampada;
		}
	
		public void apertar() {
			if (lampada.estaLigada()) {
				lampada.desligar();
			} else {
				lampada.ligar();
			}
		}
	
	
	
	

}
