package com.mesh.onlinemovies;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class RomanticE extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private ImageView honeymoon_img;
    private ImageView favorite_img;
    private ImageView duff_img;
    private ImageView summer_img;
    private ImageView sexy_img;
    private ImageView beauty_img;
    private ImageView surrogate_img;
    private ImageView fire_img;
    private ImageView powerplay_img;
    private ImageView winterweekend_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic_e);


        AdView mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(RomanticE.this);
        // Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
        interstitial.loadAd(adRequest);
        // Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }
            public void displayInterstitial() {
                // If Ads are loaded, show Interstitial else show nothing.
                if (interstitial.isLoaded()) {
                    interstitial.show();
                }

            }
        });


        honeymoon_img = (ImageView)findViewById(R.id.honeymoon) ;
        favorite_img=(ImageView)findViewById(R.id.favorite);
        duff_img = (ImageView)findViewById(R.id.duff) ;
        summer_img = (ImageView)findViewById(R.id.summer) ;
        sexy_img=(ImageView)findViewById(R.id.sexy);
        beauty_img=(ImageView)findViewById(R.id.beauty);
        surrogate_img=(ImageView)findViewById(R.id.surrogate);
        fire_img=(ImageView)findViewById(R.id.fire);
        powerplay_img=(ImageView)findViewById(R.id.powerplay);
        winterweekend_img=(ImageView)findViewById(R.id.winterweekend);

        honeymoon_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.youtube.com/watch?v=GGoPZcc4uUM"));
                startActivity(intent);
            }
        });
        favorite_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.youtube.com/watch?v=nuCjAPV9dTo"));
                startActivity(intent);
            }
        });
        duff_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.youtube.com/watch?v=Rf8PK8FoyTc"));
                startActivity(intent);
            }
        });
        summer_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.youtube.com/watch?v=tAr8bEl9y0c"));
                startActivity(intent);
            }
        });
        sexy_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.youtube.com/watch?v=a4Vb2xbYTxc"));
                startActivity(intent);
            }
        });
        beauty_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=WeOuKguaBec"));
                startActivity(intent);
            }
        });
        surrogate_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=BSlRaC5xzSg"));
                startActivity(intent);
            }
        });
        fire_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=WOJCuMgOxUg"));
                startActivity(intent);
            }
        });
        powerplay_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=paPudy9m7ag"));
                startActivity(intent);
            }
        });
        winterweekend_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=aWOieOiMzyE"));
                startActivity(intent);
            }
        });




    }


        }

