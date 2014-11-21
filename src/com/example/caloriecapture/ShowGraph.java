package com.example.caloriecapture;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowGraph extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_show_graph);
	    
	    Button btn = (Button)findViewById(R.id.btnBackMain);
	    btn.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
  
	    // TODO Auto-generated method stub
	}

}
