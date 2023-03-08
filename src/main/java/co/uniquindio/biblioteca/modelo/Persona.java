package co.uniquindio.biblioteca.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
}
