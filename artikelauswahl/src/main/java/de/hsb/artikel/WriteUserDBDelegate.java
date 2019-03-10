package de.hsb.artikel;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.util.logging.Logger;

public class WriteUserDBDelegate implements JavaDelegate {
	private static final Logger LOG = Logger.getLogger("Artikel");
	public void execute(DelegateExecution execution) throws Exception {
		LOG.info("Erstelle Account in DB: insert into Kundenstamm (kundenmail,rechnungsadresse,lieferadresse,land) values (\"" + execution.getVariable("kundenmail") +"\",\"" + execution.getVariable("rechnungsadresse")+ "\",\"" + execution.getVariable("lieferadresse") + "\",\"" + execution.getVariable("land") + "\");" );
	}
}
