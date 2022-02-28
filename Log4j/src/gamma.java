import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import alpha.Demo;

public class gamma {
	private static Logger log=LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("im in debug mode");
		log.info("new method");
		log.fatal("fatal msg");
		log.error("default pkg");
	}

}
