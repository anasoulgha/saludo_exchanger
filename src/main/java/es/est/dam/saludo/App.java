package es.est.dam.saludo;

import java.util.concurrent.Exchanger;

public class App {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread hilo1 = new Thread(new Saludo(exchanger));
        Thread hilo2 = new Thread(new Saludo(exchanger));

        hilo1.start();
        hilo2.start();


}
}