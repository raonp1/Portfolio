package raonp1.bit;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources = getResources();
        String paperName = resources.getString(R.string.paperName);
        TextView txtDisplay = (TextView)findViewById(R.id.Hi);
        txtDisplay.setText(paperName);
    }
}
