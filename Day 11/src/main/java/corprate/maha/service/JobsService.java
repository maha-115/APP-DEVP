package corprate.maha.service;

import corprate.maha.dto.request.JobsRequest;
import corprate.maha.dto.response.JobsListResponse;
import corprate.maha.dto.response.JobsResponse;


public interface JobsService {
    JobsResponse createJobs(JobsRequest jobs);

    JobsListResponse getAllJobs();
}
