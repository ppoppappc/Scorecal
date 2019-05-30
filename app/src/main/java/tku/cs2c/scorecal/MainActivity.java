package tku.cs2c.scorecal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etPrograming,etDataStruct,etAlgorithm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews(){
        etPrograming = findViewById(R.id.editText);
        etDataStruct = findViewById(R.id.editText2);
        etAlgorithm = findViewById(R.id.editText3);
    }
    private boolean isValid(EditText editText){
        String pattern = "1[0]{2}|[0-9]{1,2}";
        String text = editText.getText().toString();

        if(!text.matches(pattern)){
            editText.setError("0~100");
            return false;
        }
        else{
            return true;
        }
    }

    public void onSubmitClick(View v){

    }
}
