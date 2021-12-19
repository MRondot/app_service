package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_service.R;

public class Code_Postal extends AppCompatActivity {

    Bundle bun = new Bundle();
    EditText input;
    Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_postal);
         extras = getIntent().getExtras();
         input =this.findViewById(R.id.edit_codeP);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue:
                String codeP = input.getText().toString();
                if (codeP.length() == 5)  {
                    Intent cEntreprise_intent = new Intent(Code_Postal.this, ChoixEntreprise.class);
                    bun.putString("codeP", codeP);
                    cEntreprise_intent.putExtras(bun);
                    startActivity(cEntreprise_intent);
                }else {
                    Toast.makeText(Code_Postal.this, "Veuillez entrer un code postal à 5 chiffres pour continuer", Toast.LENGTH_SHORT).show();
                }

                break;

        }
    }
}