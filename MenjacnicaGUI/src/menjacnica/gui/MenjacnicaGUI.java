package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;

import java.awt.Dimension;

import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.ImageIcon;

import java.awt.Toolkit;

import javax.swing.border.TitledBorder;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class MenjacnicaGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	
	private JPanel panel;
	private JButton btnDodajKurs;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenu mnNewMenu;
	private JMenuItem mntmAbout;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;
	
	
	private static JTextArea textAreaStatus = new JTextArea();
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/1380429_711884798906059_6321634375902937318_n.jpg")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getScrollPane_1(), BorderLayout.SOUTH);
		contentPane.add(getPanel(), BorderLayout.EAST);
	}

	public static JTextArea getTextAreaStatus1() {
		return textAreaStatus;
	}
	
	public static void setTextAreaStatus(String status) {
		MenjacnicaGUI.textAreaStatus.setText(status);
	}

	static JTextArea jta = new JTextArea();
	private static String izabrano = jta.getText();
	
	
	public static String getIzabrano() {
		return izabrano;
	}

	public static void setIzabrano(String i) {
		izabrano = i;
	} 
	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, ""},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				Class[] columnTypes = new Class[] {
					Integer.class, String.class, Double.class, Double.class, Double.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			table.getColumnModel().getColumn(1).setPreferredWidth(85);
			addPopup(table, getPopupMenu());
		}
		return table;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane_1.setPreferredSize(new Dimension(70, 70));
			scrollPane_1.setViewportView(getTextAreaStatus1());
		}
		return scrollPane_1;
	}
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(140, 10));
			panel.setLayout(null);
			panel.add(getBtnDodajKurs());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					new DodajKursGUI().setVisible(true);
				}
			});
			btnDodajKurs.setBounds(10, 11, 120, 23);
		}
		return btnDodajKurs;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Obrisi kurs");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					new ObrisiKursGUI().setVisible(true);
				}
			});
			btnNewButton.setBounds(10, 45, 120, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Izvrsi zamenu");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					new IzvrsiZamenuGUI().setVisible(true);
				}
			});
			btnNewButton_1.setBounds(10, 79, 120, 23);
		}
		return btnNewButton_1;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					
					try {
						JFileChooser fc = new JFileChooser();
						int opt = fc.showOpenDialog(contentPane);
						if(opt == JFileChooser.APPROVE_OPTION) {
							File f = fc.getSelectedFile();
							izabrano = izabrano + "Ucitan fajl: " + f.getAbsolutePath() + "\n";
							textAreaStatus.setText(izabrano);
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(contentPane,
								e.getMessage(), "Greska",
								JOptionPane.ERROR_MESSAGE);
					}
					
					
				}
			});
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeOpen.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}

	
	private void ugasiProgram() {
		int sifra = JOptionPane.showConfirmDialog(contentPane, "Da li zaista zelite da izadjete iz programa?", "Izlaz", JOptionPane.YES_NO_CANCEL_OPTION);
		if (sifra == JOptionPane.YES_OPTION)
			System.exit(0);
	  }
	
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					ugasiProgram();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenu getMenu_1() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Help");
			mnNewMenu.add(getMntmAbout());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					
					JOptionPane.showMessageDialog(contentPane,
							"Autor: Milena Djurdjic, Verzija 1.0", "O programu",
							JOptionPane.INFORMATION_MESSAGE);
					
				}
			});
		}
		return mntmAbout;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMenuItem_1());
			popupMenu.add(getMenuItem_2());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	private JMenuItem getMenuItem_1() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
			mntmObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					new DodajKursGUI().setVisible(true);
				}
			});
		}
		return mntmObrisiKurs;
	}
	private JMenuItem getMenuItem_2() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
			mntmIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					new IzvrsiZamenuGUI().setVisible(true);
				}
			});
		}
		return mntmIzvrsiZamenu;
	}

	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					
					try {
						JFileChooser fc = new JFileChooser();
						int opt = fc.showSaveDialog(contentPane);
						if(opt == JFileChooser.APPROVE_OPTION) {
							File f = fc.getSelectedFile();
							izabrano = izabrano + "Sacuvan fajl: " + f.getAbsolutePath() + "\n";
							textAreaStatus.setText(izabrano);
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(contentPane,
								e.getMessage(), "Greska",
								JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					
					new DodajKursGUI().setVisible(true);
					
				}
			});
		}
		return mntmDodajKurs;
	}
}
