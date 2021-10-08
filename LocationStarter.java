class LocationStarter{
	public static void main(String[] juices)
	{
		String start="mysore";
		String dest="banglore";
		Location location=new Location(start,dest);
		System.out.println(location.startingPoint);
		
		long pin=577028l;
		new Location(pin);
		
		float dis=89.45f;
		new Location(dis);
		
		boolean car=false;
		new Location(car);
		
		int meas=100;
		String vehicle="Hero delux";
		new Location(meas,vehicle);
		
		new Location("bike");
		
		new Location(2);
		
		new Location();
		
		new Location("google maps",true);
		
		new Location(45.7f,577219l);
	}
}