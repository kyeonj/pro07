package kr.go.mohw.service;

import java.util.List;

import kr.go.mohw.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> boardList() throws Exception;
}
