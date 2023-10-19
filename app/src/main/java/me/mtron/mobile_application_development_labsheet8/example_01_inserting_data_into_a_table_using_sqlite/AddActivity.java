package me.mtron.mobile_application_development_labsheet8.example_01_inserting_data_into_a_table_using_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.mtron.mobile_application_development_labsheet8.R;

public class AddActivity extends AppCompatActivity {

    EditText name;
    EditText dept;
    EditText salary;
    Button btnAdd;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        name = (EditText) findViewById(R.id.et1);
        dept = (EditText) findViewById(R.id.et2);
        salary = (EditText) findViewById(R.id.et3);
        btnAdd = (Button) findViewById(R.id.button4);

        dbHandler = new DBHandler(this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String empName = name.getText().toString();
                String empDept = dept.getText().toString();
                String empSalary = salary.getText().toString();

                Employee emp = new Employee(empName, empDept, empSalary);
                dbHandler.addEmployee(emp);
                Toast.makeText(getApplicationContext(), "Data Inserted Successfully!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}