package com.abhisheksabbarwal.simpleactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity {
	
	Button screen1Btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        
        //Get reference to the button on the first screen
        screen1Btn = (Button) findViewById(R.id.button1);
        
        
        //Set listener for the button
        
        screen1Btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				//Intent declaration
				Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
				
				//Start new activity using the intent created above
				startActivity(intent);
				
			}
		});
        
    }
}
