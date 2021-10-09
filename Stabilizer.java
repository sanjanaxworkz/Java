class Stabilizer{
	String colour;
	short price;
	float size;
	int number;
	boolean bill;
	char model;
	String type;
	String brand;
	double capacity;
	boolean withWire;
	
	Stabilizer(short price,char model)
	 {
		 System.out.println("invoking Stabilizer constructor");
		 this.price=price;
		 this.model=model;
	 }
	Stabilizer(boolean bill)
	{
		System.out.println("bill is issued");
		this.bill=bill;
	}
	Stabilizer(String brand)
	{
		System.out.println("brand of the stabilizer is");
		this.brand=brand;
	}
	Stabilizer(int number)
	{
		System.out.println("number of stabilizers purchased");
		this.number=number;
	}
	Stabilizer(float size)
	{
		System.out.println("size of the stabilizer");
		this.size=size;
	}
	Stabilizer()
	{
		System.out.println("no argument constructor");
	}

}