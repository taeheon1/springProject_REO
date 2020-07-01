package kr.co.reo.common;

import java.sql.Date;

import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MemberDTO {
	private int mem_num;
	private String mem_email;
	private String mem_name;
	private String mem_pw;
	private String mem_tel;
	private String mem_role;
	private Date mem_regDate;
	private String mem_sector;
	private String mem_agentName;
	private String mem_agentTel;
	@XmlTransient
	private String searchCondition;
	@XmlTransient
	private String searchKeyword;

	public String getMem_sector() {
		return mem_sector;
	}

	public void setMem_sector(String mem_sector) {
		this.mem_sector = mem_sector;
	}

	public String getMem_agentName() {
		return mem_agentName;
	}

	public void setMem_agentName(String mem_agentName) {
		this.mem_agentName = mem_agentName;
	}

	public String getMem_agentTel() {
		return mem_agentTel;
	}

	public void setMem_agentTel(String mem_agentTel) {
		this.mem_agentTel = mem_agentTel;
	}

	@JsonIgnore
	public String getSearchCondition() {
		return searchCondition;
	}

	@JsonIgnore
	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public int getMem_num() {
		return mem_num;
	}

	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_tel() {
		return mem_tel;
	}

	public void setMem_tel(String mem_tel) {
		this.mem_tel = mem_tel;
	}

	public String getMem_role() {
		return mem_role;
	}

	public void setMem_role(String mem_role) {
		this.mem_role = mem_role;
	}

	public Date getMem_regDate() {
		return mem_regDate;
	}

	public void setMem_regDate(Date mem_regDate) {
		this.mem_regDate = mem_regDate;
	}
}
