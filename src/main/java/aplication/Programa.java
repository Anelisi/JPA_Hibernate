package aplication;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        /* Pessoa p1 = new Pessoa(null, "Anelisi Meller", "anelisi@unisinos.com");
         Pessoa p2 = new Pessoa(null, "Arthur Svensson", "arthur@unisinos.com");
         Pessoa p3 = new Pessoa(null, "Licodêncio Meller Svensson", "lico@etbilu.com");
        Pessoa p4 = new Pessoa(null,"Gretchen","congalaconga@piripiripirim.bum");*/


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java_coffee-jpa");
        EntityManager em = emf.createEntityManager();

       /*em.getTransaction().begin();
        em.persist(p4);
        em.persist(p1);
         em.persist(p2);
         em.persist(p3);

         em.getTransaction().commit();*/

        Pessoa p = em.find(Pessoa.class, 4);
        System.out.println(p);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto!");
    }
}
