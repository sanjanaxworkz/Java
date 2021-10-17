class ComputerStarter{
	public static void main(String[] biscuits)
	{
		Computer computer=new Computer();
		computer.brand="Hp";
		computer.modelNo="15B67";
		computer.price=43000f;
		computer.quantity=2;
		computer.displayDetails();
		computer.displayTotalPrice();
		computer.displayTotalOfAll();
		
		Computer computer1=new Computer();
		computer1.brand="Dell";
		computer1.modelNo="P8745";
		computer1.price=28000f;
		computer1.quantity=3;
		computer1.type=ComputerType.MINICOMPUTER;
		computer1.displayDetails();
		computer1.displayTotalPrice();
		computer1.displayTotalOfAll();
		
	    Computer computer2=new Computer();
		computer2.brand="Lenovo";
		computer2.modelNo="DE8976";
		computer2.price=56000f;
		computer2.quantity=4;
		computer2.type=ComputerType.MAINFRAME;
		computer2.displayDetails();
		computer2.displayTotalPrice();
		computer2.displayTotalOfAll();
		
	    Computer computer3=new Computer();
		computer3.brand="mac";
		computer3.modelNo="MA7345";
		computer3.price=78000f;
		computer3.quantity=2;
		computer3.type=ComputerType.HYBRID;
		computer3.displayDetails();
		computer3.displayTotalPrice();
		computer3.displayTotalOfAll();
		
		Computer computer4=new Computer();
		computer4.brand="Acer";
		computer4.modelNo="HB4567";
		computer4.price=34000f;
		computer4.quantity=3;
		computer4.type=ComputerType.SUPERCOMPUTER;
		computer4.displayDetails();
		computer4.displayTotalPrice();
		computer4.displayTotalOfAll();
	}
}