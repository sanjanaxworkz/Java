class FoodItem{
	public static String ingredients(String[] items)
	{
		System.out.println("invoking ingredients");
		for(int index=0;index<items.length;index++)
		{
			System.out.println(items[index]);
		}
		
		return items[0];
	}
}