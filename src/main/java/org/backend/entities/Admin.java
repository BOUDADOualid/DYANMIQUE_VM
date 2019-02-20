package org.backend.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Admin {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	private String login;
	private String MotDePasse;
	private String Email;

}
