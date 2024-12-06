package ar.edu.unlp.objetos.uno.ejer10;

public class JobMostEffort extends JobScheduler {

	@Override
	public JobDescription siguiente() {
		return this.jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
	}

}
