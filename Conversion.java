class Convertion{
	public static void main(String[] values)
	{
		System.out.println("convertion of string to byte");
		String age="21";
		String iplScore="120";
		String shirtSize="32";
		String tvSize="64";
		String milkPerLitre="35";
		
		byte convertedage=Byte.parseByte(age);
		byte convertedIplScore=Byte.parseByte(iplScore);
		byte convertedShirtSize=Byte.parseByte(shirtSize);
		byte convertedTvSize=Byte.parseByte(tvSize);
		byte convertedMilkPerLitre=Byte.parseByte(milkPerLitre);
		
		System.out.println(convertedage);
		System.out.println(convertedIplScore);
		System.out.println(convertedShirtSize);
		System.out.println(convertedTvSize);
		System.out.println(convertedMilkPerLitre);
		
		System.out.println("conversion of string to short");
		String odiScore="356";
		String testScore="789";
		String salary="20000";
		String motorPrice="30000";
		String batteryPrice="25000";
		
		short convertedOdiScore=Short.parseShort(odiScore);
		short convertedTestScore=Short.parseShort(testScore);
		short convertedSalary=Short.parseShort(salary);
		short convertedMotorPrice=Short.parseShort(motorPrice);
		short convertedBatteryPrice=Short.parseShort(batteryPrice);
		
		System.out.println(convertedOdiScore);
		System.out.println(convertedTestScore);
		System.out.println(convertedSalary);
		System.out.println(convertedMotorPrice);
		System.out.println(convertedBatteryPrice);
		
		System.out.println("conversion of string to float");
		String weight="45.6f";
		String height="6.7f";
		String haemoglobin="14.2f";
		String goldWeight="50.8f";
		String over="12.3f";
		
		float convertedWeight=Float.parseFloat(weight);
		float convertedHeight=Float.parseFloat(height);
		float convertedHaemoglobin=Float.parseFloat(haemoglobin);
		float convertedGoldWeight=Float.parseFloat(goldWeight);
		float convertedOver=Float.parseFloat(over);
		
		System.out.println(convertedWeight);
		System.out.println(convertedHeight);
		System.out.println(convertedHaemoglobin);
		System.out.println(convertedGoldWeight);
		System.out.println(convertedOver);
		
		System.out.println("conversion of string to integer");
		String loan="2000000";
		String emi="1000000";
		String carPrice="5000000";
		String tvPrice="80000";
		String refrigeratorPrice="90000";
		
		int convertedLoan=Integer.parseInt(loan);
		int convertedEmi=Integer.parseInt(emi);
		int convertedCarPrice=Integer.parseInt(carPrice);
		int convertedTvPrice=Integer.parseInt(tvPrice);
		int convertedRefrigeratorPrice=Integer.parseInt(refrigeratorPrice);
		
		System.out.println(convertedLoan);
		System.out.println(convertedEmi);
		System.out.println(convertedCarPrice);
		System.out.println(convertedTvPrice);
		System.out.println(convertedRefrigeratorPrice);
		
		System.out.println("conversion of string to double");
		String cgpa="8.9345d";
		String balance="6.9876d";
		String cholestrol="5.8976d";
		String lactometer="9.765434d";
		String fraction="8.907865d";
		
		double convertedCgpa=Double.parseDouble(cgpa);
		double convertedBalance=Double.parseDouble(balance);
		double convertedCholestrol=Double.parseDouble(cholestrol);
		double convertedLactometer=Double.parseDouble(lactometer);
		double convertedFraction=Double.parseDouble(fraction);

        System.out.println(convertedCgpa);
        System.out.println(convertedBalance);
		System.out.println(convertedCholestrol);
		System.out.println(convertedLactometer);
		System.out.println(convertedFraction);
		
		System.out.println("conversion of string to long");
	    String cellNumber="9976543280l";
		String adharNumber="234567894569l";
		String accountNumber="1245689659076l";
		String galaxy="2345890000000l";
		String population="70678945324590l";
		
		long convertedCellNumber=Long.parseLong(cellNumber);
		long convertedAdharNumber=Long.parseLong(adharNumber);
		long convertedAccountNumber=Long.parseLong(accountNumber);
		long convertedGalaxy=Long.parseLong(galaxy);
		long convertedPopulation=Long.parseLong(population);
		
		System.out.println(convertedCellNumber);
		System.out.println(convertedAdharNumber);
		System.out.println(convertedAccountNumber);
		System.out.println(convertedGalaxy);
		System.out.println(convertedPopulation);
		
		System.out.println("conversion of string to char");
		String name="S";
		String section="C";
		String classes="B";
		String code="D";
		String center="E";
		
		char convertedName=Character.parseCharacter(name);
		char convertedSection=Character.parseCharacter(section);
		char convertedClasses=Character.parseCharacter(classes);
		char convertedCode=Character.parseCharacter(code);
		char convertedCenter=Character.parseCharacter(center);
		
		System.out.println(convertedName);
		System.out.println(convertedSection);
		System.out.println(convertedClasses);
		System.out.println(convertedCode);
		System.out.println(convertedCenter);
		
		System.out.println("conversion of string to boolean");
		String switchBoard="false";
		String fan="true";
		String light="true";
		String door="false";
		String torch="true";
		
		boolean convertedSwitchBoard=Boolean.parseBoolean(switchBoard);
		boolean convertedFan=Boolean.parseBoolean(fan);
		boolean convertedLight=Boolean.parseBoolean(light);
		boolean convertedDoor=Boolean.parseBoolean(door);
		boolean convertedTorch=Boolean.parseBoolean(torch);
		
		System.out.println(convertedSwitchBoard);
		System.out.println(convertedFan);
		System.out.println(convertedLight);
		System.out.println(convertedDoor);
		System.out.println(convertedTorch);
		
		
		
		
		
		
		
		
		
	}
}