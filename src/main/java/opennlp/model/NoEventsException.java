package opennlp.model;

public class NoEventsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NoEventsException() {}

	public NoEventsException(String message) {
		super(message);
	}

	public NoEventsException(Throwable cause) {
		super(cause);
	}

	public NoEventsException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoEventsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
