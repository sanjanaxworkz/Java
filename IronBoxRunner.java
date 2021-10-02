class IronBoxRunner{
	public static void main(String[] value)
	{
		System.out.println("invoking heating");
		String clothType="Cotton";
		IronBox.heating(clothType);
		System.out.println("invoking streamwater");
		IronBox.streamWater(true);
	}
}