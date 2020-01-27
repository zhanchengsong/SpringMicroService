package zhancheng.api.recommendation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RecommendationSummary {
    private int recommendationId;
    private String author;
    private int rate;
}
