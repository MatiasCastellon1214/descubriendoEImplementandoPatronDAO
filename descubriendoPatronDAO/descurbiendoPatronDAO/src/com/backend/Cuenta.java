package com.backend;

public class Cuenta {
    private int numero;
    private double saldo;

    public void setEstrategia(EstrategiaDeExtraccion estrategia) {
        this.estrategia = estrategia;
    }

    private EstrategiaDeExtraccion estrategia;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean extraer(double monto){
        return estrategia.extraer(this, monto);
    }


}
