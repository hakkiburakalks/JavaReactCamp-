package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.Candidates;




public interface CandidatesService {

	DataResult<List<Candidates>> getAll();
	DataResult<Candidates> add(Candidates candidate);
}
