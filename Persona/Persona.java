package Persona;

public class Persona {
    String nombre;
    int edad;

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre
                + " con una edad de " + edad + " años actualmente bajo contrato");
    }

    public class Empleado extends Persona {
        String departamento;

        @Override
        public void mostrarDetalles(){
            super.mostrarDetalles();
            System.out.println("Nombre: " + nombre + " edad del empleado: " + edad + " actualmente de serivicio en " + departamento);
        }

    }
}
