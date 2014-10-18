package com.telematica.dsalazar.control_multimedios;


import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.telematica.dsalazar.control_multimedios.JSONParser;

public class MainActivity extends ActionBarActivity {

	TextView title;
	TextView points;
	TextView link;
	ArrayList<HashMap<String, String>> oslist = new ArrayList<HashMap<String, String>>();
	
	private static String url = "http://www.mocky.io/v2/5440667984d353f103f697c0";
	  //JSON Node Names
	private static final String TAG_TIT = "title";
	private static final String TAG_IM = "image";
	private static final String TAG_PTS = "points";
	private static final String TAG_LK = "links";
	
	JSONArray android = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        oslist = new ArrayList<HashMap<String, String>>();
		
		ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar1);
		ListView    listview    = (ListView) findViewById(R.id.widget_list_view);
		
		
	}
	
	         

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
