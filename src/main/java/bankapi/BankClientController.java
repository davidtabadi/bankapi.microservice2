package bankapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class BankClientController {

	@Autowired
	private BankClientService bankClientService;

	// read all people from microservice1
	@RequestMapping(value = "/readall", method = RequestMethod.GET)
	public List<Person> readAllPeople() {
		return bankClientService.readAll();
	}

	// read all people from microservice1 with name starting A or K
	@RequestMapping(value = "/readnamesak", method = RequestMethod.GET)
	public List<Person> readAllPeopleWithNameAK() {
		return bankClientService.readAllPeopleWithNameAK();
	}

	// read all people from microservice1 above average weight and Israel
	@RequestMapping(value = "/readaboveavgisrael", method = RequestMethod.GET)
	public List<Person> readAllPeopleAboveAvgIsrael() {
		return bankClientService.readAllPeopleAboveAvgIsrael();
	}
}
