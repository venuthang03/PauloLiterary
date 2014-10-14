package com.Toltec.pauloliterary;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MainListActivity extends ListActivity {
	
	protected String[] mPaulo; /*= {"Alchemist",
								"Aleph",
								"Manuscripts Found in Accra",
								"Veronica decides to die"
								
	};*/
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_list);
		
		Resources resources = getResources();
		
		mPaulo =resources.getStringArray(R.array.paulo_books);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mPaulo);
		setListAdapter(adapter);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_list, menu);
		return true;
	}

}
