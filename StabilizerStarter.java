class StabilizerStarter{
	public static void main(String[] matchBoxes)
	{
		short price=30000;
		Stabilizer stabilizer=new Stabilizer(price,'b');
		System.out.println(stabilizer);
		System.out.println(stabilizer.price);
		System.out.println(stabilizer.model);
		
		Stabilizer stabilizer1=new Stabilizer(true);
		System.out.println(stabilizer1.bill);
		
		Stabilizer stabilizer2=new Stabilizer("viguard");
		System.out.println(stabilizer2.brand);
		
		Stabilizer stabilizer3=new Stabilizer(2);
		System.out.println(stabilizer3.number);
		
		Stabilizer stabilizer4=new Stabilizer(4.5f);
		System.out.println(stabilizer4.size);
		
		Stabilizer stabilizer5=new Stabilizer();
		stabilizer5.type="metal";
		System.out.println(stabilizer5.type);
	    
		Stabilizer stabilizer6=new Stabilizer();
	    stabilizer6.capacity=45.6789d;
		System.out.println(stabilizer6.capacity);
		
		Stabilizer stabilizer7=new Stabilizer();
	    stabilizer7.withWire=true;
		System.out.println(stabilizer7.withWire);
		
		Stabilizer stabilizer8=new Stabilizer();
		stabilizer8.colour="green";
		System.out.println(stabilizer8.colour);
	}
}