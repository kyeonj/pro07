package kr.go.mohw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.mohw.dto.SampleDTO;
import kr.go.mohw.model.SampleDAO;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleDAO sampleDAO;

	@Override
	public List<SampleDTO> sampleList() throws Exception {
		return sampleDAO.sampleList();
	}

	@Override
	public SampleDTO getSample(String id) throws Exception {
		return sampleDAO.getSample(id);
	}

	@Override
	public void addSample(SampleDTO sample) throws Exception {
		sampleDAO.addSample(sample);
	}
	
	
}
