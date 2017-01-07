package AbstratasFolhaPgto;

public class FolhaPgto{

  public double calcula(Funcionario...funcionarios ){
	  double total = 0;
	  
	  for(Funcionario funcionario : funcionarios){
		  total += funcionario.getSalarioComBonificacao();
	  }
	  return total;
  }
	
}
