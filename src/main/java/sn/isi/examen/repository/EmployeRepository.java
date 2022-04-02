package sn.isi.examen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sn.isi.examen.model.Employe;

@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> {
}
