package org.backend.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author A705896
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Domain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String nom;
	private String nomEditeur;

	@Cascade(CascadeType.DELETE)
	@JsonIgnore
	@OneToMany(mappedBy = "domain", fetch = FetchType.LAZY)
//	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private List<Indicateur> List_Indicateur;
	
	@Cascade(CascadeType.DELETE)
	@JsonIgnore
	@OneToMany(mappedBy="domain",fetch=FetchType.LAZY)
	private List<IncidentEncours> ListIncidentEncours;
	
	
	@Cascade(CascadeType.DELETE)
	@JsonIgnore
	@OneToMany(mappedBy="domain",fetch=FetchType.LAZY)
	private List<IncidentRecus> ListIncidentRecus;
	
	@Cascade(CascadeType.DELETE)
	@JsonIgnore
	@OneToMany(mappedBy="domain",fetch=FetchType.LAZY)
	private List<IncidentResolus> ListResolus;
	
	@Cascade(CascadeType.DELETE)
	@JsonIgnore
	@OneToMany(mappedBy="domain",fetch=FetchType.LAZY)
	private List<Resultat> ListResultat;
	
	
	

}
