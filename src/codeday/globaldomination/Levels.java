package codeday.globaldomination;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Levels extends Activity {

	Player temp = new Player();
	SharedPreferences.Editor editor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_levels);
		SharedPreferences settings = getApplicationContext().getSharedPreferences("SAVEDFILE",0);
		editor = settings.edit();
		for (int temp = 1; temp <= 10; temp ++)
			this.refresh(temp); 
		startTimerThread();
	}
	Thread th;
	private void startTimerThread() {       
	    th = new Thread(new Runnable() {
	        public void run() {
	            while (true) {                
	                runOnUiThread(new Runnable() {
	                    @Override
	                    public void run() {
	                    	for(int i = 1; i <= 10; i++)
	                    	{
	                    		refresh(i);
	                    	}
	                    				  }
	                							 });
	                try {
	                    Thread.sleep(1000);
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
			final TextView hpText = (TextView) findViewById(R.id.textView2);
			final TextView atkText = (TextView) findViewById(R.id.textView3);
			final TextView armText = (TextView) findViewById(R.id.textView4);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f1.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f1.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f1.getArmor()));
			
			editor.putFloat("f1hp",(float) temp.f1.getHealth());
			editor.putFloat("f1dmg",(float)temp.f1.getDamage());
			editor.putFloat("f1arm",(float) temp.f1.getArmor());
			
		} 
		else if (x == 2)
		{
			final TextView hpText = (TextView) findViewById(R.id.textView5);
			final TextView atkText = (TextView) findViewById(R.id.textView6);
			final TextView armText = (TextView) findViewById(R.id.textView7);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f2.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f2.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f2.getArmor()));
			
			editor.putFloat("f2hp",(float) temp.f2.getHealth());
			editor.putFloat("f2dmg",(float)temp.f2.getDamage());
			editor.putFloat("f2arm",(float) temp.f2.getArmor());
		} 
		else if (x == 3)
		{
			final TextView hpText = (TextView) findViewById(R.id.textView8);
			final TextView atkText = (TextView) findViewById(R.id.textView9);
			final TextView armText = (TextView) findViewById(R.id.textView10);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f3.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f3.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f3.getArmor()));
			
			editor.putFloat("f3hp",(float) temp.f3.getHealth());
			editor.putFloat("f3dmg",(float)temp.f3.getDamage());
			editor.putFloat("f3arm",(float) temp.f3.getArmor());
		} 
		else if (x == 4)
		{
			final TextView hpText = (TextView) findViewById(R.id.textView11);
			final TextView atkText = (TextView) findViewById(R.id.textView12);
			final TextView armText = (TextView) findViewById(R.id.textView13);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f4.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f4.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f4.getArmor()));
			
			editor.putFloat("f4hp",(float) temp.f4.getHealth());
			editor.putFloat("f4dmg",(float)temp.f4.getDamage());
			editor.putFloat("f4arm",(float) temp.f4.getArmor());
		} 
		else if (x == 5)
		{
			final TextView hpText = (TextView) findViewById(R.id.textView14);
			final TextView atkText = (TextView) findViewById(R.id.textView15);
			final TextView armText = (TextView) findViewById(R.id.textView16);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f5.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f5.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f5.getArmor()));
			
			editor.putFloat("f5hp",(float) temp.f5.getHealth());
			editor.putFloat("f5dmg",(float)temp.f5.getDamage());
			editor.putFloat("f5arm",(float) temp.f5.getArmor());
		} 
		else if (x == 6)
		{
			final TextView hpText = (TextView) findViewById(R.id.textView17);
			final TextView atkText = (TextView) findViewById(R.id.textView18);
			final TextView armText = (TextView) findViewById(R.id.textView19);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f6.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f6.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f6.getArmor()));
			
			editor.putFloat("f6hp",(float) temp.f6.getHealth());
			editor.putFloat("f6dmg",(float)temp.f6.getDamage());
			editor.putFloat("f6arm",(float) temp.f6.getArmor());
		} 
		else if (x == 7)
		{
			final TextView hpText = (TextView) findViewById(R.id.textView20);
			final TextView atkText = (TextView) findViewById(R.id.textView21);
			final TextView armText = (TextView) findViewById(R.id.textView22);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f7.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f7.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f7.getArmor()));
			
			editor.putFloat("f7hp",(float) temp.f7.getHealth());
			editor.putFloat("f7dmg",(float)temp.f7.getDamage());
			editor.putFloat("f7arm",(float) temp.f7.getArmor());
		} 
		else if (x == 8)
		{
			final TextView hpText = (TextView) findViewById(R.id.textView23);
			final TextView atkText = (TextView) findViewById(R.id.textView24);
			final TextView armText = (TextView) findViewById(R.id.textView25);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f8.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f8.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f8.getArmor()));
			
			editor.putFloat("f8hp",(float) temp.f8.getHealth());
			editor.putFloat("f8dmg",(float)temp.f8.getDamage());
			editor.putFloat("f8arm",(float) temp.f8.getArmor());
		} 
		else if (x == 9)
		{
			final TextView hpText = (TextView) findViewById(R.id.textView26);
			final TextView atkText = (TextView) findViewById(R.id.textView27);
			final TextView armText = (TextView) findViewById(R.id.textView28);
			
			hpText.setText("HP: " + String.format("%.2f%n", temp.f9.getHealth()));
			atkText.setText("ATK: " + String.format("%.2f%n", temp.f9.getDamage()));
			armText.setText("AMR: " + String.format("%.2f%n", temp.f9.getArmor()));
			
			editor.putFloat("f9hp",(float) temp.f9.getHealth());
			editor.putFloat("f9dmg",(float)temp.f9.getDamage());
			editor.putFloat("f9arm",(float) temp.f9.getArmor());
		} 
		
		editor.commit();
	}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.levels, menu);
		return true;
	}
	
	public void openMain(View view) {
		th.interrupt();
		finish();
	}
	
	public void openFight(View view) {
		String monster = (String) view.getTag();
		temp.chooseFight(monster);
		
		
		Intent intent = new Intent(this, Fight.class);
		startActivity(intent);
	}

	
	
}
