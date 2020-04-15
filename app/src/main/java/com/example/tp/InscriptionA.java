package com.example.tp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.tp.database.AppDatabase;
import com.example.tp.entities.User;

public class InscriptionA extends AppCompatActivity {

    private EditText nom , prenom , codep , pass, email;
    private RadioGroup radioGroup;
    private RadioButton sexe;
    private Button valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "chatUqtr").build();

        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        codep = (EditText) findViewById(R.id.codep);
        pass = (EditText) findViewById(R.id.pass);
        email = (EditText) findViewById(R.id.email);
        radioGroup = (RadioGroup) findViewById(R.id.Bgroup);

        int selectedId = radioGroup.getCheckedRadioButtonId();
        sexe = (RadioButton) findViewById(selectedId);

        User user = new User();
        user.setNom(nom.getText().toString());
        user.setPrenom(prenom.getText().toString());
        user.setCodePermanent(codep.getText().toString());
        user.setPass(pass.getText().toString());
        user.setMail(email.getText().toString());
        user.setSexe(sexe.getText().toString());


        valider = (Button) findViewById(R.id.register);

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Toast.makeText(InscriptionA.this,
                            "veuillez remplir tout les champs", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
