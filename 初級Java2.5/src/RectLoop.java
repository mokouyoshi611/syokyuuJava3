
public class RectLoop extends MyFrame{
	public void run() {
		int i;
		int x=30;
		int y=30;
		setColor(y,128,0);
	
		for (i=0 ; i<10 ; i++) {
		
		fillRect(y,y,x,x);
		y+=x;
		x+=10;
		

		}
		
	}

}
