package codeday.globaldomination;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Humans extends Activity {
	
	
	Player temp = new Player();
	TextView moneyText;
	SharedPreferences.Editor editor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_humans);
		moneyText = (TextView) findViewById(R.id.money);
		Intent intent = getIntent();
		startTimerThread();
		SharedPreferences settings = getApplicationContext().getSharedPreferences("SAVEDFILE",0);
		editor = settings.edit();
		
		for (int temp = 1; temp <= 10; temp ++)
			this.refresh(temp); 
	}
	Thread th;
	private void startTimerThread() {       
	    th = new Thread(new Runnable() {
	        public void run() {
	            while (true) {                
	                runOnUiThread(new Runnable() {
	                    @Override
	                    public void run() {
	                    	moneyText.setText("Money $: " + String.format("%.2f%n", temp.getMoney()));
	                    				  }
	                							 });
	                try {
	                    Thread.sleep(200);
	                    } 
	                catch (InterruptedException e) 
	                {
	                    e.printStackTrace();
	                }
	                
	            }}});
	            th.start();}
	
	public void refresh(int x)
	{
		int popAdd = 1;
		
		popAdd += temp.h1.getQuant();
		popAdd += temp.h2.getQuant();
		popAdd += temp.h3.getQuant();
		popAdd += temp.h4.getQuant();
		popAdd += temp.h5.getQuant();
		popAdd += temp.h6.getQuant();
		popAdd += temp.h7.getQuant();
		popAdd += temp.h8.getQuant();
		popAdd += temp.h9.getQuant();
		popAdd += temp.h10.getQuant();
		
		temp.setPopulation(popAdd);
		
		final TextView moneyText = (TextView) findViewById(R.id.money);
		
		moneyText.setText("Money $: " + String.format("%.2f%n", temp.getMoney()));
		
		
		if (x == 1)
		{
			final TextView priceText1 = (TextView) findViewById(R.id.textView2);
			final TextView quantText1 = (TextView) findViewById(R.id.textView3);
		
			priceText1.setText("$: " + String.format("%.2f%n", temp.h1.getPrice()));
			
			quantText1.setText("#: " + temp.h1.getQuant());
			
			editor.putFloat("h1price", (float) temp.h1.getPrice());
			editor.putInt("h1quantity", temp.h1.getQuant());
			
		} 
		
		else if (x == 2)
		{
			final TextView priceText2 = (TextView) findViewById(R.id.textView4);
			final TextView quantText2 = (TextView) findViewById(R.id.textView5);
			
			priceText2.setText("$: " + String.format("%.2f%n", temp.h2.getPrice()));
			quantText2.setText("#: " + temp.h2.getQuant());
			
			editor.putFloat("h2price", (float) temp.h2.getPrice());
			editor.putInt("h2quantity", temp.h2.getQuant());
			
		}
		
		else if (x == 3)
		{
			final TextView priceText3 = (TextView) findViewById(R.id.textView6);
			final TextView quantText3 = (TextView) findViewById(R.id.textView7);
			
			priceText3.setText("$: " + String.format("%.2f%n", temp.h3.getPrice()));
			quantText3.setText("#: " + temp.h3.getQuant());
			
			editor.putFloat("h3price", (float) temp.h3.getPrice());
			editor.putInt("h3quantity", temp.h3.getQuant());
			
		}
		
		else if (x == 4)
		{
			final TextView priceText4 = (TextView) findViewById(R.id.textView8);
			final TextView quantText4 = (TextView) findViewById(R.id.textView9);
			
			priceText4.setText("$: " + String.format("%.2f%n", temp.h4.getPrice()));
			quantText4.setText("#: " + temp.h4.getQuant());
			
			editor.putFloat("h4price", (float) temp.h4.getPrice());
			editor.putInt("h4quantity", temp.h4.getQuant());
			
		}
		
		else if (x == 5)
		{
			final TextView priceText5 = (TextView) findViewById(R.id.textView10);
			final TextView quantText5 = (TextView) findViewById(R.id.textView11);
			
			priceText5.setText("$: " + String.format("%.2f%n", temp.h5.getPrice()));
			quantText5.setText("#: " + temp.h5.getQuant());
			
			editor.putFloat("h5price", (float) temp.h5.getPrice());
			editor.putInt("h5quantity", temp.h5.getQuant());
			
		}
		
		else if (x == 6)
		{
			final TextView priceText6 = (TextView) findViewById(R.id.textView12);
			final TextView quantText6 = (TextView) findViewById(R.id.textView13);
			
			priceText6.setText("$: " + String.format("%.2f%n", temp.h6.getPrice()));
			quantText6.setText("#: " + temp.h6.getQuant());
			
			editor.putFloat("h6price", (float) temp.h6.getPrice());
			editor.putInt("h6quantity", temp.h6.getQuant());
			
		}
		
		else if (x == 7)
		{
			final TextView priceText7 = (TextView) findViewById(R.id.textView14);
			final TextView quantText7 = (TextView) findViewById(R.id.textView15);
			
			priceText7.setText("$: " + String.format("%.2f%n", temp.h7.getPrice()));
			quantText7.setText("#: " + temp.h7.getQuant());
			
			editor.putFloat("h7price", (float) temp.h7.getPrice());
			editor.putInt("h7quantity", temp.h7.getQuant());
			
		}
		
		else if (x == 8)
		{
			final TextView priceText8 = (TextView) findViewById(R.id.textView16);
			final TextView quantText8 = (TextView) findViewById(R.id.textView17);
			
			priceText8.setText("$: " + String.format("%.2f%n", temp.h8.getPrice()));
			quantText8.setText("#: " + temp.h8.getQuant());
			
			editor.putFloat("h8price", (float) temp.h8.getPrice());
			editor.putInt("h8quantity", temp.h8.getQuant());
			
		}
		
		else if (x == 9)
		{
			final TextView priceText9 = (TextView) findViewById(R.id.textView18);
			final TextView quantText9 = (TextView) findViewById(R.id.textView19);
			
			priceText9.setText("$: " + String.format("%.2f%n", temp.h9.getPrice()));
			quantText9.setText("#: " + temp.h9.getQuant());
			
			editor.putFloat("h9price", (float) temp.h9.getPrice());
			editor.putInt("h9quantity", temp.h9.getQuant());
			
		}
		
		else if (x == 10)
		{
			final TextView priceText10 = (TextView) findViewById(R.id.textView20);
			final TextView quantText10 = (TextView) findViewById(R.id.textView21);
			
			priceText10.setText("$: " + String.format("%.2f%n", temp.h10.getPrice()));
			quantText10.setText("#: " + temp.h10.getQuant());
			
			editor.putFloat("h10price", (float) temp.h10.getPrice());
			editor.putInt("h10quantity", temp.h10.getQuant());
			
		}
		editor.commit();
			
		
		
	}
	
	
	
	public void buy1(View view)
	{
		temp.subMoney(temp.h1.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h1.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h1.getIncome());
			temp.h1.purchase();
		}
		this.refresh(1);
	}
	
	public void buy2(View view)
	{
		temp.subMoney(temp.h2.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h2.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h2.getIncome());
			temp.h2.purchase();
		}
		this.refresh(2);
	}
	
	public void buy3(View view)
	{

		temp.subMoney(temp.h3.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h3.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h3.getIncome());
			temp.h3.purchase();
		}
		this.refresh(3);

	}
	
	
	public void buy4(View view)
	{
		
		temp.subMoney(temp.h4.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h4.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h4.getIncome());
			temp.h4.purchase();
		}
		this.refresh(4);

	}
	
	public void buy5(View view)
	{
		
		temp.subMoney(temp.h5.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h5.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h5.getIncome());
			temp.h5.purchase();
		}
		this.refresh(5);
	}
	
	public void buy6(View view)
	{
		
		temp.subMoney(temp.h6.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h6.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h6.getIncome());
			temp.h6.purchase();
		}
		this.refresh(6);

	}
	
	
	public void buy7(View view)
	{
		
		temp.subMoney(temp.h7.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h7.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h7.getIncome());
			temp.h7.purchase();
		}
		this.refresh(7);

	}
	
	public void buy8(View view)
	{

		temp.subMoney(temp.h8.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h8.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h8.getIncome());
			temp.h8.purchase();
		}
		this.refresh(8);

	}
	
	public void buy9(View view)
	{

		temp.subMoney(temp.h9.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h9.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h9.getIncome());
			temp.h9.purchase();
		}	
		this.refresh(9);
	}
	
	public void buy10(View view)
	{

		temp.subMoney(temp.h10.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.h10.getPrice());
		else
		{	
			temp.addPop();
			temp.addIncome(temp.h10.getIncome());
			temp.h10.purchase();
		}
		this.refresh(10);

	}
	
	
	public void openMain(View view) {
		th.interrupt();
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.humans, menu);
		return true;
	}

}
