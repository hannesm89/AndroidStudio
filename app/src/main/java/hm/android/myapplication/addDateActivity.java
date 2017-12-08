package hm.android.myapplication;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;
import java.util.TimeZone;

public class addDateActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonChooseDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_date);
        buttonChooseDate = (Button) findViewById(R.id.buttonChooseDate);
        buttonChooseDate.setOnClickListener(this);
        Calendar myCalendar = Calendar.getInstance();
        EditText edittext= (EditText) findViewById(R.id.Birthday);

        Bundle b = getIntent().getExtras();
        int terminID = b.getInt("Termin-ID");
    }



    public void onClick(View view) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        DatePickerDialog dialog = new DatePickerDialog(_context, this,
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));
        dialog.show();
    }
}
