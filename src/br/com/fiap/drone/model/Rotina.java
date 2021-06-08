package br.com.fiap.drone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rotina {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String dataT; //Data na Terra (dd/mm/yyyy)
	private int diasM; //Sóis decorridos desde que o drone coletou dados em Marte.
	private int mesM; //Mes em Marte (Mesma forma que na Terra)
	private double longSolar; //Logitude solar (ângulo Marte-Sol) medidos a partir do hemisfério sul
	private double minTempM; //Temperatura (ºC) min. em Marte
	private double maxTempM; //Temperatura (ºC) min. em Marte
	private double pressao; //Pressão Atm. (Pa) da localização do drone em Marte
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDataT() {
		return dataT;
	}
	public void setDataT(String dataT) {
		this.dataT = dataT;
	}
	public int getDiasM() {
		return diasM;
	}
	public void setDiasM(int diasM) {
		this.diasM = diasM;
	}
	public double getLongSolar() {
		return longSolar;
	}
	public void setLongSolar(double longSolar) {
		this.longSolar = longSolar;
	}
	public int getMesM() {
		return mesM;
	}
	public void setMesM(int mesM) {
		this.mesM = mesM;
	}
	public double getMinTempM() {
		return minTempM;
	}
	public void setMinTempM(double minTempM) {
		this.minTempM = minTempM;
	}
	public double getMaxTempM() {
		return maxTempM;
	}
	public void setMaxTempM(double maxTempM) {
		this.maxTempM = maxTempM;
	}
	public double getPressao() {
		return pressao;
	}
	public void setPressao(double pressao) {
		this.pressao = pressao;
	}
	
	

}
