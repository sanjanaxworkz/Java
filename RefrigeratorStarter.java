class RefrigeratorStarter{
	public static void main(String[] deserts)
	{
		Refrigerator refrigerator=new Refrigerator("2FB","LG",2,true);
		String model=refrigerator.getModel();
		String company=refrigerator.getCompany();
		int capacityInLiters=refrigerator.getCapacityInLiters();
		boolean doubleDoor=refrigerator.getDoubleDoor();
		
		if(company!=null)
		{
			System.out.println("---------");
		}
		
		refrigerator.setModel("15D");
		refrigerator.setCompany("Whirlpool");
		refrigerator.setCapacityInLiters(4);
		refrigerator.setDoubleDoor(false);
		
		System.out.println(refrigerator.getModel());
		System.out.println(refrigerator.getCompany());
		System.out.println(refrigerator.getCapacityInLiters());
		System.out.println(refrigerator.getDoubleDoor());
	}
}