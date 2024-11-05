package Tools;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Test_Log {
	@Test
	public void logReport() throws IOException
	{
		Layout lay=new PatternLayout("%d %c %m %n");
		Appender app=new FileAppender(lay, "./Reports/lrep1.log");
		BasicConfigurator.configure(app);
		Logger log=Logger.getLogger(this.getClass().getName());
		log.warn("testcase warning");
		log.info("testcase info");
		log.error("testcase error");
		
	}

}
