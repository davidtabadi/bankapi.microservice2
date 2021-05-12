package bankapi;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class BankClientService {

	private final String FIND_ALL_PEOPLE = "http://localhost:8011/persons/readallpersons";
	private final String FIND_ALL_PEOPLE_NAME_STARTS_A_K = FIND_ALL_PEOPLE + "AK";
	private final String FIND_ALL_PEOPLE_ABOVE_AVG_ISRAEL = FIND_ALL_PEOPLE + "avgisrael";

	// Create an instance of WebClient
	private WebClient webClient = WebClient.builder().baseUrl(FIND_ALL_PEOPLE).build();

	public BankClientService() {
	}

	// read all people from microservice1
	public List<Person> readAll() {
		return webClient.get().uri(FIND_ALL_PEOPLE).retrieve().bodyToFlux(Person.class).collectList().block();
	}

	// read all people from microservice1 with name starting A or K
	public List<Person> readAllPeopleWithNameAK() {
		return webClient.get().uri(FIND_ALL_PEOPLE_NAME_STARTS_A_K).retrieve().bodyToFlux(Person.class).collectList()
				.block();
	}

	// read all people from microservice1 above average weight and Israel
	public List<Person> readAllPeopleAboveAvgIsrael() {
		return webClient.get().uri(FIND_ALL_PEOPLE_ABOVE_AVG_ISRAEL).retrieve().bodyToFlux(Person.class).collectList()
				.block();
	}

}
