class EmailRunner{
	public static void main(String[] value)
	{
		boolean val=true;
		Email.sendMessage(val);
		String ref2="false";
		boolean ref=Email.recieveMessage(ref2);
		
	}
}