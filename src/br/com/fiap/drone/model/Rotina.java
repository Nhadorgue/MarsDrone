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
	private int diasM; //S�is decorridos desde que o drone coletou dados em Marte.
	private int mesM; //Mes em Marte (Mesma forma que na Terra)
	private double longSolar; //Logitude solar (�ngulo Marte-Sol) medidos a partir do hemisf�rio sul
	private double minTempM; //Temperatura (�C) min. em Marte
	private double maxTempM; //Temperatura (�C) min. em Marte
	private double pressao; //Press�o Atm. (Pa) da localiza��o do drone em Marte
	
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
