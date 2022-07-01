package Fruit.pojo;

public class Fruit {
    private int FId;
    private String FName;
    private int Price;
    private int FCount;
    private String Remark;

    public Fruit(int fId, String FName, int price, int fCount, String remark) {
        FId = fId;
        FName = FName;
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

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
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
                ", FName='" + FName + '\'' +
                ", Price=" + Price +
                ", FCount=" + FCount +
                ", Remark='" + Remark + '\'' +
                '}';
    }
}
