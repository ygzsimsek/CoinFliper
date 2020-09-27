package com.fortinbras.coinfliper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {
    //YOU CAN IGNORE THIS ACTIVITY JUST PROMOTING MYSELF

    Button btn_reddit, btn_ig, btn_telegram, btn_github, btn_twitter,btn_facebook,btn_ytb,btn_src,btn_ttrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setTitle(R.string.app_name);

        btn_ytb = (Button) findViewById(R.id.btn_youtube);
        btn_reddit = (Button) findViewById(R.id.btn_reddit);
        btn_ig = (Button) findViewById(R.id.btn_instagram);
        btn_telegram = (Button) findViewById(R.id.btn_telegram);
        btn_github = (Button) findViewById(R.id.btn_github);
        btn_twitter = (Button) findViewById(R.id.btn_twitter);
        btn_facebook = (Button) findViewById(R.id.btn_facebook);
        btn_src = (Button) findViewById(R.id.btn_src);
        btn_ttrl = (Button) findViewById(R.id.btn_ttrl);
        //onclicklistener
        btn_ytb.setOnClickListener(this);
        btn_ttrl.setOnClickListener(this);
        btn_reddit.setOnClickListener(this);
        btn_ig.setOnClickListener(this);
        btn_telegram.setOnClickListener(this);
        btn_github.setOnClickListener(this);
        btn_twitter.setOnClickListener(this);
        btn_facebook.setOnClickListener(this);
        btn_src.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ttrl:
                String ttr = "https://youtu.be/pJIqKSfX7dE";
                Intent l = new Intent(Intent.ACTION_VIEW);
                l.setData(Uri.parse(ttr));
                startActivity(l);
                break;
            case R.id.btn_youtube:
                String yt = "https://www.youtube.com/channel/UCvYCkonBDI1HFLcB5OdxRgQ";
                Intent y = new Intent(Intent.ACTION_VIEW);
                y.setData(Uri.parse(yt));
                startActivity(y);
                break;
            case R.id.btn_instagram:
                String ig = "https://www.instagram.com/fortinbrasgood/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(ig));
                startActivity(i);
                break;
            case R.id.btn_reddit:
                String rd = "https://www.reddit.com/user/fortinbrasgod/";
                Intent r = new Intent(Intent.ACTION_VIEW);
                r.setData(Uri.parse(rd));
                startActivity(r);
                break;
            case R.id.btn_telegram:
                String tg = "https://t.me/fortinbrasgod/";
                Intent t = new Intent(Intent.ACTION_VIEW);
                t.setData(Uri.parse(tg));
                startActivity(t);
                break;
            case R.id.btn_twitter:
                String tw = "https://twitter.com/fortinbrasgood/";
                Intent w = new Intent(Intent.ACTION_VIEW);
                w.setData(Uri.parse(tw));
                startActivity(w);
                break;
            case R.id.btn_github:
                String gt = "https://github.com/ygzsimsek/";
                Intent g = new Intent(Intent.ACTION_VIEW);
                g.setData(Uri.parse(gt));
                startActivity(g);
                break;
            case R.id.btn_facebook:
                String fb = "https://www.facebook.com/profile.php?id=100015364983025";
                Intent f = new Intent(Intent.ACTION_VIEW);
                f.setData(Uri.parse(fb));
                startActivity(f);
                break;
            case R.id.btn_src:
                String src = "https://github.com/ygzsimsek/CoinFlipper/";
                Intent s = new Intent(Intent.ACTION_VIEW);
                s.setData(Uri.parse(src));
                startActivity(s);
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
