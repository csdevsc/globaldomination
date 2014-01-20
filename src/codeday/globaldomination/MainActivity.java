package codeday.globaldomination;

import codeday.globaldomination.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView moneyText;
	TextView clickMoney;
	TextView timeMoney;
	Player mainPlayer = new Player();
	boolean keepGoing;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		moneyText = (TextView) findViewById(R.id.money);
		clickMoney = (TextView) findViewById(R.id.textView2);
		timeMoney = (TextView) findViewById(R.id.textView3);
		
		Intent intent = getIntent();
		
		startTimerThread();
	}
	
	
	private void startTimerThread() {       
	    Thread th = new Thread(new Runnable() {
	        public void run() {
	            while (true) {                
	                runOnUiThread(new Runnable() {
	                    @Override
	                    public void run() {
	                    	mainPlayer.addMoneySec(30);
	                    	moneyText.setText("Money $: " + String.format("%.2f%n", mainPlayer.getMoney()));
	                    	clickMoney.setText("Click $: " + String.format("%.2f%n", mainPlayer.getIncome()));
	                    	timeMoney.setText("Time $: " + String.format("%.2f%n", mainPlayer.getIncome()*0.167));
	                    	
	                    	if(mainPlayer.getTime() == 5)
	                    	{
	                    		SharedPreferences settings = getApplicationContext().getSharedPreferences("SAVEDFILE", 0);
	                    		SharedPreferences.Editor editor = settings.edit();
	                    		
	                    		editor.putFloat("tMoney", (float) mainPlayer.getMoney());
	                			
	                			editor.putFloat("income", (float) mainPlayer.getIncome());
	                			
	                			editor.putInt("maxHealth",mainPlayer.getMaxHealth());
	                			
	                			editor.putInt("population", mainPlayer.getPopulation());
	                			
	                			editor.putInt("damage", mainPlayer.getDamage());
	                			
	                			editor.putInt("armor", mainPlayer.getArmor());
	                			
	                			editor.putBoolean("hasLoad", true);
	                    	    editor.commit();
	                    	    
	                    	    mainPlayer.setTime(0);
	                    	}
	                    }
	                });
	                try {
	                    Thread.sleep(200);
	                    
	                } 
	                catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    });
	   
	    	th.start();
	}
	
	
	public void gainMoney(View view){
		
		final TextView moneyText = (TextView) findViewById(R.id.money);
		
		final ImageButton button1 = (ImageButton) findViewById(R.id.makeMoney);
		button1.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v)
			{
				mainPlayer.addMoney(mainPlayer.getIncome());
				moneyText.setText("Money $: " + String.format("%.2f%n", mainPlayer.getMoney()));
				clickMoney.setText("Click $: " + String.format("%.2f%n", mainPlayer.getIncome()));
            	timeMoney.setText("Time $: " + String.format("%.2f%n", mainPlayer.getIncome()*0.167));
				
			}  
		});  
	}  
	
	
	public void openHumans(View view) {
		Intent intent = new Intent(this, Humans.class);

		startActivity(intent);
	}
	
	public void openTech(View view) {
		Intent intent = new Intent(this, Tech.class);
	
		startActivity(intent);
	}
	
	public void openFight(View view) {
		Intent intent = new Intent(this, Fight.class);
	
		startActivity(intent);
	}
	
	public void openLevels(View view) {
		Intent intent = new Intent(this, Levels.class);
		
		startActivity(intent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
