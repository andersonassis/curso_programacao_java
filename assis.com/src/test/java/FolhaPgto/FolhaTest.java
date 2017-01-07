package FolhaPgto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import AbstratasFolhaPgto.FolhaPgto;
import AbstratasFolhaPgto.Gerente;
import AbstratasFolhaPgto.Secretaria;
import AbstratasFolhaPgto.Supervisor;

public class FolhaTest {
	private FolhaPgto folhapgto;
	
	
	@Before
	public void init(){
		folhapgto = new FolhaPgto();
	}
	
	@Test
	public void testarSemFuncionarios(){
		double total = folhapgto.calcula();
		Assert.assertEquals(Double.valueOf(0), Double.valueOf(total));
		
	}
	
	@Test
	public void testarCalculoFolha(){
		Gerente gerente = new Gerente("MArcio rossi", 1000);
		Supervisor supervisor = new Supervisor("Anderson", 800);
		Secretaria secretaria = new Secretaria("Ana", 500);
		
		double total = folhapgto.calcula(gerente,supervisor,secretaria);
		Assert.assertEquals(Double.valueOf(2530), Double.valueOf(total));
		
	}
	

}
