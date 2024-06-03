
public class carobje {
	int x,y,vx,vy;
	public carobje(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
		public void draw(MyFrame frame) {
			frame.fillRect(20+x, y,60,20 );
			frame.fillRect(35+x, y-10,30,10 );
			frame.fillOval(30+x, y+20,20,20 );
			frame.fillOval(55+x, y+20,20,20 );
			
		}
		public void move() {
			
			x+=vx;
		}
		
		
		
	

}
