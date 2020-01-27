package zhancheng.api.recommendation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation {
    private  int productId;
    private  int recommendationId;
    private  String author;
    private  int rate;
    private  String content;
    private  String serviceAddress;

    
}
