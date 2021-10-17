class Computer{
	String brand;
	String modelNo;
	float price;
	int quantity;
	ComputerType type=ComputerType.DIGITAL;
	static double totalOfAll;
	
	void displayDetails()
	{
		System.out.println("details of computer");
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
		
	}
	void displayTotalPrice()
	{
		double totalPrice=this.quantity*this.price;
		System.out.println(totalPrice);
		Computer.totalOfAll=Computer.totalOfAll+totalPrice;
	}
	void displayTotalOfAll()
	{
		System.out.println("displaying total of all");
		System.out.println(Computer.totalOfAll);
	}
}