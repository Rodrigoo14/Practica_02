package actividades;

public class Principal {

	public static void main(String[] args) {
		Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(10);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");
		bolsaCho.add(c);
		bolsaCho.add(c1);
		bolsaCho.add(c2);
		for (Chocolatina chocolatina: bolsaCho) {
			System.out.println(chocolatina.getMarca());
		}
		Bolsa<Golosina> bolsaGol = new Bolsa<Golosina>(4);
		Golosina g = new Golosina("Peritas", 0.5);
		Golosina g1 = new Golosina("Chupetines", 0.33);
		Golosina g2 = new Golosina("Sublime", 1);
		bolsaGol.add(g1);
		bolsaGol.add(g2);
		bolsaGol.add(g);
		
		for (Golosina golosina: bolsaGol) {
			System.out.println("Nombre: " + golosina.getNombre() + "\nPeso: " + golosina.getPeso() + "\n");
		}
		
	}
}
