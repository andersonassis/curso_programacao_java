package equipamento;

public class Televisao extends Eletronico{
	
	private int polegadas;
	

	//construtor 
	public Televisao(double preco,String fabr,int polegadsas){
		super(preco,fabr);
		
	}//fim do construtor
	
	

	
	//get  e seters
	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}



  
	
	/*METODO PARA CALCULAR PREÇO
		@Override
	    public double calcularPrecoFinal(){
			return getPreco() + getPreco()*0.02; 	
	    }*/

	
	
	
	

}
