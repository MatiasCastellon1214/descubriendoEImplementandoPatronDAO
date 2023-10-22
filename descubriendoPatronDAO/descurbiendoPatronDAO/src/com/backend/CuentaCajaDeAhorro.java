package com.backend;

public class CuentaCajaDeAhorro extends Cuenta{
    boolean resultado = false;
    @Override
    public boolean extraer(double monto) {
        if (getSaldo() >= monto){
            setSaldo(getSaldo() - monto);
            resultado = true;
        }
        return resultado;
    }
}
