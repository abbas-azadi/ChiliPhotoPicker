package lv.chi.photopicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class AvatarActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        //++++++++++++++++++++++++++++++++++++++++++ remove title +++++++++++++++++++++
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().setBackgroundDrawableResource(R.color.my_transparent);
//        getWindow().setTitle("");
//        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);

        ImageView imgAvatar1 = findViewById(R.id.imgAvatar1);
        ImageView imgAvatar2 = findViewById(R.id.imgAvatar2);
        ImageView imgAvatar3 = findViewById(R.id.imgAvatar3);
        ImageView imgAvatar4 = findViewById(R.id.imgAvatar4);
        ImageView imgAvatar5 = findViewById(R.id.imgAvatar5);
        ImageView imgAvatar6 = findViewById(R.id.imgAvatar6);
        ImageView imgAvatar7 = findViewById(R.id.imgAvatar7);
        ImageView imgAvatar8 = findViewById(R.id.imgAvatar8);
        ImageView imgAvatar9 = findViewById(R.id.imgAvatar9);

        intent = new Intent();

        imgAvatar1.setOnClickListener(this);
        imgAvatar2.setOnClickListener(this);
        imgAvatar3.setOnClickListener(this);
        imgAvatar4.setOnClickListener(this);
        imgAvatar5.setOnClickListener(this);
        imgAvatar6.setOnClickListener(this);
        imgAvatar7.setOnClickListener(this);
        imgAvatar8.setOnClickListener(this);
        imgAvatar9.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        int id = v.getId();
        if (id == R.id.imgAvatar1) {
            intent.putExtra("avatarId", R.drawable.avataaars1);
        } else if (id == R.id.imgAvatar2) {
            intent.putExtra("avatarId", R.drawable.avataaars2);
        } else if (id == R.id.imgAvatar3) {
            intent.putExtra("avatarId", R.drawable.avataaars3);
        } else if (id == R.id.imgAvatar4) {
            intent.putExtra("avatarId", R.drawable.avataaars4);
        } else if (id == R.id.imgAvatar5) {
            intent.putExtra("avatarId", R.drawable.avataaars5);
        } else if (id == R.id.imgAvatar6) {
            intent.putExtra("avatarId", R.drawable.avataaars6);
        } else if (id == R.id.imgAvatar7) {
            intent.putExtra("avatarId", R.drawable.avataaars7);
        } else if (id == R.id.imgAvatar8) {
            intent.putExtra("avatarId", R.drawable.avataaars8);
        } else if (id == R.id.imgAvatar9) {
            intent.putExtra("avatarId", R.drawable.avataaars9);
        }

        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
