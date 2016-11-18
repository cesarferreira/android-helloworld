package github.cesarferreira.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements MainActivityView {

    Button mToastButton;
    MainActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);

        setupViews();
    }

    private void setupViews() {
        mToastButton = (Button) findViewById(R.id.toastButton);

        mToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.toastButtonClicked();
            }
        });
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "Hi, I'm a toast!", Toast.LENGTH_SHORT).show();
    }
}
