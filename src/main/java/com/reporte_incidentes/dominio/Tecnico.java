package com.reporte_incidentes.dominio;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tecnico")
public class Tecnico {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	private String nombre;
	private String apellido;
	private String dni;
	private String tipo_notificacion;
	@OneToMany
	@JoinColumn(name="id_especialidad", referencedColumnName="id")
	private List<Especialidad> especialidad;
}
