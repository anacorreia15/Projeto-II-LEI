package com.projeto.Backendmicroservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Refeicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime dataEhora;
   //private long nRefeicoes; não é um parametro mas sim uma soma de todos os registos que haverá
    private double volumeSopaDesperdicado;

    public Refeicao(LocalDateTime dataEhora, double volumeSopaDesperdicado) {
        this.dataEhora = dataEhora;
        this.volumeSopaDesperdicado = volumeSopaDesperdicado;
    }
}
