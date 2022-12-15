package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.VO.BoardVO;
import com.dw.emp.mapper.BoardMapper;

@Service
public class BoardService {
	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoard(){
		return boardMapper.selectBoard();
	}
	
	public int insertBoard(BoardVO vo) {
		return boardMapper.insertBoard(vo);
	}
	
	public BoardVO selectBoardFindByBoardNo(int boardNo) {
		return boardMapper.selectBoardFindByBoardNo(boardNo);
	}
	public int deleteBoard(String writer) {
		return boardMapper.deleteBoard(writer);
	}
	public int updateBoard(BoardVO vo) {
		return boardMapper.updateBoard(vo);
	}
}
