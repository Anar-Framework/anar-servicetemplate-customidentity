package af.gov.anar.dck.common.exception;

public class SubmissionException extends Exception {
	
	public SubmissionException(String msg) {
		super(msg);
	}
	
	public SubmissionException(Throwable e) {
		super(e);
	}
}
