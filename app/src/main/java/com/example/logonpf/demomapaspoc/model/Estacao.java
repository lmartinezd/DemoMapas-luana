package com.example.logonpf.demomapaspoc.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by logonrm on 28/06/2017.
 */

public class Estacao implements Parcelable {
     public String nome;
     public String endereco;
     public String latitude;
     public String longitude;
     public String capacidade_passageiro_hora_pico;
     public String area_construida_m_2;
     public String inauguracao;
     public String urlImagem;

    protected Estacao(Parcel in) {
        nome = in.readString();
        endereco = in.readString();
        latitude = in.readString();
        longitude = in.readString();
        capacidade_passageiro_hora_pico = in.readString();
        area_construida_m_2 = in.readString();
        inauguracao = in.readString();
        urlImagem = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(endereco);
        dest.writeString(latitude);
        dest.writeString(longitude);
        dest.writeString(capacidade_passageiro_hora_pico);
        dest.writeString(area_construida_m_2);
        dest.writeString(inauguracao);
        dest.writeString(urlImagem);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Estacao> CREATOR = new Creator<Estacao>() {
        @Override
        public Estacao createFromParcel(Parcel in) {
            return new Estacao(in);
        }

        @Override
        public Estacao[] newArray(int size) {
            return new Estacao[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCapacidade_passageiro_hora_pico() {
        return capacidade_passageiro_hora_pico;
    }

    public void setCapacidade_passageiro_hora_pico(String capacidade_passageiro_hora_pico) {
        this.capacidade_passageiro_hora_pico = capacidade_passageiro_hora_pico;
    }

    public String getArea_construida_m_2() {
        return area_construida_m_2;
    }

    public void setArea_construida_m_2(String area_construida_m_2) {
        this.area_construida_m_2 = area_construida_m_2;
    }

    public String getInauguracao() {
        return inauguracao;
    }

    public void setInauguracao(String inauguracao) {
        this.inauguracao = inauguracao;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
