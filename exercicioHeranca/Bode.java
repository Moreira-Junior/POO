package exercicioHeranca;

public class Bode extends Animal{
	
	private String barulho = "bodejar";
	
	public Bode(String nome) {
		super(nome);
	}
	
	@Override
	public String perturbar() {
		return super.perturbar() + barulho;
	}
}
