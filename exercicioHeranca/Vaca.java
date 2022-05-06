package exercicioHeranca;

public class Vaca extends Animal{

	private String barulho = "mugir";
	
	public Vaca(String nome) {
		super(nome);
	}
	
	@Override
	public String perturbar() {
		return super.perturbar() + barulho;
	}
}
