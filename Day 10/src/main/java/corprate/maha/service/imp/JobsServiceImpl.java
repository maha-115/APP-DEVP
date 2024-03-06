package corprate.maha.service.imp;

import corprate.maha.dto.request.JobsRequest;
import corprate.maha.dto.response.JobsListResponse;
import corprate.maha.dto.response.JobsResponse;
import corprate.maha.model.Jobs;
import corprate.maha.repository.JobsRepository;
import corprate.maha.service.JobsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    private JobsRepository jobsRepository;

    @Override
    public JobsResponse createJobs(JobsRequest jobs) {

        var eve = Jobs.builder()
                        .jobname(jobs.getJobname())
                        .description(jobs.getDescription())
                        .location(jobs.getLocation())
                        .salary(jobs.getSalary())
                        .build();

        jobsRepository.save(eve);

        return JobsResponse.builder().message("jobss added successfully").build();
    }

    @Override
    public JobsListResponse getAllJobs(){

        List<Jobs> jobs = jobsRepository.findAll();
        return JobsListResponse.builder()
            .jobs(jobs)
            .build();
    }


    // Other CRUD methods can be implemented similarly
}

