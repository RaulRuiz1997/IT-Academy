package exercici2;

public class Cotxe {

    private static final String MARCA = "Honda";
    private static String model;
    private final int POTENCIA;

    // Demostra la diferència entre els tres.

    // static -> Es una variable de clase y no de objeto. Esto quiere decir que el valor de esta variable se verá reflejada
    // en los diferentes objetos que la compartan
    // final -> Esta variable tiene que tener un valor si o si, o cuando se instancia o cuando se inicializa
    // static final -> Al ser una variable de clase y ser final se compartiran entre todos los objetos y tendrá que tener
    // valor por defecto

    // N’hi ha algun que es pugui inicialitzar al constructor de la classe?

    // Si, solo la POTENCIA se puede inicializar ya que al ser una variable final necesita un valor si o si y si no se le pone
    // en la inicializacion se le tiene que poner en el constructor

    public Cotxe(int POTENCIA) {
        this.POTENCIA = POTENCIA;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public int getPOTENCIA() {
        return POTENCIA;
    }

    public void accelerar() {

        System.out.println("El vehicle està accelerant");

    }

    public static void frenar() {

        System.out.println("El vehicle està frenant");

    }

}
