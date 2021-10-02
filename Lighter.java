class Lighter{
	public static boolean on(String lightName)
	{
		System.out.println("invoking on method"); 
		return true;
	}	
	   
	   
     public static boolean off(boolean nam)
	 {
		 System.out.println("calling off method");
		 return false;
	 }
	 
	 
	 public static boolean light(int width)
	 {
		 if(width>0)
		 {
			 System.out.println("method excutes if it is true");
			 return true;
		 }
		 else
		 {
			System.out.println("method is false");
            return false;			
		 }
		 
     }
}