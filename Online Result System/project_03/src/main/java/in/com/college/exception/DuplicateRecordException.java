package in.com.college.exception;

public class DuplicateRecordException extends Exception{
	/**
	 * @author Kapil Dudhe
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateRecordException(String msg){
		super(msg);
	}
}
