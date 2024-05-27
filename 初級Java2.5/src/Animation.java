
public class Animation extends MyFrame{
	public void run() {
		int x =100;
		int y=30;
		while (x>=30) {
			clear();
			setColor(0,128,0);
			fillRect(y,x,10,100);
			x-=5;
			sleep(0.1);
		}
		while (y<=170) {
			clear();
			setColor(0,128,0);
			fillRect(y,x,310,100);
			y+=5;
			sleep(0.1);
		}

		
	}
	

}
