import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettingUpTest {
    @Test
    void getNameNegativeNumberTest(){
        SettingUp settingUp = new SettingUp();
        String result = settingUp.getName(-1);
        Assertions.assertEquals("a",result);
    }

    @Test
    void getNamePositiveNumberTest(){
        SettingUp settingUp = new SettingUp();
        String result = settingUp.getName(1);
        Assertions.assertEquals("b",result);
    }
}