package kr.co.reo.client.member.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.reo.common.MemberDTO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	// 회원 등록
	public void insertUser(MemberDTO dto) {
		System.out.println("===> Mybatis로 insertBoard() 기능 처리");
		mybatis.insert("MemberDAO.insertMember", dto);
	}

	public void updateUser(MemberDTO dto) {
		System.out.println("===> Mybatis로 updateBoard() 기능 처리");
		mybatis.update("MemberDAO.updateUser", dto);
	}

	public void deleteUser(MemberDTO dto) {
		System.out.println("===> Mybatis로 deleteBoard() 기능 처리");
		mybatis.delete("MemberDAO.updateUser", dto);
	}
}
