import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Timer;
import javax.swing.JOptionPane;
public class MorningRushTester {

	public MorningRushTester() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int DELAY = 1000;

		class DrinkCoffee implements ActionListener{
			private int gulps;
			public DrinkCoffee(int inGulps) { 
				gulps = inGulps;
			}
			public void actionPerformed(ActionEvent event) {
				if(gulps > 0) {
					System.out.println(gulps);
				}
				else if (gulps == 0) {
					System.out.println("Go to school");
				}
			}
		}

		DrinkCoffee dc = new DrinkCoffee(5);
		Timer t = new Timer(DELAY,dc);
		t.start();
		
		JOptionPane.showMessageDialog(null,"Make another!"); 
		System.exit(0);
	}

}
