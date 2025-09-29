package Animal;

public class Animal {
    String especie;

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }

    public class Pez extends Animal {
        String TipodeAgua;

        @Override
        public void mostrarEspecie(){
            super.mostrarEspecie();
            System.out.println("Las caracteristicas del pez son las siguientes; Es de la especie " + especie + " Y habita aguas del tipo " + TipodeAgua);
        }

    }
}