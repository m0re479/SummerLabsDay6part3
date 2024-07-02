package ru.app.projectday6summerlabs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextId, editTextName, editTextSoc_sec, editTextSalary;
    String idStr, nameStr, soc_secStr, salaryStr;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button buttonAdd = findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewNewEmployee();
            }
        });
    }

    private void viewNewEmployee() {
        editTextId = findViewById(R.id.editTextId);
        idStr = editTextId.getText().toString();

        editTextName = findViewById(R.id.editTextName);
        nameStr = editTextName.getText().toString();

        editTextSoc_sec = findViewById(R.id.editTextSoc_sec);
        soc_secStr = editTextSoc_sec.getText().toString();

        editTextSalary = findViewById(R.id.editTextSalary);
        salaryStr = editTextSalary.getText().toString();

        result = findViewById(R.id.textViewResult);

        if (idStr.isEmpty() || nameStr.isEmpty() || soc_secStr.isEmpty() || salaryStr.isEmpty()) {
            Toast.makeText(this, "Пожалуйста, введите все необходимые данные", Toast.LENGTH_SHORT).show();
        }
        else {
            int id = Integer.parseInt(idStr);
            double salary = Double.parseDouble(salaryStr);
            result.setText("Employee ID: " + id + "\nEmployee Name: " + nameStr + "\nEmployee Soc Sec #" + soc_secStr + "\nEmployee salary: " + salary);
        }
    }
}