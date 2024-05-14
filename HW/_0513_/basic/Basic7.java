package _0513_.basic;

public enum Basic7 {
    KOR("한국", "불고기"),
    CHI("중국", "짜장면"),
    JAP("일본", "초밥"),
    USA("미국", "햄버거");

    private final String countryName;
    private final String representativeFood;

    Basic7(String countryName, String representativeFood) {
        this.countryName = countryName;
        this.representativeFood = representativeFood;
    }
    public String getCountryName() {
        return countryName;
    }
    public String getRepresentativeFood() {
        return representativeFood;
    }

    public void notifyFood(String country) {
        for (Basic7 c : Basic7.values()) {
            if (c.getCountryName().equals(country)) {
                System.out.println(country + "의 대표음식은 " + c.getRepresentativeFood() + "입니다.");
            } else {
                System.out.println("그런 나라는 없습니다.");
            }
        }
    }
}
