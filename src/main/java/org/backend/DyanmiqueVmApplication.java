package org.backend;
import org.backend.entities.Indicateur;
import org.backend.entities.IndicateurParam;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DyanmiqueVmApplication extends SpringBootServletInitializer implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DyanmiqueVmApplication.class, args);
	}

	@Override	
	public void run(String... args) throws Exception {
		
		IndicateurParam incp[] = new IndicateurParam[3];
		incp[0] = new IndicateurParam(null, null, "#0A9F32", 4, 0);
		incp[1] = new IndicateurParam(null, null, "#FFC300", 10,5 );
		incp[2] = new IndicateurParam(null, null, "#F3403B", 100,11);

		for (IndicateurParam indicateurParam : incp) {
		listValueOfIndicateurParam.listIndicateurParam.add(indicateurParam);
		System.out.println(indicateurParam.toString());
		}

		Indicateur indc[] = new Indicateur[11];
		indc[0] = new Indicateur(null, "Encours", null,null);
		indc[1] = new Indicateur(null, "Editeurs", null,null);
		indc[2] = new Indicateur(null, "Priorite",null,null);
		indc[3] = new Indicateur(null, "Noaffecte", null,null);
		indc[4] = new Indicateur(null, "SLA", null,null);
		indc[5] = new Indicateur(null, "OLA", null,null);
		indc[6] = new Indicateur(null, "OLA +",  null,null);
		indc[7] = new Indicateur(null, "2.5",  null,null);
		indc[8] = new Indicateur(null, "2.5 +",  null,null);
		indc[9] = new Indicateur(null, "Recus",  null,null);
		indc[10] = new Indicateur(null, "Resolus",  null,null);
		for (Indicateur indicateur : indc) {
			ListValueOfIndicateur.listIndicateur.add(indicateur);
			System.out.println(indicateur.toString());

		}

	}


}
