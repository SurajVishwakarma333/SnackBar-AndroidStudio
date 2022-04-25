package com.example.snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout parent;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent= findViewById(R.id.parent);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar();
            }
        });
    }
    private void showSnackbar(){
        Snackbar.make(parent,"This is a Snackbar",Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Retry!!!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.RED)   //color of retry button
                .setTextColor(Color.GREEN)
                .show();
    }
}
/*
1. go to chrome and search for material.io website to get inbuild cool widget.
2. in website go to component and select whatever widget you want to use here i am using snackbar.
3. after clicking on snackbar now go to develop->android->documentation->getting started
    follow the steps what had written
4.add button in .xml file and then give id name
5. now go to res->values->themes.xml or Style.xml->
    <style name="Theme.Snackbar" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
    replace this line with this
    <style name="Theme.Snackbar" parent="Theme.MaterialComponents.Light">
 */