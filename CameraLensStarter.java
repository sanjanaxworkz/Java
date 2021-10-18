class CameraLensStarter{
	public static void main(String[] icecreams)
	{
		CameraLens camera=new CameraLens("canon","800D",108,4000,true);
		String brand=camera.getBrand();
		String model=camera.getModel();
		int pixel=camera.getPixel();
		double price=camera.getPrice();
		boolean is4k=camera.getIs4k();
		System.out.println(camera.getBrand());
		System.out.println(camera.getModel());
		System.out.println(camera.getPixel());
		System.out.println(camera.getPrice());
		System.out.println(camera.getIs4k());

		if(brand==null)
		{
			System.out.println("value is null");
		}
		else
		{
			System.out.println("------------");
		}
		
		camera.setBrand("nikon");
		camera.setModel("567F");
		camera.setPixel(124);
		camera.setPrice(34000);
		camera.setIs4k(false);
		
	}
}