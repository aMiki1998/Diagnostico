package com.miki.diagnostico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.miki.diagnostico.data.RemoteService;
import com.miki.diagnostico.data.Sintomas;
import com.miki.diagnostico.data.SintomasAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RemoteService remoteService = new RemoteService();
    private SintomasAPI sintomasAPI = remoteService.getRetrofit().create(SintomasAPI.class);
    String strReturn;

    private MaterialCheckBox cbTos;
    private MaterialCheckBox cbCefalea;
    private MaterialCheckBox cbCongestionNasal;
    private MaterialCheckBox cbDificultadRespiratoria;
    private MaterialCheckBox cbDolorGarganta;
    private MaterialCheckBox cbFiebre;
    private MaterialCheckBox cbDiarrea;
    private MaterialCheckBox cbNauseas;
    private MaterialCheckBox cbPerdidaOlfato;
    private MaterialCheckBox cbDolorAbdominal;
    private MaterialCheckBox cbDolorArticulaciones;
    private  MaterialCheckBox cbDolorMuscular;
    private MaterialCheckBox cbDolorPecho;
    private EditText etOtroSintoma;
    private MaterialButton btEnviarSintomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbTos= findViewById(R.id.cbTos);
        cbCefalea = findViewById(R.id.cbCefalea);
        cbCongestionNasal = findViewById(R.id.cbCongestionNasal);
        cbDificultadRespiratoria = findViewById(R.id.cbDificultadRespiratoria);
        cbDolorGarganta = findViewById(R.id.cbDolorGarganta);
        cbFiebre = findViewById(R.id.cbFiebre);
        cbDiarrea = findViewById(R.id.cbDiarrea);
        cbNauseas = findViewById(R.id.cbNauseas);
        cbPerdidaOlfato = findViewById(R.id.cbPerdidaOlfato);
        cbDolorAbdominal = findViewById(R.id.cbDolorAbdominal);
        cbDolorArticulaciones = findViewById(R.id.cbDolorArticulaciones);
        cbDolorMuscular = findViewById(R.id.cbDolorMuscular);
        cbDolorPecho = findViewById(R.id.cbDolorPecho);
        etOtroSintoma = findViewById(R.id.etOtroSintoma);
        btEnviarSintomas = findViewById(R.id.btEnviarSintomas);

        btEnviarSintomas.setOnClickListener(view -> {
            Log.v("CONSOLE", "enviarSintomas");
            //enviarSintomas(sintomas);
            sendSymptoms();
        });


    }

    private void sendSymptoms() {
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


        Call<Object> call = sintomasAPI.processSymptoms(sintomas);

        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                try {
                    if (response.isSuccessful()) {
                        strReturn = response.body().toString();
                        Log.v("CONSOLE","El resultado es " + strReturn);
                    }
                } catch (Exception exception) {
                    Log.v("CONSOLE","error" + exception.getMessage());
                }
            }

            @Override
            public void onFailure(Call<Object> call, Throwable throwable) {
                Log.v("CONSOLE","Error con el servicio" + throwable.getMessage());
            }
        });
    }

    private void enviarSintomas(Sintomas sintomas) {

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
                        Log.v("CONSOLE","El resultado es " + strReturn);
                    }
                } catch (Exception exception) {
                    Log.v("CONSOLE","error" + exception.getMessage());
                }
            }

            @Override
            public void onFailure(Call<Sintomas> call, Throwable throwable) {
                Log.v("CONSOLE","Error con el servicio" + throwable.getMessage());
            }
        });
    }

}