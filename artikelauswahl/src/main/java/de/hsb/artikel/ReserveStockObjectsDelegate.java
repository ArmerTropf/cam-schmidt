package de.hsb.artikel;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ReserveStockObjectsDelegate implements JavaDelegate{
	private static final Logger LOG = Logger.getLogger("Artikel");

	public void execute(DelegateExecution execution) throws Exception {
		LOG.info("Bestand reserviert");
		
		
	}
}
