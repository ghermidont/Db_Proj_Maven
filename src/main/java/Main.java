import entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("School");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //Add student
        Student st1 = new Student("Paul", "Jordison", 1955, 4.3f);

        em.persist(st1);

        //Read
        //Students student = em.find(Students.class,2);
        //System.out.println(student + "\n");

        //Update
        //Student updateStudents = em.find(Student.class,2);
        //updateStudents.setFirstname("Peter");
        //updateStudents.setLastname("Clinton");

        //Delete
        //Students deleteStudent = em.find(Students.class,3);
        //em.remove(deleteStudent);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
