package tesi.model;

import com.javadocmd.simplelatlng.LatLng;

public class City extends Vertex{

	

	private String nome;
	private LatLng coords;
	
	public City(String nome, LatLng coords) {
		super();
		this.nome = nome;
		this.coords = coords;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LatLng getCoords() {
		return coords;
	}

	public void setCoords(LatLng coords) {
		this.coords = coords;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.toLowerCase().trim().equals(other.nome.toLowerCase().trim()))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("%s\n", nome);
	}
	
}