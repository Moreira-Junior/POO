package exercicioHeranca;

public class Exemplo {
	
	public static void main(String[] args) {
		
		Animal jumento = new Jumento("Bisonho");
		Animal bode = new Bode("Pai do chiqueiro");
		Animal vaca = new Vaca("Mimosa");
		
		System.out.println(jumento.perturbar());
		System.out.println(bode.perturbar());
		System.out.println(vaca.perturbar());
	}
}
