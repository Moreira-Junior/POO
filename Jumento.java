package exercicioHeranca;

public class Jumento extends Animal{

	private String barulho = "rinchar";
	
	public Jumento(String nome) {
		super(nome);
	}
	
	@Override
	public String perturbar() {
		return super.perturbar() + barulho;
	}
}
