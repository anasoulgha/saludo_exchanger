package es.est.dam.saludo;

import java.util.concurrent.Exchanger;

public class Saludo implements Runnable {
    private static final String SALUDO = "Hola";
    private static final String DESPEDIDA = "Adios";

    private Exchanger<String> exchanger;
    String mensaje;

    public Saludo(Exchanger<String> exchanger) {
        this.exchanger = exchanger;

    }

    public void run() {
        try {
            mensaje = exchanger.exchange(SALUDO);
            System.out.println(mensaje);
            System.out.println(DESPEDIDA);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
