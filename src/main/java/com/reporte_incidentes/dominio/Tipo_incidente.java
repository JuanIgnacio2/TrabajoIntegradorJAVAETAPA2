package com.reporte_incidentes.dominio;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tipo_incidente")
public class Tipo_incidente {
	@Id
	private int id;
	private String nombre;
	private String tiempo_estimado;
	private String tiempo_maximo;
	@OneToOne
	@JoinColumn(name="id_especialidad", referencedColumnName="id")
	private Especialidad especialidad;
}
