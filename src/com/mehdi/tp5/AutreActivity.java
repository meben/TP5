package com.mehdi.tp5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AutreActivity extends Activity implements OnClickListener {

	
	EditText champs;
	Button btn2; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_autre);
	
		
		
		btn2 = (Button)findViewById(R.id.button1);
		champs = (EditText)findViewById(R.id.editText1);
	btn2.setOnClickListener(this);
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.autre, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if (champs.getText().length() > 0 ) {
			Intent i = new Intent ();
			i.putExtra("nom", champs.getText().toString());
			
			setResult(RESULT_OK, i);
			finish();
			
		}
		
	}

}
