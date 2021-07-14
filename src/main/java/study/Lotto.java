package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public enum Lotto {
    RANK_NONE(0, 0, num -> 0),
    RANK_4TH(3, 5_000, num -> 5000),
    RANK_3RD(4, 50_000, num -> 50000),
    RANK_2ND(5, 1_500_000, num -> 1500000),
    RANK_1ST(6, 2_000_000_000, num -> 2000000000);

    private final int matchingCount;
    private final int amount;
    private final Function<Integer, Integer> function;

    private Lotto(int matchingCount, int amount, Function<Integer, Integer> function) {
        this.matchingCount = matchingCount;
        this.amount = amount;
        this.function = function;
    }

    public int getMatchingCount() {
        return matchingCount;
    }

    public int getAmount() {
        return amount;
    }

    public static Lotto getLotto(int matchingCount) {
        Lotto result = RANK_NONE;
        List<Lotto> list = new ArrayList<>();


        for(Lotto lotto : values()) {
            result = lotto.findType(matchingCount);
            // System.out.println("#### " + result.name());
            // list.add(result);
        }

        // Arrays.sort(list);
        Collections.sort(list);
        for(Lotto lotto : list){
            System.out.println("@@@@@ " + lotto.name());
        }


        return result;
    }

    public Lotto findType(int matchingCount) {
        if(this.matchingCount == matchingCount) {
            return this;
        }
        return RANK_NONE;
    }

}
