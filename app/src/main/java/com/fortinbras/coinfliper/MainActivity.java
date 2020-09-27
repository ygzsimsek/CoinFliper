package com.fortinbras.coinfliper;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //DEFINE VIEWS
        final TextView txt =(TextView)findViewById(R.id.text);
        final ImageButton imgBtn =(ImageButton)findViewById(R.id.imgBtn);
        //SET ONCLICK LISTENER
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //BOUNCE ANIMATION
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.bounce);
                //GENERATE A RANDOM NUMBER (a)
                Random random = new Random();
                int a = random.nextInt(2);
                /*BASIC IF ELSE STATEMENT
                * IF GENERATED NUMBER(a) IS 1 TAILS
                * IF GENERATED NUMBER(a) IS 2 HEADS
                * SET IMAGE BUTTON DRAWABLE AND TEXT
                * PLAY ANIMATION */
                if(a==1){
                    imgBtn.setImageDrawable(getResources().getDrawable(R.drawable.tails));
                    imgBtn.startAnimation(animation);
                    txt.setText(R.string.tails);
                }else{
                    imgBtn.setImageDrawable(getResources().getDrawable(R.drawable.heads));
                    imgBtn.startAnimation(animation);
                    txt.setText(R.string.heads);
                }
            }
        });
    }

    //MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_info) {
            //LAUNCH INFO ACTIVITY
            Intent info = new Intent(this, AboutActivity.class);
            startActivity(info);
        }
        return super.onOptionsItemSelected(item);
    }
}
