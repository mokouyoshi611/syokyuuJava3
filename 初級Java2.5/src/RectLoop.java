
public class RectLoop extends MyFrame{
	public void run() {
		int i;
		int x=35;
		int y=0;
	
		for (i=0 ; i<10 ; i++) {
		setColor(y,y,y);
		fillRect(x,100,10,100);
		y+=20;
		x+=20;
		

		}
		
	}

}
