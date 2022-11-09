package kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguageTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgrammingLanguageTechnologyRequest {
	private int id;
	private String name;
	private int programmingLanguageId;
}
