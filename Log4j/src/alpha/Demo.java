package alpha;
import org.apache.logging.log4j.*;

public class Demo {
	
private static Logger log=LogManager.getLogger(Demo.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub, 
		log.debug("im debugging");	
		log.info("object is present");
		log.error("not present");
		log.fatal("fatal");
		
	}

}
