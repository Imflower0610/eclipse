package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.VO.BoardVO;



@Mapper
public interface BoardMapper {

	public List<BoardVO> selectBoard();
	
//	아이디로 맵핑(연결)하는 것이기 때문에 작성한 쿼리 아이디와 메소드 이름이 동일해야 된다.
	public int insertBoard(BoardVO vo);
	
	public BoardVO selectBoardFindByBoardNo(int boardNo);
	
	public int updateBoard(BoardVO vo);
	
	public int deleteBoard(String writer);
}
