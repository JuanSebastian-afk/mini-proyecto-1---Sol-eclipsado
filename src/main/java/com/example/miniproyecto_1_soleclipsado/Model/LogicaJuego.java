package com.example.miniproyecto_1_soleclipsado.Model;

/**
 * Clase encargada de las reglas del juego
 * @author Juan Sebastian Valencia Quinchua
 *
 * */

public class LogicaJuego {

    private String palabraSecreta;
    private char letraIngresada;
    private char[] letrasEncontradas;
    private int fallos = 0;

    public void setPalabraSecreta(String palabraSecreta){
        this.palabraSecreta = palabraSecreta;
        letrasEncontradas= new char[palabraSecreta.length()];
    }

    public int getFallos(){ return fallos;}


    public boolean verificaLetra(char letra, int posicion){
        if (palabraSecreta.charAt(posicion) == letra){
            letrasEncontradas[posicion] = letra;
            System.out.println("Letra correcta");
            return true;
        }
        System.out.println("Letra incorrecta");
        fallos++;
        return false;
    }
}
