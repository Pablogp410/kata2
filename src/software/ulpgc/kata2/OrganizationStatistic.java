package software.ulpgc.kata2;

import java.util.List;
import java.util.Map;

public interface OrganizationStatistic {
    Map<String,Integer> calculate(List<Organization> organizations);
}
