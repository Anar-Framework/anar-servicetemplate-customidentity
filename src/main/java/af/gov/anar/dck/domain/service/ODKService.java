package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.exception.SubmissionException;
import af.gov.anar.dck.domain.model.User;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface ODKService {
	public void processODKSubmission(MultiValueMap<String, MultipartFile> files, User user, boolean overrideFlag) throws SubmissionException, SubmissionException;
	public File getXMLFileFromSubmission(MultiValueMap<String, MultipartFile> filesMap);
}
