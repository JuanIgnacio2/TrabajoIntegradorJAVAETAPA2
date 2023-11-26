package com.reporte_incidentes.dominio;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="servicio")
public class Servicio {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	private String descripcion;
	@OneToOne
	@JoinColumn(name="id_incidente", referencedColumnName="id")
	private Incidentes incidente;
	@ManyToOne
	@JoinColumn(name="id_servicio", referencedColumnName="id")
	private Cliente cliente;
}
