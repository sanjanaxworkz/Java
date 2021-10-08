class ClimateStarter{
	public static void main(String[] softdrinks)
	{
		float temp=26.5f;
		Climate climate=new Climate(temp);
		System.out.println(climate.temperature);
				
		double hum=45.677889d;
		Climate climate1=new Climate(hum);
		System.out.println(climate1.humidity);
		
		new Climate(null,null);
		
		String descript="cloudy";
		new Climate(descript);
		
		int time=6;
		new Climate(time);
		
		new Climate(true);
		
		new Climate("sanjeev",600000l);
		
		new Climate("news",7);
		
		new Climate(true,null);
		
		new Climate();
	}
}