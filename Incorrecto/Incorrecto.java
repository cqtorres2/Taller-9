package Incorrecto;

public class Incorrecto {
    public String error = "X";

    public Incorrecto(){
        super.error();
    }

    public class cambio extends Incorrecto {
        super.error();

    }
}
