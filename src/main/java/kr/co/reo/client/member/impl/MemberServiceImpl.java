package kr.co.reo.client.member.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.reo.client.member.service.MemberService;
import kr.co.reo.common.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO MemberDAO;

	public void insertUser(MemberDTO dto) {
		MemberDAO.insertUser(dto);
	}

	public void updateUser(MemberDTO dto) {
		MemberDAO.updateUser(dto);
	}

	public void deleteUser(MemberDTO dto) {
		MemberDAO.deleteUser(dto);
	}

	@Override
	public MemberDTO getUser(MemberDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> getUserList(MemberDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
}
