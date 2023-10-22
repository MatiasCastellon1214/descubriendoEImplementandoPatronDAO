import com.backend.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Vinculación dinámica
        Cuenta cuenta = new CuentaCajaDeAhorro();

        cuenta.setSaldo(1000);

        // Polimorfismo
        cuenta.extraer(1100);

        Cuenta cuenta2 = new CuentaCorriente();
        cuenta2.setSaldo(cuenta.getSaldo());
        cuenta = cuenta2;

        cuenta.extraer(1100);
        System.out.println(cuenta.getSaldo());


        Cuenta cuenta3 = new Cuenta();
        cuenta3.setSaldo(2000);
        cuenta3.setNumero(1101);
        cuenta3.setEstrategia(new EstrategiaCajaDeAhorro());

        cuenta3.extraer(2100);

        cuenta3.setEstrategia(new EstrategiaCuentaCorriente());
        cuenta3.extraer(2100);
        System.out.println(cuenta3.getSaldo());


    }
}