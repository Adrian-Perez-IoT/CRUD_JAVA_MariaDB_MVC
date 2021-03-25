package CRUD;

import java.util.Arrays;

public class Producto {
    int idProducto;
    String nombre;
    int precio;
    int cantidad;
    String proveedor;

    public static void main(String[] args){
        Producto p = new Producto();
        p.setNombre("Mouse");
        p.setPrecio(100);
        Producto p2 = new Producto("Teclado", 120,10,"CECYTEM");
        Producto p3 = new Producto(2,"Teclado",120,10,"CECYTEM");
        System.out.println("p1: " + p.getNombre());
        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

    public Producto() {
        /*System.out.println("Se creo Producto");*/
    }

    public Producto(String nombre, int precio, int cantidad, String proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public Producto(int idProducto, String nombre, int precio, int cantidad, String proveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", proveedor='" + proveedor + '\'' +
                '}';
    }
}
