package tesi.model;
import com.javadocmd.simplelatlng.LatLng;

public class StazioniRicarica {

	private int id;
	private String stationName;
	private String streetAddress;
	private City city;
	private int zip;
	private int evLevel1num;
	private int evLevel2num;
	private int dcFastCount;
	private LatLng coords;
	
	
	public StazioniRicarica(int id, String stationName, String streetAddress, City city, int zip, int evLevel1num,
			int evLevel2num, int dcFastCount, LatLng coords) {
		super();
		this.id = id;
		this.stationName = stationName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.zip = zip;
		this.evLevel1num = evLevel1num;
		this.evLevel2num = evLevel2num;
		this.dcFastCount = dcFastCount;
		this.coords=coords;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStationName() {
		return stationName;
	}


	public void setStationName(String stationName) {
		this.stationName = stationName;
	}


	public String getStationAddress() {
		return streetAddress;
	}


	public void setStationAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public int getEvLevel1num() {
		return evLevel1num;
	}


	public void setEvLevel1num(int evLevel1num) {
		this.evLevel1num = evLevel1num;
	}


	public int getEvLevel2num() {
		return evLevel2num;
	}


	public void setEvLevel2num(int evLevel2num) {
		this.evLevel2num = evLevel2num;
	}


	public int getDcFastCount() {
		return dcFastCount;
	}


	public void setDcFastCount(int dcFastCount) {
		this.dcFastCount = dcFastCount;
	}


	public LatLng getCoords() {
		return this.coords;
	}
	
	public void setCoords(LatLng coords) {
		this.coords=coords;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coords == null) ? 0 : coords.hashCode());
		result = prime * result + id;
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
		StazioniRicarica other = (StazioniRicarica) obj;
		if (coords == null) {
			if (other.coords != null)
				return false;
		} else if (!coords.equals(other.coords))
			return false;
		if (id != other.id)
			return false;
		return true;
	}


	


	
	
	
	
	
}
