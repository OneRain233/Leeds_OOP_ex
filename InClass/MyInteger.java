public class MyInteger {
    private  int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public boolean isEven() {
        return value % 2 == 0;
    }
    public boolean isOdd() {
        return value % 2 != 0;
    }
    public static int parseInt(char[] value) {
        String valueString = new String(value);
        return Integer.parseInt(valueString);

    }
    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
    public boolean equals(int tmp) {
        return tmp == value;
    }
    public boolean equals(MyInteger other) {
        return other.getValue() == value;
    }


}
