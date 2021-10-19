class StringTester{
	public static void main(String[] drinks)
	{
		String name=new String("Virat");
	    String day=new String("sunday");
	    String place=new String("Dubai");
	    String food=new String("Masala dosa");
	    String product=new String("Laptop");
	    String brand=new String("Dell");
		String game=new String("Cricket");
		String award=new String("MOM");
		String country=new String("India");
		String cup=new String("WorldCup");
		
		String replacing=day.replace('s','b');
		System.out.println(replacing);
		
		String concating=product.concat(brand);
		System.out.println(concating);
		
		String deleting=food.substring(5);
		System.out.println(deleting);
		
		boolean containing=cup.contains("world");
		System.out.println(containing);
		
		boolean matching=name.matches(award);
		System.out.println(matching);
		
		String deleting2=food.substring(1,5);
		System.out.println(deleting2);
		
		String upperCase=country.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase=name.toLowerCase();
		System.out.println(lowerCase);
		
		char ch=game.charAt(3);
		System.out.println(ch);
		
		int codePoint=day.codePointAt(3);
		System.out.println(codePoint);
		
		int code=place.codePointBefore(2);
		System.out.println(code);
		
		int count=product.codePointCount(0,5);
		System.out.println(count);
		
		boolean equals=day.contentEquals("sunday");
		System.out.println(equals);
		
		String triming=name.trim();
		System.out.println(triming);
		
		
		
	}
	
	 
}