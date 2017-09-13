package www.leslie.org.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public Button mBtnRemoveF2;
    public Button mBtnAddF1;
    public Button mBtnAddF2;
    public Button mBtnAttachF2;
    public Button mBtnAttachF1;
    public Button mBtnDetachF1;
    public Button mBtnDetachF2;
    public Button mBtnRemoveF1;
    public Button mBtnHidenF1;
    public Button mBtnShowF1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();

    }

    private void initListener() {
        mBtnAttachF1.setOnClickListener(this);
        mBtnAttachF2.setOnClickListener(this);


        mBtnAddF1.setOnClickListener(this);
        mBtnAddF2.setOnClickListener(this);

        mBtnDetachF1.setOnClickListener(this);
        mBtnDetachF2.setOnClickListener(this);

        mBtnRemoveF1.setOnClickListener(this);
        mBtnRemoveF2.setOnClickListener(this);

        mBtnHidenF1.setOnClickListener(this);
        mBtnShowF1.setOnClickListener(this);

    }

    private void initView() {

        mBtnRemoveF1 = (Button) findViewById(R.id.btn);
        mBtnRemoveF2 = (Button) findViewById(R.id.remove2);

        mBtnAddF1 = (Button) findViewById(R.id.add1);
        mBtnAddF2 = (Button) findViewById(R.id.add2);

        mBtnAttachF1 = (Button) findViewById(R.id.attach1);
        mBtnAttachF2 = (Button) findViewById(R.id.attach2);

        mBtnDetachF1 = (Button) findViewById(R.id.detach1);
        mBtnDetachF2 = (Button) findViewById(R.id.detach2);

        mBtnHidenF1 = (Button) findViewById(R.id.hidenF1);
        mBtnShowF1 = (Button) findViewById(R.id.showF1);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.add1:
                FragmentOne fragmentOne = new FragmentOne();
                addFragement(fragmentOne,"F1");
                break;
            case R.id.add2:
                FragmentTwo fragmentTwo = new FragmentTwo();
                addFragement(fragmentTwo,"F2");
                break;
            case R.id.remove2:
                Fragment f2 = getSupportFragmentManager().findFragmentByTag("F2");
                Log.d("MainActivity", "f2==null:" + (f2 == null));
                remove(f2);

                break;
            case R.id.btn:
                Fragment f1= getSupportFragmentManager().findFragmentByTag("F1");
                remove(f1);
                break;
            case R.id.attach1:
                f1= getSupportFragmentManager().findFragmentByTag("F1");
                attach(f1);
                break;
            case R.id.attach2:
                f2= getSupportFragmentManager().findFragmentByTag("F2");
                attach(f2);
                break;
            case R.id.detach1:
                f1= getSupportFragmentManager().findFragmentByTag("F1");
                detach(f1);
                break;
            case R.id.detach2:
                f2= getSupportFragmentManager().findFragmentByTag("F2");
                detach(f2);
                break;
            case R.id.showF1:
                f1= getSupportFragmentManager().findFragmentByTag("F1");
                show(f1);
                break;
            case R.id.hidenF1:
                f1= getSupportFragmentManager().findFragmentByTag("F1");
                hide(f1);
                break;

        }
    }
    public void addFragement(Fragment fragment,String tag){
        getSupportFragmentManager().beginTransaction().add(R.id.container,fragment,tag).commit();
    }
    public void remove(Fragment fragment){
        getSupportFragmentManager().beginTransaction().remove(fragment).commit();

    }
    public void attach(Fragment fragment){
        getSupportFragmentManager().beginTransaction().attach(fragment).commit();
    }
    public void detach(Fragment fragment){
        getSupportFragmentManager().beginTransaction().detach(fragment).commit();
    }

    public void show(Fragment fragment){
        getSupportFragmentManager().beginTransaction().show(fragment).commit();
    }

    public void hide(Fragment fragment){
        getSupportFragmentManager().beginTransaction().hide(fragment).commit();
    }

}
