class CalenderRunner{
	public static void main(String[] value)
	{
		int age=20;
		String name="virat";
		int ref=Calender.getBirthMonth(name);
		System.out.println(ref);
		String ref2=Calender.getBirthday(name);
		System.out.println(ref2);
		boolean ref3=Calender.isEligibletoVote(age,name);
		System.out.println(ref3);
	}
}