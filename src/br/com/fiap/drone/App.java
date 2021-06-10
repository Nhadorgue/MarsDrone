package br.com.fiap.drone;

import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.GridLayout;
=======
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

<<<<<<< HEAD
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
=======
import javax.swing.JButton;
import javax.swing.JFrame;
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
<<<<<<< HEAD
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
=======
import javax.swing.UIManager;
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
import javax.swing.table.DefaultTableModel;

import br.com.fiap.drone.dao.RotinaDAO;
import br.com.fiap.drone.model.Rotina;
import br.com.fiap.drone.util.Labels;

public class App extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
//	painelPrincipal
	private JPanel painelPrincipal = new JPanel();
	
<<<<<<< HEAD
	private Labels titulo = new Labels("Missão MarsDrone 2.0");
	
	private JPanel vazioL = new JPanel();
	private JPanel vazioB = new JPanel();
	
	private JPanel painelEsquerdo = new JPanel();
	private Border lblM = BorderFactory.createTitledBorder("Informações Marte");
	private Labels lblTemp = new Labels("Temperaturas");
	private Labels lblbe6 = new Labels("");
	private	JPanel painelTemp = new JPanel();
	private Labels lblMax = new Labels("Máxima:");
	private JTextField txtTMax = new JTextField();
	private Labels lblMin = new Labels("Mínima:");
	private JTextField txtTMin = new JTextField();
	private JLabel lble7 = new JLabel("");
	private	JPanel painelPressao= new JPanel();
	private Labels lblPressao = new Labels("Pressão:");
	private JTextField txtPressao = new JTextField();
	private	JPanel painelDias= new JPanel();
	private Labels lblDias = new Labels("Dias:");
	private JTextField txtDias = new JTextField();
	private	JPanel painelMes= new JPanel();
	private Labels lblMes = new Labels("Mês:");
	private JTextField txtMes = new JTextField();
	private JLabel lble8 = new JLabel("");
	private JLabel lble9 = new JLabel("");
	
	private JPanel painelDireito = new JPanel();
	private Labels lblDtTerra = new Labels("Data Terráquea");
	private JTextField txtDtTerra = new JTextField();
	//.setToolTipText("Apenas números");
	private JLabel lblLS = new Labels("Longitude Solar");
	private String[] graus = {
			"...",
			"0  : Equinócio de Outono",
			"90 : Solstício de Inverno",
			"180: Equinócio de Pimavera",
			"270: Solstício de Verão"
			
	};
	private JComboBox<String> cbLS = new JComboBox<String>(graus);
	private Labels lblbe1 = new Labels("");
	private Labels lblbe2 = new Labels("");
	private Labels lblbe3 = new Labels("");
	private Labels lblbe4 = new Labels("");
	private Labels lblbe5 = new Labels("");
	private JButton btnSalvar = new JButton("  Salvar  ");
	private JButton btnCancelar = new JButton("Cancelar");
		
=======
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
//	painelConsulta
	private JPanel painelConsulta = new JPanel();
	private JTabbedPane abas = new JTabbedPane();
	private DefaultTableModel model = new DefaultTableModel();
<<<<<<< HEAD
	private JTable tabela = new JTable(model);
	private JPanel painelBotoes = new JPanel();
	private JButton btnApagar = new JButton("Apagar");
	private JButton btnCarregar = new JButton("Carregar");
