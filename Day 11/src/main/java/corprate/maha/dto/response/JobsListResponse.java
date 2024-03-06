package corprate.maha.dto.response;

import java.util.List;

import corprate.maha.model.Jobs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobsListResponse {

    private List<Jobs> jobs;
}
