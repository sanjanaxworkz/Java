class CameraLens{
	String brand;
	String model;
	int pixel;
	double price;
	boolean is4k;
	
	CameraLens(String brand,String model,int pixel,double price,boolean is4k)
	{
		this.brand=brand;
		this.model=model;
		this.pixel=pixel;
		this.price=price;
		this.is4k=is4k;
		System.out.println("invoking camera constructor");
	}
	String getBrand()
	{
		return this.brand;
	}
	String getModel()
	{
		return this.model;
	}
	int getPixel()
	{
		return this.pixel;
	}
	double getPrice()
	{
		return this.price;
	}
	boolean getIs4k()
	{
		return this.is4k;
	}
	
	void setBrand(String brand)
	{
		this.brand=brand;
	}
	void setModel(String model)
	{
		this.model=model;
	}
	void setPixel(int pixel)
	{
		this.pixel=pixel;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void setIs4k(boolean is4k)
	{
		this.is4k=is4k;
	}
}