import Animal.Animal;
import Persona.Persona;

public class Main {
    public static void main(String[] args) {

        Animal anima = new Animal();
        Persona perso = new Persona();
        Persona.Empleado per1 = perso.new Empleado("Bolivar", 23, "Miguel");
        Animal.Pez ani1 = anima.new Pez("Bagre", "Salada");

        System.out.println(ani1);
        System.out.println(per1);
    }
}
