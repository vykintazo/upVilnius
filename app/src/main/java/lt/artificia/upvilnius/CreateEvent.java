package lt.artificia.upvilnius;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;

import static java.security.AccessController.getContext;

public class CreateEvent extends Activity {

    String[] List1 = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] List2 = new String[] {"Basketball", "Football", "Baseball", "Tennis", "Other"};
    String[] List3 = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                        R.layout.dropdown_menu_popup_item,
                        List1);

        AutoCompleteTextView editTextFilledExposedDropdown = findViewById(R.id.filled_exposed_dropdown1);
        editTextFilledExposedDropdown.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                R.layout.dropdown_menu_popup_item,
                List2);

        AutoCompleteTextView editTextFilledExposedDropdown2 = findViewById(R.id.filled_exposed_dropdown2);
        editTextFilledExposedDropdown2.setAdapter(adapter2);

    }

    public void close(View v){
        finish();
    }
}
