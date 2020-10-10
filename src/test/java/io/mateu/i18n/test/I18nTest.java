package io.mateu.i18n.test;

import io.mateu.i18n.Translator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class I18nTest {

    @Test
    public void testFound() {
        String t = Translator.translate("test1");
        assertEquals("Hola Test 1", t);
    }


    @Test
    public void testDefault() {
        String t = Translator.translate("test2");
        assertEquals("bbbbbbb", t);
    }

    @Test
    public void testNaturalKey() {
        String t = Translator.translate("test 3");
        assertEquals("Hola Test 3", t);
    }


    @Test
    public void testNotFound() {
        String t = Translator.translate("No translation");
        assertEquals("No translation", t);
    }

}
