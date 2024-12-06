package ar.edu.unlp.objetos.uno.ejer10;

import java.util.List;

public class JobFIFO extends JobScheduler {

	@Override
	public JobDescription siguiente() {
		return this.jobs.get(0);
	}
}
