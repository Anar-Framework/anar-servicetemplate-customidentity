package af.gov.anar.dck.domain.exception;

public class SubmissionException extends Exception {
	
	public SubmissionException(String msg) {
		super(msg);
	}
	
	public SubmissionException(Throwable e) {
		super(e);
	}
}
