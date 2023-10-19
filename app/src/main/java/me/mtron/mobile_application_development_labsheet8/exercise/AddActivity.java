package me.mtron.mobile_application_development_labsheet8.exercise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import me.mtron.mobile_application_development_labsheet8.R;

public class AddActivity extends AppCompatActivity {

    EditText name;
    EditText age;
    EditText address;
    EditText department;
    Button btnAdd;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add2);

        name = (EditText) findViewById(R.id.et1);
        age = (EditText) findViewById(R.id.et2);
        address = (EditText) findViewById(R.id.et3);
        department = (EditText) findViewById(R.id.et4);
        btnAdd = (Button) findViewById(R.id.button4);

        dbHandler = new DBHandler(this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stuName = name.getText().toString();
                String stuAge = age.getText().toString();
                String stuAddress = address.getText().toString();
                String stuDepartment = department.getText().toString();

                Student stu = new Student(stuName, stuAge, stuAddress, stuDepartment);
                dbHandler.addStudent(stu);
                Toast.makeText(getApplicationContext(), "Student Data Inserted Successfully!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}