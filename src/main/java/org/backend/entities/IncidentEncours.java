package org.backend.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class IncidentEncours extends Incident {

	private int priorite;

	private String intervenant;

	private String Date_SLA;

	private String deadLineGrp;

	private String groupeEncharge;

	private String actionDateCreation;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_domain")
	private Domain domain;

}
