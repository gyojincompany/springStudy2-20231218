package com.jbedu.test2;

public class JoinMember {
	
	private String joinId;
	private String joinPw;
	private String joinName;
	private String joinEmail;
	
	public JoinMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JoinMember(String joinId, String joinPw, String joinName, String joinEmail) {
		super();
		this.joinId = joinId;
		this.joinPw = joinPw;
		this.joinName = joinName;
		this.joinEmail = joinEmail;
	}
	public String getJoinId() {
		return joinId;
	}
	public void setJoinId(String joinId) {
		this.joinId = joinId;
	}
	public String getJoinPw() {
		return joinPw;
	}
	public void setJoinPw(String joinPw) {
		this.joinPw = joinPw;
	}
	public String getJoinName() {
		return joinName;
	}
	public void setJoinName(String joinName) {
		this.joinName = joinName;
	}
	public String getJoinEmail() {
		return joinEmail;
	}
	public void setJoinEmail(String joinEmail) {
		this.joinEmail = joinEmail;
	}
	
	

}
