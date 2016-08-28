package ashwath.spring;

public class MaintainVehicle {

	public void serviceVehicle(Vehicle vehicle) {
		
		System.out.println( vehicle.getType() +" is now being serviced...");
		vehicle.setServiced("true");
		
	}

	public void washVehicle(Vehicle vehicle) {
		
		System.out.println(vehicle.getType()+" is now being washed...");
		vehicle.setWashed("true");
	}

}
