class Watch{
	String countryMade;
    int price;
    WatchTypes type=WatchTypes.QUARTZ;

    Watch(int price,String countryMade,WatchTypes type)
	{
		System.out.println("invoking constructor");
		this.countryMade=countryMade;
		this.type=type;
		this.price=price;
	}
	void time()
	{
		System.out.println("invoking time method");
	}
	 void displayDetails()
	 {
		 System.out.println("Displaying"); 
		 System.out.println("countrymade:"+countryMade);
		 System.out.println("cost:"+price);
		 System.out.println("type:"+type);
	 }
	
}