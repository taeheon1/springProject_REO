package kr.co.reo.client.member.service;
import java.util.List;

import kr.co.reo.common.MemberDTO;

public interface MemberService {
	// CRUD 기능의 메소드 구현
	// 회원 등록
	void insertUser(MemberDTO dto);

	// 회원 수정
	void updateUser(MemberDTO dto);

	// 회원 삭제
	void deleteUser(MemberDTO dto);

	// 회정 정보 조회
	MemberDTO getUser(MemberDTO dto);

	// 회원 목록 조회
	List<MemberDTO> getUserList(MemberDTO dto);
}