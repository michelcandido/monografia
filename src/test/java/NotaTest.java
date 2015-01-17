import org.junit.Assert;
import org.junit.Test;

import exception.ArgumentOutOfBoundsException;

public class NotaTest {
	
	@Test(expected=ArgumentOutOfBoundsException	.class)
	public void validarNota1IncorretaMenorZero() {
		Nota nota = new Nota();
		nota.setNota1(-1);
	}
	
	@Test(expected=ArgumentOutOfBoundsException	.class)
	public void validarNota1IncorretaMaiorDez() {
		Nota nota = new Nota();
		nota.setNota1(9);
	}
	
	@Test
	public void validarNota1Correta(){
		Nota nota = new Nota();
		nota.setNota1(5);
		Assert.assertEquals(0,
				Double.compare(5, nota.getNota1()));
	}
}
