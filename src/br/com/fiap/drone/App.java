package br.com.fiap.drone;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.drone.dao.RotinaDAO;
import br.com.fiap.drone.model.Rotina;

public class App extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
//	painelPrincipal
	private JPanel painelPrincipal = new JPanel();
	
//	painelConsulta
	private JPanel painelConsulta = new JPanel();
	private JTabbedPane abas = new JTabbedPane();
	private DefaultTableModel model = new DefaultTableModel();
	private JButton carregar = new JButton("carregar");
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
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
		
		Rotina rotina2 = new Rotina();
		LocalDateTime data2 = LocalDateTime.now();
		DateTimeFormatter dataFormatter2 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String dF2 = dataFormatter2.format(data2);
		rotina2.setDataT(dF2);
		rotina2.setDiasM(14);
		rotina2.setLongSolar(160);
		rotina2.setMesM(6);
		rotina2.setMinTempM(117);
		rotina2.setMaxTempM(7777);
		rotina2.setPressao(3);
		
		RotinaDAO dao = new RotinaDAO();
		dao.cadastrar(rotina);
		dao.cadastrar(rotina2);
		
		App app = new App();
		app.init();
		
	}

	private void init() {
		
		painelPrincipal.setLayout(new BorderLayout());
		
		painelConsulta.setLayout(new BorderLayout());
		
		abas.add("Cadastrar", painelPrincipal);
		abas.add("Lista", painelConsulta);
		add(abas);
		
		//adicionar ao painelPrincipal
		
		//adicionar ao painelConsulta
//		String[] colunas = {, "", "", ""};
//		String[][] dados = {
//				{"01/02/2000", "12", "34,6", "6", "10", "57", "3,4"},
//				{"02/02/2000", "13", "40,6", "6", "12", "60", "4,8"}
//		}; 
		model.addColumn("Dt. Terra");
		model.addColumn("Dias (Marte)");
		model.addColumn("Mês (Marte)");
		model.addColumn("Longitude");
		model.addColumn("Temp. Mínima(ºC)");
		model.addColumn("Temp. Máxima(ºC)");
		model.addColumn("Pressão (Pa)");
		carregarRotinas(model);
		
		JTable tabela = new JTable(model);
		
		painelConsulta.add(new JScrollPane(tabela));
		painelConsulta.add(carregar, BorderLayout.SOUTH);
		
		carregar.addActionListener(this);
		
		setSize(600, 350);
		setLocation(400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	private void carregarRotinas(DefaultTableModel model) {
		
		model.setNumRows(0);
		RotinaDAO dao = new RotinaDAO();
		List<Rotina> lista = dao.consultar();
		for (Rotina rotina : lista) {
			Object[] linha = {
					rotina.getDataT(), 
					rotina.getDiasM(), 
					rotina.getMesM(), 
					rotina.getLongSolar(), 
					rotina.getMinTempM(), 
					rotina.getMaxTempM(), 
					rotina.getPressao()
					};
			model.addRow(linha);
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		carregarRotinas(model);
		
	}

}

