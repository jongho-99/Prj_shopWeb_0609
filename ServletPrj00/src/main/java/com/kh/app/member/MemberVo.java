package com.kh.app.member;

public class MemberVo {
	private String no;
	private String user_Id;
	private String user_Pwd;
	private String user_Nick;
	private String created_Date;
	private String del_Yn;
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVo(String no, String user_Id, String user_Pwd, String user_Nick, String created_Date, String del_Yn) {
		super();
		this.no = no;
		this.user_Id = user_Id;
		this.user_Pwd = user_Pwd;
		this.user_Nick = user_Nick;
		this.created_Date = created_Date;
		this.del_Yn = del_Yn;
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", user_Id=" + user_Id + ", user_Pwd=" + user_Pwd + ", user_Nick=" + user_Nick
				+ ", created_Date=" + created_Date + ", del_Yn=" + del_Yn + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_Pwd() {
		return user_Pwd;
	}
	public void setUser_Pwd(String user_Pwd) {
		this.user_Pwd = user_Pwd;
	}
	public String getUser_Nick() {
		return user_Nick;
	}
	public void setUser_Nick(String user_Nick) {
		this.user_Nick = user_Nick;
	}
	public String getCreated_Date() {
		return created_Date;
	}
	public void setCreated_Date(String created_Date) {
		this.created_Date = created_Date;
	}
	public String getDel_Yn() {
		return del_Yn;
	}
	public void setDel_Yn(String del_Yn) {
		this.del_Yn = del_Yn;
	}
	
	
	
	
}
