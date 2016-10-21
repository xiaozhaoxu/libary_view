package com.source.widget;

/**
 * Created by zhaoxu2014 on 16/10/21.
 */
public class UsedTest {
    /*
  圆形头像
   <com.source.widget.imageview.CircularImageView
        android:id="@+id/imgDoge"
        android:layout_width="196dp"
        android:layout_height="196dp"
        android:layout_gravity="center_horizontal"
        android:layout_margin="8dp"
        android:clickable="true"
        android:src="@drawable/doge"
        app:border="true"
        app:border_color="#FFFFFFFF"  头像外的边的颜色
        app:border_width="4dp"
        app:selector="true"
        app:selector_color="#2200ff00"  头像被点击时整体颜色
        app:selector_stroke_color="#aa5677fc"  头像被点击时头像外的边的颜色
        app:selector_stroke_width="4dp"
        app:shadow="true" />


        CircularImageView imgDoge;
		imgDoge.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(imgDoge.isSelected()) {
					txtWow.setVisibility(View.VISIBLE);
					txtClick.setVisibility(View.VISIBLE);
				}
				else {
					txtWow.setVisibility(View.INVISIBLE);
					txtClick.setVisibility(View.INVISIBLE);
				}

				return false;
			}
		});
 */




    /**
     * Created by Administrator on 2015/8/3.
     * 示例：
     *  private PopupWindowHelper popupWindowHelper;
     private View popView;

     @Override
     public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
     findViewById(R.id.button).setOnClickListener(this);
     findViewById(R.id.button2).setOnClickListener(this);
     findViewById(R.id.button4).setOnClickListener(this);
     findViewById(R.id.button5).setOnClickListener(this);
     popView = LayoutInflater.from(this).inflate(R.layout.popupview, null);
     popupWindowHelper = new PopupWindowHelper(popView);
     popView.findViewById(R.id.button3).setOnClickListener(this);
     }

     @Override
     public void onClick(View v) {
     switch (v.getId()) {
     case R.id.button:
     popupWindowHelper.showAsPopUp(v);
     break;
     case R.id.button2:
     popupWindowHelper.showAsDropDown(v,40,10);
     break;
     case R.id.button3:
     popupWindowHelper.dismiss();
     break;
     case R.id.button4:
     popupWindowHelper.showFromTop(v);
     break;
     case R.id.button5:
     popupWindowHelper.showFromBottom(v);
     break;
     default:
     break;
     }
     }
     */

}
