package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class LibroServicio {

    Scanner lr = new Scanner(System.in);
    Libro nuevoLibro = new Libro();
    Editorial ed1 = new Editorial();
    Autor au1 = new Autor();
    
    //Creamos una clase EntityManager encargada de dar acceso a la base de datos
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    

    /*
    //1) Ingresar nuevo libro
    public void altaLibro() {
        //Ingresar los datos del nuevo libro
        
        nuevoLibro.setIsbn(978);
        nuevoLibro.setTitulo("Cien años de soledad");
        nuevoLibro.setAnio(1982);
        nuevoLibro.setEjemplares(200);
        nuevoLibro.setEjemplaresPrestados(20);
        nuevoLibro.setEjemplaresResantes(nuevoLibro.getEjemplares() - nuevoLibro.getEjemplaresPrestados());
        nuevoLibro.setEditorial(au1.setNombre("Sudamericana"));
        nuevoLibro.setAutor("Gabriel García Márquez");

        em.getTransaction().begin();

        em.persist(nuevoLibro);
        em.getTransaction().commit();
    }
     */
    //5) Búsqueda de un libro por ISBN
    public void buscarLibroPorISBN() {

        //realizamos la consulta solicitada
        //2) Búsqueda de un libro por ISBN.
        System.out.println("Ingrese ISBN del libro a buscar ");
        int isbn = lr.nextInt();
        Libro l1 = (Libro) em.createQuery("SELECT * FROM libro WHERE isbn = " + isbn + ";");
        System.out.println("Resultado...\n" + l1.toString());
    }

}

/*
+ "1)                   + 
                        + "2) Modificar datos de un libro.\n"
                        + "3) Eliminar libro.\n"
                        + "4) Búsqueda de un Autor por nombre. \n"
                        + "5) Búsqueda de un libro por ISBN.\n"
                        + "6) Búsqueda de un libro por Título. \n"
                        + "7) Búsqueda de un libro/s por nombre de Autor.\n"
                        + "8) Búsqueda de un libro/s por nombre de Editorial.\n"
 */
