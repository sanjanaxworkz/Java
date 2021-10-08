class Headset{
	String brand;
	short price;
	String type;
	float volumeLevel;
	String noiseCancellation;
	boolean mic;
	String mode;
	double offer;
	String colour;
	int buttons;
	Headset(String brnd,String typ)
	{
		System.out.println("invoking haedset constructor");
		brand=brnd;
		type=typ;
	}
	Headset(short pri)
	{
		System.out.println("headset price");
		price=pri;
	}
	Headset(float volume)
	{
		System.out.println("volume level of the headset");
		volumeLevel=volume;
	}
	Headset(boolean mi)
	{
		System.out.println("mic is provided with headset");
		mic=mic;
	}
	Headset(double off)
	{
		System.out.println("offer on headset");
		offer=off;
	}
	Headset(int button)
	{
		System.out.println("headset has 3 buttons");
		buttons=button;
	}
	Headset(String mod)
	{
		System.out.println("purchased headset in online mode");
		mode=mod;
	}
	Headset(String noise,float vol)
	{
		System.out.println("noise cancellation is available");
		noiseCancellation=noise;
		volumeLevel=vol;
	}
	Headset(String clr,short rate)
	{
		System.out.println("rate increases with colour");
		colour=clr;
		price=rate;
	}
	Headset()
	{
		System.out.println("haedset is of good quality");
	}
}