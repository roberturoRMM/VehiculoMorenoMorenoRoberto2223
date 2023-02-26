package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {

    public static void main(String[] args) {
        VehiculoMorenoMorenoRoberto2223 miVehiculoMorenoMorenoRoberto2223;
        int stockActual;

        miVehiculoMorenoMorenoRoberto2223 = new VehiculoMorenoMorenoRoberto2223("Seat", 18000, 100);
        operativaVehiculosMorenoMorenoRoberto2223(miVehiculoMorenoMorenoRoberto2223, 50);
    }

    private static void operativaVehiculosMorenoMorenoRoberto2223(VehiculoMorenoMorenoRoberto2223 miVehiculoMorenoMorenoRoberto2223, int cantidad) {
        int stockActual;
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoMorenoMorenoRoberto2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoMorenoMorenoRoberto2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoMorenoMorenoRoberto2223.obtenerStock();
        System.out.println("El stock actual es" + stockActual);
    }

}
