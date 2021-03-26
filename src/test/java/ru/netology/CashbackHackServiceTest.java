package ru.netology;


import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldSumLess1000() {
        CashbackHackService service=new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSumMere1000(){
        CashbackHackService service=new CashbackHackService();
        int amount=1100;
        int actual= service.remain(amount);
        int expected=900;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSumEquel100(){}
    CashbackHackService service=new CashbackHackService();
    int amount =1000;
    int actual=service.remain(amount);
    int expected=0;
}


