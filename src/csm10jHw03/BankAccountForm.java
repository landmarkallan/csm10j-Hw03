package csm10jHw03;

class BankAccountForm extends AssetForm
{
	// members:
	private int WIDTH = 400; 
	private int HEIGHT = 400;
	
	private Container pane;
	
	private JLabel nameLbl, balanceLbl;
	private JTextField nameTF, balanceTF;
	private JButton cancelB, saveB;
	
	// methods:
	
		// constructor:
	public WealthManagerForm()
	{
		this.setTitle("Bank Account");
		this.setSize(WIDTH,HEIGHT);
		this.setVisible(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setup()
	{
		nameLbl = new JLabel("Name", SwingConstants.LEFT);
		balanceLbl = new JLabel("Balance", SwingConstants.LEFT);

		nameTF = new JTextField();
		balanceTF = new JTextField();
		
		cancelB = new JButton();
		saveB = new JButton();
		
		nameLbl.setLocation(10,10);
		nameLbl.setSize(100,20);
		
		balanceLbl.setLocation(170,10);
		balanceLbl.setSize(100,20);
		
		nameTF.setEditable(true);
		balanceTF.setEditable(true);
		
		pane = getContentPane();
		pane.setLayout(null);
		
		pane.add(nameLbl);
		pane.add(balanceLbl);
		pane.add(nameTF);
		pane.add(balanceTF);
		
		this.setJMenuBar(menuMB);
		this.setNewMenu();
		
		this.setSize(800,600);
		this.setVisible(true);
	}
}
