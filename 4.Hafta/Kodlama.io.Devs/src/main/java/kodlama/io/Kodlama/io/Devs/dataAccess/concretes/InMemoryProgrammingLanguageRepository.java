package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void update(int id, ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage language : programmingLanguages) {
			if(language.getId()==id) {
				language.setName(programmingLanguage.getName());
				break;
			}
		}
		
	}

	@Override
	public void delete(int id) {
		for (ProgrammingLanguage language : programmingLanguages) {
			if(language.getId()==id) {
				programmingLanguages.remove(language);
				break;
			}
		}
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage language : programmingLanguages) {
			if(language.getId()==id) {
				return language;
			}
		}
		return null;
	}


}
