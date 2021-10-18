class Refrigerator{
	String model;
	String company;
	int capacityInLiters;
	boolean doubleDoor;
	
	Refrigerator(String model,String company,int capacityInLiters,boolean doubleDoor)
	{
		this.model=model;
		this.company=company;
		this.capacityInLiters=capacityInLiters;
		this.doubleDoor=doubleDoor;
		System.out.println("invoking refrigerator constructor");
	}
	String getModel()
	{
		return this.model;
	}
	String getCompany()
	{
		return this.company;
	}
	int getCapacityInLiters()
	{
		return this.capacityInLiters;
	}
	boolean getDoubleDoor()
	{
		return this.doubleDoor;
	}
	
	void setModel(String model)
	{
		this.model=model;
	}
	void setCompany(String company)
	{
		this.company=company;
	}
	void setCapacityInLiters(int capacityInLiters)
	{
		this.capacityInLiters=capacityInLiters;
	}
	void setDoubleDoor(boolean doubleDoor)
	{
		this.doubleDoor=doubleDoor;
	}
}