package in.com.college.exception;

public class RecordNotFoundException extends Exception{
	/**
	 * @author Kapil Dudhe
	 */
	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String msg){
		super(msg);
	}
}
