package hw03;

public class PhoneInfo {
    String[] names = new String[100];
    String[] phoneNums = new String[100];

    int index = 0;

    public void insertPhoneInfo(String name, String phoneNum) {
        names[index] = name;
        phoneNums[index++] = phoneNum;
    }

    public void printAllPhoneInfo() {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("이름: " + names[i] + ", 번호: " + phoneNums[i]);
            }
        }
    }

    public void printPhoneInfo(int index) {
        if (names[index] != null) {
            System.out.println("이름: " + names[index] + ", 번호: " + phoneNums[index]);
        } else {
            System.out.println("해당 번호로 저장된 정보가 없습니다.");
        }
    }
}
