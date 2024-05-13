package hw10.basic;

public enum Country {

    KOR("한국", "불고기"),
    CHI("중국", "짜장면"),
    JAP("일본", "초밥"),
    USA("미국", "햄버거");

    private String countryName;
    private String food;

    Country(String countryName, String food) {
        this.countryName = countryName;
        this.food = food;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
