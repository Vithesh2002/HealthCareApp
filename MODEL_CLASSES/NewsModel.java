package MODEL_CLASSES;

import java.util.ArrayList;

public class NewsModel {

private String status;
private String totalResults;
ArrayList<articles> articles;

    public NewsModel(String status, String totalResults, ArrayList<MODEL_CLASSES.articles> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<MODEL_CLASSES.articles> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<MODEL_CLASSES.articles> articles) {
        this.articles = articles;
    }
}
