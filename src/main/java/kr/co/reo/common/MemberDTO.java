package kr.co.reo.common;

import java.sql.Date;

import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MemberDTO {
	private int mem_num;
	@Pattern(regexp="^\\S*$", message="공백문자를 입력할 수 없습니다.")
	@Email(message="이메일 형식이 아닙니다.")
	@NotEmpty(message = "이메일을 입력해주세요.")
	private String mem_email;
	@Pattern(regexp="(^[가-힣]*$)", message="이름이 아닙니다.")
	@NotEmpty(message = "이름을 입력해주세요.")
	private String mem_name;
	@Pattern(regexp="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$", message="비밀번호 형식을 확인해주세요.")
	@NotEmpty(message = "비밀번호를 입력해주세요.")
	private String mem_pw;
	@Pattern(regexp="(^[0-9]*$)", message="전화번호가 아닙니다.")
	@NotEmpty(message = "전화번호를 입력해주세요.")
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
