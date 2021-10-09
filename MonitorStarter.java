class MonitorStarter{
	public static void main(String[] pencils)
	{
		Monitor monitor=new Monitor(5.6f);
		System.out.println(monitor.size);
		
	    Monitor monitor1=new Monitor(2);
		System.out.println(monitor1.types);
		
		Monitor monitor2=new Monitor(6.6543d);
		System.out.println(monitor2.bandwidth);
		
		Monitor monitor3=new Monitor("red");
		System.out.println(monitor3.colour);
		
		short price=28000;
		String brand="hp";
		Monitor monitor4=new Monitor(price,brand);
		System.out.println(monitor4.price);
		System.out.println(monitor4.brand);
		
		Monitor monitor5=new Monitor();
		monitor5.working=true;
		System.out.println(monitor5.working);
		
		Monitor monitor6=new Monitor();
	    monitor6.display=true;
		System.out.println(monitor6.display);
		
		Monitor monitor7=new Monitor();
	    monitor7.output="obtained";
		System.out.println(monitor7.output);
		
		Monitor monitor8=new Monitor();
	    monitor8.weight=23.2f;
		System.out.println(monitor8.weight);
	}
	
}