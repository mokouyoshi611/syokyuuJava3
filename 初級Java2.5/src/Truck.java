
public class Truck extends Vehicle{
	public Truck(int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
	}
		

		public void draw(MyFrame frame) {
			frame.fillRect(x+60,y,20,25);
			frame.fillRect(x,y+20,80,15);
			frame.fillOval(x+10,y+35,8,8);
			frame.fillOval(x+20,y+35,8,8);
			frame.fillOval(x+60,y+35,8,8);
		}


}

