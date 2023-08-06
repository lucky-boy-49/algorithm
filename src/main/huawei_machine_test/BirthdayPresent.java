package main.huawei_machine_test;

/**
 * 生日礼物
 */
public class BirthdayPresent {

    public static void solution(String cakes, String gift, int x) {
        int res = 0;
        String[] gifts = gift.split(",");
        for (String cake : cakes.split(",")) {
            int cakeValue = Integer.parseInt(cake);
            for (String s : gifts) {
                int giftValue = Integer.parseInt(s);
                if (cakeValue + giftValue <= x) {
                    res++;
                }
            }

        }
        System.out.println(res);
    }

}
