package tr.com.biletix.test.api.dto;

import java.util.Date;

public class BtxTAInputDTO {

	private String testCaseName;
	private String result;
	private String resultMessage;
	private Date startTestCase;
	private Date finishTestCase;

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Date getStartTestCase() {
		return startTestCase;
	}

	public void setStartTestCase(Date startTestCase) {
		this.startTestCase = startTestCase;
	}

	public Date getFinishTestCase() {
		return finishTestCase;
	}

	public void setFinishTestCase(Date finishTestCase) {
		this.finishTestCase = finishTestCase;
	}

}
