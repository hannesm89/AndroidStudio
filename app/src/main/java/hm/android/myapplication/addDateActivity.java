package hm.android.myapplication;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class addDateActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextDate;
    private DatePickerDialog datePickerDialog;

    private SimpleDateFormat dateFormatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_date);

        editTextDate= (EditText) findViewById(R.id.editTextDate);
        editTextDate.setInputType(InputType.TYPE_NULL);

        dateFormatter = new SimpleDateFormat("dd.MM.yyyy");

        editTextDate.setOnClickListener(this);

        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                editTextDate.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        Bundle b = getIntent().getExtras();
        int terminID = b.getInt("Termin-ID");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.editTextDate:
            datePickerDialog.show();
        }
    }
}
