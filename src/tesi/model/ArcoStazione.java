package tesi.model;

public class ArcoStazione {

	private StazioniRicarica s1;
	private StazioniRicarica s2;
	private float distance;
	
	public ArcoStazione(StazioniRicarica s1, StazioniRicarica s2, float distance) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.distance = distance;
	}

	public StazioniRicarica getS1() {
		return s1;
	}

	public void setS1(StazioniRicarica s1) {
		this.s1 = s1;
	}

	public StazioniRicarica getS2() {
		return s2;
	}

	public void setS2(StazioniRicarica s2) {
		this.s2 = s2;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}
	
	
}
