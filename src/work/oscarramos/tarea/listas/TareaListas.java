package work.oscarramos.tarea.listas;

import work.oscarramos.tarea.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class TareaListas {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(3,5600.00));
        productos.add(new Producto(5,8500.00));
        productos.add(new Producto(8,9500.00));
        productos.add(new Producto(9,5000.00));
        productos.add(new Producto(6,3500.00));

        double total = productos.stream().mapToDouble(p -> p.getCantidad() * p.getPrecio()).sum();

        System.out.println("Total productos : " + total);
    }
}
