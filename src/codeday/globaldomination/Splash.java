package codeday.globaldomination;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
 
public class Splash extends Activity {
 
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
    Player mainPlayer = new Player();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
		
        SharedPreferences settings = getApplicationContext().getSharedPreferences("SAVEDFILE", 0);
			double tMoney = settings.getFloat("tMoney", 0);
			mainPlayer.setMoney(tMoney);
			
			double income = settings.getFloat("income",1);
			mainPlayer.setIncome(income);
			
			int maxHealth = settings.getInt("maxHealth",100);
			mainPlayer.setHealth(maxHealth);
			
			int population = settings.getInt("population", 1);
			mainPlayer.setPopulation(population);
			
			int damage = settings.getInt("damage", 1);
			mainPlayer.setDamage(damage);
			
			int armor = settings.getInt("armor", 0);
			mainPlayer.setArmor(armor);
			
			int w1quantity = settings.getInt("w1quantity",0);
			float w1price = settings.getFloat("w1price",100);
			mainPlayer.w1.setQuantityPrice(w1quantity, w1price);
			
			
			int w2quantity = settings.getInt("w2quantity",0);
			float w2price = settings.getFloat("w2price",200);
			mainPlayer.w2.setQuantityPrice(w2quantity, w2price);
			
			int w3quantity = settings.getInt("w3quantity",0);
			float w3price = settings.getFloat("w3price",400);
			mainPlayer.w3.setQuantityPrice(w3quantity, w3price);
			
			int w4quantity = settings.getInt("w4quantity",0);
			float w4price = settings.getFloat("w4price",1000);
			mainPlayer.w4.setQuantityPrice(w4quantity, w4price);
			
			int w5quantity = settings.getInt("w5quantity",0);
			float w5price = settings.getFloat("w5price",10000);
			mainPlayer.w5.setQuantityPrice(w5quantity, w5price);
			
			int w6quantity = settings.getInt("w6quantity",0);
			float w6price = settings.getFloat("w6price",100000);
			mainPlayer.w6.setQuantityPrice(w6quantity, w6price);
			
			int w7quantity = settings.getInt("w7quantity",0);
			float w7price = settings.getFloat("w7price",1000000);
			mainPlayer.w7.setQuantityPrice(w7quantity, w7price);
			
			int w8quantity = settings.getInt("w8quantity",0);
			float w8price = settings.getFloat("w8price",10000000);
			mainPlayer.w8.setQuantityPrice(w8quantity, w8price);
			
			int w9quantity = settings.getInt("w9quantity",0);
			float w9price = settings.getFloat("w9price",100000000);
			mainPlayer.w9.setQuantityPrice(w9quantity, w9price);
			
			int w10quantity = settings.getInt("w10quantity",0);
			float w10price = settings.getFloat("w10price",1000000000);
			mainPlayer.w10.setQuantityPrice(w10quantity, w10price);
			
			int a1quantity = settings.getInt("a1quantity",0);
			float a1price = settings.getFloat("a1price",100);
			mainPlayer.a1.setQuantityPrice(a1quantity, a1price);
			
			int a2quantity = settings.getInt("a2quantity",0);
			float a2price = settings.getFloat("a2price",200);
			mainPlayer.a2.setQuantityPrice(a2quantity, a2price);
			
			int a3quantity = settings.getInt("a3quantity",0);
			float a3price = settings.getFloat("a3price",400);
			mainPlayer.a3.setQuantityPrice(a3quantity, a3price);
			
			int a4quantity = settings.getInt("a4quantity",0);
			float a4price = settings.getFloat("a4price",800);
			mainPlayer.a4.setQuantityPrice(a4quantity, a4price);
			
			int a5quantity = settings.getInt("a5quantity",0);
			float a5price = settings.getFloat("a5price",1600);
			mainPlayer.a5.setQuantityPrice(a5quantity, a5price);
			
			int a6quantity = settings.getInt("a6quantity",0);
			float a6price = settings.getFloat("a6price",5000);
			mainPlayer.a6.setQuantityPrice(a6quantity, a6price);
			
			int a7quantity = settings.getInt("a7quantity",0);
			float a7price = settings.getFloat("a7price",10000);
			mainPlayer.a7.setQuantityPrice(a7quantity, a7price);
			
			int a8quantity = settings.getInt("a8quantity",0);
			float a8price = settings.getFloat("a8price",30000);
			mainPlayer.a8.setQuantityPrice(a8quantity, a8price);
			
			int a9quantity = settings.getInt("a9quantity",0);
			float a9price = settings.getFloat("a9price",100000);
			mainPlayer.a9.setQuantityPrice(a9quantity, a9price);
			
