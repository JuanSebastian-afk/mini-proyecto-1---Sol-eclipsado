package com.example.miniproyecto_1_soleclipsado.Model;

import java.text.Normalizer; //Para quitar acentos
import java.util.regex.Pattern;

public class PalabraSecreta {

    public String palabraSecreta;


    public PalabraSecreta(String palabraSecreta){
        this.palabraSecreta = palabraSecreta;
    }

    public int getCantidadLetras(){ return palabraSecreta.length();}

    public String getPalabraSecreta() {return palabraSecreta;}

    public boolean palabraValida(){
        if(palabraSecreta.length()>=6 && palabraSecreta.length()<=12) return true;
        else if(palabraSecreta.matches("\\p{L}+")) return false;
        else return false;
    }

    public void quitarAcentos(){
        String normalizer = Normalizer.normalize(palabraSecreta, Normalizer.Form.NFD);

        Pattern pattern = Pattern.compile("\\p{InCOMBINING_DIACRITICAL_MARKS}+");

        palabraSecreta = pattern.matcher(normalizer).replaceAll("");
    }

    public void pasarAMinusculas(){ palabraSecreta = palabraSecreta.toLowerCase();}

}
