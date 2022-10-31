package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
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
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getName()=="" || programmingLanguage.getName()==null) {
			throw new RuntimeException("Name can not be empty. Please try again.");
		}
		for (ProgrammingLanguage language : programmingLanguageRepository.getAll()) {
				if (programmingLanguage.getId() == language.getId()
						|| programmingLanguage.getName() == language.getName()) {
					throw new RuntimeException("Sorry , This name is already taken.");
				} else {
					
					break;
				}

			}

		programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);

	}

	@Override
	public void update(int id, ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getName()=="" || programmingLanguage.getName()==null) {
			throw new RuntimeException("Name can not be empty. Please try again.");
		}
		for (ProgrammingLanguage language : programmingLanguageRepository.getAll()) {
				if (language.getName() == programmingLanguage.getName()) {
					throw new RuntimeException("Sorry , This name is already taken.");
				}

		}
		programmingLanguageRepository.update(id, programmingLanguage);

	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}

}
