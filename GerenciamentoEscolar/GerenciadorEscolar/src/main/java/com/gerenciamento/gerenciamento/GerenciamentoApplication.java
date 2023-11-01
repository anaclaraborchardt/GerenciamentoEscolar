package com.gerenciamento.gerenciamento;

import com.gerenciamento.gerenciamento.Service.BancoDeDados.ProcedureService;
import com.gerenciamento.gerenciamento.Service.BancoDeDados.TriggerService;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
@AllArgsConstructor
public class GerenciamentoApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(GerenciamentoApplication.class, args);
		ProcedureService procedureService = new ProcedureService();
		TriggerService triggerService = new TriggerService();

		System.out.println(procedureService.criarGerarBoletimDisciplina());
		System.out.println(procedureService.createGerarMediaDisciplina());
		procedureService.callGerarMediaDisciplina(1);
		System.out.println(triggerService.createTriggerGerarMedia());
		System.out.println(triggerService.createTriggerAtualiazarBoletim());
	}

}

