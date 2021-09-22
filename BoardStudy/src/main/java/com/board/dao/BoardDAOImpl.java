package com.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.board";
	
	// 게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".write", vo);
	}

	// 게시물 조회
	public BoardVO view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".view", bno);	
	}
	
	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception{
		sql.update(namespace + ".modify", vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".delete", bno);
	}
	
	// 게시물 총수량
	@Override
	public int count() throws Exception{
		return sql.selectOne(namespace + ".count");
	}

	// 게시물 목록 + 페이지기능
	@Override
	public List list(int displayPost, int postNum, 
			String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		HashMap data = new HashMap();
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
		
		data.put("searchType", searchType);
		data.put("keyword", keyword);
				
		return sql.selectList(namespace + ".list", data);
	}
	
	// 검색 결과 게시물 총수량
	@Override
	public int searchCount(String searchType, String keyword) throws Exception{
		
		HashMap data = new HashMap();
		
		data.put("searchType", searchType);
		data.put("keyword", keyword);
		
		return sql.selectOne(namespace + ".serachCount", data);
	}
}
