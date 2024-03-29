package gov.cdc.ncezid.eip.kafka.exception;

import org.json.JSONException;
import org.json.JSONObject;


public class WorkerException extends Exception {

	private static final long serialVersionUID = 3638768641142369946L;

	private final String obj;

	public WorkerException(String message) {
		super(message);
		obj = null;
	}

	public WorkerException(Exception e) {
		super(e);
		obj = null;
	}

	public WorkerException(JSONObject obj) {
		this.obj = obj.toString();
	}

	public JSONObject getObj() throws JSONException {
		return obj != null ? new JSONObject(obj) : null;
	}

}
