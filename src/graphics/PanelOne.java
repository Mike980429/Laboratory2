package graphics;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.Player;

public class PanelOne extends JPanel implements ListSelectionListener{

	private Graphic main;
	private JScrollPane scroll;
	private JList<Player> players;
	//private String[] s={"enero","febrero"};
	private JPanel aux;
	
	public PanelOne(Graphic main) {
		// TODO Auto-generated constructor stub
		
		this.main=main;
		players=new JList<Player>();
		scroll=new JScrollPane();
		//players.setName(name);
		//players.add(s);
		aux=new JPanel(new GridLayout());
		aux.setSize(new Dimension(366,66));
		aux.add(players);
		add(aux);
		
	}

	
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
