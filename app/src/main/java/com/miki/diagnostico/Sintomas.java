package com.miki.diagnostico;

public class Sintomas {

    private boolean tos;
    private boolean cefalea;
    private boolean congestionNasal;
    private boolean dificultadRespiratoria;
    private boolean dolorGarganta;
    private boolean fiebre;
    private boolean diarrea;
    private boolean nauseas;
    private boolean perdidaOlfato;
    private boolean dolorAbdominal;
    private boolean dolorArticulaciones;
    private boolean dolorMuscular;
    private boolean dolorPecho;
    private boolean otroSintoma;

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
}
