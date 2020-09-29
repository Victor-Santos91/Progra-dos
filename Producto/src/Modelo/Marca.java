/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author victo
 */
public class Marca extends Producto {
    private int marca;

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }
    
    @Override
    protected void agregar(){
    System.out.println("Marca"+ getMarca() );
    System.out.println("Producto"+ this.getProducto());
    System.out.println("Descripcion"+ this.getDescripcion());
    System.out.println("Precio_Costo"+ this.getPrecio_costo());
    System.out.println("Precio_venta"+ this.getPrecio_venta());
    System.out.println("Existencia"+ this.getExistencia());
    }
    @Override
    protected void modificar(){
    System.out.println("Marca"+ getMarca() );
    System.out.println("Producto"+ this.getProducto());
    System.out.println("Descripcion"+ this.getDescripcion());
    System.out.println("Precio_Costo"+ this.getPrecio_costo());
    System.out.println("Precio_venta"+ this.getPrecio_venta());
    System.out.println("Existencia"+ this.getExistencia());
    }
    @Override
    protected void eliminar(){
    System.out.println("Marca"+ getMarca() );
    System.out.println("Producto"+ this.getProducto());
    System.out.println("Descripcion"+ this.getDescripcion());
    System.out.println("Precio_Costo"+ this.getPrecio_costo());
    System.out.println("Precio_venta"+ this.getPrecio_venta());
    System.out.println("Existencia"+ this.getExistencia());
    }
    
}
