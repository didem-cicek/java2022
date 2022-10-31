package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}

	@GetMapping("/getById/{id}")
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageService.getById(id);
	}

	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage){
		programmingLanguageService.add(programmingLanguage);
	}

	@PutMapping("/update/{id}")
	public void update(ProgrammingLanguage programmingLanguage, int id) {
		programmingLanguageService.update(id, programmingLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(int id) {
		programmingLanguageService.delete(id);
	}
}
