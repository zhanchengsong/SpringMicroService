package zhancheng.api.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewSummary {
    private int reviewId;
    private String author;
    private String subject;


}
