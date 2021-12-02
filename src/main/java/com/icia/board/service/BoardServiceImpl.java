package com.icia.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.board.dto.BoardDTO;
import com.icia.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardRepository br;

	@Override
	public void save(BoardDTO board) {
		br.save(board);
	}

	@Override
	public List<BoardDTO> findAll() {
//		List<BoardDTO> boardList = br.findAll();
//		return boardList;
		return br.findAll();
	}

	@Override
	public BoardDTO findById(long b_number) {
		BoardDTO board = br.findById(b_number);
		return board;
	}

	@Override
	public int hits(long b_number) {
		return br.hits(b_number);
	}

	@Override
	public void update(BoardDTO board) {
		br.update(board);
		
	}

	@Override
	public void delete(long b_number) {
		br.delete(b_number);
		
	}

	
}
