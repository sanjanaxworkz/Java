class IntialRunner{
	public static void main(String[] value)
	{
		Inverter inverter=new Inverter();
		inverter.colour="green";
		inverter.capacity=200.6f;
		inverter.weight=12;
		System.out.println(inverter.make);
		System.out.println(inverter.price);
		System.out.println(inverter.colour);
		System.out.println(inverter.capacity);
		System.out.println(inverter.weight);
		
		Fish fish=new Fish();
		fish.price=24.5f;
		fish.type="mangalore";
		fish.swim="yes";
		System.out.println(fish.foodItem);
		System.out.println(fish.aquaticAnimal);
		System.out.println(fish.price);
		System.out.println(fish.type);
		System.out.println(fish.swim);
		
		Train train=new Train();
		train.colour="red";
		train.material="iron";
		train.types="goods";
		System.out.println(train.name);
		System.out.println(train.speed);
		System.out.println(train.colour);
		System.out.println(train.material);
		System.out.println(train.types);
		
		Charger charger=new Charger();
		charger.colour="black";
		charger.function="charging";
		charger.pin="c port";
		System.out.println(charger.brand);
		System.out.println(charger.price);
		System.out.println(charger.colour);
		System.out.println(charger.function);
		System.out.println(charger.pin);
	
	}
}