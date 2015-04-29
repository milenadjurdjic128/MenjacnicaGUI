package menjacnica.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;
	private JButton btnDodaj;
	private JButton btnOdustani;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getTextFieldSkraceni());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra:");
			lblSifra.setBounds(10, 28, 46, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv:");
			lblNaziv.setBounds(240, 28, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(10, 53, 194, 20);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(240, 53, 194, 20);
		}
		return textFieldNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs:");
			lblProdajniKurs.setBounds(10, 84, 162, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs:");
			lblKupovniKurs.setBounds(240, 84, 148, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setBounds(10, 109, 194, 20);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setColumns(10);
			textFieldKupovni.setBounds(240, 109, 194, 20);
		}
		return textFieldKupovni;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs:");
			lblSrednjiKurs.setBounds(10, 140, 139, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv:");
			lblSkraceniNaziv.setBounds(240, 140, 119, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setBounds(10, 165, 194, 20);
			textFieldSrednji.setColumns(10);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setColumns(10);
			textFieldSkraceni.setBounds(240, 165, 194, 20);
		}
		return textFieldSkraceni;
	}
	
	
	
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					String d = "Sifra: " + textFieldSifra.getText() + ", Skraceni naziv: " + textFieldSkraceni.getText() + 
							", Prodajni kurs: " + textFieldProdajni.getText() + ", Srednji kurs: " + textFieldSrednji.getText() + 
							", Kupovni kurs: " + textFieldKupovni.getText() + ", Naziv: " + textFieldNaziv.getText();
					
					MenjacnicaGUI.setIzabrano(MenjacnicaGUI.getIzabrano() + d + "\n");
					
					MenjacnicaGUI.setTextAreaStatus(MenjacnicaGUI.getIzabrano());
					
				}
			});
			btnDodaj.setBounds(10, 215, 194, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					dispose();
				}
			});
			btnOdustani.setBounds(240, 215, 194, 23);
		}
		return btnOdustani;
	}
}
