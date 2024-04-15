package com.example.myapplication55;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Scanner;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText phone;
    Button button;
    EditText nameEdittext;
    Button nextPage;
    EditText password1;
    EditText password2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);
        button=findViewById(R.id.button);
        nextPage=findViewById(R.id.nextPage);
        nameEdittext=findViewById(R.id.nameEdittext);
        password1=findViewById(R.id.PasswordVerification);
        password2=findViewById(R.id.PasswordVerification2);
        phone=findViewById(R.id.phone);
        password1 = findViewById(R.id.PasswordVerification);
        password2 = findViewById(R.id.PasswordVerification2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (nameEdittext.getText().toString().trim().equals("علی") && phone.getText().toString().trim().equals("123")){
                    // استفاده از تابع trim برای حذف فاصله های اضافی
                    Intent intent=new Intent(getApplicationContext(),MainActivity4.class);

                    startActivity(intent);

                    Toast.makeText(MainActivity3.this, "خوش آمدید", Toast.LENGTH_SHORT).show();

                }
            }

        });
        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String password = password1.getText().toString();
                if (password.trim().matches("[a-zA-Z]+")) {
                    // استفاده از تابع trim برای حذف فاصله های اضافی

                    if (password.length() > 8 ){
                        String phoneNumber = phone.getText().toString();
                        if (phoneNumber.trim().startsWith("09") && phoneNumber.trim().length() == 11 ) {
                            // استفاده از تابع trim برای حذف فاصله های اضافی

                            // اجازه دادن به کاربر برای ورود شماره تلفن

                            String pass1 = password1.getText().toString();
                            String pass2 = password2.getText().toString();

                            if (pass1.equals(pass2)) {
                                // اگر رمزها یکسان بودند
                                // انتقال به صفحه بعدی
                                Toast.makeText(MainActivity3.this, "خوش آمدید", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),MainActivity4.class);
                                startActivity(intent);

                            } else {
                                // اگر رمزها یکسان نبودند
                                // نمایش پیام خطا
                                Toast.makeText(MainActivity3.this, "رمز عبور شما یکسان نیست", Toast.LENGTH_SHORT).show();
                            }
                            if (phoneNumber.trim().length() == 11 ){

                                // استفاده از تابع trim برای حذف فاصله های اضافی

                                // چک میکند که آیا شماره تلفن تعداد ارقام آن 11 است اگر بود به صفحه بعد منتقل شود


                                if (nameEdittext.getText().toString().trim().equals("علی")){

                                    Toast.makeText(MainActivity3.this, "خوش آمدید", Toast.LENGTH_SHORT).show();
                                }

                            }
                            else {
                                Toast.makeText(MainActivity3.this, "تعداد شماره تلفن باید یازده عدد باشد", Toast.LENGTH_SHORT).show();
                            }

                            // اجازه دادن به کاربر برای ورود شماره تلفن
                        } else {
                            // نمایش پیام خطا به کاربر
                            Toast.makeText(MainActivity3.this, "تعداد شماره تلفن باید یازده عدد باشد", Toast.LENGTH_SHORT).show();
                            Toast.makeText(getApplicationContext(), "شماره تلفن باید با صفر شروع شود", Toast.LENGTH_SHORT).show();
                        }
                        // اجازه دادن به کاربر برای ورود رمز

                    }
                    else {
                        // نمایش پیام خطا به کاربر
                        Toast.makeText(MainActivity3.this, "رمز باید بیشتر از 8 کاراکتر باشد", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "رمز باید فقط شامل حروف انگلیسی باشد", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}