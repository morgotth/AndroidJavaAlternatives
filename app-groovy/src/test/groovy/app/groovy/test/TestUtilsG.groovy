package app.groovy.test
import app.groovy.Utils
import groovy.transform.CompileStatic
import org.hamcrest.CoreMatchers
import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat

@CompileStatic
class TestUtilsG {

    @Test
    void testHello() throws Exception {
        assertThat(Utils.hello("groovy"), CoreMatchers.is("Hello groovy!"))
    }
}