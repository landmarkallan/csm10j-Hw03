// libraries:

import java.awt.Container;
// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Graphics;

// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JTextField;
// import javax.swing.JButton;
import javax.swing.JPanel;

import javax.swing.JMenuBar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.JList;

import javax.swing.JTextArea;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javax.swing.ListSelectionModel;

import javax.swing.SwingConstants;

import java.util.Vector;

// import java.util.LinkedList;
// import java.util.List;

import WealthManagement.Asset;

// classes:

public class WealthManagerForm extends JFrame implements ActionListener,
	ListSelectionListener
{
	// members:
	private int WIDTH = 400; 
	private int HEIGHT = 400;
	
	private Container pane;
	
	private JLabel assetLbl, assetDetailLbl;
	
	private JMenuBar menuMB;
	private JMenu newM;
	private JMenuItem bankAccountI, stockI, carI, houseI;
	
	private JList<Asset> assetLst;
	
	private JTextArea assetTA;
	
	private Vector<Asset> assetV;
	
	// methods:
	
		// constructor:
	public WealthManagerForm()
	{
		this.setTitle("Wealth Manager");
		this.setSize(WIDTH,HEIGHT);
		this.setVisible(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setup()
	{	
		assetLbl = new JLabel("Assets", SwingConstants.LEFT);
		assetDetailLbl = new JLabel("Asset Detail", SwingConstants.LEFT);
	
		menuMB = new JMenuBar();
	
		assetV = new Vector<Asset>();
	
		assetLst = new JList<Asset>(assetV);
		assetTA = new JTextArea(10,1);
		
		assetLbl.setLocation(10,10);
		assetLbl.setSize(100,20);
		
		assetDetailLbl.setLocation(170,10);
		assetDetailLbl.setSize(100,20);
		
		assetLst.setLocation(10,40);
		assetLst.setSize(150,490);
		
		assetTA.setLocation(170,40);
		assetTA.setSize(600,400);
		
		assetLst.setVisibleRowCount(10);
		assetLst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		assetLst.addListSelectionListener(this);
		
		assetTA.setEditable(false);
		
		pane = getContentPane();
		pane.setLayout(null);
		
		pane.add(assetLbl);
		pane.add(assetDetailLbl);
		pane.add(assetLst);
		pane.add(assetTA);
		
		this.setJMenuBar(menuMB);
		this.setNewMenu();
		
		this.setSize(800,600);
		this.setVisible(true);
	}
	
	private void setNewMenu()
	{
		newM = new JMenu("New");
		menuMB.add(newM);
		
		bankAccountI = new JMenuItem("Bank Account");
		newM.add(bankAccountI);
		bankAccountI.addActionListener(this);
		
		stockI = new JMenuItem("Stock");
		newM.add(stockI);
		stockI.addActionListener(this);
		
		carI = new JMenuItem("Car");
		newM.add(carI);
		carI.addActionListener(this);
		
		houseI = new JMenuItem("House");
		newM.add(houseI);
		houseI.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JMenuItem mItem = (JMenuItem) e.getSource();
		
		if (mItem == bankAccountI)
		{
			
		}
		else if (mItem == stockI)
		{
			
		}
		else if (mItem == carI)
		{
			
		}
		else if (mItem == houseI)
		{
			
		}
	}
	
	public void valueChanged(ListSelectionEvent e)
	{
		
	}
	
	public static void main(String[] args)
	{
		WealthManagerForm wm = new WealthManagerForm();
		wm.setup();
	}
}
