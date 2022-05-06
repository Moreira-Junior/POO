package exercicioHeranca;

public abstract class Animal {
	
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String perturbar() {
		return "Eu sou um(a) " + this.getClass().getSimpleName() + 
				" meu nome é " + this.nome +
				" e faço um barulho chamado: "; 
	}
}
