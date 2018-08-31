/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos7;

/**
 *
 * @author PC USER
 */
public class Funcionalidad {

    private String[] empleados = new String[3];
    private String[] productos = new String[3];
    private String[] monedas = new String[3];
    double importe;
    private double[][][] ventas = new double[3][3][3];
   
    private int numE = 0; 
    private int numP = 0;
    private int numM = 0;
    
    public int buscar(String nombre, int num, String[] v) {
        int indice = -1;
        for (int i = 0; i < num; i++) {
            indice++;
            if (v[i].equalsIgnoreCase(nombre)) {
                return indice;
            }
        }
        return -1;
    }    
    
 public void agregarE(String empleado) {
        int cont=0;
        int t = productos.length;
        String[] aux = new String[empleados.length];        
        for (int i=0;i<empleados.length;i++){
            if (empleados[i]==null){                
                cont++;
            }
            else{
                numE++;
            }
        }
        if (cont==0){
            System.arraycopy(empleados, 0, aux, 0, t);
            empleados = new String[empleados.length+5];            
            System.arraycopy(aux, 0, empleados, 0, t);
            }
        
        for (int i=0;i<empleados.length;i++){
            if (empleados[i]==null){
                empleados[i] = empleado;                
            }            
        }        
    }
 
  public void agregarP(String producto) {
        int cont=0;
        int t = productos.length;
        String[] aux = new String[productos.length];     
        for (int i=0;i<productos.length;i++){
            if (productos[i]==null){                
                cont++;
            }else{
                numP++;
            }            
        }
        if (cont==0){
            System.arraycopy(productos, 0, aux, 0, t);
            productos = new String[productos.length+5];            
            System.arraycopy(aux, 0, productos, 0, t);
            }
        
        for (int i=0;i<productos.length;i++){
            if (productos[i]==null){
                productos[i] = producto;                
            }            
        }        
    }
  
   public void agregarM(String empleado) {
        int cont=0;
        String[] aux = new String[monedas.length];
        int t = monedas.length;
        for (int i=0;i<monedas.length;i++){
            if (monedas[i]==null){                
                cont++;
            }else{
                numM++;
            }            
        }
        if (cont==0){
            System.arraycopy(monedas, 0, aux, 0, t);
            monedas = new String[monedas.length+5];            
            System.arraycopy(aux, 0, monedas, 0, t);
            }
        
        for (int i=0;i<empleados.length;i++){
            if (monedas[i]==null){
                monedas[i] = empleado;                
            }            
        }        
    }
    
    public void VentasLLenado(double nombre) {
       int cont= 0;
       
       double[][][] aux = new double[empleados.length][productos.length][monedas.length];
       int t = ventas.length + ventas[0].length+ ventas[0][0].length;
        for(int i=0; i < ventas.length; i++){
            for(int j=0; j < ventas[0].length; j++){
                for(int k=0; k < ventas[0][0].length; k++){
                   if (ventas[i][j][k]==0){
                       cont++;
                }
            }  
          }  
        }
            if (cont==0){
            System.arraycopy(monedas, 0, aux, 0, t);
            ventas = new double[numE][numP][numM];            
            System.arraycopy(aux, 0, monedas, 0, t);
            }
            
            
        for(int i=0 ; i < ventas.length; i++){
            for(int j=0; j < ventas[0].length; j++){
                for(int k=0; k < ventas[0][0].length; k++){
                    ventas[i][j][k]=nombre;
                }
            }    
    }
        
    }

    public void actArticulos(String nombre, int cantidad) {
        int indice = buscar(nombre);
        if (indice != -1) {
            if (-1 * (cantidad) <= articulos[indice]) {
                articulos[indice] = articulos[indice] + cantidad;
            } else {
                articulos[indice] = 0;
            }
            System.out.println("cantidad de articulos actualizados correctamente");
        } else {
            System.err.println("No se encontro el  proveedor");
        }
    }

    public void actProveedor(String codigo, String nombre, String observacion) {
        int i = 0;
        for (int e = 0; e < numElementos; e++) {
            if (proveedores[e].getCodigo().compareTo(codigo) == -1) {
                i++;
            }
        }
        if (numElementos < proveedores.length) {
            for (int j = numElementos - 1; j >= i; j--) {
                proveedores[j + 1] = proveedores[j];
            }
            Proveedor nuevo = new Proveedor(codigo, nombre, observacion);
            proveedores[i] = nuevo;
            numElementos++;
            System.out.println("Proveedor añadido");
        } else {
            System.err.println("El areglo esta lleno");
        }
    }

    public void eliminar(String codigo) {
        int indice = -1;
        for (int i = 0; i< numElementos; i++) {
            if (proveedores[i].getCodigo().equalsIgnoreCase(codigo)) {
                indice = i;
            }
        }
        if (indice != -1) {
            for (int e = 0; e < numElementos; e++) {
                if (indice != proveedores.length - 1) {
                    proveedores[e] = proveedores[e + 1];
                    ciudades[e] = ciudades[e + 1];
                    articulos[e] = articulos[e + 1];
                    numElementos--;
                } else {
                    proveedores[e] = null;
                    ciudades[e] = null;
                    articulos[e] = 0;
                }
            }
        } else {
            System.err.println("No se encontro el  proveedor");
        }
        
    }
}
