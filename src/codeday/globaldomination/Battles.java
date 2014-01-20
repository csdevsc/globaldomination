package codeday.globaldomination;

public class Battles {

	private double myHealth;
	private double myDamage;
	private double myArmor;
	private boolean isLocked;
	private boolean isBeaten;
	private String myDescrip;
	private String myName;
	private double currHealth;
	
	public Battles(double health, double damage, double armor, boolean locked, boolean beaten, String descrip, String name)
	{
		myHealth = health;
		myDamage = damage;
		myArmor = armor;
		isLocked = true;
		isBeaten = false;
		myDescrip = descrip;
		myName = name;
		currHealth = health;
		
	}
	
	public void setValues(float hp, float dmg, float arm)
	{
		myHealth = hp;
		myDamage = dmg;
		myArmor = arm;
	}
	
	public double getHealth()
	{
		return myHealth;
	}
	
	public double getCurrHealth()
	{
		return currHealth;
	}
	
	public double getDamage()
	{
		return myDamage;
	}
	
	public double getArmor()
	{
		return myArmor;
	}
	
	public boolean getLocked()
	{
		return isLocked;
	}
	
	public boolean getBeaten()
	{
		return isBeaten;
	}
	
	public String getDescrip()
	{
		return myDescrip;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public void buffMonster()
	{
		myHealth *= 1.50;
		currHealth *= 1.50;
		myDamage *= 1.50;
		myArmor *= 1.50;
	}
	
	public void unlock()
	{
		isLocked = false;
	}
	
	public void defeated()
	{
		isBeaten = true;
	}
	
	public void restore()
	{
		currHealth = myHealth;
		isBeaten = false;
	}
	
	public boolean getDamaged(double calc)
	{
		currHealth -= calc;
		
		if (currHealth <= 0)
		{
			isBeaten = true;
		}
		
		return isBeaten;
	}

}
