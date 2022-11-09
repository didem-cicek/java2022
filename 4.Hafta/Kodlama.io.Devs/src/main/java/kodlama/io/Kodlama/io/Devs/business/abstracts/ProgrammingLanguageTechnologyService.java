package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.DeleteProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguageTechnology.GetAllProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguageTechnology.GetByIdProgrammingLanguageTechnologyResponse;

public interface ProgrammingLanguageTechnologyService {
	List<GetAllProgrammingLanguageTechnologyResponse> getAll();
	void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnology) throws Exception;
	void delete (DeleteProgrammingLanguageTechnologyRequest deleteProgrammingLanguage) throws Exception;
	void update (UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguage) throws Exception;
	GetByIdProgrammingLanguageTechnologyResponse getById(int id);
}
