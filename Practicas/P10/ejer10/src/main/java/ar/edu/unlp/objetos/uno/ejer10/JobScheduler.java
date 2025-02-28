package ar.edu.unlp.objetos.uno.ejer10;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {
    protected List<JobDescription> jobs;
    protected String strategy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
        this.strategy = "FIFO";
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public String getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(String aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
    	JobDescription nextJob = this.siguiente();
        this.unschedule(nextJob);
        return nextJob;
    }

	public abstract JobDescription siguiente();

}
