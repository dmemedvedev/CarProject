package home;

public enum CarModel {

    SORENTO("KIA" ,2021),
    A5("AUDI" , 2022),
    XC90("VOLVO", 2020);

    private String brandName;
    private int issueYear;

    private CarModel(String brandName, int issueYear) {
        this.brandName = brandName;
        this.issueYear = issueYear;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getIssueYear() {
        return issueYear;
    }
}