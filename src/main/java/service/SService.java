package service;

import java.util.List;

public interface SService<E> {
    void addStudent(E e);
    boolean editStudent(int id,E e);
    boolean deleteStudent(int id);
    List<E> getStudent();
    E findPetById(int id);
}
