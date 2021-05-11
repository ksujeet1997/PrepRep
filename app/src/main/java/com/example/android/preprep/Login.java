package com.example.android.preprep;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    Button signUp, signIn;
    ImageView image;
    TextView phrase, slang;
    TextInputLayout username, password;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_login);

        signUp = findViewById(R.id.sign_up);
        image = findViewById(R.id.signup_logo);
        phrase = findViewById(R.id.signup_phone);
        slang = findViewById(R.id.signup_slang1);
        username = findViewById(R.id.login_username);
        password = findViewById(R.id.login_password);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registration.class);

                Pair[] pairs = new Pair[2];
                //pairs[0] = new Pair<View, String>(image, "logo_trans");
                //pairs[1] = new Pair<View, String>(phrase, "slang1_trans");

                pairs[0] = new Pair<View, String>(username, "user_trans");
                pairs[1] = new Pair<View, String>(password, "pass_trans");
                //pairs[2] = new Pair<View, String>(slang, "slang_trans");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this, pairs);
                startActivity(intent, options.toBundle());
                finish();
            }
        });



        signIn = findViewById(R.id.sign_in);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MenuPage.class);
                startActivity(intent);
            }
        });



    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }
}