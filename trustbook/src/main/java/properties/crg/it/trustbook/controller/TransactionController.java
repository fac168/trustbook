package properties.crg.it.trustbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import properties.crg.it.trustbook.dto.Transaction;

@RestController
public class TransactionController {
	
	@GetMapping("/getTransaction/{account}")
	public Transaction getTransaction(@PathVariable(value = "account" ) String account) {
		return new Transaction();
	}
}
