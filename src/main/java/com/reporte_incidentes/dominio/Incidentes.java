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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="incidentes")
public class Incidentes {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	private String titulo;
	private String descripcion;
	@Temporal(TemporalType.DATE)
	private LocalDateTime fecha_ingreso;
	private LocalDateTime fecha_resolucion;
	private String estado;
	@OneToOne
	@JoinColumn(name="id_tipo_incidente", referencedColumnName="id")
	private Tipo_incidente tipo_incidente;
	@ManyToOne
	@JoinColumn(name="id_tecnico", referencedColumnName="id")
	private Tecnico tecnico;
	@OneToOne(mappedBy="Cliente")
	private Cliente cliente;
}
