package equipamento;

public class Eletronico extends Equipamento {

	public Eletronico(double pre, String fab) {
		super(pre, fab);
	}
	
	
	//METODO PARA CALCULAR PREÇO DOS ELETRONICOS
			@Override
		    public double calcularPrecoFinal(){
				return getPreco() + getPreco()*0.10; 	
		    }
	

}
