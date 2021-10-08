class HeadsetStarter{
	public static void main(String[] coffies)
	{
		String brnd="Boet";
		String typ="fibre";
		Headset headset=new Headset(brnd,typ);
		System.out.println(headset.brand);
		System.out.println(headset.type);
		
		short pri=32000;
		new Headset(pri);
		
		float volume=7.5f;
		new Headset(volume);
		
		boolean mi=true;
		new Headset(mi);
		
		double off=45.8976d;
		new Headset(off);
		
		int button=3;
		new Headset(button);
		
		String mod="online";
		new Headset(mod);
		
		new Headset(null,8.9f);
		
		short rate=4000;
		new Headset("red",rate);
		
		new Headset();
	}
}