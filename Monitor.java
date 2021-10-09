class Monitor{
	float size;
	double bandwidth;
	int types;
	short price;
	String colour;
	String brand;
	boolean working;
	boolean display;
	String output;
	float weight;
	
	Monitor(float size)
	{
		System.out.println("invoking monitor constructor with parameter size");
		this.size=size;
	}
	Monitor(int types)
	{
		System.out.println("types of monitor");
		this.types=types;
	}
	Monitor(double bandwidth)
	{
		System.out.println("bandwidth of monitor");
		this.bandwidth=bandwidth;
	}
	Monitor(String colour)
	{
		System.out.println("colour of the monitor");
		this.colour=colour;
	}
	Monitor(short price,String brand)
	{
		System.out.println("price and brand of the monitor");
		this.price=price;
		this.brand=brand;
	}
	Monitor()
	{
		System.out.println("no argument constructor for instance variable");
	}
}  