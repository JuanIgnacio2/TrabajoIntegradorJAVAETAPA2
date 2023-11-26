package com.reporte_incidentes.dominio;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	private String nombre;
	private String razon_social;	
	@OneToMany
	@JoinColumn(name="id_servicio", referencedColumnName="id")
	private List<Servicio> servicio;
	@OneToOne
	@JoinColumn(name="id_incidente", referencedColumnName="id")
	private Incidentes incidente;
}
