class WatchStarter{
	public static void main(String[] chocolates)
	{
		int cost=6000;
		Watch w=new Watch(cost,"India",WatchTypes.QUARTZ);
		System.out.println(w.price);
		System.out.println(w.countryMade);
		System.out.println(w.type);
		
		System.out.println("---------------------");
		
		w.time();
		w.displayDetails();
		
		System.out.println("---------------");
		WatchTypes type=WatchTypes.MANUAL;
		System.out.println(type);
		
		
	}
}