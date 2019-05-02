package tesi.model;


import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import com.javadocmd.simplelatlng.LatLng;

import tesi.db.ColonnineDAO;

public class TesiModel {
	private ColonnineDAO dao;
	private Graph<StazioniRicarica, DefaultWeightedEdge> reteStazioni;
	
	public TesiModel() {
		this.dao=new ColonnineDAO();
		reteStazioni=new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
	}

	
	public List<String> getMarche() {
		// TODO Auto-generated method stub
		return dao.getListMarche();
	}


	public List<String> getModelli() {
		// TODO Auto-generated method stub
		return this.dao.getListModelli();
	}


	public List<Integer> getNumPosti() {
		// TODO Auto-generated method stub
		return dao.getListNumPosti();
	}


	public List<String> getSegmenti() {
		// TODO Auto-generated method stub
		return dao.getListSegmenti();
	}


	public List<String> getModelloByMarca(String value) {
		// TODO Auto-generated method stub
		return dao.getListModelliByMarca(value);
	}


	public String getMarcaByModello(String value) {
		// TODO Auto-generated method stub
		return dao.getMarcaByModello(value);
	}


	public List<AutoElettriche> getAllAuto() {
		// TODO Auto-generated method stub
		return dao.getListAuto();
	}


	public AutoElettriche getAutoByModello(String modello) {
		// TODO Auto-generated method stub
		return dao.getAutoByModello(modello);
	}


	public String getLatitudine(String partenza) {
		List<City> citta=this.dao.getAllCities();
		for(City c:citta)
			if(c.getNome().equals(partenza))
				return ""+c.getCoords().getLatitude();
		return "";
	}


	public String getLongitudine(String partenza) {
		List<City> citta=this.dao.getAllCities();
		for(City c:citta)
			if(c.getNome().equals(partenza))
				return ""+c.getCoords().getLongitude();
		return "";
	}


	public List<String> getCitta() {
		// TODO Auto-generated method stub
		return dao.getNameOfCities();
	}
	
	public void creaGrafo() {
		Graphs.addAllVertices(this.reteStazioni, dao.getListStazioni());
		for(StazioniRicarica r:this.reteStazioni.vertexSet())
			for(StazioniRicarica s:dao.getStazioniRaggiungibili(r)) {
				ArcoStazione a=new ArcoStazione(r,s,this.distanzaPunti(r.getCoords(),s.getCoords()));
				Graphs.addEdge(this.reteStazioni,a.getS1(), a.getS2(), a.getDistance());}
	}
	
	public float distanzaPunti(LatLng coords1, LatLng coords2) {
		double lat1=(coords1.getLatitude()*Math.PI/180);
		double lat2=(coords2.getLatitude()*Math.PI/180);
		double long1=(coords1.getLongitude()*Math.PI/180);
		double long2=(coords2.getLongitude()*Math.PI/180);
		
		double lat=lat2-lat1;
		double lon=long2-long1;
		
		double p1=Math.cos(lat2)*Math.sin(lon);
		double p11=p1*p1;
		
		double p2=Math.cos(lat1)*Math.sin(lat2)-Math.sin(lat1)*Math.cos(lat2)*Math.cos(lon);
		double p22=p2*p2;
		
		double p3=Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon);
		double p4=Math.atan((Math.sqrt(p11+p22))/p3);
		
		float distance=(float)p4*6372;
		return distance;
	}


	public Graph<StazioniRicarica, DefaultWeightedEdge> getReteStazioni() {
		return reteStazioni;
	}
	
	

	

}
