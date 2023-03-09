package co.uniquindio.biblioteca.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String isbn;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int unidades;
    @Column(nullable = false)
    private int anio;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    @Column(length = 50, nullable = false)
    private List<Genero> genero;

    @ManyToMany
    private List<Autor> autores;
    @OneToMany(mappedBy = "libro")
    private List<PrestamoLibro> prestamoLibro;
}
