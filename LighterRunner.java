class LighterRunner{
	public static void main(String[] args)
	{
		String name="wednesday";
		boolean ref1=Lighter.on(name);
		System.out.println(ref1);
		
		boolean ref2=Lighter.off(true);
		System.out.println(ref2);
		
		int width=6;
		boolean ref3=Lighter.light(width);
		System.out.println(ref3);
		
		
		
	}
}