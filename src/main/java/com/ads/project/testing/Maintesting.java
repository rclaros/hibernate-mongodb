/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ads.project.testing;

import com.ads.project.model.Proyecto;
import com.ads.project.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Maintesting {

    private static EntityManager em = Persistence.createEntityManagerFactory("primary").createEntityManager();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jhon Doe");
        List<Proyecto> projects = new ArrayList<Proyecto>();
        projects.add(new Proyecto("Proyecto 1", "descripcion", 288774.25));
        projects.add(new Proyecto("Proyecto 2", "descripcion", 8745.25));
        usuario.setProyectos(projects);

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(usuario);
        em.flush();
        tx.commit();
    }
}
