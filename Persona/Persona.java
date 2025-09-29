package Persona;

public class Persona {
    String nombre;
    int edad;

    public String mostrarDetalles() {
        System.out.println("Nombre: " + nombre
                + " con una edad de " + edad + " años actualmente bajo contrato");
        return nombre;
    }

    public class Empleado extends Persona {
        String departamento;

        public Empleado(String departamento, int edad, String nombre){
            this.nombre = nombre;
            this.edad = edad;
            this.departamento = departamento;
        }

        @Override
        public String mostrarDetalles(){
            super.mostrarDetalles();
             return "Nombre: " + nombre + " edad del empleado: " + edad + " actualmente de serivicio en " + departamento;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + " edad del empleado: " + edad + " actualmente de serivicio en " + departamento;
        }

    }
}
