package br.com.fiap.drone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.fiap.drone.dao.RotinaDAO;
import br.com.fiap.drone.model.Rotina;

public class App {
	
	public static void main(String[] args) {
		Rotina rotina = new Rotina();
		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String dF = dataFormatter.format(data);
		rotina.setDataT(dF);
		rotina.setDiasM(10);
		rotina.setLongSolar(180);
		rotina.setMesM(5);
		rotina.setMinTempM(12);
		rotina.setMaxTempM(50);
		rotina.setPressao(3.4);
		
		RotinaDAO dao = new RotinaDAO();
		dao.cadastrar(rotina);
		
		
	}

}
