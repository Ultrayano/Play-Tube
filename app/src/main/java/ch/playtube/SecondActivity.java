package ch.playtube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editInput;
    Button home_page;
    Button second_page;
    Button third_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editInput = (EditText) findViewById(R.id.edit_input);


        //Find your views
        home_page = (Button) findViewById(R.id.home_page);

        //Assign a listener to your button
        home_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(ch.playtube.SecondActivity.this, ch.playtube.MainActivity.class);
                startActivity(intent);
            }
        });


        //Find your views
        second_page = (Button) findViewById(R.id.second_page);

        //Assign a listener to your button
        second_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(ch.playtube.SecondActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        //Find your views
        third_page = (Button) findViewById(R.id.third_page);

        //Assign a listener to your button
        third_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(ch.playtube.SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }


}
