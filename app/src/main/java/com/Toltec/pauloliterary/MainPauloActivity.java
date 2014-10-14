package com.Toltec.pauloliterary;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MainPauloActivity extends ListActivity {

	protected String[] mPaulo = {"aleph",
								"Brida",
								"Alchemist"}; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_paulo_list);
		
	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mPaulo);
	setListAdapter(adapter);
		
	}

	private void setListAdapter(ArrayAdapter<String> adapter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_paulo, menu);
		return true;
	}

}
