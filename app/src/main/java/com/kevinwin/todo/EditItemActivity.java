package com.kevinwin.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditText;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etEditText = (EditText) findViewById(R.id.etEditField);

        String editableText = getIntent().getStringExtra("text");
        pos = getIntent().getIntExtra("pos", 0);

        etEditText.setText(editableText);
    }

    public void onSave(View view) {
        Intent data = new Intent();
        data.putExtra("newText", etEditText.getText().toString());
        data.putExtra("pos", pos);


        setResult(24, data);
        finish();
    }
}
