package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageTechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.DeleteProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguageTechnology.GetAllProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguageTechnology.GetByIdProgrammingLanguageTechnologyResponse;

@RestController
@RequestMapping("/api/programmingtechnologies")
public class ProgrammingTechnologiesController {

	private ProgrammingLanguageTechnologyService programmingTechnologyService;

	@Autowired
	public ProgrammingTechnologiesController(ProgrammingLanguageTechnologyService programmingTechnologyService) {
		this.programmingTechnologyService = programmingTechnologyService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnology) {
		programmingTechnologyService.add(createProgrammingLanguageTechnology);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody DeleteProgrammingLanguageTechnologyRequest deleteProgrammingLanguage) {
		programmingTechnologyService.delete(deleteProgrammingLanguage);
	}

	@PutMapping("/update")
	public void update(@RequestBody UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguage) {
		programmingTechnologyService.update(updateProgrammingLanguage);
	}

	@GetMapping("/getall")
	public List<GetAllProgrammingLanguageTechnologyResponse> getAll() {
		return programmingTechnologyService.getAll();
	}

	@GetMapping("/getbyid/{id}")

	public GetByIdProgrammingLanguageTechnologyResponse getById(int id) {
		return programmingTechnologyService.getById(id);
	}

}
