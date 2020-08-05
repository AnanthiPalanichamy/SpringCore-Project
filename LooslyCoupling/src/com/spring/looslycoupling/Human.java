package com.spring.looslycoupling;

public class Human {
	Sim sim;

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void usage() {
    sim.call();
	}

}
