
public class Animation extends MyFrame{
	public void run() {
		int x =30;
		int i;
		for (i=1; i<=3;i++) {
			while(x<=200) {
			clear();
			setColor(0,128,0);
			fillRect(x,60,10,100);
			x+=5;
			sleep(0.1);
			}
			while(x>=30) {
			clear();
			setColor(0,128,0);
			fillRect(x,60,10,100);
			x-=5;
			sleep(0.1);
			}

		}


		
	}
	

}
