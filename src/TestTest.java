import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class TestTest {

   // @Test
    @RepeatedTest(5) //20 раз запустить
    @DisplayName("проверка расчета") //описание теста
    public void test0(){
        int result = 10 / 1;
        Assertions.assertEquals(10,10 / 1);
    }

}