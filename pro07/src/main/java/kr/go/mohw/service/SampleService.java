package kr.go.mohw.service;

import java.util.List;

import kr.go.mohw.dto.SampleDTO;

public interface SampleService {
	public List<SampleDTO> sampleList() throws Exception;
	public SampleDTO getSample(String id) throws Exception;
	public void addSample(SampleDTO sample) throws Exception;
}
