package sn.isi.examen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 11, nullable = false)
    private int valeur;
    @Column(length = 11, nullable = false)
    private int année;
    @ManyToOne
    private Employe employe = new Employe();
    @ManyToOne
    private Criteres critere = new Criteres();
    @ManyToOne
    private Indicateur indicateur = new Indicateur();
}
