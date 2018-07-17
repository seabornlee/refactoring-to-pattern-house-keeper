import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class HouseKeeperTest {
    @Test
    public void should_control_light() {
        // given
        Light light = new Light();

        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.setLight(light);

        // when
        houseKeeper.masterAtHome();

        // then
        assertTrue(light.isOn());
    }
}
