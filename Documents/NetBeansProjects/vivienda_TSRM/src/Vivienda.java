/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author DAW TARDE
 */
//metodos observadores
public interface Vivienda {

    public double getSuperficie();

    public double getPrecio();

    public Operacion getOperacion();

    public String getDireccion();

    //metodos modificadores
    public void setSuperficie(double superficie);

    public void setPrecio(double precio);

    public void setOperacion(Operacion operacion);

    public void setDireccion(String direccion);

    //metodos extra
    public double getRebajaDeVIvienda();

    public boolean esLaViviendaDeEsaOperacion(String operacion);

    public double getCantidadQueSeLlevaLaInmobiliaria();
    
    public double getPrecioPorMetroCuadrado();
    
    public String getDevolverDirecionDeViviendaConMayorPrecioPorMetroCuadrado(Vivienda v);
    
    public String getTamañoDeVivienda();
    
    public String getLocalidadDeLaVivienda();
    
    public double getCalcularLaSuperficieTotal(int [] superficie);
    
}
