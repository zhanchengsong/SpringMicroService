package zhancheng.api.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zhancheng.api.recommendation.RecommendationSummary;
import zhancheng.api.review.ReviewSummary;
import zhancheng.api.service.ServiceAddresses;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductAggregate {
    private int productId;
    private  String name;
    private  int weight;
    private  List<RecommendationSummary> recommendations;
    private  List<ReviewSummary> reviews;
    private  ServiceAddresses serviceAddresses;



}
