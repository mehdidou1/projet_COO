package test;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StationTest {

    @Test
    public void testAddPosition() throws Exception {
        Station station = new Station();
        station.addPosition();

        // Use reflection to access the private listPositions field
        Field listPositionsField = Station.class.getDeclaredField("listPositions");
        listPositionsField.setAccessible(true);
        List<?> listPositions = (List<?>) listPositionsField.get(station);

        assertEquals(1, listPositions.size(), "addPosition should add one position to the list");
    }
}