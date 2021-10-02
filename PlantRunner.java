class PlantRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking grow");
		Plant.grow("Rose");
		System.out.println("invoking watering");
		int times=2;
		Plant.watering(times);
	}
}