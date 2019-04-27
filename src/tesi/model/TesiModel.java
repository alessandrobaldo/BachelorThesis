package tesi.model;


import java.util.List;

import tesi.db.AutoDAO;
import tesi.db.CityDAO;

public class TesiModel {
	private AutoDAO adao;
	private CityDAO cdao;
	
	public TesiModel() {
		this.adao=new AutoDAO();
		this.cdao=new CityDAO();
	}

	
	public List<String> getMarche() {
		// TODO Auto-generated method stub
		return adao.getListMarche();
	}


	public List<String> getModelli() {
		// TODO Auto-generated method stub
		return this.adao.getListModelli();
	}


	public List<Integer> getNumPosti() {
		// TODO Auto-generated method stub
		return adao.getListNumPosti();
	}


	public List<String> getSegmenti() {
		// TODO Auto-generated method stub
		return adao.getListSegmenti();
	}


	public List<String> getModelloByMarca(String value) {
		// TODO Auto-generated method stub
		return adao.getListModelliByMarca(value);
	}


	public String getMarcaByModello(String value) {
		// TODO Auto-generated method stub
		return adao.getMarcaByModello(value);
	}


	public List<AutoElettriche> getAllAuto() {
		// TODO Auto-generated method stub
		return adao.getListAuto();
	}


	public AutoElettriche getAutoByModello(String modello) {
		// TODO Auto-generated method stub
		return adao.getAutoByModello(modello);
	}


	public String getLatitudine(String partenza) {
		List<City> citta=this.cdao.getAllCities();
		for(City c:citta)
			if(c.getNome().equals(partenza))
				return ""+c.getLatitude();
		return "";
	}


	public String getLongitudine(String partenza) {
		List<City> citta=this.cdao.getAllCities();
		for(City c:citta)
			if(c.getNome().equals(partenza))
				return ""+c.getLongitude();
		return "";
	}


	public List<String> getCitta() {
		// TODO Auto-generated method stub
		return cdao.getNameOfCities();
	}

	

}
