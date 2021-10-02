class Bottle{
	public static void storing(int price,String colour,int hieght,String quality,String[] brand)
	{
		System.out.println("invoking storing");
		System.out.println("bottle colour:"+colour);
		for(int bottleIndex=0;bottleIndex<brand.length;)
		{
			String ref=brand[bottleIndex];
			System.out.println(ref);
			bottleIndex++;
		}
	}
}