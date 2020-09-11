public class VehiculoDeportivo extends Vehiculo {

    private int cilindraje;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindraje) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    @Override
    public String mostrardatos() {
        return super.mostrardatos()+"\nCilindraje: "+cilindraje;
    }
}
