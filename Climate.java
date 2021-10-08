class Climate{
	float temperature;
	double humidity;
	String season;
	String location;
	String description;
	int timings;
	String information;
	boolean rainy;
	String reporter;
	long salary;
	
	Climate(float temp)
	{
		System.out.println("invoking climate constructor");
		temperature=temp;
	}
	Climate(double hum)
	{
		System.out.println("showing climate humidity");
		humidity=hum;
	}
	Climate(String sea,String local)
	{
		System.out.println("costructor with 2 string parameter");
		season=sea;
		location=local;
	}
	Climate(String descript)
	{
		System.out.println("climate description");
		description=descript;
	}
	Climate(int time)
	{
		System.out.println("climate timings");
		timings=time;
	}
	Climate(boolean rain){
		System.out.println("is it a rainy day");
		rainy=rain;
	}
	Climate(String name,long sal)
	{
		System.out.println("climate reporter salary");
		reporter=name;
		salary=sal;
	}
	Climate(String inform,int tim)
	{
		System.out.println("information timings");
		information=inform;
		timings=tim;
	}
	Climate(boolean rain,String sea)
	{
		System.out.println("rainy season is true");
		rainy=rain;
		season=sea;

	}
	Climate()
	{
		System.out.println("empty");
	}
	
}