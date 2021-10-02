class SpeakerCase{
	public static String volume(int level)
	{
		System.out.println("Invoking volume method");
		String functionName="Birthday Party";
		if(level<=0)
		{
			System.out.println("on it first");
		}
		else if(level<=3)
		{
			System.out.println("ok");
		}
		else if(level>3)
		{
			System.out.println("loud");
		}
		else if(level>5)
		{
			System.out.println("Too loud");
		}
		else if(level>9)
		{
			System.out.println("call police");
		}
		else
		{
			System.out.println("warning");
			
		}
		return functionName;
	}
	
	public static boolean turnon()
	{
		System.out.println("turn on the power");
		return true;
	}
	
	public static boolean turnoff()
	{
		System.out.println("turn off the power");
		return false;
	}
}