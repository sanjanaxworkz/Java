class FoodItemRunner{
	public static void main(String[] value)
	{
		String[] foo={"masal dosa","idli vada","pongal","puliyogare","lemon rice"};
		String store=FoodItem.ingredients(foo);
		System.out.println(store);
	}
}