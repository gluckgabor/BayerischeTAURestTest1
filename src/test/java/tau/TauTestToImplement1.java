package tau;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.Gson;

public class TauTestToImplement1 {

	private static final String EXPECTED_TYPE = "articles";
	private static final String EXPECTED_TITLE = "There is a JSON title!";
	private static final String EXPECTED_BODY = "The shortest article. Ever.";
	private static final int EXPECTED_MINIMUM_READERCOUNT = 300;
	private static final int EXPECTED_MAXIMUM_READERCOUNT = 400;
	

	@Test
	public void exampleTest() {
		// FIXME: Implement test, that uses the FakeRestAction.exampleResponse() method,
		// and implement meaningful assertions, based on the constant fields, and the
		// implemented example.

		final String apiResponse = FakeRestAction.exampleResponse();
		final ExampleResponseBean exampleResponseBean = new Gson().fromJson(apiResponse, ExampleResponseBean.class);

		Assert.assertEquals("Example response TYPE was not equal to expected one. Expected: " + EXPECTED_TYPE + " returned: "
						+ exampleResponseBean.getType(), EXPECTED_TYPE, exampleResponseBean.getType());

		Assert.assertEquals("Example response TITLE was not equal to expected one. Expected: " + EXPECTED_TITLE + " returned: "
						+ exampleResponseBean.getAttributes().getTitle(), EXPECTED_TITLE, exampleResponseBean.getAttributes().getTitle());

		Assert.assertEquals("Example response BODY was not equal to expected one. Expected: " + EXPECTED_BODY + " returned: "
						+ exampleResponseBean.getAttributes().getBody(), EXPECTED_BODY, exampleResponseBean.getAttributes().getBody());

		boolean is_within_range = !(exampleResponseBean.getAttributes().getReaderCount() >= EXPECTED_MINIMUM_READERCOUNT && exampleResponseBean.getAttributes().getReaderCount() <= EXPECTED_MAXIMUM_READERCOUNT);

		Assert.assertFalse("Example response READERCOUNT was not equal to expected one. Expected between "
						+ EXPECTED_MINIMUM_READERCOUNT + " and " + EXPECTED_MAXIMUM_READERCOUNT + " returned: "
						+ exampleResponseBean.getAttributes().getReaderCount(), is_within_range);
	}
}
