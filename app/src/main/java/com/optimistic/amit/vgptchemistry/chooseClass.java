package com.optimistic.amit.vgptchemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class chooseClass extends AppCompatActivity {
    LinearLayout eleventheory,twelvetheory;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_class);
        eleventheory=findViewById(R.id.eleven);
        twelvetheory=findViewById(R.id.twelve);
        eleventheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(),"eleven",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),elevenListTheory.class);
                startActivity(intent);

            }
        });
        twelvetheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"twelve",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),twelveListTheory.class);
                startActivity(intent);
            }
        });
        button=findViewById(R.id.aboutus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AboutUs.class);
                startActivity(intent);
            }
        });
    }
}
