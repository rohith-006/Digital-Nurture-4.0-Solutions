package com.cognizant.spring_learn;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        // Set logging level before anything else
        System.setProperty("logging.level.com.cognizant.spring_learn", "DEBUG");

        LOGGER.info("START");
        displayCountry();
        LOGGER.info("END");
    }


    public static void displayCountry() {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country : {}", country.toString());
    }
}



