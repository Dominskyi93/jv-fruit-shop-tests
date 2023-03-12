package core.basesyntax.db;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Test;

public class StorageTest {

    @After
    public void cleanStorageAfterEach() {
        Storage.STORAGE.clear();
    }

    @Test
    public void storage_notEmptyMap_ok() {
        Map<String, Integer> expected = new HashMap<>();
        for (int i = 0; i < 50; i++) {
            Storage.STORAGE.put(("apple" + i), i);
            expected.put(("apple" + i), i);
            assertEquals(expected, Storage.STORAGE);
        }
    }

    @Test
    public void storage_emptyMap_ok() {
        assertEquals(new HashMap<>(), Storage.STORAGE);
    }
}
