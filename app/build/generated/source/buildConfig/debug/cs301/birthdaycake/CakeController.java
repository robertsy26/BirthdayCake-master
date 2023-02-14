package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController (CakeView cakeView){
        this.cakeView = cakeView;
        cakeModel = this.cakeView.getCakeModel();
    }

    public void onClick(View v){
        cakeModel.lit = !cakeModel.lit;
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModel.hasCandles = b;
        cakeView.invalidate();
    }
}
