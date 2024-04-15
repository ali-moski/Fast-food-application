package com.example.myapplication55;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    EditText phone;
    Button button;
    EditText nameEdittext;
    Button nextPage;
    EditText userassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.button);
        nextPage=findViewById(R.id.nextPage);
        nameEdittext=findViewById(R.id.nameEdittext);
        userassword=findViewById(R.id.PasswordVerification);
        phone=findViewById(R.id.phone);
        button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {

            if (userassword.getText().toString().equals("test") && phone.getText().toString().equals("123")){
                Intent intent=new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(intent);
            }

            else {
                Toast.makeText(MainActivity2.this, "رمز و شماره تلفن نادرست میباشد", Toast.LENGTH_SHORT).show();

            }
        }

    });
        nextPage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(intent);
        }

    });

    }

}