package codeday.globaldomination;

import codeday.globaldomination.Battles;
import codeday.globaldomination.Population;
import codeday.globaldomination.Technology;

public class Player {

	static private double tMoney;
	static private double health;
	static private int maxHealth;
	static private int population;
	static private double income;
	static private int damage;
	static private int armor;
	static private int currMana;
	static private int maxMana;
	static private int manaInc;
	static private int time;
	
	static Population h1 = new Population(100, 100, 1, "Farms land","Peasant");
	static Population h2 = new Population(200, 200, 3, "Sells girl scout cookies","Girl Scout");
	static Population h3 = new Population(500, 300, 5, "Beer pong competitions","Frat Boy");
	static Population h4 = new Population(1000, 500, 10, "Manages the peasants on your farm","Farmer");
	static Population h5 = new Population(2000, 750, 15, "Advertise and sell your product","Salesman");
	static Population h6 = new Population(5000, 1000, 25, "Make money by taking other people's","Banker");
	static Population h7 = new Population(10000, 5000, 50, "Win gold medals","Athlete");
	static Population h8 = new Population(50000, 10000, 100, "Be popular","Celebrity");
	static Population h9 = new Population(100000, 50000, 250, "Manage other people to make money for you","CEO");
	static Population h10 = new Population(500000, 100000, 1000, "Do nothing","President");
	
	static Technology w1 = new Technology(100,2,0,"Blunt strike to the head!","Wooden Bat");
	static Technology w2 = new Technology(200,3,0,"A stab or two will do the trick.","Pocket Knife");
	static Technology w3 = new Technology(400,5,0,"Slice and Dice!!","Sword");
	static Technology w4 = new Technology(1000,7,0,"Bust a cap in their traps","Pistol");
	static Technology w5 = new Technology(10000,9,0,"Feel the power of Rambo with this weapons.","Machine Gun");
	static Technology w6 = new Technology(100000,11,0,"Warning: Don’t play with fire around the gun powder","Cannon");
	static Technology w7 = new Technology(1000000,15,0,"Deal tons of damage!","Tank");
	static Technology w8 = new Technology(10000000,20,0,"Command the seas!","Navy Ship");
	static Technology w9 = new Technology(100000000,50,0,"Command the atmosphere!","Bomber");
	static Technology w10 = new Technology(1000000000,100,0,"...Take it easy...","Nuke");
	
	static Technology a1 = new Technology(100,0,1,"Muscles = Defense","Abs");
	static Technology a2 = new Technology(200,0,2,"Shirts provide some cushion","T-Shirt");
	static Technology a3 = new Technology(400,0,3,"Absorb some of the impact with a pillow!","Pillow");
	static Technology a4 = new Technology(800,0,4,"Books have been known to stop bullets.","Books");
	static Technology a5 = new Technology(1600,0,5,"Great defense against piercing objects.","Chainmail");
	static Technology a6 = new Technology(5000, 0,6,"Even better than Chainmail!","Plate Armor");
	static Technology a7 = new Technology(10000,0,7,"Protect yourself with glass...wat","Pexiglass Shield");
	static Technology a8 = new Technology(30000,0,8,"What is this","Kevlar");
	static Technology a9 = new Technology(100000,0,9,"Meat shield, the best.","Body Gaurd");
	static Technology a10 = new Technology(500000,0,10,"YOU ARE A TRANSFORMER","Mecha Suit");
	
	static Battles f1 = new Battles(100,5,5,false,false,"The first battle!","House");
	static Battles f2 = new Battles(200,10,10,true,false,"Love thy Neighbor","Neighbor");
	static Battles f3 = new Battles(500,15,20,true,false,"Conquer the Neighborhood","Block");
	static Battles f4 = new Battles(1000,10,35,true,false,"Beat the mayor","City");
	static Battles f5 = new Battles(5000,50,100,true,false,"Corrupt the councilmembers","County");
	static Battles f6 = new Battles(10000,500,500,true,false,"Challenge the Governator","State");
	static Battles f7 = new Battles(25000,1000,1000,true,false,"Leader of your own country","Country");
	static Battles f8 = new Battles(50000,5000,5000,true,false,"Ruler of the great seven","Continent");
	static Battles f9 = new Battles(100000,50000,50000,true,false,"Global Domination","Earth");
	
