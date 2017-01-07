package equipamento;

import org.junit.Assert;
import org.junit.Test;


public class EquipamentoTest {
	@Test
	public void testarImpressora() {
		double preco = 200;
		double preco1 = 220.0;
		Impressora impressora = new Impressora(preco, "HP");
		Assert.assertEquals(Double.valueOf(preco1),
				Double.valueOf(impressora.calcularPrecoFinal()));
	}

	@Test
	public void testarTelevisao() {
		double preco = 2000;
		double preco2 = 2200.0;
		Televisao televisao = new Televisao(preco, "Sony", 32);
		Assert.assertEquals(Double.valueOf(preco2),
				Double.valueOf(televisao.calcularPrecoFinal()));
	}

	@Test
	public void testarCadeira() {
		double preco = 20;
		Cadeira cadeira = new Cadeira(preco, "Cadeireira");
		Assert.assertEquals(Double.valueOf(preco),
				Double.valueOf(cadeira.calcularPrecoFinal()));
	}

}
