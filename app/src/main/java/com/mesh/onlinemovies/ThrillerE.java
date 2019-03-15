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

public class ThrillerE extends AppCompatActivity {
    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private ImageView oija_img;
    private ImageView motel_img;
    private ImageView charms_img;
    private ImageView revenge_img;
    private ImageView quite_img;
    private ImageView forest_img;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thriller_e);

        AdView mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(ThrillerE.this);
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


        oija_img = (ImageView)findViewById(R.id.oija) ;
        motel_img=(ImageView)findViewById(R.id.motel);
        charms_img = (ImageView)findViewById(R.id.charms) ;
        revenge_img = (ImageView)findViewById(R.id.revenge) ;
        quite_img=(ImageView)findViewById(R.id.quite);
        forest_img=(ImageView)findViewById(R.id.forest);


        oija_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=-bhR6ShjLkU"));
                startActivity(intent);
            }
        });
        motel_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=US1Fs6SJjd4"));
                startActivity(intent);
            }
        });
        charms_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=PtmcnVHxOkw"));
                startActivity(intent);
            }
        });
        revenge_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=1R6kxZocJ_0"));
                startActivity(intent);
            }
        });
        quite_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=8rkx-K4JyW8"));
                startActivity(intent);
            }
        });
        forest_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=61ohQyJND3s"));
                startActivity(intent);
            }
        });


    }

}
