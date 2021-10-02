class Email{
	public static void sendMessage(boolean printArgs)
	{
		boolean point=printArgs;
		System.out.println("invoking send message");
		if(point)
		{
			System.out.println("value is correct");
		}
		   System.out.println("out of loop");
		   return;
	}
	public static boolean recieveMessage(String msg)
	{
		boolean fire=true;
		if(msg==null)
		{
			System.out.println("string is null");
		}
		    System.out.println("string is not null");
		    return fire;
	}
}