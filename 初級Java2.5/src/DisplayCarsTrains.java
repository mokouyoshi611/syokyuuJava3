
import java.util.Vector;
public class DisplayCarsTrains extends MyFrame{
	public void run() {
		Vector<Vehicle> Vehicles=new Vector<Vehicle>();
		Vehicles.add(new Car(10,30,3,0));
		Vehicles.add(new Car(200,100,-5,0));
		Vehicles.add(new Train(10,180,7,0));
		Vehicles.add(new Train(200,230,-7,0));
		Vehicles.add(new Truck(10,290,7,0));
		Vehicles.add(new Truck(200,340,7,0));
		for(int i=0; i<30; i++) {
			clear();
			for(int j=0; j<Vehicles.size(); j++) {
				Vehicles.get(j).draw(this);
				Vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}

}
