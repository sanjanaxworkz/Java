class BiCycleStarter{
	public static void main(String[] vehicles)
	{
		String colour="Black";
		float price=4000f;
		BiCycle cycle=new BiCycle(colour,price,"Hercules",CycleTypes.GEAR);
		cycle.brake();
		cycle.move();
		cycle.displayDetails();
	}
}