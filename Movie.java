class Movie{
	public static void entertain(int ticketPrice,String movieLength,String movieName,String[] actors)
	{
		System.out.println("invoking entertainment");
		System.out.println("movie name:"+movieName);
		System.out.println("movie Ticket:"+ticketPrice);
		for(int index=0;index<actors.length;index++)
		{
			String temp=actors[index];
			System.out.println(temp);
		}
	}
}