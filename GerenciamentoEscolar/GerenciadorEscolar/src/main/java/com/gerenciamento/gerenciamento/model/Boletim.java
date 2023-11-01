package com.gerenciamento.gerenciamento.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boletim {

    @EmbeddedId
    private ChaveBoletim chaveBoletim;
    private Double media;

}