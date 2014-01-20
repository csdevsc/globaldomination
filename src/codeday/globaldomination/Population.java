package codeday.globaldomination;

public class Population {

	private double myPrice;
	private int myHealth;
	private int myIncome;
	private String myDescrip;
	private String myName;
	
	private int quantity;
	
	public Population(double price, int health, int income, String descrip, String name)
	{
		myPrice = price;
		myHealth = health;
		myIncome = income;
		myDescrip = descrip;
		myName = name;
		quantity = 0;
	}
	
	public double purchase()
	{
		quantity ++;
		return myPrice *= 1.50;
	}
	
	public double getPrice()
	{
		return myPrice;
	}
	
	public int getHealth()
	{
		return myHealth;
	}
	
	public int getIncome()
	{
		return myIncome;
	}
	
	public String getDescrip()
	{
		return myDescrip;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public int getQuant()
	{
		return quantity;
	}

	public void setQuantityPrice(int quantity, float price) {
		this.quantity = quantity;
		this.myPrice = (double) price;
		
	}

}
