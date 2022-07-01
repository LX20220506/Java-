package Thymeleaf.Fruit.pojo;

public class Fruit {
    private int FId;
    private String FNmae;
    private int Price;
    private int FCount;
    private String Remark;

    public Fruit(int fId, String fNmae, int price, int fCount, String remark) {
        FId = fId;
        FNmae = fNmae;
        Price = price;
        FCount = fCount;
        Remark = remark;
    }

    public Fruit() {

    }

    public int getFId() {
        return FId;
    }

    public void setFId(int FId) {
        this.FId = FId;
    }

    public String getFNmae() {
        return FNmae;
    }

    public void setFNmae(String FNmae) {
        this.FNmae = FNmae;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getFCount() {
        return FCount;
    }

    public void setFCount(int FCount) {
        this.FCount = FCount;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "FId=" + FId +
                ", FNmae='" + FNmae + '\'' +
                ", Price=" + Price +
                ", FCount=" + FCount +
                ", Remark='" + Remark + '\'' +
                '}';
    }
}