	static Battles temp = f1;
	static String imageName = "house_f";

	
	public Player()
	{
		health = 100.0;
		maxHealth = 100;
		currMana = 0;
		maxMana = 1000;
		manaInc = 1;
		time = 0;
	}
	public int getTime()
	{
		return time++;
	}
	
	public void setTime(int i)
	{
		time=i;
	}
	
	public double getMoney()
	{
		return tMoney;
	}
	
	public double getHealth()
	{
		return health;
	}

	public int getMaxHealth()
	{
		return maxHealth;
	}
	
	public int getPopulation()
	{
		return population;
	}
	
	public double getIncome()
	{
		return income;
	}
	
	public int getDamage()
	{
		return damage;
	}
	
	public double calcDamage()
	{
		return population+damage;
	}
	public void addPop()
	{
		population ++;
	}
	public void addDamage(double y)
	{
		damage += y;
	}
	
	public int getArmor()
	{
		return armor;
	}
	
	public int getCurrMana()
	{
		return currMana;
	}
	
	public int getMaxMana()
	{
		return maxMana;
	}
	
	public void addHealth(double heal)
	{
		health += heal;
	}
	
	public double setDamage()
	{
		return population*damage;
	}
	
	public void addMoney(double x)
	{
		tMoney += x;
	}
	
	public void subMoney(double x)
	{
		tMoney -= x;
	}
	
	public void addIncome(Population person)
	{
		income += person.getIncome();
	}
	public void addIncome(int x)
	{
		income += x;
	}
	
	public void addDam(int x)
	{
		damage += x;
	}
	
 /*	public void resetMana()
	{
		currMana = 0;
		manaInc = 1;
	}
	
	public void addMana()
	{
		if ( (currMana+maxMana) >= maxMana)
			currMana = maxMana;
		else
			currMana += manaInc;
		
	}
	
	public void upgradeManaInc()
	{
		manaInc += 5;
	}
	
	public void enemyAttacks(Battles monster)
	{
		health -= (monster.getDamage() * 0.0167);
	}  */
	
	public void setIncome(double income2) {
		income = income2;
		
	}

	public void setHealth(int maxHealth2) {
		maxHealth = maxHealth2;
		
	}

	public void setPopulation(int population2) {
		population = population2;
		
	}

	public void setArmor(int armor2) {
		armor = armor2;
		
	}

	public void setDamage(int damage2) {
		damage = damage2;
		
	}
	
	public void setMoney(double amount)
	{
		tMoney = amount;
	}
	
	public void addMoneySec(long delta)
	{
		tMoney += income/delta;
	}

	
	public void chooseFight(String tag)
	{
		if (Integer.parseInt(tag) == 1)
		{
			temp = f1;
			imageName = "house_f";
		}
		else if (Integer.parseInt(tag) == 2)
		{
			temp = f2;
			imageName = "neighbor_f";
		}
		else if (Integer.parseInt(tag) == 3)
		{
			temp = f3;
			imageName = "block_f";
		}
		else if (Integer.parseInt(tag) == 4)
		{
			temp = f4;
			imageName = "city_f";
		}
		else if (Integer.parseInt(tag) == 5)
		{
			temp = f5;
			imageName = "county_f";
		}
		else if (Integer.parseInt(tag) == 6)
		{
			temp = f6;
			imageName = "state_f";
		}
		else if (Integer.parseInt(tag) == 7)
		{
			temp = f7;
			imageName = "country_f";
		}
		else if (Integer.parseInt(tag) == 8)
		{
			temp = f8;
			imageName = "continent_f";
		}
		else if (Integer.parseInt(tag) == 9)
		{
			temp = f9;
			imageName = "earth_f";
		}
		
	}
	
	public String getImage()
	{
		return imageName;
	}
	
	public Battles getFight()
	{
		return temp;
	}
	
}
