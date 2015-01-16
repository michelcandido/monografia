package utils.enums;

public enum LimiteNota {

	LIMITE_INFERIOR(0), LIMITE_SUPERIOR(10);
	
	public float limite;
	
	private LimiteNota(float limite) {
		this.limite = limite;
	}
	
	public float getValor(){
		return this.limite;
	}
	
}
