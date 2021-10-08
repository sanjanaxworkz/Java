class HandBagStarter{
	public static void main(String[] cooldrinks)
	{
		String colr="blue";
		String brand="Allen solly";
		HandBag handbag=new HandBag(colr,brand);
		System.out.println(handbag.colour);
		System.out.println(handbag.brand);
		
		int pri=600;
		new HandBag(pri);
		
		float size=15.7f;
		new HandBag(size);
		
		String mate="lether";
		new HandBag(mate);
		
		double cap=45.78965d;
		new HandBag(cap);
		
		boolean style=true;
		new HandBag(style);
		
		new HandBag(5,"available");
		
		new HandBag(10000);
		
		short rate=32000;
		new HandBag("red",rate);
		
		new HandBag();
		
		
	}
}