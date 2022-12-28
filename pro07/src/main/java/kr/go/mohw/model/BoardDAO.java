package kr.go.mohw.model;

import java.util.List;

import kr.go.mohw.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> boardList() throws Exception;
}
