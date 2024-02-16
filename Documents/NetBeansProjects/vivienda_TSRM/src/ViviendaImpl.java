
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DAW TARDE
 */
public class ViviendaImpl implements Vivienda {

    private final double DESCUENTOS = 0.10;
    private double superficie;
    private double precio;
    private Operacion operacion;
    private String direccion;
    //crea tres constructores
    //Uno que reciba los valores de todos los atributos por parámetro. (0.1P)

    public ViviendaImpl(double superficie, double precio, Operacion operacion, String direccion) {
        this.superficie = superficie;
        this.precio = precio;
        this.operacion = operacion;
        this.direccion = direccion;
    }

    //Uno que reciba únicamente la dirección y el resto los inicialice al valor establecido por defecto:
    public ViviendaImpl(String direccion) {
        this.superficie = 90;
        this.precio = 15000;
        this.operacion = Operacion.VENTA;
        this.direccion = direccion;
    }

    /*Uno que no reciba ningún valor por parámetro e inicialice al 
    valor nulo todos los atributos. El valor por defecto de operación es venta*/
    public ViviendaImpl() {
        this.superficie = 0;
        this.precio = 0;
        this.operacion = Operacion.VENTA;
        this.direccion = "";
    }

    //metodos observadores
    /**
     * @return: superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @return : precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return : operracion
     */
    public Operacion getOperacion() {
        return operacion;
    }

    /**
     * @return : direccion
     */
    public String getDireccion() {
        return direccion;
    }

    //metodos modificadores 
    /**
     * @param : superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @param : precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param : Operacion
     */
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * @param : direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //metodos extra
    /**
     * Crear un método que rebaje el precio de la vivienda a un 10%. El valor de
     * rebaja debe ser creado en una constante.
     *
     * @return : rebaja de vivienda
     */
    public double getRebajaDeVIvienda() {
        return this.precio - (this.DESCUENTOS * this.getPrecio());
    }

    /**
     * Crear el método toString que muestre la información de la Vivienda en el
     * siguiente formato:
     *
     * @return : rebaja de vivienda
     */

    public String toString() {
        return "Direccion: " + this.direccion + "Precio: " + this.precio + "Superficie: " + this.superficie + "Operacion: " + this.operacion;

    }

    /**
     * Cree un método que dada una operación, alquiler, venta o alquiler con
     * opción a compra, devuelva si la vivienda es de esa operación.
     *
     * @return : es la vivienda de esa operacion
     */
    public boolean esLaViviendaDeEsaOperacion(String operacion) {
        return this.operacion == Operacion.valueOf(operacion.toUpperCase());
    }

    /*Crear un método que devuelva la cantidad que se lleva la inmobiliaria por la gestión. 
    En el caso de las viviendas en alquiler se lleva un 8% del precio, en el caso de las 
    viviendas en venta se lleva un 14% y en el alquiler con opción a compra un 11%*/
    /**
     * @return : cantidad que se lleva la imobiliaria
     */
    public double getCantidadQueSeLlevaLaInmobiliaria() {
        double comision = 0;
        switch (operacion) {
            case ALQUILER:
                comision = precio * 0.8;
                break;
            case VENTA:
                comision = precio * 0.14;
                break;
            case VENTA_O_ALQUILER:
                comision = precio * 0.11;
                break;
        }
        return comision;
    }

    /**
     * Para ello, necesitará crear un método que calcule el precio por metro cuadrado
     * @return : precio por metro cuadrado
     */
    public double getPrecioPorMetroCuadrado() {
        return this.precio / this.superficie;
    }


    /**
     *     Crear un método que dado otra Vivienda y sí únicamente la operación en ambas en la misma,
    es decir, ambas están en Venta o en alquiler nos devuelva la dirección de la vivienda con
    mayor precio por metro cuadrado. En el caso de que las viviendas  no tengan la misma 
    operación  devuelva “Las viviendas no tienen la misma dirección”
     * @return : Devolver direcion de vivienda con mayor precio por metro
     * cuadrado
     */
    public String getDevolverDirecionDeViviendaConMayorPrecioPorMetroCuadrado(Vivienda v) {
        String direccion = "";
        if (this.operacion == v.getOperacion()) {
            if (this.getPrecioPorMetroCuadrado() > v.getPrecioPorMetroCuadrado()) {
                direccion = this.direccion;
            } else if (this.getPrecioPorMetroCuadrado() < v.getPrecioPorMetroCuadrado()) {
                direccion = v.getDireccion();
            }
        } else {
            direccion = "Las viviendas no tienen la misma dirección";
        }

        return direccion;
    }

    
    /**
     * Cree un método que devuelva un String que diga si la vivienda es pequeña, mediana o grande.
     * @return : tamaño de la vivienda
     */
    public String getTamañoDeVivienda() {
        String tamañoDeVivienda = "";
        if (this.superficie < 70) {
            tamañoDeVivienda = "la Vivienda pequeña";
        } else if (this.superficie < 95 && this.superficie > 70) {
            tamañoDeVivienda = "la Vivienda mediana";
        } else if (this.superficie > 95) {
            tamañoDeVivienda = "la Vivienda grande";
        }
        return tamañoDeVivienda;
    }


    /**
     *     Cree un método que devuelva la localidad en la que se encuentra la vivienda.
    El formato de la dirección siempre se escribirá así:
     * @return : localidad de la vivienda
     */
    public String getLocalidadDeLaVivienda() {
        String localidad = "";
        if ("Calle Andujar nº 24".equals(direccion)) {
            localidad = this.direccion + ",sevilla";
        } else if ("Avenida Andalucía nº107 - 3ºA".equals(direccion)) {
            localidad = this.direccion + ",lebrija";
        } else if ("Plaza de los rios nº 86 - puerta A - 1º D".equals(direccion)) {
            localidad = this.direccion + ",matalascañas";
        }
        return localidad;
    }

    /**
     * Cree un método que dado un array con las superficies de cada una de
     * las estancias de la vivienda te calcule la superficie total y modifique la superficie
     * @return : calcular la superficie total
     */
    public double getCalcularLaSuperficieTotal(int[] superficie) {
        double superficie2 = 0;
        for (int i = 0; i < superficie.length; i++) {
            superficie2 = superficie2 + superficie[i];
        }
        return superficie2;
    }
}
