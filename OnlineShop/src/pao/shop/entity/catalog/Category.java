package pao.shop.entity.catalog;

public class Category {
    private Integer id;
    private String categoryName;

    public Category(String categoryName, int categoryCode) {
        this.categoryName = categoryName;
        this.id = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "category: Name=" + categoryName +
                ", Code=" + id;
    }
}
