package br.com.fiap.drone;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.drone.dao.RotinaDAO;
import br.com.fiap.drone.model.Rotina;
import br.com.fiap.drone.util.Labels;

public class App extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
//	painelPrincipal
	private JPanel painelPrincipal = new JPanel();
	
	private Labels titulo = new Labels("Miss�o MarsDrone 2.0");
	
	private JPanel vazioL = new JPanel();
	private JPanel vazioB = new JPanel();
	
	private JPanel painelEsquerdo = new JPanel();
	private Border lblM = BorderFactory.createTitledBorder("Informa��es Marte");
	private Labels lblTemp = new Labels("Temperaturas");
	private Labels lblbe6 = new Labels("");
	private	JPanel painelTemp = new JPanel();
	private Labels lblMax = new Labels("M�xima:");
	private JTextField txtTMax = new JTextField();
	private Labels lblMin = new Labels("M�nima:");
	private JTextField txtTMin = new JTextField();
	private JLabel lble7 = new JLabel("");
	private	JPanel painelPressao= new JPanel();
	private Labels lblPressao = new Labels("Press�o:");
	private JTextField txtPressao = new JTextField();
	private	JPanel painelDias= new JPanel();
	private Labels lblDias = new Labels("Dias:");
	private JTextField txtDias = new JTextField();
	private	JPanel painelMes= new JPanel();
	private Labels lblMes = new Labels("M�s:");
	private JTextField txtMes = new JTextField();
	private JLabel lble8 = new JLabel("");
	private JLabel lble9 = new JLabel("");
	
	private JPanel painelDireito = new JPanel();
	private Labels lblDtTerra = new Labels("Data Terr�quea");
	private JTextField txtDtTerra = new JTextField();
	//.setToolTipText("Apenas n�meros");
	private JLabel lblLS = new Labels("Longitude Solar");
	private String[] graus = {
			"...",
			"0  : Equin�cio de Outono",
			"90 : Solst�cio de Inverno",
			"180: Equin�cio de Pimavera",
			"270: Solst�cio de Ver�o"
			
	};
	private JComboBox<String> cbLS = new JComboBox<String>(graus);
	private Labels lblbe1 = new Labels("");
	private Labels lblbe2 = new Labels("");
	private Labels lblbe3 = new Labels("");
	private Labels lblbe4 = new Labels("");
	private Labels lblbe5 = new Labels("");
	private JButton btnSalvar = new JButton("  Salvar  ");
	private JButton btnCancelar = new JButton("Cancelar");
		
