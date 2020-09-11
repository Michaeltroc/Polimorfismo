public class VehiculoFurgoneta extends Vehiculo{

    private int carga;


    public VehiculoFurgoneta(String matricula, String marca, String modelo,int carga) {
        super(matricula, marca, modelo);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrardatos() {
        return super.mostrardatos()+"\nCarga: "+carga;
    }
}
