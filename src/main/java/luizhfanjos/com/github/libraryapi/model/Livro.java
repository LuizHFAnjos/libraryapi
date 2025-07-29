package luizhfanjos.com.github.libraryapi.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "livro")
@Data
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "data_publicacao")
    private LocalDate data_publicacao;

    @Column(name = "genero")
    @Enumerated(value = EnumType.STRING)
    private GeneroLivro genero;

    @Column(name = "preco", precision = 18, scale = 2)
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
}
