package com.board.domain;

public class Page {
	
	private int num; // 현재 페이지 넘버
	private int count; // 게시물 총수량
	private int postNum = 30; // 한 페이지 출력할 게시물 수량 [설정수정가능]
	private int pageNum;// 마지막 페이지번호=(게시물총량/한페이지수량)의올림
	private int displayPost; // 출력할 게시물
	
	private int pageNum_cnt = 10; // 한 화면에 출력할 페이지수 [설정수정가능]
	private int endPageNum; // 현화면 마지막 페이지번호
	private int startPageNum; // 첫번째 페이지
	private boolean prev; // [이전] 페이지 버튼
	private boolean next; // [다음] 페이지 버튼
	
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setCount(int count) {
		this.count = count;
		dataCalc();
	}
	public int getNum() {
		return num;
	}
	public int getPostNum() {
		return postNum;
	}
	public int getPageNum() {
		return pageNum;
	}
	public int getDisplayPost() {
		return displayPost;
	}
	public int getEndPageNum() {
		return endPageNum;
	}
	public int getStartPageNum() {
		return startPageNum;
	}
	public boolean isPrev() {
		return prev;
	}
	public boolean isNext() {
		return next;
	}
	
	private void dataCalc() {
		
		endPageNum=(int)(Math.ceil((double)num/(double)pageNum_cnt)*pageNum_cnt); // 마지막 페이지번호(현페이지기준)
		startPageNum = endPageNum - (pageNum_cnt - 1); // 시작 페이지번호
		pageNum = (int)Math.ceil((double)count/postNum); // 마지막페이지번호(전체페이지 기준) 아래 조건문에 쓰려고 계산.
		if(endPageNum > pageNum) { // 페이지 마지막 묶음에서 필요없는 페이지 안뜨게 걸러내기
			endPageNum = pageNum;
		}
		prev = startPageNum == 1 ? false : true; // 1페이지에서 안뜨게
		next = endPageNum * postNum >= count ? false : true; // 마지막 페이지 묶음에선 안 뜨게
		
		displayPost = (num - 1) * postNum; // 출력할 게시물
	}
	
	// 검색 타입과 검색어 유지
	
	public String getSearchTypeKeyword() {
		if(searchType.equals("") || keyword.equals("")) {
			return "";
		}else {
			return "&searchType=" + searchType + "&keyword=" + keyword;
		}
	}
	
	private String searchType;
	private String keyword;

	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
