class Calender{
	public static int getBirthMonth(String personName)
	{
		System.out.println("want to know date of birth");
		int num=3;
		return num;
	}
	public static String getBirthday(String personName)
	{
		System.out.println("want to know day of birth");
		String day="sunday";
		return day;
	}
	public static boolean isEligibletoVote(int age,String personName)
	{
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("not Eligible");
		}
		return true;
	}
}