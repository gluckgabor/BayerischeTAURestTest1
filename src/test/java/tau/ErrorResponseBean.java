package tau;

import java.time.LocalDateTime;
import java.util.List;

public class ErrorResponseBean {
	
	static class Error
	
	{
    	private String detail;
        private String title;
        private int status;
        
		public String getDetail() {
			return detail;
		}
		public String getTitle() {
			return title;
		}
		public int getStatus() {
			return status;
		} 
	}
	
	List<Error> errors;
} 
