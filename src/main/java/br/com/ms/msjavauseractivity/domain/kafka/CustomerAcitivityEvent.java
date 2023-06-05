package br.com.ms.msjavauseractivity.domain.kafka;

public class CustomerAcitivityEvent {
	
	private String userid;
	private String activity;
	private String time;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "{userid:" + userid + ", activity:" + activity + ", time:" + time + "}";
	}
	
	
	
}
