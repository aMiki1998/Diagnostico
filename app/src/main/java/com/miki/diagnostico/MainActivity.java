package com.miki.diagnostico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String strReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialCheckBox cbTos = findViewById(R.id.cbTos);
        MaterialCheckBox cbCefalea = findViewById(R.id.cbCefalea);
        MaterialCheckBox cbCongestionNasal = findViewById(R.id.cbCongestionNasal);
        MaterialCheckBox cbDificultadRespiratoria = findViewById(R.id.cbDificultadRespiratoria);
        MaterialCheckBox cbDolorGarganta = findViewById(R.id.cbDolorGarganta);
        MaterialCheckBox cbFiebre = findViewById(R.id.cbFiebre);
        MaterialCheckBox cbDiarrea = findViewById(R.id.cbDiarrea);
        MaterialCheckBox cbNauseas = findViewById(R.id.cbNauseas);
        MaterialCheckBox cbPerdidaOlfato = findViewById(R.id.cbPerdidaOlfato);
        MaterialCheckBox cbDolorAbdominal = findViewById(R.id.cbDolorAbdominal);
        MaterialCheckBox cbDolorArticulaciones = findViewById(R.id.cbDolorArticulaciones);
        MaterialCheckBox cbDolorMuscular = findViewById(R.id.cbDolorMuscular);
        MaterialCheckBox cbDolorPecho = findViewById(R.id.cbDolorPecho);
        EditText etOtroSintoma = findViewById(R.id.etOtroSintoma);
        MaterialButton btEnviarSintomas = findViewById(R.id.btEnviarSintomas);

        Sintomas sintomas = new Sintomas();

        sintomas.setTos(cbTos.isChecked());
        sintomas.setCefalea(cbCefalea.isChecked());
        sintomas.setCongestionNasal(cbCongestionNasal.isChecked());
        sintomas.setDificultadRespiratoria(cbDificultadRespiratoria.isChecked());
        sintomas.setDolorGarganta(cbDolorGarganta.isChecked());
        sintomas.setFiebre(cbFiebre.isChecked());
        sintomas.setDiarrea(cbDiarrea.isChecked());
        sintomas.setNauseas(cbNauseas.isChecked());
        sintomas.setPerdidaOlfato(cbPerdidaOlfato.isChecked());
        sintomas.setDolorAbdominal(cbDolorAbdominal.isChecked());
        sintomas.setDolorArticulaciones(cbDolorArticulaciones.isChecked());
        sintomas.setDolorMuscular(cbDolorMuscular.isChecked());
        sintomas.setDolorPecho(cbDolorPecho.isChecked());
        sintomas.setOtroSintoma(!(etOtroSintoma.getText().toString().trim().length() == 0));

        btEnviarSintomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                enviarSintomas(sintomas);
            }
        });


    }

    private void enviarSintomas(Sintomas sintomas) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api-diagnostico-covid19.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        SintomasAPI sintomasAPI = retrofit.create(SintomasAPI.class);

        Call<Sintomas> call = sintomasAPI.sendSintomas(
                sintomas.isTos(),
                sintomas.isCefalea(),
                sintomas.isCongestionNasal(),
                sintomas.isDificultadRespiratoria(),
                sintomas.isDolorGarganta(),
                sintomas.isFiebre(),
                sintomas.isDiarrea(),
                sintomas.isNauseas(),
                sintomas.isPerdidaOlfato(),
                sintomas.isDolorAbdominal(),
                sintomas.isDolorArticulaciones(),
                sintomas.isDolorMuscular(),
                sintomas.isDolorPecho(),
                sintomas.isOtroSintoma());

        call.enqueue(new Callback<Sintomas>() {
            @Override
            public void onResponse(Call<Sintomas> call, Response<Sintomas> response) {
                try {
                    if (response.isSuccessful()) {
                        strReturn = response.body().toString();
                        Toast.makeText(getApplicationContext(), "El resultado es " + strReturn, Toast.LENGTH_LONG).show();
                    }
                } catch (Exception exception) {
                    Toast.makeText(getApplicationContext(), exception.getMessage(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Sintomas> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error con el servicio", Toast.LENGTH_LONG).show();
            }
        });
    }

}