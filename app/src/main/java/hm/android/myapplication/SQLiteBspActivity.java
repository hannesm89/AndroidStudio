package hm.android.myapplication;

import java.util.List;
import java.util.Random;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;

public class SQLiteBspActivity extends ListActivity {
	
	/*private final String TAG = TermineDataSource.class.getName();
	private TermineDataSource datasource;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		datasource = new TermineDataSource(this);
		datasource.open();
		System.out.println("DAO bereit");

		List<Termin> values = datasource.alleTermine();

		// Use the SimpleCursorAdapter to show the
		// elements in a ListView
		ArrayAdapter<Termin> adapter = new ArrayAdapter<Termin>(this,
				android.R.layout.simple_list_item_1, values);
		System.out.println("Adapter angelegt");
		setListAdapter(adapter);
	}

	// Will be called via the onClick attribute
	// of the buttons in main.xml	
	public void onClick(View view) {
		@SuppressWarnings("unchecked")
		ArrayAdapter<Termin> adapter = (ArrayAdapter<Termin>) getListAdapter();
		Termin comment = null;
		switch (view.getId()) {
		case R.id.add:
			String[] comments = new String[] { "essen", "trinken", "arbeiten" };
			int nextInt = new Random().nextInt(3);
			// Save the new comment to the database
			Log.i(TAG, "nextInt " + nextInt);
			Termin termin = new Termin(2012, 5, 1, nextInt, comments[nextInt]);
			comment = datasource.createTermin(termin);
			adapter.add(comment);
			break;
		case R.id.delete:
			if (getListAdapter().getCount() > 0) {
				comment = (Termin) getListAdapter().getItem(0);
				datasource.deleteTermin(comment);
				adapter.remove(comment);
			}
			break;
		}
		adapter.notifyDataSetChanged();
	}

	@Override
	protected void onResume() {
		datasource.open();
		super.onResume();
	}

	@Override
	protected void onPause() {
		datasource.close();
		super.onPause();
	}
*/
}
