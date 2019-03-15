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

public class RomanticH extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private ImageView apne_img;
    private ImageView machine_img;
    private ImageView milenge_img;
    private ImageView tum_img;
    private ImageView ashiq_img;
    private ImageView shaandaar_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic_h);

        AdView mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(RomanticH.this);
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

        apne_img = (ImageView)findViewById(R.id.apne) ;
        machine_img=(ImageView)findViewById(R.id.machine);
        milenge_img = (ImageView)findViewById(R.id.milenge) ;
        tum_img = (ImageView)findViewById(R.id.tum) ;
        ashiq_img=(ImageView)findViewById(R.id.ashiq);
        shaandaar_img=(ImageView)findViewById(R.id.shaandaar);


        apne_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=kJ3kBiu7dQo"));
                startActivity(intent);
            }
        });
        machine_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=AmSOEs2A5dE"));
                startActivity(intent);
            }
        });
        milenge_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=yQR4wD6Jiuk"));
                startActivity(intent);
            }
        });
        tum_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=_hmMa8vZBPQ"));
                startActivity(intent);
            }
        });
        ashiq_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=C9zZy1S-b2s"));
                startActivity(intent);
            }
        });
        shaandaar_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=i53drAVudLs"));
                startActivity(intent);
            }
        });


    }

}