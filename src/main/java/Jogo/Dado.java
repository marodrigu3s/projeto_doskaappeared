/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo;
import java.util.Random;

/**
 *
 * @author felip
 */
public class Dado {
    private int numeroDado;

public int gerarNumero(){
        Random random = new Random();
        numeroDado = random.nextInt((6 - 1) + 1) + 1;
        return numeroDado;
    }

    public int getNumeroDado() {
        return numeroDado;
    }

    public void setNumeroDado(int numeroDado) {
        this.numeroDado = numeroDado;
    }


}

