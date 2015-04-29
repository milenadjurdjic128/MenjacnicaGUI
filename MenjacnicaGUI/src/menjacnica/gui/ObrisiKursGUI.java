package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JButton button;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;
	private JButton btnObrisi;
	private JCheckBox chckbxZaistaObrisiKurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel_4());
		contentPane.add(getLabel_5());
		contentPane.add(getButton());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getTextFieldSkraceni());
		contentPane.add(getBtnObrisi());
		contentPane.add(getChckbxZaistaObrisiKurs());
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Sifra:");
			label.setBounds(10, 27, 46, 14);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Naziv:");
			label_1.setBounds(224, 27, 46, 14);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Prodajni kurs:");
			label_2.setBounds(10, 91, 162, 14);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Kupovni kurs:");
			label_3.setBounds(224, 91, 148, 14);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Srednji kurs:");
			label_4.setBounds(10, 153, 139, 14);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Skraceni naziv:");
			label_5.setBounds(224, 153, 119, 14);
		}
		return label_5;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Odustani");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					
					dispose();
					
				}
			});
			button.setBounds(224, 238, 194, 23);
		}
		return button;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(10, 52, 194, 20);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(224, 52, 194, 20);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setColumns(10);
			textFieldProdajni.setBounds(10, 116, 194, 20);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setColumns(10);
			textFieldKupovni.setBounds(224, 116, 194, 20);
		}
		return textFieldKupovni;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setColumns(10);
			textFieldSrednji.setBounds(10, 178, 194, 20);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setColumns(10);
			textFieldSkraceni.setBounds(224, 178, 194, 20);
		}
		return textFieldSkraceni;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					String d = "Sifra: " + textFieldSifra.getText() + ", Skraceni naziv: " + textFieldSkraceni.getText() + 
							", Prodajni kurs: " + textFieldProdajni.getText() + ", Srednji kurs: " + textFieldSrednji.getText() + 
							", Kupovni kurs: " + textFieldKupovni.getText() + ", Naziv: " + textFieldNaziv.getText();
					
					MenjacnicaGUI.setIzabrano(MenjacnicaGUI.getIzabrano() + d + "\n");
					
					MenjacnicaGUI.setTextAreaStatus(MenjacnicaGUI.getIzabrano());
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 238, 194, 23);
		}
		return btnObrisi;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					
					if(chckbxZaistaObrisiKurs.isSelected()) {
						btnObrisi.setEnabled(true);
					}
					else {
						btnObrisi.setEnabled(false);
					}
					
				}
			});
			chckbxZaistaObrisiKurs.setBounds(10, 205, 139, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
}