//	painelConsulta
	private JPanel painelConsulta = new JPanel();
	private JTabbedPane abas = new JTabbedPane();
	private DefaultTableModel model = new DefaultTableModel();
	private JTable tabela = new JTable(model);
	private JPanel painelBotoes = new JPanel();
	private JButton btnApagar = new JButton("Apagar");
	private JButton btnCarregar = new JButton("Carregar");
	private JButton btnAlterar = new JButton("Alterar");
	
	private boolean decisao;
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
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
		model.addColumn("ID");
		model.addColumn("Dt. Terra");
		model.addColumn("Dias (Marte)");
		model.addColumn("M�s (Marte)");
		model.addColumn("Longitude");
		model.addColumn("Temp. M�nima(�C)");
		model.addColumn("Temp. M�xima(�C)");
		model.addColumn("Press�o (Pa)");
		carregarRotinas(model);
		painelBotoes.add(btnCarregar);
		painelBotoes.add(btnAlterar);
		painelBotoes.add(btnApagar);
		
		//adicionar ao painelConsulta
		painelConsulta.add(new JScrollPane(tabela));
		painelConsulta.add(painelBotoes, BorderLayout.SOUTH);
				
		//configurar botoes
		btnSalvar.addActionListener(this);
		btnCarregar.addActionListener(this);
		btnCancelar.addActionListener(this);
		btnApagar.addActionListener(this);
		btnAlterar.addActionListener(this);
		
		setSize(600, 350);
		setLocation(400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void alterar() {
		
		int linha = tabela.getSelectedRow();
		Long id = (Long) tabela.getValueAt(linha, 0);
		String data = tabela.getValueAt(linha, 1).toString();
		
		Object[] opcs = {"   Sim   ", "   N�o   "};
		int n = JOptionPane.showOptionDialog(null, "Deseja alterar rotina " +id+ " do dia " +data+ "?", "Alterar...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcs, opcs[1]);
		
		if(n == 0) {
			String dM = tabela.getValueAt(linha, 2).toString();
			String mM = tabela.getValueAt(linha, 3).toString();
			String longi = tabela.getValueAt(linha, 4).toString();
			String tMin = tabela.getValueAt(linha, 5).toString();
			String tMax = tabela.getValueAt(linha, 6).toString();
			String press = tabela.getValueAt(linha, 7).toString();
			
			Rotina rotina = new Rotina();
			rotina.setId(id);
			rotina.setDataT(data);
			rotina.setDiasM(dM);
			rotina.setLongSolar(longi);
			rotina.setMesM(mM);
			rotina.setMinTempM(tMin);
			rotina.setMaxTempM(tMax);
			rotina.setPressao(press);
			
			abas.setSelectedIndex(0);
			txtDtTerra.setText(data);
			txtDias.setText(dM);
//			String a ;
//			for (int i = 0; i <= cbLS.getItemCount() - 1; i++) {
//				JOptionPane.showMessageDialog(null, cbLS.getItemAt(i)+" - " + longi);
//				if (cbLS.getItemAt(i).toString().substring(0, 3) == longi.substring(0, 3)) {
//					a = cbLS.getItemAt(i);
//					cbLS.setSelectedItem(a);
//					
//				}
				
//				if (cbLS.getSelectedItem().toString().substring(0, 3) == longi) {
//					a = i;
//				}
//			}
			
			txtMes.setText(mM);
			txtTMin.setText(tMin);
			txtTMax.setText(tMax);
			txtPressao.setText(press);
			
//			RotinaDAO dao = new RotinaDAO();
//			
//			
//			
//			dao.alterar(Long.valueOf(id));
//			carregarRotinas(model);--------
//			JOptionPane.showMessageDialog(null, "Rotina alterada com sucesso!!!");
//		
		}
		
		
	}

	private void sair() {
		Object[] opcs = {"   Sim   ", "   N�o   "};
		int n = JOptionPane.showOptionDialog(null, "Deseja Sair/Cancelar?", "Sair...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcs, opcs[1]);
		
		if(n == 0) {
			System.exit(0);
		}
		
	}

	private void salvar() {
		
		if (decisao == true) {
			String dT = txtDtTerra.getText();
			String dia = dT.substring(0, 2);
			String mes = dT.substring(2, 4);
			String ano = dT.substring(4, 8);
			dT = dia + "/" + mes + "/" + ano;
//			int dias = txtDias.getText();
			String dias = txtDias.getText();
			String longi = (String)cbLS.getSelectedItem();
			String tempMin = txtTMax.getText();
			String tempMax = txtTMin.getText();
			String pres = txtPressao.getText();
			String mesM = txtMes.getText();
			
			Rotina rotina = new Rotina();
			rotina.setDataT(dT);
			rotina.setDiasM(dias);
			rotina.setLongSolar(longi.substring(0, 3));
			rotina.setMesM(mesM);
			rotina.setMinTempM(tempMin);
			rotina.setMaxTempM(tempMax);
			rotina.setPressao(pres);
			
			Object[] opcs = {"   Sim   ", "   N�o   "};
			int n = JOptionPane.showOptionDialog(null, "Deseja salvar?", "Salvar...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcs, opcs[1]);
			
			if(n == 0) {
				RotinaDAO dao = new RotinaDAO();
				dao.cadastrar(rotina);
				JOptionPane.showMessageDialog(null, "Rotina inserida com sucesso!!!");
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Programar Alterar");

		}
		
		
		
		
	}

	private void apagar() {
		int linha = tabela.getSelectedRow();
		String id = tabela.getValueAt(linha, 0).toString();
		String data = tabela.getValueAt(linha, 1).toString();
		
		Object[] opcs = {"   Sim   ", "   N�o   "};
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
		
		if (e.getSource() == btnSalvar) { salvar(); decisao = true;};
		
		if (e.getSource() == btnApagar) apagar();
		
		if (e.getSource() == btnAlterar) { alterar(); decisao = false;};
		
	}

	

}