=======
	private JButton carregar = new JButton("carregar");
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
<<<<<<< HEAD
		Rotina rotina1 = new Rotina();
		LocalDateTime data1 = LocalDateTime.now();
		DateTimeFormatter dataFormatter1 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String dF1 = dataFormatter1.format(data1);
		rotina1.setDataT(dF1);
		rotina1.setDiasM("10");
		rotina1.setLongSolar("180");
		rotina1.setMesM("5");
		rotina1.setMinTempM("12");
		rotina1.setMaxTempM("50");
		rotina1.setPressao("3.4");
		
		RotinaDAO dao = new RotinaDAO();
		dao.cadastrar(rotina1);
		
		App app = new App();
		app.init();
		
	}

	private void init() {
		
		abas.add("Cadastrar", painelPrincipal);
		abas.add("Lista", painelConsulta);
		add(abas);
		
		painelEsquerdo.setLayout(new GridLayout(8,1));
		painelEsquerdo.setBorder(new EmptyBorder(20, 10, 16, 10));
		painelEsquerdo.setBorder(lblM);
		painelEsquerdo.add(lblTemp);
		painelTemp.setLayout(new GridLayout(1, 4));
		painelTemp.setBorder(new EmptyBorder(0, 0, 0, 10));
		painelTemp.add(lblMax);
		painelTemp.add(txtTMax);
		painelTemp.add(lblMin);
		painelTemp.add(txtTMin);
		painelEsquerdo.add(painelTemp);
		painelEsquerdo.add(lble7);
		painelPressao.setLayout(new GridLayout(1, 2));
		painelPressao.setBorder(new EmptyBorder(0, 0, 0, 10));
		painelPressao.add(lblPressao);
		painelPressao.add(txtPressao);
		painelEsquerdo.add(painelPressao);
		painelEsquerdo.add(lble8);
		painelDias.setLayout(new GridLayout(1, 2));
		painelDias.setBorder(new EmptyBorder(0, 0, 0, 10));
		painelDias.add(lblDias);
		painelDias.add(txtDias);
		painelEsquerdo.add(painelDias);
		painelEsquerdo.add(lble9);
		painelMes.setLayout(new GridLayout(1, 2));
		painelMes.setBorder(new EmptyBorder(0, 0, 0, 10));
		painelMes.add(lblMes);
		painelMes.add(txtMes);
		painelEsquerdo.add(painelMes);

		painelDireito.setLayout(new GridLayout(12,1));
		painelDireito.setBorder(new EmptyBorder(20, 16, 0, 16));
		painelDireito.add(lblDtTerra);
//		Dar um jeito de adicionar hint
		painelDireito.add(txtDtTerra);
		painelDireito.add(lblbe6);
		painelDireito.add(lblLS);
		painelDireito.add(cbLS);
		painelDireito.add(lblbe1);
		painelDireito.add(lblbe2);
		painelDireito.add(lblbe3);
		painelDireito.add(lblbe4);
		painelDireito.add(lblbe5);
		painelDireito.add(btnSalvar);
		painelDireito.add(btnCancelar);
		
		//adicionar ao painelPrincipal
		painelPrincipal.setLayout(new BorderLayout());
		painelPrincipal.add(vazioL, BorderLayout.WEST);
		painelPrincipal.add(titulo, BorderLayout.NORTH);
		painelPrincipal.add(vazioB, BorderLayout.SOUTH);
		painelPrincipal.add(painelEsquerdo, BorderLayout.CENTER);
		painelPrincipal.add(painelDireito, BorderLayout.EAST);
		
		
		painelConsulta.setLayout(new BorderLayout());
		model.addColumn("Dt. Terra");
		model.addColumn("Dias (Marte)");
		model.addColumn("Mês (Marte)");
		model.addColumn("Longitude");
		model.addColumn("Temp. Mínima(ºC)");
		model.addColumn("Temp. Máxima(ºC)");
		model.addColumn("Pressão (Pa)");
		carregarRotinas(model);
		painelBotoes.add(btnCarregar);
		painelBotoes.add(btnApagar);
		
		//adicionar ao painelConsulta
		painelConsulta.add(new JScrollPane(tabela));
		painelConsulta.add(painelBotoes, BorderLayout.SOUTH);
				
		//configurar botoes
		btnSalvar.addActionListener(this);
		btnCarregar.addActionListener(this);
		btnCancelar.addActionListener(this);
		btnApagar.addActionListener(this);
		
		setSize(600, 350);
		setLocation(400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	private void sair() {
		Object[] opcs = {"   Sim   ", "   Não   "};
		int n = JOptionPane.showOptionDialog(null, "Deseja Sair/Cancelar?", "Sair...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcs, opcs[1]);
		
		if(n == 0) {
			System.exit(0);
		}
		
	}

	private void salvar() {
		
=======
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
		Rotina rotina = new Rotina();
		
<<<<<<< HEAD
		String dT = txtDtTerra.getText();
		String dia = dT.substring(0, 2);
		String mes = dT.substring(2, 4);
		String ano = dT.substring(4, 8);
		dT = dia + "/" + mes + "/" + ano;
//		int dias = txtDias.getText();
		String dias = txtDias.getText();
		String longi = (String)cbLS.getSelectedItem();
		String tempMin = txtTMax.getText();
		String tempMax = txtTMin.getText();
		String pres = txtPressao.getText();
		
		String mesM = txtMes.getText();
		rotina.setDataT(dT);
		rotina.setDiasM(dias);
		rotina.setLongSolar( longi.substring(0, 3));
		rotina.setMesM(mesM);
		rotina.setMinTempM(tempMin);
		rotina.setMaxTempM(tempMax);
		rotina.setPressao(pres);
		
		Object[] opcs = {"   Sim   ", "   Não   "};
		int n = JOptionPane.showOptionDialog(null, "Deseja salvar?", "Salvar...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcs, opcs[1]);
		
		if(n == 0) {
			RotinaDAO dao = new RotinaDAO();
			dao.cadastrar(rotina);
			JOptionPane.showMessageDialog(null, "Rotina inserida com sucesso!!!");
		}
		
		
	}

	private void apagar() {
		int linha = tabela.getSelectedRow();
		String id = tabela.getValueAt(linha, 0).toString();
		String data = tabela.getValueAt(linha, 1).toString();
		
		Object[] opcs = {"   Sim   ", "   Não   "};
		int n = JOptionPane.showOptionDialog(null, "Deseja apagar rotina " +id+ " do dia " +data+ "?", "Apagar...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcs, opcs[1]);
		
		if(n == 0) {
			RotinaDAO dao = new RotinaDAO();
			dao.apagar(Long.valueOf(id));
			carregarRotinas(model);
			JOptionPane.showMessageDialog(null, "Rotina apagada com sucesso!!!");
		
		}
		
	}
	
	private void carregarRotinas(DefaultTableModel model) {
		
		model.setNumRows(0);
		RotinaDAO dao = new RotinaDAO();
		List<Rotina> lista = dao.consultar();
		for (Rotina rotina : lista) {
			Object[] linha = {
					rotina.getId(),
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
		if (e.getSource() == btnCarregar) carregarRotinas(model);
		
		if (e.getSource() == btnCancelar) sair();
		
		if (e.getSource() == btnSalvar) salvar();
		
		if (e.getSource() == btnApagar) apagar();
			
=======
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
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
		
	}

}

<<<<<<< HEAD



=======
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
