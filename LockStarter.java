class LockStarter{
	public static void main(String[] icecreams)
	{
		System.out.println("main method");
		Lock lock=new Lock();
		lock.open();
		lock.close();
	}
}