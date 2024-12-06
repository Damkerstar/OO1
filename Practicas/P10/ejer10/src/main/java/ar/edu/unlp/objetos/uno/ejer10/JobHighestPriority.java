package ar.edu.unlp.objetos.uno.ejer10;

public class JobHighestPriority extends JobScheduler {

	@Override
	public JobDescription siguiente() {
		return this.jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
	}

}
