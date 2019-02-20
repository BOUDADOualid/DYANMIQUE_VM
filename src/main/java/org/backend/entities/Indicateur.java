package org.backend.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Indicateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String indicateur;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_domain")
	private Domain domain;

	@Cascade(CascadeType.DELETE)
	@JsonIgnore
	@OneToMany(mappedBy = "indicateur", fetch = FetchType.LAZY)
//	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private List<IndicateurParam> List_Indicateur_param;

}
