package com.mesh.onlinemovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class HindiActivity extends AppCompatActivity {
    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private ImageView romantich_img;
    private ImageView comedyh_img;
    private ImageView thrillerh_img;
    private ImageView actionh_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);
        AdView mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(HindiActivity.this);
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
        romantich_img = (ImageView)findViewById(R.id.romantich) ;
        comedyh_img=(ImageView)findViewById(R.id.comedyh);
        thrillerh_img = (ImageView)findViewById(R.id.thrillerh) ;
        actionh_img = (ImageView)findViewById(R.id.actionh) ;

        romantich_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, RomanticH.class);
                startActivity(intent);
            }
        });

        comedyh_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, ComedyH.class);
                startActivity(intent);
            }
        });
        thrillerh_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, ThrillerH.class);
                startActivity(intent);
            }
        });
        actionh_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, ActionH.class);
                startActivity(intent);
            }
        });
    }
}
