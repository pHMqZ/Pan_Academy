package pacote_animais;

public class Programa {
	public static void main(String[] args) {

		Gato gatinho1 = new Gato();
		gatinho1.dormir();
		gatinho1.peso = 7;
		gatinho1.raca = "Siames";
		System.out.println("---Sobre o gato---");
		System.out.println(gatinho1.peso);

		Cachorro cachorrinho1 = new Cachorro();
		cachorrinho1.comer();
		cachorrinho1.peso = 12;
		cachorrinho1.raca = "Labrador";
		System.out.println("---Sobre o cachorro---");
		System.out.println(cachorrinho1.peso);

	}
}
