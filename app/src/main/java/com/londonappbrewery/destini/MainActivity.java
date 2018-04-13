package com.londonappbrewery.destini;

import android.media.SoundPool;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topButton;
    Button bottomButton;
    TextView storyTextView;
    int storyStage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyStage = 1;
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);
        storyTextView = findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini","Top button clicked");
                if (storyStage==1 || storyStage==2){
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    storyTextView.setText(R.string.T3_Story);
                    storyStage=3;
                }else if (storyStage==3){
                    storyTextView.setText(R.string.T6_End);
                    bottomButton.setVisibility(View.GONE);
                    topButton.setVisibility(View.GONE);
                    storyStage=6;

                }

            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("Destini","Bottom button clicked");
                if (storyStage==1){
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    storyTextView.setText(R.string.T2_Story);
                    storyStage=2;
                }else if (storyStage==2){
                    storyTextView.setText(R.string.T4_End);
                    bottomButton.setVisibility(View.GONE);
                    topButton.setVisibility(View.GONE);
                    storyStage=6;

                }else if (storyStage==3){
                    storyTextView.setText(R.string.T5_End);
                    bottomButton.setVisibility(View.GONE);
                    topButton.setVisibility(View.GONE);
                    storyStage=6;
                }
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
