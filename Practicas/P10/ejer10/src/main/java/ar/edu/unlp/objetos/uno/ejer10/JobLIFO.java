package ar.edu.unlp.objetos.uno.ejer10;

public class JobLIFO extends JobScheduler {

	@Override
	public JobDescription siguiente() {
		return this.jobs.get(jobs.size()-1);
	}
}