			int a10quantity = settings.getInt("a10quantity",0);
			float a10price = settings.getFloat("a10price",500000);
			mainPlayer.a10.setQuantityPrice(a10quantity, a10price);
			
			int h1quantity = settings.getInt("h1quantity",0);
			float h1price = settings.getFloat("h1price",100);
			mainPlayer.h1.setQuantityPrice(h1quantity, h1price);
			
			int h2quantity = settings.getInt("h2quantity",0);
			float h2price = settings.getFloat("h2price",200);
			mainPlayer.h2.setQuantityPrice(h2quantity, h2price);

			int h3quantity = settings.getInt("h3quantity",0);
			float h3price = settings.getFloat("h3price",500);
			mainPlayer.h3.setQuantityPrice(h3quantity, h3price);
			
			int h4quantity = settings.getInt("h4quantity",0);
			float h4price = settings.getFloat("h4price",1000);
			mainPlayer.h4.setQuantityPrice(h4quantity, h4price);
			
			int h5quantity = settings.getInt("h5quantity",0);
			float h5price = settings.getFloat("h5price",2000);
			mainPlayer.h5.setQuantityPrice(h5quantity, h5price);
			
			int h6quantity = settings.getInt("h6quantity",0);
			float h6price = settings.getFloat("h6price",5000);
			mainPlayer.h6.setQuantityPrice(h6quantity, h6price);
			
			int h7quantity = settings.getInt("h7quantity",0);
			float h7price = settings.getFloat("h7price",10000);
			mainPlayer.h7.setQuantityPrice(h7quantity, h7price);
			
			int h8quantity = settings.getInt("h8quantity",0);
			float h8price = settings.getFloat("h8price",50000);
			mainPlayer.h8.setQuantityPrice(h8quantity, h8price);
			
			int h9quantity = settings.getInt("h9quantity",0);
			float h9price = settings.getFloat("h9price",100000);
			mainPlayer.h9.setQuantityPrice(h9quantity, h9price);
			
			int h10quantity = settings.getInt("h10quantity",0);
			float h10price = settings.getFloat("h10price",500000);
			mainPlayer.h10.setQuantityPrice(h10quantity, h10price);
			
			float f1hp = settings.getFloat("f1hp", 100);
			float f1dmg = settings.getFloat("f1dmg", 5);
			float f1arm = settings.getFloat("f1arm", 5);
			mainPlayer.f1.setValues(f1hp, f1dmg, f1arm);
			
			float f2hp = settings.getFloat("f2hp", 200);
			float f2dmg = settings.getFloat("f2dmg", 10);
			float f2arm = settings.getFloat("f2arm", 10);
			mainPlayer.f2.setValues(f2hp, f2dmg, f2arm);
			
			float f3hp = settings.getFloat("f3hp", 500);
			float f3dmg = settings.getFloat("f3dmg", 15);
			float f3arm = settings.getFloat("f3arm", 20);
			mainPlayer.f1.setValues(f3hp, f3dmg, f3arm);
			
			float f4hp = settings.getFloat("f4hp", 1000);
			float f4dmg = settings.getFloat("f4dmg", 10);
			float f4arm = settings.getFloat("f4arm", 35);
			mainPlayer.f4.setValues(f4hp, f4dmg, f4arm);
			
			float f5hp = settings.getFloat("f5hp", 5000);
			float f5dmg = settings.getFloat("f5dmg", 50);
			float f5arm = settings.getFloat("f5arm", 100);
			mainPlayer.f5.setValues(f5hp, f5dmg, f5arm);
			
			float f6hp = settings.getFloat("f6hp", 10000);
			float f6dmg = settings.getFloat("f6dmg", 500);
			float f6arm = settings.getFloat("f6arm", 500);
			mainPlayer.f6.setValues(f6hp, f6dmg, f6arm);
			
			float f7hp = settings.getFloat("f7hp", 25000);
			float f7dmg = settings.getFloat("f7dmg", 1000);
			float f7arm = settings.getFloat("f7arm", 1000);
			mainPlayer.f7.setValues(f7hp, f7dmg, f7arm);
			
			float f8hp = settings.getFloat("f8hp", 50000);
			float f8dmg = settings.getFloat("f8dmg", 5000);
			float f8arm = settings.getFloat("f8arm", 5000);
			mainPlayer.f8.setValues(f8hp, f8dmg, f8arm);
			
			float f9hp = settings.getFloat("f9hp", 100000);
			float f9dmg = settings.getFloat("f9dmg", 50000);
			float f9arm = settings.getFloat("f9arm", 50000);
			mainPlayer.f9.setValues(f9hp, f9dmg, f9arm);
			
			
			mainPlayer.setTime(0);
			
        new Handler().postDelayed(new Runnable() {
 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
 
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
 
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
 
}