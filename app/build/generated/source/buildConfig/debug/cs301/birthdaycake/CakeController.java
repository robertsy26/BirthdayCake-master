package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
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

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.candles = i;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
