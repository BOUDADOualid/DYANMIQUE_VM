package org.backend.dto;
import lombok.Value;

@Value
public class GraphBar {
    
	private Long id;
	private String nomDomain;
	private int countEncours;
	private int countResolus;
	
	
}
