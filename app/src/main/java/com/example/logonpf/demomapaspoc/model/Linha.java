package com.example.logonpf.demomapaspoc.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Linha implements Parcelable {

    private String cor;
    private String numero;
    private String urlImagem;

    protected Linha(Parcel in) {
        cor = in.readString();
        numero = in.readString();
        urlImagem = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cor);
        dest.writeString(numero);
        dest.writeString(urlImagem);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Linha> CREATOR = new Creator<Linha>() {
        @Override
        public Linha createFromParcel(Parcel in) {
            return new Linha(in);
        }

        @Override
        public Linha[] newArray(int size) {
            return new Linha[size];
        }
    };

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
