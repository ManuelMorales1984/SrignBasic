package testSpringItc;
import org.apache.log4j.Logger;

public class HelloWord {
	

	private static final Logger LOG = Logger.getLogger(HelloWord.class);
	
	private String mensaje;

	public String getMensaje() {
		System.out.println("Your Message : " + mensaje);
		if (LOG.isDebugEnabled()){
			LOG.debug("test de log....");
		}
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
