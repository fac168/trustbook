package properties.crg.it.trustbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrustBook {
	public static void main(String[] args) {
		try {
			SpringApplication.run(TrustBook.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
