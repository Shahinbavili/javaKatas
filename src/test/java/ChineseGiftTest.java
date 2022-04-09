import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChineseGiftTest {
    @Test
    void goodBudgetDivided() {
        luckeyMoney(150, 9);
    }

    @Test
    void isIdealBudget() {
        int result = luckeyMoney(64, 8);
        Assertions.assertEquals(8,result);
    }

    @Test
    void noGiftEgualTo4() {
        int result = luckeyMoney(68, 9);
        Assertions.assertEquals(7,result);
    }

    @Test
    void noGiftEgualsTo0() {
        int result = luckeyMoney(64, 9);
        Assertions.assertEquals(7,result);
    }

    @Test
    void budgetLessThan8() {
        int result = luckeyMoney(7, 1);
        Assertions.assertEquals(0,result);
    }

    @Test
    void noBudget() {
        int result = luckeyMoney(0, 9);
        Assertions.assertEquals(0,result);
    }

    @Test
    void importantMontant() {
        int result = luckeyMoney(99, 9);
        Assertions.assertEquals(9,result);
    }

    private int luckeyMoney(int money, int giftees) {
        int packet8 = 0;

        if (money >= giftees * 8) {
            int extraOfbudget = money - (giftees * 8);
            money -= extraOfbudget;
            packet8 = money/8;

       } else {
            if (money % 8 == 4 || money % 8 == 0) {
                money -= 8;
            }
            while (money - 8 >= 0) {
                packet8++;
                money -= 8;
            }
        }
        //only one return for this methode
        return packet8;
    }
}
