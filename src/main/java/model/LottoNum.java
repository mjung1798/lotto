package model;

public class LottoNum {
    private int number;

    public static final int MAX_LOTTO_NUM = 45;
    public static final int MIN_LOTTO_NUM= 1;

    public LottoNum(int number){

        if( isValidRange(number) ) {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }

    private boolean isValidRange(int number) {
        return number <= 45 && number >= 1;
    }
}
