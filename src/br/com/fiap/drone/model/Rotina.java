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
<<<<<<< HEAD
	private String diasM; //Sóis decorridos desde que o drone coletou dados em Marte.
	private String mesM; //Mes em Marte (Mesma forma que na Terra)
	private String longSolar; //Logitude solar (ângulo Marte-Sol) medidos a partir do hemisfério sul
	private String minTempM; //Temperatura (ºC) min. em Marte
	private String maxTempM; //Temperatura (ºC) min. em Marte
	private String pressao; //Pressão Atm. (Pa) da localização do drone em Marte
=======
	private int diasM; //Sóis decorridos desde que o drone coletou dados em Marte.
	private int mesM; //Mes em Marte (Mesma forma que na Terra)
	private double longSolar; //Logitude solar (ângulo Marte-Sol) medidos a partir do hemisfério sul
	private double minTempM; //Temperatura (ºC) min. em Marte
	private double maxTempM; //Temperatura (ºC) min. em Marte
	private double pressao; //Pressão Atm. (Pa) da localização do drone em Marte
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
	
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
	public String getDiasM() {
		return diasM;
	}
	public void setDiasM(String diasM) {
		this.diasM = diasM;
	}
	public String getLongSolar() {
		return longSolar;
	}
	public void setLongSolar(String longSolar) {
		this.longSolar = longSolar;
	}
	public String getMesM() {
		return mesM;
	}
	public void setMesM(String mesM) {
		this.mesM = mesM;
	}
	public String getMinTempM() {
		return minTempM;
	}
	public void setMinTempM(String minTempM) {
		this.minTempM = minTempM;
	}
	public String getMaxTempM() {
		return maxTempM;
	}
	public void setMaxTempM(String maxTempM) {
		this.maxTempM = maxTempM;
	}
	public String getPressao() {
		return pressao;
	}
	public void setPressao(String pressao) {
		this.pressao = pressao;
	}
	
	

}
