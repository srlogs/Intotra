package com.example.intotra;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity
{

    TextView intotra;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        intotra = findViewById(R.id.splash_name);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        intotra.startAnimation(myanim);
        final Intent i = new Intent(splash.this,home.class);
        Thread timer =new Thread()
        {
            public void run()
            {
                try {
                    sleep(2000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);

                }
            }

        };
        timer.start();

    }
}
