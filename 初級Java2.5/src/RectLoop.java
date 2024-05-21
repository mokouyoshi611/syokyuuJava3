
public class RectLoop extends MyFrame{
	public void run() {
		int i;
		int x=30;
		int y=150;
		int z=290;
		int a=30;
		
		setColor(0,128,0);
	
		for (i=0 ; i<10 ; i++) {

		fillRect(x,100,10,y);
		fillRect(x,z,10,a);

		x+=20;
		y-=10;
		z-=10;
		a+=10;
		
	
		

		

		}
		
	}

}
