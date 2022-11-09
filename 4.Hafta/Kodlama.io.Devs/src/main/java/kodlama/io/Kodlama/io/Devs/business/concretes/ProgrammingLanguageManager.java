package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguage.GetAllProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguage.GetByIdProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> programmingLanguageReponse = new ArrayList<>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			programmingLanguageReponse.add(responseItem);
			
		}
		return programmingLanguageReponse;
	}

	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {
		ProgrammingLanguage programmingLanguage=this.programmingLanguageRepository.findById(id).get();
		GetByIdProgrammingLanguageResponse getProgrammingLanguageResponse=new GetByIdProgrammingLanguageResponse();
		getProgrammingLanguageResponse.setId(programmingLanguage.getId());
		getProgrammingLanguageResponse.setName(programmingLanguage.getName());
		
		return getProgrammingLanguageResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguage) {
		if (createProgrammingLanguage.getName()=="" || createProgrammingLanguage.getName()==null) {
			throw new RuntimeException("Name can not be empty. Please try again.");
		}
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
				if (programmingLanguage.getId() == language.getId()
						|| programmingLanguage.getName() == language.getName()) {
					throw new RuntimeException("Sorry , This name is already taken.");
				} else {
					
					break;
				}

			}

		programmingLanguage.setName(createProgrammingLanguage.getName());
		programmingLanguageRepository.save(programmingLanguage);
		
	}

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguage) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setId(deleteProgrammingLanguage.getId());
		programmingLanguageRepository.deleteById(deleteProgrammingLanguage.getId());
		
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguage) {
		if (updateProgrammingLanguage.getName()=="" || updateProgrammingLanguage.getName()==null) {
			throw new RuntimeException("Name can not be empty. Please try again.");
		}
		for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
				if (language.getName() == updateProgrammingLanguage.getName()) {
					throw new RuntimeException("Sorry , This name is already taken.");
				}

		}
		ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
		programmingLanguage.setId(updateProgrammingLanguage.getId());
		programmingLanguage.setName(updateProgrammingLanguage.getName());
		this.programmingLanguageRepository.save(programmingLanguage);
		
	}

}
