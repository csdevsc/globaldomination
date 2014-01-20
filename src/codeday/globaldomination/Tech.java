package codeday.globaldomination;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class Tech extends Activity {
	Player temp = new Player();
	TextView moneyText;
	SharedPreferences.Editor editor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tech);
		moneyText = (TextView) findViewById(R.id.money);
		Intent intent = getIntent();
		startTimerThread();
		
		SharedPreferences settings = getApplicationContext().getSharedPreferences("SAVEDFILE", 0);
		editor = settings.edit();
		
		for (int temp = 1; temp <= 20; temp ++)
			this.refresh(temp); 
		
		
		TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
		tabs.setup();

		TabSpec spec1=tabs.newTabSpec("Weapons");
		spec1.setContent(R.id.Weapons);
		spec1.setIndicator("Weapons");

		TabSpec spec2=tabs.newTabSpec("Armor");
		spec2.setContent(R.id.Armor);
		spec2.setIndicator("Armor");


		tabs.addTab(spec1);
		tabs.addTab(spec2);
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
		
		if (x == 1)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView2);
			final TextView quantText = (TextView) findViewById(R.id.textView3);
		
			priceText.setText("$: " + String.format("%.2f%n", temp.w1.getPrice()));
			quantText.setText("#: " + temp.w1.getQuant());
			
			editor.putInt("w1quantity",temp.w1.getQuant());
			editor.putFloat("w1price", (float) temp.w1.getPrice());
			
		} 
		
		else if (x == 2)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView4);
			final TextView quantText = (TextView) findViewById(R.id.textView5);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w2.getPrice()));
			quantText.setText("#: " + temp.w2.getQuant());
			
			editor.putInt("w2quantity",temp.w2.getQuant());
			editor.putFloat("w2price", (float) temp.w2.getPrice());
			
		}
		
		else if (x == 3)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView6);
			final TextView quantText = (TextView) findViewById(R.id.textView7);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w3.getPrice()));
			quantText.setText("#: " + temp.w3.getQuant());
			
			editor.putInt("w3quantity",temp.w3.getQuant());
			editor.putFloat("w3price", (float) temp.w3.getPrice());
			
		}
		else if (x == 4)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView8);
			final TextView quantText = (TextView) findViewById(R.id.textView9);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w4.getPrice()));
			quantText.setText("#: " + temp.w4.getQuant());

			editor.putInt("w4quantity",temp.w4.getQuant());
			editor.putFloat("w4price", (float) temp.w4.getPrice());
			
		}
		else if (x == 5)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView10);
			final TextView quantText = (TextView) findViewById(R.id.textView11);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w5.getPrice()));
			quantText.setText("#: " + temp.w5.getQuant());
			
			editor.putInt("w5quantity",temp.w5.getQuant());
			editor.putFloat("w5price", (float) temp.w5.getPrice());
			
		}
		else if (x == 6)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView12);
			final TextView quantText = (TextView) findViewById(R.id.textView13);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w6.getPrice()));
			quantText.setText("#: " + temp.w6.getQuant());
			
			editor.putInt("w6quantity",temp.w6.getQuant());
			editor.putFloat("w6price", (float) temp.w6.getPrice());
			
		}
		else if (x == 7)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView14);
			final TextView quantText = (TextView) findViewById(R.id.textView15);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w7.getPrice()));
			quantText.setText("#: " + temp.w7.getQuant());
			
			editor.putInt("w7quantity",temp.w7.getQuant());
			editor.putFloat("w7price", (float) temp.w7.getPrice());
			
		}
		else if (x == 8)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView16);
			final TextView quantText = (TextView) findViewById(R.id.textView17);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w8.getPrice()));
			quantText.setText("#: " + temp.w8.getQuant());
			
			editor.putInt("w8quantity",temp.w8.getQuant());
			editor.putFloat("w8price", (float) temp.w8.getPrice());
			
		}
		else if (x == 9)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView18);
			final TextView quantText = (TextView) findViewById(R.id.textView19);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w9.getPrice()));
			quantText.setText("#: " + temp.w9.getQuant());
			
			editor.putInt("w9quantity",temp.w9.getQuant());
			editor.putFloat("w9price", (float) temp.w9.getPrice());
			
		}
		else if (x == 10)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView20);
			final TextView quantText = (TextView) findViewById(R.id.textView21);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.w10.getPrice()));
			quantText.setText("#: " + temp.w10.getQuant());
			
			editor.putInt("w10quantity",temp.w10.getQuant());
			editor.putFloat("w10price", (float) temp.w10.getPrice());
			
		}
		else if (x == 11)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView22);
			final TextView quantText = (TextView) findViewById(R.id.textView23);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a1.getPrice()));
			quantText.setText("#: " + temp.a1.getQuant());
			
			editor.putInt("a1quantity",temp.a1.getQuant());
			editor.putFloat("a1price", (float) temp.a1.getPrice());
			
		}
		else if (x == 12)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView24);
			final TextView quantText = (TextView) findViewById(R.id.textView25);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a2.getPrice()));
			quantText.setText("#: " + temp.a2.getQuant());
			
			editor.putInt("a2quantity",temp.a2.getQuant());
			editor.putFloat("a2price", (float) temp.a2.getPrice());
			
		}
		else if (x == 13)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView26);
			final TextView quantText = (TextView) findViewById(R.id.textView27);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a3.getPrice()));
			quantText.setText("#: " + temp.a3.getQuant());
			
			editor.putInt("a3quantity",temp.a3.getQuant());
			editor.putFloat("a3price", (float) temp.a3.getPrice());
			
		}
		else if (x == 14)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView28);
			final TextView quantText = (TextView) findViewById(R.id.textView29);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a4.getPrice()));
			quantText.setText("#: " + temp.a4.getQuant());
			
			editor.putInt("a4quantity",temp.a4.getQuant());
			editor.putFloat("a4price", (float) temp.a4.getPrice());
			
		}
		else if (x == 15)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView30);
			final TextView quantText = (TextView) findViewById(R.id.textView31);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a5.getPrice()));
			quantText.setText("#: " + temp.a5.getQuant());
			
			editor.putInt("a5quantity",temp.a5.getQuant());
			editor.putFloat("a5price", (float) temp.a5.getPrice());
			
		}
		else if (x == 16)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView32);
			final TextView quantText = (TextView) findViewById(R.id.textView33);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a6.getPrice()));
			quantText.setText("#: " + temp.a6.getQuant());
			
			editor.putInt("a6quantity",temp.a6.getQuant());
			editor.putFloat("a6price", (float) temp.a6.getPrice());
			
		}
		else if (x == 17)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView34);
			final TextView quantText = (TextView) findViewById(R.id.textView35);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a7.getPrice()));
			quantText.setText("#: " + temp.a7.getQuant());
			
			editor.putInt("a7quantity",temp.a7.getQuant());
			editor.putFloat("a7price", (float) temp.a7.getPrice());
			
		}
		else if (x == 18)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView36);
			final TextView quantText = (TextView) findViewById(R.id.textView37);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a8.getPrice()));
			quantText.setText("#: " + temp.a8.getQuant());
			
			editor.putInt("a8quantity",temp.a8.getQuant());
			editor.putFloat("a8price", (float) temp.a8.getPrice());
			
		}
		else if (x == 19)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView38);
			final TextView quantText = (TextView) findViewById(R.id.textView39);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a9.getPrice()));
			quantText.setText("#: " + temp.a9.getQuant());
			
			editor.putInt("a9quantity",temp.a9.getQuant());
			editor.putFloat("a9price", (float) temp.a9.getPrice());
			
		}
		else if (x == 20)
		{
			final TextView priceText = (TextView) findViewById(R.id.textView40);
			final TextView quantText = (TextView) findViewById(R.id.textView41);
			
			priceText.setText("$: " + String.format("%.2f%n", temp.a10.getPrice()));
			quantText.setText("#: " + temp.a10.getQuant());
			
			editor.putInt("a10quantity",temp.a10.getQuant());
			editor.putFloat("a10price", (float) temp.a10.getPrice());
			
		}
		editor.commit();
		
	}
	
	
	
	public void buyw1(View view)
	{
		temp.subMoney(temp.w1.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w1.getPrice());
		else
		{
			temp.addDam(temp.w1.getAttack());
			temp.w1.purchase();
		}
		this.refresh(1);
		
	}
	
	public void buyw2(View view)
	{
		temp.subMoney(temp.w2.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w2.getPrice());
		else
		{
			temp.addDam(temp.w2.getAttack());
			temp.w2.purchase();
		}
		this.refresh(2);

	}
	
	public void buyw3(View view)
	{
		temp.subMoney(temp.w2.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w3.getPrice());
		else
		{
			temp.addDam(temp.w3.getAttack());
			temp.w3.purchase();
		}
		
		this.refresh(3);

	}
	
	public void buyw4(View view)
	{
		temp.subMoney(temp.w4.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w4.getPrice());
		else
		{
			temp.addDam(temp.w4.getAttack());
			temp.w4.purchase();
		}		
		this.refresh(4);

	}
	
	public void buyw5(View view)
	{
		temp.subMoney(temp.w5.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w5.getPrice());
		else
		{
			temp.addDam(temp.w5.getAttack());
			temp.w5.purchase();
		}
		this.refresh(5);

	}
	
	public void buyw6(View view)
	{
		temp.subMoney(temp.w6.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w6.getPrice());
		else
		{
			temp.addDam(temp.w6.getAttack());
			temp.w6.purchase();
		}
		
		this.refresh(6);

	}
	
	public void buyw7(View view)
	{
		temp.subMoney(temp.w7.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w7.getPrice());
		else
		{
			temp.addDam(temp.w7.getAttack());
			temp.w7.purchase();
		}
		
		this.refresh(7);

	}
	
	public void buyw8(View view)
	{
		temp.subMoney(temp.w8.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w8.getPrice());
		else
		{
			temp.addDam(temp.w8.getAttack());
			temp.w8.purchase();
		}
		this.refresh(8);

	}
	
	public void buyw9(View view)
	{
		temp.subMoney(temp.w9.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w9.getPrice());
		else
		{
			temp.addDam(temp.w8.getAttack());
			temp.w8.purchase();
		}
		
		this.refresh(9);

	}
	
	public void buyw10(View view)
	{
		temp.subMoney(temp.w10.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.w10.getPrice());
		else
		{
			temp.addDam(temp.w10.getAttack());
			temp.w10.purchase();
		}
		
		this.refresh(10);

	}
	
	public void buya1(View view)
	{
		temp.subMoney(temp.a1.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a1.getPrice());
		else
			temp.a1.purchase();
		
		this.refresh(11);
		
	}
	
	public void buya2(View view)
	{
		temp.subMoney(temp.a2.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a2.getPrice());
		else
			temp.a2.purchase();
		
		this.refresh(12);

	}
	
	public void buya3(View view)
	{
		temp.subMoney(temp.a3.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a3.getPrice());
		else
			temp.a3.purchase();
		
		this.refresh(13);
		
	}
	
	public void buya4(View view)
	{
		temp.subMoney(temp.a4.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a4.getPrice());
		else
			temp.a4.purchase();
		
		this.refresh(14);

	}
	
	public void buya5(View view)
	{
		temp.subMoney(temp.a5.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a5.getPrice());
		else
			temp.a5.purchase();
		
		this.refresh(15);
	}
	
	public void buya6(View view)
	{
		temp.subMoney(temp.a6.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a6.getPrice());
		else
			temp.a6.purchase();
		
		this.refresh(16);
	}
	
	public void buya7(View view)
	{
		temp.subMoney(temp.a7.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a7.getPrice());
		else
			temp.a1.purchase();
		
		this.refresh(17);
	}
	
	public void buya8(View view)
	{
		temp.subMoney(temp.a8.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a8.getPrice());
		else
			temp.a8.purchase();
		
		this.refresh(8);
	}
	
	public void buya9(View view)
	{
		temp.subMoney(temp.a9.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a9.getPrice());
		else
			temp.a9.purchase();
		
		this.refresh(19);
	}
	
	public void buya10(View view)
	{
		temp.subMoney(temp.a10.getPrice());
		
		if (temp.getMoney()<= 0)
			temp.addMoney(temp.a10.getPrice());
		else
			temp.a1.purchase();
		
		this.refresh(20);
	}
	
	
	
	
	public void openMain(View view) {
		th.interrupt();
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tech, menu);
		return true;
	}

}
