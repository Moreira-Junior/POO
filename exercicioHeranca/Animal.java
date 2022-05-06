package exercicioHeranca;

public abstract class Animal {
	
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String perturbar() {
		return "Eu sou um(a) " + this.getClass().getSimpleName() + 
				" meu nome � " + this.nome +
				" e fa�o um barulho chamado: "; 
	}
}
