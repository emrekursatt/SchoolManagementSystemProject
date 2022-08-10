package patika.dev.schoolmanagementsystemproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import patika.dev.schoolmanagementsystemproject.models.Student;

@Repository // Persistance to indicate that the class is
public interface IStudentRepository extends CrudRepository<Student,Integer> {



}
