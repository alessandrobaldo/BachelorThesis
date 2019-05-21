package tesi.model;

public class ArcoStazione {

	private Vertex s1;
	private Vertex s2;
	private double distance;
	
	public ArcoStazione(Vertex s1, Vertex s2, double distance) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.distance = distance;
	}
	
	

	public ArcoStazione(Vertex s1, Vertex s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}



	public Vertex getS1() {
		return s1;
	}

	public void setS1(Vertex s1) {
		this.s1 = s1;
	}

	public Vertex getS2() {
		return s2;
	}

	public void setS2(Vertex s2) {
		this.s2 = s2;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return String.format("ArcoStazione [s1=%s, s2=%s, distance=%s]", s1, s2, distance);
	}
	
	
}
