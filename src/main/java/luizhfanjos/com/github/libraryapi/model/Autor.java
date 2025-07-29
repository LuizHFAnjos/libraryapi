package luizhfanjos.com.github.libraryapi.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "autor")
@Data
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate data_nascimento;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;
}
