package sn.isi.examen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 150, nullable = false)
    private String nom;
    @Column(length = 150, nullable = false)
    private String prenom;
    @Column(length = 150, nullable = false)
    private String tel;
    @OneToMany(mappedBy = "employe")
    private List<Evaluation> evaluations  = new ArrayList<Evaluation>();

}