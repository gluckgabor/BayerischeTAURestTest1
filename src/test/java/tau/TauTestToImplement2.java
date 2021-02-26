package tau;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TauTestToImplement2 {

    private final static int[] EXPECTED_ERROR_CODES = {400, 401, 403, 404};

    @Test
    public void exampleTest() {
        //FIXME: Implement test, that uses the FakeRestAction.errorResponse() method.
    	final String apiResponse = FakeRestAction.errorResponse();
       
        //FIXME: Implement ErrorResponseBean as the parsing result of the call.
    	 final ErrorResponseBean errorResponseBean = new Gson().fromJson(apiResponse, ErrorResponseBean.class);
    	 
        //FIXME: Check if the results contain expected error codes, fail if there is one, that is not in EXPECTED_ERROR_CODES constant.
    	List <Integer> expected_error_codes = new ArrayList<>(); 
    	
    	for(int i: EXPECTED_ERROR_CODES) {
    		
    		expected_error_codes.add(i);
    	}
    	
    	for(ErrorResponseBean.Error error: errorResponseBean.errors) {
    		Assert.assertTrue("Example response ERROR_CODE was not equal to expected one. Expected: " + Arrays.toString(EXPECTED_ERROR_CODES) + " returned: " + error.getStatus(), expected_error_codes.contains(error.getStatus()));
    	}
    	     	 
        //HINT: Parse response into an array in a form like: final ErrorResponseBean[] errorResponseBean = new Gson().fromJson(apiResponse, ErrorResponseBean[].class);
    }

}
