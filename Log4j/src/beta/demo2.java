package beta;
import org.apache.logging.log4j.*;

public class demo2 {
	
private static Logger log=LogManager.getLogger(demo2.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub, 
		log.debug("im debugging");	
		log.info("object is present");
		log.error("not present");
		log.fatal("fatal");
		
	}

}
