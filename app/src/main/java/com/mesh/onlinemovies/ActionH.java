package com.mesh.onlinemovies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class ActionH extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private ImageView ek_img;
    private ImageView darna_img;
    private ImageView jakson_img;
    private ImageView mumbai_img;
    private ImageView don_img;
    private ImageView sherka_img;
    private ImageView sivaaji_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_h);
        AdView mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(ActionH.this);
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
        ek_img = (ImageView)findViewById(R.id.ek) ;
        darna_img=(ImageView)findViewById(R.id.darna);
        jakson_img = (ImageView)findViewById(R.id.jakson) ;
        mumbai_img = (ImageView)findViewById(R.id.mumbai) ;
        don_img=(ImageView)findViewById(R.id.don);
        sherka_img=(ImageView)findViewById(R.id.sherka);
        sivaaji_img=(ImageView)findViewById(R.id.sivaji);


        ek_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=jfoG6alzlE8"));
                startActivity(intent);
            }
        });
        darna_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=6ULyVFqfaP4"));
                startActivity(intent);
            }
        });
        jakson_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=yGa2XF0JkRU"));
                startActivity(intent);
            }
        });
        mumbai_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=o3tjRfdYpWU"));
                startActivity(intent);
            }
        });
        don_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=tTQIVw9nmJw"));
                startActivity(intent);
            }
        });
        sherka_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=FE435iFT6jw"));
                startActivity(intent);
            }
        });
        sivaaji_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=NenlQz-FkLY&t=1813s"));
                startActivity(intent);
            }
        });

            }
    }

