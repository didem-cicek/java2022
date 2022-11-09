package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageTechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.DeleteProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguageTechnology.GetAllProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguageTechnology.GetByIdProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageTechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguageTechnology;

public class ProgrammingTechnologyManager implements ProgrammingLanguageTechnologyService {

	private ProgrammingLanguageTechnologyRepository programmingTechnologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingTechnologyManager(ProgrammingLanguageTechnologyRepository programmingTechnologyRepository,
			ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingTechnologyRepository = programmingTechnologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageTechnologyResponse> getAll() {
		List<ProgrammingLanguageTechnology> programmingLanguageTechnology = programmingTechnologyRepository.findAll();
		List<GetAllProgrammingLanguageTechnologyResponse> getAllProgrammingLanguageTechnologyResponse = new ArrayList<GetAllProgrammingLanguageTechnologyResponse>();

		for (ProgrammingLanguageTechnology programmingTechnology : programmingLanguageTechnology) {
			GetAllProgrammingLanguageTechnologyResponse responseItem = new GetAllProgrammingLanguageTechnologyResponse();
			responseItem.setId(programmingTechnology.getId());
			responseItem.setName(programmingTechnology.getName());
			responseItem.setProgrammingLanguage(programmingTechnology.getProgrammingLanguage().getName());
			responseItem.setProgrammingLanguageId(programmingTechnology.getProgrammingLanguage().getId());
			getAllProgrammingLanguageTechnologyResponse.add(responseItem);
		}
		return getAllProgrammingLanguageTechnologyResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnology) {
		ProgrammingLanguageTechnology programmingLanguageTechnology = new ProgrammingLanguageTechnology();
		ProgrammingLanguage languages = programmingLanguageRepository
				.findById(createProgrammingLanguageTechnology.getProgrammingLanguageId()).get();
		programmingLanguageTechnology.setName(createProgrammingLanguageTechnology.getName());
		programmingLanguageTechnology.setProgrammingLanguage(languages);
		programmingTechnologyRepository.save(programmingLanguageTechnology);
	}

	@Override
	public void delete(DeleteProgrammingLanguageTechnologyRequest deleteProgrammingLanguage) {
		programmingTechnologyRepository.deleteById(deleteProgrammingLanguage.getId());

	}

	@Override
	public void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguage) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository
				.findById(updateProgrammingLanguage.getProgrammingLanguageId()).get();
		ProgrammingLanguageTechnology technology = programmingTechnologyRepository.findById(updateProgrammingLanguage.getId()).get();
		technology.setName(updateProgrammingLanguage.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		programmingTechnologyRepository.save(technology);

	}

	@Override
	public GetByIdProgrammingLanguageTechnologyResponse getById(int id) {
		ProgrammingLanguageTechnology programmingLanguageTechnology = this.programmingTechnologyRepository.findById(id)
				.get();
		GetByIdProgrammingLanguageTechnologyResponse getByIdProgrammingLanguageTechnologyResponse = new GetByIdProgrammingLanguageTechnologyResponse();
		getByIdProgrammingLanguageTechnologyResponse.setName(programmingLanguageTechnology.getName());
		return getByIdProgrammingLanguageTechnologyResponse;
	}

}
