package com.abhisheksabbarwal.simpleactivity;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//Get reference to the layout for second screen and set is as the content
		setContentView(R.layout.activity_second);
	}


}
