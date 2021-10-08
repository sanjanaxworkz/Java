class HandBag{
	String colour;
	int price;
	String brand;
	float size;
	String material;
	double capacity;
	boolean stylish;
	int zips;
	String space;
	short amount;
	
	HandBag(String colr,String brnd)
	{
		System.out.println("invoking handbag constructor");
		colour=colr;
		brand=brnd;
	}
	HandBag(int pr)
	{
		System.out.println("hand bag price is in int");
		price=pr;
	}
	HandBag(float siz)
	{
		System.out.println("handbag size is in float");
		size=siz;
	}
	HandBag(String mat)
	{
		System.out.println("hand bag material is String");
		material=mat;
	}
	HandBag(double cap)
	{
		System.out.println("handbag capacity is in double");
		capacity=cap;
	}
	HandBag(boolean style)
	{
		System.out.println("handbag is stylish");
		stylish=style;
	}
	HandBag(int zip,String area)
	{
		System.out.println("handbag is with 2 parameters");
		zips=zip;
		space=area;
	}
	HandBag(short money)
	{
		System.out.println("handbag is worthfull");
		amount=money;
	}
	HandBag(String clr,short rate)
	{
		System.out.println("handbag rate differ with colour");
		colour=clr;
		amount=rate;
	}
	HandBag()
	{
		System.out.println("handbag without parameter");
	}
}