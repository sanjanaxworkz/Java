class ScooterStarter{
	public static void main(String[] keys)
	{
		Scooter scooter=new Scooter("Honda Activa");
		System.out.println(scooter.company);
		
		Scooter scooter1=new Scooter(125);
		System.out.println(scooter1.cc);
		
		Scooter scooter2=new Scooter(960000l);
		System.out.println(scooter2.price);
		
		Scooter scooter3=new Scooter("silky silver",'a');
		System.out.println(scooter3.colour);
		System.out.println(scooter3.model);
		
		Scooter scooter4=new Scooter(true);
		System.out.println(scooter4.withHelmet);
		
		Scooter scooter5=new Scooter();
		scooter5.space=65.9876d;
		System.out.println(scooter5.space);
		
		Scooter scooter6=new Scooter();
	    scooter6.size=8.98f;
		System.out.println(scooter6.size);
		
		Scooter scooter7=new Scooter();
	    scooter7.types=4;
		System.out.println(scooter7.types);
		
		Scooter scooter8=new Scooter();
		scooter8.purchase="online";
		System.out.println(scooter8.purchase);
		
	}
}