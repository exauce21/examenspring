package sn.isi.examen.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.isi.examen.model.Employe;
import sn.isi.examen.repository.EmployeRepository;

import java.util.Optional;

@Data
@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employeRepository;

    public Iterable<Employe> getEmployes() {
        return employeRepository.findAll();
    }

    public Employe saveEmploye(Employe employe) {
        Employe saveEmploye = employeRepository.save(employe);
        return saveEmploye;
    }
}
