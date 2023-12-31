package entidades;

public class Hotel5Estrellas extends Hotel4Estrellas {

    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(String tipoGimnasio, int cantSalonesConferencia, int cantSuites, int cantLimosinas, String nombreRestaurante,
            int capacidadRestaurante, int cantHabitaciones, int numCamas, int cantPisos, int precioHabitacion,
            String nombre, String direccion, String localidad, String gerente) {
        super(tipoGimnasio, nombreRestaurante, capacidadRestaurante,
                cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
//        this.precioHabitacion = getPrecio();
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCuenta con " + cantSalonesConferencia + " salones de conferencia"
                + "\n" + cantSuites + " suites"
                + "\ny " + cantLimosinas + " limosinas";
    }

    @Override
    public int getPrecio() {
        return super.getPrecio() + (15 * cantLimosinas);
    }

}
