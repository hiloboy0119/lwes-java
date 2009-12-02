package org.lwes.db;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.io.File;

/**
 * @author fmaritato
 */

public class EmptyEventTest {

    private static final String ESF = "src/test/java/org/lwes/db/EmptyEventTest.esf";

    @Test
    public void testEmptyEvent() {

        EventTemplateDB template = new EventTemplateDB();
        template.setESFFile(new File(ESF));
        template.initialize();

        assertTrue(template.checkForEvent("EmptyEvent"));
    }
}