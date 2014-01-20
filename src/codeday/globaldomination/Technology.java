package codeday.globaldomination;

public class Technology {

	private double price;
	private int attack;
	private int armor;
	private String desc;
	private String name;
	
	private int quantity;
	
	public Technology(double price, int attack, int armor, String desc, String name)
	{
		this.price = price;
		this.attack = attack;
		this.armor = armor;
		this.desc = desc;
		this.name = name;
		this.quantity = 0;
	}
	
	public double purchase()
	{
		quantity ++;
		return price *= 1.25;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getArmor()
	{
		return armor;
	}
	
	public String getDesc()
	{
		return desc;
	}

	public int getQuant()
	{
		return quantity;
	}

	public void setQuantityPrice(int quantity, float price) {
		this.quantity = quantity;
		this.price = (double) price;
		
	}
}
