public class Hyundai {
    private String modelo;
    private int version;
    private double precio;


    public Hyundai(String modelo, int version, double precio) {
        this.modelo = modelo;
        this.version = version;
        this.precio = precio;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getversion() {
        return version;
    }

    public void setversion(int version) {
        this.version = version;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + version);
        System.out.println("Precio: S/" + precio);
    }
    /*Metodo creado por Adrian Moises Rondan Carlos*/
}