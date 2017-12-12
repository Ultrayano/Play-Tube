package ch.playtube.fragments;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import ch.playtube.BackgroundAudioService;

import ch.playtube.MainActivity;
import ch.playtube.R;

import static ch.playtube.BackgroundAudioService.ACTION_STOP;

public class TimerFragment extends Fragment {

    public static TimerFragment newInstance() {
        return new TimerFragment();
    }

    Switch timer_switch;
    TextView timer_onoff;
    EditText timePicker;
    BackgroundAudioService bas = new BackgroundAudioService();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.timer, container, false);
        timer_switch = (Switch) v.findViewById(R.id.timer_switch);
        timer_onoff = (TextView) v.findViewById(R.id.timer_onoff);
        timePicker = (EditText) v.findViewById(R.id.timePicker);


        timer_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int timerTime = Integer.parseInt(timePicker.getText().toString());
                int displayTime = timerTime;
                timerTime = timerTime *1000 * 60;
                if(isChecked) {
                    timer_onoff.setText("ON");
                    new CountDownTimer(timerTime, 1000) {
                        @Override
                        public void onTick(long l) {

                        }

                        public void onFinish() {
                            android.os.Process.killProcess(android.os.Process.myPid());
                            System.exit(0);
                        }

                    }.start();


                    Toast.makeText(getActivity(), "Timer set for " +displayTime +" Minutes", Toast.LENGTH_SHORT).show();
                }else{
                    timer_onoff.setText("OFF");
                }
            }
        });


        return v;

    }
}


