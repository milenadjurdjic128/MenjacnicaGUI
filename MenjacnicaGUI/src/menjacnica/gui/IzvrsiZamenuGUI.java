package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblProdajniKurs;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs_1;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupujem;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblProdajniKurs_1());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupujem());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Kupovni kurs:");
			lblProdajniKurs.setBounds(10, 11, 124, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta:");
			lblValuta.setBounds(194, 11, 46, 14);
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs_1() {
		if (lblProdajniKurs_1 == null) {
			lblProdajniKurs_1 = new JLabel("Prodajni kurs:");
			lblProdajniKurs_1.setBounds(288, 11, 92, 14);
		}
		return lblProdajniKurs_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 29, 135, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(288, 29, 135, 20);
		}
		return textField_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(171, 29, 92, 20);
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos:");
			lblIznos.setBounds(10, 95, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(10, 120, 135, 20);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(245, 74, 135, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupujem() {
		if (rdbtnKupujem == null) {
			rdbtnKupujem = new JRadioButton("Kupovina");
			rdbtnKupujem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					if(rdbtnKupujem.isSelected()) {
						rdbtnProdaja.setEnabled(false);
					}
					else {
						rdbtnProdaja.setEnabled(true);
					}
				}
			});
			rdbtnKupujem.setBounds(244, 95, 109, 23);
		}
		return rdbtnKupujem;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					if(rdbtnProdaja.isSelected()) {
						rdbtnKupujem.setEnabled(false);
					}
					else {
						rdbtnKupujem.setEnabled(true);
					}
				}
			});
			rdbtnProdaja.setBounds(244, 119, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent o) {
					int vrednost = slider.getValue();
					textFieldIznos.setText("" + vrednost);
				}
			});
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setBounds(20, 158, 403, 45);
		}
		return slider;
	}
	
	private String kupovinaIliProdaja() {
		String p = "Nepoznato";
		if(rdbtnProdaja.isSelected()) {
			p = "Prodaja";
		} 
		if (rdbtnKupujem.isSelected()) {
			p = "Kupovina";
		}
		return p;
	}
	
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					try {
						String d = "Valuta: " + comboBox.getSelectedItem() + ", Iznos: " + textFieldIznos.getText() + ", U pitanju je: " + 
						kupovinaIliProdaja();
						
						MenjacnicaGUI.setIzabrano(MenjacnicaGUI.getIzabrano() + d + "\n");
						
						MenjacnicaGUI.setTextAreaStatus(MenjacnicaGUI.getIzabrano());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(contentPane,
								e.getMessage(), "Greska",
								JOptionPane.ERROR_MESSAGE);
					}
					
					
				}
			});
			btnIzvrsiZamenu.setBounds(10, 222, 180, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				  dispose();
				}
			});
			btnOdustani.setBounds(245, 222, 180, 23);
		}
		return btnOdustani;
	}
}
