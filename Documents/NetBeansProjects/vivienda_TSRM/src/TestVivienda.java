
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author DAW TARDE
 */
public class TestVivienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        Vivienda v1 = new ViviendaImpl(80, 850, Operacion.ALQUILER, "Calle Gongora nº 58  - 4ºB ,Cordoba");

        Vivienda v2 = new ViviendaImpl();

        Vivienda v3 = new ViviendaImpl();
        v3.setDireccion(" Plaza de las flores nº 24, Úbeda ");

        System.out.println("dame la superficie");
        double superficie = Sc.nextDouble();
        v2.setSuperficie(superficie);
        System.out.println("dame el precio");
        double precio = Sc.nextDouble();
        v2.setPrecio(precio);
        Sc.nextLine();
        System.out.println("dame la direccion");
        String direccion = Sc.nextLine();
        v2.setDireccion(direccion);

        System.out.println("se ha realizado una rebaja " + v1.getRebajaDeVIvienda());
        
        System.out.println(v2.getCantidadQueSeLlevaLaInmobiliaria());
        
        System.out.println(v2.getPrecioPorMetroCuadrado());
        
        System.out.println(v1.getLocalidadDeLaVivienda());

        System.out.println(v2.getDevolverDirecionDeViviendaConMayorPrecioPorMetroCuadrado(v3));
        
        System.out.println(v1.getDevolverDirecionDeViviendaConMayorPrecioPorMetroCuadrado(v3));
        
        System.out.println(v3.getTamañoDeVivienda());
        
        System.out.println(v1.getPrecio());
        System.out.println(v2.getPrecio());
        System.out.println(v3.getPrecio());
    }
      
}
