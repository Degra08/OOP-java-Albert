package com.banana.proyectostareas.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "products")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(0)
    private Long id;

    @Column
    @NotBlank
    @NotNull
    @Size(min = 3, max = 50)
    private String nombre;

    @DateTimeFormat
    private LocalDate fechaCreacion;
}
