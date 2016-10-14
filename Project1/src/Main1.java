import javax.swing.JFrame;


public class Main1 
{
	public static void main(String[] args) 
	{

		JFrame myFrame = new JFrame("MineSweeper");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(400, 250);
		myFrame.setSize(400, 445);

		MyPanel1 myPanel = new MyPanel1();
		myFrame.add(myPanel);
		MyMouseAdapter1 myMouseAdapter = new MyMouseAdapter1();

		myFrame.addMouseListener(myMouseAdapter);
		myMouseAdapter.MinesArray(); //  added
		myFrame.setVisible(true);
	}

}