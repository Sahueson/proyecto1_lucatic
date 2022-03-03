package proyecto1_lucatic.control;

import proyecto1_lucatic.gui.Menu;
import proyecto1_lucatic.utilidades.Datos;

public class Lucasteam {

    public void abrirLucasteam() {
        boolean seguir = true;
        do {
            Menu.mostrarMenu();
            seguir = this.seleccionOpciones();
        } while (seguir);
        System.out.println("   --- Fin de la sesion ---");
    }

    public boolean seleccionOpciones() {

        boolean continuar = true;

        try {
            switch (Datos.recogeInt()) {
                case 1:
                    //ALTA DE UN PRODUCTO
                    services.AddProducto();
                    break;

                case 2:
                    //ELIMINAR UN PRODUCTO
                    services.eliminarProducto();
                    break;

                case 3:
                    //LISTAR PRODUCTOS
                    services.ListarProductos();
                    break;

                case 4:
                    //INDICAR CANTIDADES DE UN PRODUCTO
                    services.CantidadesProducto();
                    break;

                case 5:
                    //LISTADO DE PRODUCTOS CON EXISTENCIAS MENORES DE 5
                    services.CantidadesMenores(5);
                    break;

                case 6:
                    //CASOS DE PRUEBA
                    services.CasosDePrueba();
                    break;

                case 7:
                    //SERIALIZAR
                    services.serializarStock();
                    break;

                case 8:
                    //DESERIALIZAR
                    services.deSerializarStock();
                    break;

                case 0:
                    continuar = salir();
                    break;
            }
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return continuar;
    }

    private boolean salir() throws Exception {
        String sino = Datos.recogeString("   ¿Está seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }


}
