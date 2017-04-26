import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Ajay verma on 26-04-2017.
 */
public class list extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list_view;
        String items[] = new String[]{"Apple",
                "Banana",
                "carrot",
                "doll",
                "eagle",
                "fish",
                "girl",
                "hat"};
        list_view = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, items);
        list_view.setAdapter(adapter);


    }
}
