package co.uniquindio.biblioteca.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String cedula;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(nullable = false, unique = true)
    private String email;
    @ElementCollection
    private List<String> telefono;
    @ManyToOne
    private Ciudad ciudad;
    @OneToMany(mappedBy = "persona")
    private List<Prestamo> prestamos;
}
