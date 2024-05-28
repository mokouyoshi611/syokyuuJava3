
public class Car {
	int x,y;
	public Car(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x, y,40,20 );
		frame.fillRect(x-20, y+30,80, 30);
		frame.fillOval(x-10,y+55,20,20);
		frame.fillOval(x+30,y+55,20,20);
	}

}
