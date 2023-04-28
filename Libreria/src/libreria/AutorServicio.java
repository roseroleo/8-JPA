package libreria;

import libreria.servicios.AutorJpaController;
import libreria.servicios.ControladoraPersistencia;

public class AutorServicio {
    
    //Instanciar controladora de pesistencia
    AutorJpaController autorJpa = new AutorJpaController();
    
    //8) Búsqueda de un Autor por nombre. 
    public void consulta() {
        String sql = "SELECT nombre FROM autor;";
        autorJpa.getEntityManager().createQuery(sql);
        autorJpa.findAutor(Integer.SIZE).getId();
    }

    public void crear() {
       
    }

    public void modificar() {
         System.out.println("Hola mundo");
    }

    public void eliminar() {

    }
}


/*
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título. 
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.
*/