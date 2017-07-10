package com.spring.hibernate.model;
// default package
// Generated 2015. 11. 22 ���� 7:33:34 by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * TbUser generated by hbm2java
 */
public class TbUser implements java.io.Serializable {

	private String userid;
	private String password;
	private String name;
	private String email;
	private Short point;
	private Byte rank;
	private Date regdate;
	private Date lastdate;
	private String gender;
	private String interest;

	public TbUser() {
	}

	public TbUser(String userid, String password, String name, Date regdate) {
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.regdate = regdate;
	}

	public TbUser(String userid, String password, String name, String email,
			Short point, Byte rank, Date regdate, Date lastdate, String gender,
			String interest) {
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.email = email;
		this.point = point;
		this.rank = rank;
		this.regdate = regdate;
		this.lastdate = lastdate;
		this.gender = gender;
		this.interest = interest;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getPoint() {
		return this.point;
	}

	public void setPoint(Short point) {
		this.point = point;
	}

	public Byte getRank() {
		return this.rank;
	}

	public void setRank(Byte rank) {
		this.rank = rank;
	}

	public Date getRegdate() {
		return this.regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getLastdate() {
		return this.lastdate;
	}

	public void setLastdate(Date lastdate) {
		this.lastdate = lastdate;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "TbUser [userid=" + userid + ", password=" + password
				+ ", name=" + name + ", email=" + email + ", point=" + point
				+ ", rank=" + rank + ", regdate=" + regdate + ", lastdate="
				+ lastdate + ", gender=" + gender + ", interest=" + interest
				+ "]";
	}
}