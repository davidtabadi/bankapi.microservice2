//package bankapi;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.web.reactive.function.client.WebClient;
//
//public class PeopleClientTest {
//
//	private final String FIND_ALL_PEOPLE = "http://localhost:8011/persons/readallpersons";
//	private final String FIND_ALL_PEOPLE_NAME_STARTS_A_K = FIND_ALL_PEOPLE + "AK";
//	private final String FIND_ALL_PEOPLE_ABOVE_AVG_ISRAEL = FIND_ALL_PEOPLE + "avgisrael";
//
//	WebClient webClient = WebClient.builder().baseUrl(FIND_ALL_PEOPLE).build();
//	BankClientController bankClientController = new BankClientController();;
//
//	@Test
//	void readAllPeople() {
//		List<Person> peopleList = bankClientController.readAllPeople();
//		System.out.println("People List: " + peopleList);
//		assertTrue(peopleList.size() > 0);
//	}
//
//	@Test
//	void readAllPeopleWithNameAK() {
//		List<Person> peopleListAK = bankClientController.readAllPeopleWithNameAK();
//		System.out.println("People List names starting A or K: " + peopleListAK);
//		assertTrue(peopleListAK.size() > 0);
//	}
//
//	@Test
//	void readAllPeopleAboveAvgIsrael() {
//		List<Person> peopleListAboveAvgIsrael = bankClientController.readAllPeopleAboveAvgIsrael();
//		System.out.println("People List above average wight and from Israel: " + peopleListAboveAvgIsrael);
//		assertTrue(peopleListAboveAvgIsrael.size() > 0);
//	}
//
//}
