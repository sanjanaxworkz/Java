class InstanceRunner{
	public static void main(String[] values)
	{
	
	Internet internet=new Internet();
	String pro=internet.provider;
	System.out.println(pro);
	
	Deodrant deodrant=new Deodrant();
	String fogg=deodrant.brand;
	System.out.println(fogg);
	String good=deodrant.quality;
	System.out.println(good);
	String pink=deodrant.colour;
	System.out.println(pink);
	int pri=deodrant.price;
	System.out.println(pri);
	
	PowerBank powerBank=new PowerBank();
	String comp=powerBank.company;
	System.out.println(comp);
	String cap=powerBank.capacity;
	System.out.println(cap);
	int amount=powerBank.price;
	System.out.println(amount);
	
	Wallet wallet=new Wallet();
	String country=wallet.countryMade;
	System.out.println(country);
	String blue=wallet.colour;
	System.out.println(blue);
	int cost=wallet.price;
	System.out.println(cost);
	}
	
}