package app.groovy.test;

import org.junit.Test;

import app.groovy.Utils;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestUtils {

    @Test
    public void testHello() throws Exception {
        assertThat(Utils.hello("java"), is("Hello java!"));
    }
}