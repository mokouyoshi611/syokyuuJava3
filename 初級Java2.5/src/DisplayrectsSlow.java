
public class DisplayrectsSlow extends MyFrame{
	public void run() {
		setColor(0,128,0);
		
		int x=30;
		while(x<=170) {
			fillRect(x,x,10,100);
			x+=20;
			sleep(1);
		}
	}

}
