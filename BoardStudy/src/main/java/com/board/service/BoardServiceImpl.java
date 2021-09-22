package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO dao;

	// 게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
	}

	// 게시물 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(bno);
	}
	
	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception{
		dao.modify(vo);
	}

	// 게시물 삭제
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}
	
	// 게시물 총수량
	public int count() throws Exception{
		return dao.count();
	}

	// 게시물 목록 + 페이지기능
	public List list(int displayPost, int postNum, 
			String searchType, String keyword) throws Exception{
		return dao.list(displayPost, postNum, searchType, keyword);
	}

	// 검색 결과 게시물 총수량
	@Override
	public int searchCount(String serachType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return dao.searchCount(serachType, keyword);
	}
}
