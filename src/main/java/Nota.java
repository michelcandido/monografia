import java.security.InvalidAlgorithmParameterException;
import java.util.concurrent.ExecutionException;

import utils.enums.LimiteNota;
import exception.ArgumentOutOfBoundsException;


public class Nota {

	private float nota1;
	private float nota2;
	private float nota3;
	private float nota4;
	
	public void setNota1(float nota1) {
		this.validaNota(nota1);
		this.nota1 = nota1;
	}
	
	private void validaNota(float nota){
		if (nota < LimiteNota.LIMITE_INFERIOR.getValor()) {
			String argumento = "O valor"+nota1+" é menor que 0"; 
			throw new ArgumentOutOfBoundsException(argumento);
		}else if (nota > LimiteNota.LIMITE_SUPERIOR.getValor()) {
			String argumento = "O valor"+nota1+" é maior que 10"; 
			throw new ArgumentOutOfBoundsException(argumento);
		}
	}
	
	public float getNota1(){
		return this.nota1;
	}
	
}
