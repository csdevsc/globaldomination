package codeday.globaldomination;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Fight extends Activity {
	Player temp = new Player();
	Battles monster = temp.getFight();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fight);
		Intent intent = getIntent();
		
		monster.restore();
		
		ImageButton btn = (ImageButton)findViewById(R.id.attack);
		btn.setImageResource(getResources().getIdentifier(temp.getImage(), "drawable", getPackageName()));
		
		
		
		this.refresh();
	}

	public void openMain(View view) {
		finish();
	}
	
	public void attackMonster(View view) {
		double calc = temp.calcDamage() - monster.getArmor();
		
		if (calc <= 0)
			calc = 1;
		
		if (!monster.getDamaged(calc))
			this.refresh();
		else
		{
			monster.buffMonster();
			monster.restore();
			finish();
		}
		
	}

	public void refresh()
	{
		final TextView monsterHp = (TextView) findViewById(R.id.textView2);
		
		monsterHp.setText("HP: " + String.format("%.2f%n", monster.getCurrHealth()));
		
		final TextView currDmg = (TextView) findViewById(R.id.textView3);
		currDmg.setText("DMG: " + String.format("%.2f%n", temp.calcDamage() - monster.getArmor()));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fight, menu);
		return true;
	}

}
