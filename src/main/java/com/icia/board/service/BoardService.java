package com.icia.board.service;

import java.util.List;

import com.icia.board.dto.BoardDTO;

public interface BoardService {
	
	// interface
	// 추상메서드를 가짐 -> 실행블록은 없고 메서드 선언부만 있음.
	// interface를 구현(implements)하는 구현 클래스에서 실행블록을 작성함.
	
	public void save(BoardDTO board);

	public List<BoardDTO> findAll();

	public BoardDTO findById(long b_number);

	public int hits(long b_number);

	public void update(BoardDTO board);

	public void delete(long b_number);



}
