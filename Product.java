class Product{
	String name;
	boolean quality;
	float price;
	int quantity;
	boolean isiMark;
	static double totalOfAllProduct;
	
	Product()
	{
		System.out.println("invoking product constructor");
	}
	void displayDetails()
	{
		System.out.println("displaying the details of product");
        System.out.println(this.name);				
		System.out.println(this.quality);
        System.out.println(this.price);
        System.out.println(this.quantity);
        System.out.println(this.isiMark);
	}
	void displayTotalPrice()
	{
		System.out.println("displaying total price of all product");
		double totalPrice=this.quantity*this.price;
		System.out.println(totalPrice);
		Product.totalOfAllProduct=Product.totalOfAllProduct+totalPrice;
	    System.out.println(Product.totalOfAllProduct);
	}
}