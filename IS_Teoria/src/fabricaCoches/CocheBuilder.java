package fabricaCoches;

public abstract class CocheBuilder {
	protected Coche coche;

	public Coche getCoche() {
		return coche;
	}

	public void construirCoche() {
		coche = new Coche();
	}
	// Caracteristicas Coche
	// public abstract void XXXX();
}
