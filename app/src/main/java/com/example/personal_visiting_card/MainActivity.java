package com.example.personal_visiting_card;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView emailIcon, whatsappIcon, facebookIcon, githubIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailIcon = findViewById(R.id.emailIcon);
        whatsappIcon = findViewById(R.id.whatsappIcon);
        facebookIcon = findViewById(R.id.facebookIcon);
        githubIcon = findViewById(R.id.githubIcon);


        // Email intent
        emailIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:nahian.stu218@juniv.edu"));
                startActivity(Intent.createChooser(emailIntent, "Send Email"));
            }
        });

        // WhatsApp intent
        whatsappIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsappIntent = new Intent(Intent.ACTION_VIEW);
                whatsappIntent.setData(Uri.parse("https://wa.me/+8801521581789"));
                startActivity(whatsappIntent);
            }
        });

        // Facebook intent
        facebookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/saud.alnahian/"));
                startActivity(facebookIntent);
            }
        });
        // Set up an implicit intent for GitHub link
        githubIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace this URL with your GitHub profile URL
                String githubUrl = "https://github.com/nhoc34n";

                // Create an implicit intent to open the GitHub URL
                Intent githubIntent = new Intent(Intent.ACTION_VIEW);
                githubIntent.setData(Uri.parse(githubUrl));
                startActivity(githubIntent);
            }
        });

    }
}
