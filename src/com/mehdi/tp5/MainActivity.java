package com.mehdi.tp5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        

        Button btn;
        btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(this);
        
    }

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public static final int code_retour = 0;


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, AutreActivity.class);
		startActivityForResult(intent, code_retour);
		
		
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		//super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == code_retour) {
			if (resultCode == RESULT_OK)
			{ String nom = data.getStringExtra("nom");
			Toast.makeText(this, "votre nom est"+nom, Toast.LENGTH_SHORT).show();
			}
		
		else if (resultCode == RESULT_CANCELED){
		Toast.makeText(this, "Opération annulée", Toast.LENGTH_SHORT).show();
		}
		
	}}
    
}
