package com.miki.diagnostico.data;

import com.google.gson.annotations.SerializedName;

/*
{
"tos": true,
"cefalea": true,
"congestion_nasal": true,
"dificultad_respiratoria": true,
"dolor_garganta": true,
"fiebre": true,
"diarrea": true,
"nauseas": true,
"anosmia_hiposmia": true,
"dolor_abdominal": true,
"dolor_articulaciones": true,
"dolor_muscular": true,
"dolor_pecho": true,
"otros_sintomas": true
}
 */
public class Sintomas {

    private boolean tos;
    private boolean cefalea;
    @SerializedName("congestion_nasal")
    private boolean congestionNasal;
    @SerializedName("dificultad_respiratoria")
    private boolean dificultadRespiratoria;
    @SerializedName("dolor_garganta")
    private boolean dolorGarganta;
    private boolean fiebre;
    private boolean diarrea;
    private boolean nauseas;
    private boolean perdidaOlfato;
    @SerializedName("dolor_abdominal")
    private boolean dolorAbdominal;
    @SerializedName("dolor_articulaciones")
    private boolean dolorArticulaciones;
    @SerializedName("dolor_muscular")
    private boolean dolorMuscular;
    @SerializedName("dolor_pecho")
    private boolean dolorPecho;
    @SerializedName("otros_sintomas")
    private boolean otroSintoma;
    @SerializedName("anosmia_hiposmia")
    private boolean anosmiaHipsomia = false;

    public Sintomas(boolean tos, boolean cefalea, boolean congestionNasal, boolean dificultadRespiratoria, boolean dolorGarganta, boolean fiebre, boolean diarrea, boolean nauseas, boolean perdidaOlfato, boolean dolorAbdominal, boolean dolorArticulaciones, boolean dolorMuscular, boolean dolorPecho, boolean otroSintoma) {
        this.tos = tos;
        this.cefalea = cefalea;
        this.congestionNasal = congestionNasal;
        this.dificultadRespiratoria = dificultadRespiratoria;
        this.dolorGarganta = dolorGarganta;
        this.fiebre = fiebre;
        this.diarrea = diarrea;
        this.nauseas = nauseas;
        this.perdidaOlfato = perdidaOlfato;
        this.dolorAbdominal = dolorAbdominal;
        this.dolorArticulaciones = dolorArticulaciones;
        this.dolorMuscular = dolorMuscular;
        this.dolorPecho = dolorPecho;
        this.otroSintoma = otroSintoma;
    }

    public Sintomas() {
    }

    public boolean isTos() {
        return tos;
    }

    public void setTos(boolean tos) {
        this.tos = tos;
    }

    public boolean isCefalea() {
        return cefalea;
    }

    public void setCefalea(boolean cefalea) {
        this.cefalea = cefalea;
    }

    public boolean isCongestionNasal() {
        return congestionNasal;
    }

    public void setCongestionNasal(boolean congestionNasal) {
        this.congestionNasal = congestionNasal;
    }

    public boolean isDificultadRespiratoria() {
        return dificultadRespiratoria;
    }

    public void setDificultadRespiratoria(boolean dificultadRespiratoria) {
        this.dificultadRespiratoria = dificultadRespiratoria;
    }

    public boolean isDolorGarganta() {
        return dolorGarganta;
    }

    public void setDolorGarganta(boolean dolorGarganta) {
        this.dolorGarganta = dolorGarganta;
    }

    public boolean isFiebre() {
        return fiebre;
    }

    public void setFiebre(boolean fiebre) {
        this.fiebre = fiebre;
    }

    public boolean isDiarrea() {
        return diarrea;
    }

    public void setDiarrea(boolean diarrea) {
        this.diarrea = diarrea;
    }

    public boolean isNauseas() {
        return nauseas;
    }

    public void setNauseas(boolean nauseas) {
        this.nauseas = nauseas;
    }

    public boolean isPerdidaOlfato() {
        return perdidaOlfato;
    }

    public void setPerdidaOlfato(boolean perdidaOlfato) {
        this.perdidaOlfato = perdidaOlfato;
    }

    public boolean isDolorAbdominal() {
        return dolorAbdominal;
    }

    public void setDolorAbdominal(boolean dolorAbdominal) {
        this.dolorAbdominal = dolorAbdominal;
    }

    public boolean isDolorArticulaciones() {
        return dolorArticulaciones;
    }

    public void setDolorArticulaciones(boolean dolorArticulaciones) {
        this.dolorArticulaciones = dolorArticulaciones;
    }

    public boolean isDolorMuscular() {
        return dolorMuscular;
    }

    public void setDolorMuscular(boolean dolorMuscular) {
        this.dolorMuscular = dolorMuscular;
    }

    public boolean isDolorPecho() {
        return dolorPecho;
    }

    public void setDolorPecho(boolean dolorPecho) {
        this.dolorPecho = dolorPecho;
    }

    public boolean isOtroSintoma() {
        return otroSintoma;
    }

    public void setOtroSintoma(boolean otroSintoma) {
        this.otroSintoma = otroSintoma;
    }

    public boolean isAnosmiaHipsomia() {
        return anosmiaHipsomia;
    }

    public void setAnosmiaHipsomia(boolean anosmiaHipsomia) {
        this.anosmiaHipsomia = anosmiaHipsomia;
    }
}
