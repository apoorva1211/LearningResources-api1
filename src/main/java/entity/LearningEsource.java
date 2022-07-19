package entity;

public class LearningEsource {
    enum LearningResourceStatus {
        PLANNING, PUBLISHED, LIVE, RETIRED
    }

    private int id;
    private String name;
    private int costPrice, sellingPrice;
    private String productStatus;
    private String createdDate, publishedDate, retiredDate;

    public LearningEsource(String name) {
        this.name = name;
    }

    public LearningEsource(int costPrice, int sellingPrice) {
        this.costPrice = costPrice;
        this.sellingPrice= sellingPrice;
    }

    public LearningEsource(String productStatus, String createdDate, String publishedDate, String retiredDate) {
        this.productStatus = productStatus;
        this.createdDate = createdDate;
        this.publishedDate = publishedDate;
        this.retiredDate = retiredDate;
    }

    public LearningEsource(int id) {
        this.id = id;
    }
}
