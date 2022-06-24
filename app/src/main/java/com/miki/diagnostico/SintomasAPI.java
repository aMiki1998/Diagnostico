package com.miki.diagnostico;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SintomasAPI {

    @FormUrlEncoded
    @POST("Diagnostico")
    public Call<Sintomas> sendSintomas(
            @Field("tos") boolean tos,
            @Field("cefalea") boolean cefalea,
            @Field("congestion_nasal") boolean congestion_nasal,
            @Field("dificultad_respiratoria") boolean dificultad_respiratoria,
            @Field("dolor_garganta") boolean dolor_garganta,
            @Field("fiebre") boolean fiebre,
            @Field("diarrea") boolean diarrea,
            @Field("nauseas") boolean nauseas,
            @Field("anosmia_hiposmia") boolean anosmia_hiposmia,
            @Field("dolor_abdominal") boolean dolor_abdominal,
            @Field("dolor_articulaciones") boolean dolor_articulaciones,
            @Field("dolor_muscular") boolean dolor_muscular,
            @Field("dolor_pecho") boolean dolor_pecho,
            @Field("otros_sintomas") boolean otros_sintomas
            );

}
