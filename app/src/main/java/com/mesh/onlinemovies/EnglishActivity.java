package com.mesh.onlinemovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class EnglishActivity extends AppCompatActivity {
    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private ImageView romantic_img;
    private ImageView comedy_img;
    private ImageView thriller_img;
    private ImageView action_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        AdView mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(EnglishActivity.this);
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
        romantic_img = (ImageView)findViewById(R.id.romantic) ;
        comedy_img=(ImageView)findViewById(R.id.comedy);
        thriller_img = (ImageView)findViewById(R.id.thriller) ;
        action_img = (ImageView)findViewById(R.id.action) ;

        romantic_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, RomanticE.class);
                startActivity(intent);
            }
        });

        comedy_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, ComedyE.class);
                startActivity(intent);
            }
        });
        thriller_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, ThrillerE.class);
                startActivity(intent);
            }
        });
        action_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, ActionE.class);
                startActivity(intent);
            }
        });
    }
}
