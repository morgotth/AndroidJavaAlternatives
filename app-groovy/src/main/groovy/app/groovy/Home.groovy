package app.groovy
import android.app.Activity
import android.os.Bundle
import android.support.annotation.Nullable
import android.widget.TextView
import groovy.transform.CompileStatic

@CompileStatic
class Home extends Activity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        def message = Utils.hello("Groovy")
        def text = findViewById(R.id.text) as TextView
        text.setText(message)
    }
}