package org.example;

import exercici1.Corda;
import exercici1.Instrument;
import exercici1.Percussio;
import exercici1.Vent;
import exercici2.Cotxe;

public class Main {

    public static void main(String[] args) {

        // Exercici 1 --------------------------------------------------------------------------------------------------
        Instrument instrumentVent = new Vent("Flauta", 5.0);
        Instrument instrumentCorda = new Corda("Violin", 229.99);
        Instrument instrumentPercussio = new Percussio("Tambor", 24.99);

        // Llamamos a los métodos tocar() de cada instrumento
        instrumentVent.tocar();
        instrumentCorda.tocar();
        instrumentPercussio.tocar();

        // Exercici 2 --------------------------------------------------------------------------------------------------
        Cotxe cotxe = new Cotxe(200);

        // Llamamos a los métodos accelerar() y frenar()
        cotxe.accelerar();

        // Para llamar al método frenar() (que es estático) tenemos 2 posibilidades:
        // Si el método que estamos trabajando (en este caso main()) es estático, puede llamar a ese método o llamando
        // a la clase en sí 'Cotxe' sin instanciar el objeto y llamar a su método estático
        cotxe.frenar();

        Cotxe.frenar();

        // Exercici 3 --------------------------------------------------------------------------------------------------

        // VIDEO FET

    }

}