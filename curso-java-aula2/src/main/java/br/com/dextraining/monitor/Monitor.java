package br.com.dextraining.monitor;

public class Monitor {
	
	public int     polegadas;
	public String  numeroSerie;
	public String  cor; 
	public boolean ligado;
	public int     brilho;
	
	
	public Monitor(int polegadas,String numeroSerie,String cor){//construtor
		this.polegadas   = polegadas;
		this.numeroSerie = numeroSerie;
		this.cor         = cor;	
	}
	
	
	
	
	
	public void ligar(){
		System.out.println("LIgado..");
		ligado = true;	
	}
	
	public void desligar(){
		System.out.println("Desligado..");
		ligado = false;	
		
	}
	
	
	
	public int aumentarBrilho(){// metodos com tipo de valores 
		if (brilho<100){
		brilho ++;
		return brilho;	
		}
		return brilho;
		
	}
	public int diminuirBrilho(){
		if(brilho >0){
		brilho --;
		}
		return brilho;
	}
	
	public int trocarBrilho(int brilho){
		this.brilho  = brilho;//this serve para referenciar o objeto da classe que esta 
		
		return brilho;
	}
	
	
	 

}
