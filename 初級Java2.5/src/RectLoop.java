
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=35;
		int i;
		for (i=0 ; i<10 ; i++) {
			fillRect(x,x,10,80);
			


			x+=20;

		}
	}

}
