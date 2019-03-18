package com.example.bassem.salary;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

     EditText n,r,h,d,dv,ns,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         n = findViewById(R.id.txtName);
         r = findViewById(R.id.txtRate);
         h = findViewById(R.id.txtHours);
         d = findViewById(R.id.txtDiscount);
         dv = findViewById(R.id.txtval);
         ns = findViewById(R.id.txtNetSalary);
         s = findViewById(R.id.txtSalary);
        Button calc = findViewById(R.id.btnCalc);


            calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {








                    if (TextUtils.isEmpty(n.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "enter your name", Toast.LENGTH_SHORT).show();

                    }
                    else
                        if (TextUtils.isEmpty(r.getText().toString()))
                        {
                        Toast.makeText(MainActivity.this, "enter your rate", Toast.LENGTH_SHORT).show();

                        }
                        else
                            if (TextUtils.isEmpty(h.getText().toString()))
                            {
                                 Toast.makeText(MainActivity.this, "enter your hours", Toast.LENGTH_SHORT).show();

                            }
                            else
                                if (TextUtils.isEmpty(d.getText().toString()))
                                 {
                                    Toast.makeText(MainActivity.this, "enter your discount", Toast.LENGTH_SHORT).show();
                                 }
                                  else{
                                          salaryCalculation();
                                      }


                }
            });

        }
    void salaryCalculation()
    {
        String name;
        double  rate,percent, salary, netSalary, value;
        int hours;

        name = n.getText().toString();
        rate = Double.parseDouble(r.getText().toString());
        percent = Double.parseDouble(d.getText().toString());
        hours = Integer.parseInt(h.getText().toString());

        salary = hours * rate;
        value = salary * (percent / 100);
        netSalary = salary - value;






        s.setText(String.valueOf(salary));
        dv.setText(String.valueOf(value));
        ns.setText(String.valueOf(netSalary));


    }






}
