class Scooter{
	String company;
	int cc;
	long price;
	String colour;
	char model;
	double space;
	float size;
	int types;
	boolean withHelmet;
	String purchase;
	
	Scooter(String company)
	{
		System.out.println("scooter company is");
		this.company=company;
	}
	Scooter(int cc)
	{
		System.out.println("vehicle cc is");
		this.cc=cc;
	}
	Scooter(long price)
	{
		System.out.println("scooter price is");
		this.price=price;
	}
	Scooter(String colour,char model)
	{
		System.out.println("scooter colour and model");
		this.colour=colour;
		this.model=model;
	}
	Scooter(boolean withHelmet)
	{
		System.out.println("helmet is provided with scooter");
		this.withHelmet=withHelmet;
	}
	Scooter()
	{
		System.out.println("scooter instance variables");
	}
     
}