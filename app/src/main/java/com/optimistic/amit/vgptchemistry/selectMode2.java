package com.optimistic.amit.vgptchemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class selectMode2 extends AppCompatActivity {
    TextView theory,exercise,solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode2);
        Bundle data=getIntent().getExtras();
        if(data!=null) {


            final int getdata = data.getInt("message");
            //  Toast.makeText(getApplicationContext(), "" + getdata, Toast.LENGTH_SHORT).show();


            theory = findViewById(R.id.Theory);
            exercise = findViewById(R.id.exercise);
            solution=findViewById(R.id.solution);
            theory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int ele=1;
                    Intent intent = new Intent(selectMode2.this, docviewer2.class);
                    Bundle extras = new Bundle();
                    extras.putInt("datafromchapter",getdata);
                    extras.putInt("binary",ele);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
            });
            exercise.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int twe=2;
                    Intent intent = new Intent(selectMode2.this, docviewer2.class);
                    Bundle extras = new Bundle();
                    extras.putInt("datafromchapter",getdata);
                    extras.putInt("binary",twe);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
            });
            solution.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int three=3;
                    Intent intent = new Intent(selectMode2.this, docviewer2.class);
                    Bundle extras = new Bundle();
                    extras.putInt("datafromchapter",getdata);
                    extras.putInt("binary",three);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
            });

        }

    }
}
