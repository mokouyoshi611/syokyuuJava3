
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=35;
		int y=5;
		int i;
		for (i=0 ; i<10 ; i++) {
			fillRect(x,60,10,y);
			

            y+=15;
			x+=15;

		}
	}

}
