package com.backend;

public class EstrategiaCajaDeAhorro implements EstrategiaDeExtraccion{
    boolean resultado = false;
    @Override
    public boolean extraer(Cuenta cuenta, double monto) {
        if(cuenta.getSaldo() >= monto){
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            resultado = true;
        }
        return resultado;
    }
}
