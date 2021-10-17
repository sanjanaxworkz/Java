class ProductStarter{
	public static void main(String[] icecreams)
	{
		Product product=new Product();
		product.name="Mobile";
		product.quality=true;
		product.price=230000.0f;
		product.quantity=2;
		product.isiMark=true;
		product.displayDetails();
		product.displayTotalPrice();
		
		Product product1=new Product();
		product1.name="laptop";
		product1.quality=true;
		product1.price=52000f;
		product1.quantity=3;
		product1.isiMark=true;
		product1.displayDetails();
		product1.displayTotalPrice();
		
		Product product2=new Product();
		product2.name="tv";
		product2.quality=false;
		product2.price=28000f;
		product2.quantity=1;
		product2.isiMark=true;
		product2.displayDetails();
		product2.displayTotalPrice();
		
		Product product3=new Product();
		product3.name="grinder";
		product3.quality=true;
		product3.price=5000f;
		product3.quantity=4;
		product3.isiMark=true;
		product3.displayDetails();
		product3.displayTotalPrice();
		
		Product product4=new Product();
		product4.name="refrigerator";
		product4.quality=true;
		product4.price=12000f;
		product4.quantity=2;
		product4.isiMark=false;
		product4.displayDetails();
	}
}