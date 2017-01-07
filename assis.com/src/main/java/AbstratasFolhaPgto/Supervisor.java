package AbstratasFolhaPgto;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, double salario){
	       super(nome,salario);		
			
		}
	
	
	@Override
	public double getPorcentagemAdicional() {
		// TODO Auto-generated method stub
		return 0.10;
	}

}
