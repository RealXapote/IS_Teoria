package fabricaCoches;

public class Peticion {

	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();
		CocheBuilder cocheBuilderDeportivo = new CocheBuilderDeportivo();
		fabrica.setCocheBuilder(cocheBuilderDeportivo);

	}

}
