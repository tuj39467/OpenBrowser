package edu.temple.openbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Open a Browser");
        }
        Button button = new Button(this);
        button.setText("Click Here to open Temple's website!");
        final Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        Uri uri = Uri.parse("https://www.temple.edu");
        sendIntent.putExtra(Intent.EXTRA_TEXT,uri.toString());
        sendIntent.setType("text/plain");
       // final Intent shareIntent = Intent.createChooser(sendIntent,null);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.temple.edu")));
                startActivity(sendIntent);
            }
        });
        setContentView(button);


    }
}