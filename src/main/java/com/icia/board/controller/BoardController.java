package com.icia.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;

// /board/* 주소를 모두 처리
@Controller
@RequestMapping(value="/board/*")
public class BoardController {
		
	@Autowired
	private BoardService bs;
	
	// 글쓰기 페이지 출력
	@RequestMapping(value="save", method=RequestMethod.GET)
	public String saveForm() {
		// views/board 폴더에 있는 save.jsp를 출력
		return "board/save";
	}

	// 글쓰기 처리
	@RequestMapping(value="save", method=RequestMethod.POST)
	public String save(@ModelAttribute BoardDTO board) {
		bs.save(board);
		return "redirect:/board/findAll";
	}
	
	// 글쓰기목록 출력
	@RequestMapping(value="findAll", method=RequestMethod.GET)
	public String findAll(Model model) {
		List<BoardDTO> boardList = bs.findAll();
		model.addAttribute("boardList", boardList);
		return "board/findAll";
	}
	
	// 상세조회 출력
	@RequestMapping(value="detail", method=RequestMethod.GET)
	public String findById(@RequestParam("b_number") long b_number, Model model) {
		BoardDTO board = bs.findById(b_number);
		model.addAttribute("board", board);
		return "board/detail";
	}
	
	// 수정화면 출력
	@RequestMapping(value="update", method=RequestMethod.GET)
	public String updateFrom(@RequestParam("b_number") long b_number, Model model) {
		BoardDTO baord = bs.findById(b_number);
		model.addAttribute("board", baord);
		return "board/update";
	}
	
	// 수정처리
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String update(@ModelAttribute BoardDTO board, Model model) {
		bs.update(board);
		return "redirect:/board/detail?b_number=" + board.getB_number();
	}
	
	// 삭제처리
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String delete(@RequestParam("b_number") long b_number, Model model) {
		bs.delete(b_number);
		return "redirect:/board/findAll";
	}
}
