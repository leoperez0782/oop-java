package com.io.github.leoperez0782.oopjava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Creamos un objeto persona.
        Persona p1 = new Persona("Lolo", 37);
        
        //Imprimimos en consola los datos
        System.out.println("Estado del objeto persona : nombre: " +  p1.getNombre()+ " edad: " +p1.getEdad());
        
        //Cambiamos el estado, cambiando su edad
        p1.setEdad(38);
        
      //Imprimimos en consola los datos
        System.out.println("Estado del objeto persona : nombre: " +  p1.getNombre()+ " edad: " +p1.getEdad());
        
        //Creamos otro objeto persona con los mismos datos.
        Persona p2 = new Persona("Lolo", 38);//Misma edad que p1 luego de cambiar su estado
        
        //Comparamos los objetos a ver si son iguales
        System.out.println(p1 == p2);
        
        //Como se puede ver, aunque tienen los mismos datos, son objetos distintos
        //Esto se debe a que el operador new genera un nuevo objeto.
        //Por lo tanto la identidad de estos objetos es distinta,
        //a pesar de que tengan los mismos valores para sus atributos.
        //La identidad está dada por el espacio que ocupan en memoria.


    }
}
