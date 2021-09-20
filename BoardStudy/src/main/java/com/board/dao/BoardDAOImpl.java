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
	
	// 게시물 목록
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace + ".list");
	}

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
	public int count() throws Exception{
		return sql.selectOne(namespace + ".count");
	}

	@Override
	public List listPage(int displayPost, int postNum) throws Exception {
		// TODO Auto-generated method stub
		HashMap data = new HashMap();
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
				
		return sql.selectList(namespace + ".listPage", data);
	}
}
