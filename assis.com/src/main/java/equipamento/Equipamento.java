package equipamento;

public class Equipamento {
	private double preco;
	private String fabricante;
	
	
	public Equipamento(double pre,String fab){
		this.preco = pre;
		this.fabricante = fab;
		
	}
	
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	//METODO PARA CALCULAR PREÇO
    public double calcularPrecoFinal(){
    	
    	return preco;
    }
	
}
