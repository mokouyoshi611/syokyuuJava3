
public class CarAnime extends MyFrame{
	public void run() {
		Car car1=new Car(50,50);
		Car car2=new Car(120,120);
		for (int i=0; i<70; i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.x+=5;
			car2.x-=5;
			sleep(0.1);
		}
	}

}
