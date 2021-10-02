class SpeakerCaseRunner{
	public static void main(String[] values)
	{
		int lev=5;
		String call=SpeakerCase.volume(lev);
		System.out.println(call);
		boolean ring=SpeakerCase.turnon();
		System.out.println(ring);
		boolean tring=SpeakerCase.turnoff();
		System.out.println(tring);
	}
}