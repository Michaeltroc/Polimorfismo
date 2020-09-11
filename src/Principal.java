public class Principal {
    public static void main(String[] args) {

        Vehiculo vehiculos[] = new Vehiculo[4];

        vehiculos[0] = new Vehiculo("CFD 737", "Toyota", "Sedan");
        vehiculos[1] = new VehiculoDeportivo("CDA 456", "Honda", "Campero", 1500);
        vehiculos[2] = new VehiculoFurgoneta("LLD 123", "Mazda", "familiar", 1000);
        vehiculos[3] = new VehiculoTurismo("HDA 342", "Maserati", "Todoterreno", 4);

        for (Vehiculo misvehiculos : vehiculos) {
            System.out.println(misvehiculos.mostrardatos());
            System.out.println("");
        }
    }
}