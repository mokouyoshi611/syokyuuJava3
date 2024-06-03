
public class Car extends MyFrame{
	public void run() {
		int x=20;
		int x2=20;
		int x3=20;
		int x4=20;
		int x5=20;
		

		
		
		int y=20;
		int y2=80;
		int y3=140;
		int y4=200;
		int y5=260;
	
		carobje[] cars=new carobje[5];
		cars[0] = new carobje(x,y,1,0);
		cars[1] = new carobje(x2,y2,2,0);
		cars[2] = new carobje(x3,y3,3,0);
		cars[3] = new carobje(x4,y4,4,0);
		cars[4] = new carobje(x5,y5,5,0);
		while(true) {
			clear();

			cars[0].draw(this);
			cars[1].draw(this);
			cars[2].draw(this);
			cars[3].draw(this);
			cars[4].draw(this);
			cars[0].move();
			cars[1].move();
			cars[2].move();
			cars[3].move();
			cars[4].move();
		
			
			
			


			 sleep(0.1);
			 
			
		}
		
		
		
	}

}
