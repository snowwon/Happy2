package com.example.android.happy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView lightImageView = (ImageView) findViewById(R.id.light_image_view);
        lightImageView.setImageResource(R.drawable.paris);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("매일 여행온 기분으로 사는거야!");
    }
}
