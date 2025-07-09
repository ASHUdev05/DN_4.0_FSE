package com.cognizant.load_country_xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LoadCountryXmlApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoadCountryXmlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoadCountryXmlApplication.class, args);
		LOGGER.info("START main()");
		displayCountry();
        LOGGER.info("END main()");
    }

    public static void displayCountry() {
        LOGGER.info("START displayCountry()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country : {}", country.toString());
        LOGGER.info("END displayCountry()");
    }
}
