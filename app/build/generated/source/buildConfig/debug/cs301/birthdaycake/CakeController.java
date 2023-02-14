package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
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
}
