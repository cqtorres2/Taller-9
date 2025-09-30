package Animal;

public class Animal {
    String especie;

    public String mostrarEspecie() {
        return "Especie: " + especie;
    }

    public class Pez extends Animal {
        String TipodeAgua;

        public Pez(String especie, String TipodeAgua){
            this.TipodeAgua = TipodeAgua;
            this.especie = especie;
        }

        @Override
        public String mostrarEspecie(){
            super.mostrarEspecie();
            return "Las caracteristicas del pez son las siguientes; Es de la especie " + especie + " Y habita aguas del tipo " + TipodeAgua;
            
        }

        @Override
        public String toString() {
            return mostrarEspecie();
        }

    }
}