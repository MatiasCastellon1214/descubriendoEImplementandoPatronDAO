package com.backend;

public class EstrategiaCuentaCorriente implements EstrategiaDeExtraccion{
    @Override
    public boolean extraer(Cuenta cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() - monto);
        return true;
    }
}
