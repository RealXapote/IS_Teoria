package fabricaCoches;

public class Fabrica {
	private CocheBuilder cocheBuilder;
	public void setCocheBuilder(CocheBuilder cb){
		cocheBuilder=cb;
	}
	public Coche getCoche(){
		construirCoche();
		return cocheBuilder.getCoche();
	}
	private void construirCoche(){
		cocheBuilder.construirCoche();
		// Caracteristicas del coche
	}

}
