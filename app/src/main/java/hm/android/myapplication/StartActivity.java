package hm.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class StartActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonAdd;
    Button buttonShow;
    Button buttonEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);
        buttonShow = (Button) findViewById(R.id.buttonShow);
        buttonShow.setOnClickListener(this);
        buttonEnd = (Button) findViewById(R.id.buttonEnd);
        buttonEnd.setOnClickListener(this);
    }

    // Will be called via the onClick attribute
    // of the buttons in main.xml
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonAdd:
                Log.i("StartActivity", "buttonAdd buttonAdd");
                Intent intent = new Intent(this, addDateActivity.class);
                Bundle b = new Bundle();
                b.putInt("Termin-ID", -1);
                intent.putExtras(b);
                startActivity(intent);
                break;

            case R.id.buttonShow:
                Log.i("StartActivity", "buttonAdd buttonShow");
                break;

            case R.id.buttonEnd:
                Log.i("StartActivity", "buttonAdd buttonEnd");
                break;

            default:
                break;
        }
    }
}
