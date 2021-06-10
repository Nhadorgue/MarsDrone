package br.com.fiap.drone.util;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Labels extends JLabel{
	private static final long serialVersionUID = 1L;

	public Labels(String texto) {
		super(texto);//SUPER = CONTRUTOR DA CLASSE PAI(JLABEL)
		init();
	}
	
	public void init() {
		this.setForeground(new Color(0,0,0));//FOREGROUND = COR = POSSO PASSAR ESSA COR COMO CONSTANTE(RED, GREEN, ETC) OU PELO RGB COM "NEW COLOR(R, G, B)"
		//COLOCANDO "COLOR PICK" NO GOOGLE VC CONSEGUER O RGB E O HEXA DE CORES DIFERENCIADAS
		this.setFont(new Font(null, Font.BOLD, 14));//FONT TEM 3 PARAMETROS (NOME DA FONTE, FONT.NEGRITO/ITALICO/OUTROS, TAMANHO)
		this.setHorizontalAlignment(JLabel.CENTER);
	}
	

}
