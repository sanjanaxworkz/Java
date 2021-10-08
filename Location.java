class Location{
	String startingPoint;
	float distance;
	long pincode;
	String destination;
	String travelType;
	String mapUsed;
	int km;
	String vehicleUsed;
	int members;
	boolean cab;
	
	Location(String start,String dest)
	{
		System.out.println("invoking location constructor");
		startingPoint=start;
		destination=dest;
	}
	
	Location(long pin)
	{
		System.out.println("constructor with parameter long");
		pincode=pin;
	}
	
	Location(float dis)
	{
		System.out.println("constructor with parameter float");
		distance=dis;
	}
	
	Location(boolean car)
	{
		System.out.println("constructor with parameter boolean");
		cab=car;
	}
	
	Location(int measure, String vehicle)
	{
		System.out.println("constructor with parameter String & int");
		km=measure;
		vehicleUsed=vehicle;
	}
	
	Location(String travel)
	{
		System.out.println("constructor with parameter string");
		travelType=travel;
	}
	
	Location(int mem)
	{
		System.out.println("constructor with parameter int");
		members=mem;
	}
	
	Location()
	{
		System.out.println("constructor without parameter");
	}
	
	Location(String map,boolean bike)
	{
		System.out.println("constructor with parameter boolean and string");
		mapUsed=map;
		cab=bike;
	}
	
	Location(float place,long pins)
	{
		System.out.println(" 2 constructor with parameter of same datatype is not possible");
		distance=place;
		pincode=pins;
	}
}