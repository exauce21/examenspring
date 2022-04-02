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
public class Criteres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 150, nullable = false)
    private String nom;
    @Column(length = 11, nullable = false)
    private int poids;
    @OneToMany(mappedBy = "critere")
    private List<Evaluation> evaluations  = new ArrayList<Evaluation>();
}
