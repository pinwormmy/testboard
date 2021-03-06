package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {
	
	// 게시물 작성
	public void write(BoardVO vo) throws Exception;
	
	// 게시물 조회
	public BoardVO view(int bno) throws Exception;
	
	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;
	
	// 게시물 삭제
	public void delete(int bno) throws Exception;
	
	// 게시물 총수량
	public int count() throws Exception;
	
	// 게시물 목록 + 페이지기능
	public List<BoardVO> list(int displayPost, int postNum, 
			String searchType, String keyword) throws Exception;
	
	// 검색 결과 게시물 총수량
	public int searchCount(String searchType, String keyword) throws Exception;

}
