package com.example.finalproject;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class FinalActivity extends Activity  {
   	
	MediaPlayer mp;   
	
	 ImageButton sq1;
     ImageButton sq2;
     ImageButton sq3;
     ImageButton sq4;
     ImageButton sq5;
     ImageButton sq6;
     
     int sum1=0;
    
     Vibrator vibrator;
     
    protected String sqText = new String();

    private Handler handler = new Handler();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        sq1 = (ImageButton) this.findViewById(R.id.dot1);
        sq2 = (ImageButton) this.findViewById(R.id.dot2);
        sq3 = (ImageButton) this.findViewById(R.id.dot3);
        sq4 = (ImageButton) this.findViewById(R.id.dot4);
        sq5 = (ImageButton) this.findViewById(R.id.dot5);
        sq6 = (ImageButton) this.findViewById(R.id.dot6);

        sq1.setId(1);
        sq2.setId(10);
        sq3.setId(20);
        sq4.setId(40);
        sq5.setId(80);
        sq6.setId(160);
       
        sq1.setOnTouchListener(new TouchListener());
        sq2.setOnTouchListener(new TouchListener());
        sq3.setOnTouchListener(new TouchListener());
        sq4.setOnTouchListener(new TouchListener());
        sq5.setOnTouchListener(new TouchListener());
        sq6.setOnTouchListener(new TouchListener());
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        handler.postDelayed(mUpdateUITimerTask, 1000);
    }

    private final Runnable mUpdateUITimerTask = new Runnable() {
        public void run() {
            // do whatever you want to change here, like:
            updateTextField();
        }
    };

    private void updateTextField() {
        TextView view1 = (TextView) this.findViewById(R.id.logView);
        view1.setText(sqText);
        handler.post(mUpdateUITimerTask);
    }
private void brailleMapping(int unique)
{
	switch(unique)
	{
	case 1:
		sqText="A";
		 mp = MediaPlayer.create(this, R.raw.a);
		 mp.start();
		break;
	case 21:
		sqText="B";
		 mp = MediaPlayer.create(this, R.raw.b);
		 mp.start();
		 break;
	case 11:
		sqText="C";
		 mp = MediaPlayer.create(this, R.raw.c);
		 mp.start();
		 break;
	case 51:
		sqText="D";
		 mp = MediaPlayer.create(this, R.raw.d);
		 mp.start();
		 break;
	case 41:
		sqText="E";
		 mp = MediaPlayer.create(this, R.raw.e);
		 mp.start();
		 break;
	case 31:
		sqText="F";
		 mp = MediaPlayer.create(this, R.raw.f);
		 mp.start();
		 break;
	case 71:
		sqText="G";
		 mp = MediaPlayer.create(this, R.raw.g);
		 mp.start();
		 break;
	case 61:
		sqText="H";
		 mp = MediaPlayer.create(this, R.raw.h);
		 mp.start();
		 break;
	case 30:
		sqText="I";
		 mp = MediaPlayer.create(this, R.raw.i);
		 mp.start();
		 break;
	case 70:
		sqText="J";
		 mp = MediaPlayer.create(this, R.raw.j);
		 mp.start();
		 break;
	case 81:
		sqText="K";
		 mp = MediaPlayer.create(this, R.raw.k);
		 mp.start();
		 break;
	case 101:
		sqText="L";
		 mp = MediaPlayer.create(this, R.raw.l);
		 mp.start();
		 break;
	case 91:
		sqText="M";
		 mp = MediaPlayer.create(this, R.raw.m);
		 mp.start();
		 break;
	case 131:
		sqText="N";
		 mp = MediaPlayer.create(this, R.raw.n);
		 mp.start();
		 break;
	case 121:
		sqText="O";
		 mp = MediaPlayer.create(this, R.raw.o);
		 mp.start();
		 break;
	case 111:
		sqText="P";
		 mp = MediaPlayer.create(this, R.raw.p);
		 mp.start();
		 break;
	case 151:
		sqText="Q";
		 mp = MediaPlayer.create(this, R.raw.q);
		 mp.start();
		 break;
	case 141:
		sqText="R";
		 mp = MediaPlayer.create(this, R.raw.r);
		 mp.start();
		 break;
	case 110:
		sqText="S";
		 mp = MediaPlayer.create(this, R.raw.s);
		 mp.start();
		 break;
	case 150:
		sqText="T";
		 mp = MediaPlayer.create(this, R.raw.t);
		 mp.start();
		 break;
	case 241:
		sqText="U";
		 mp = MediaPlayer.create(this, R.raw.u);
		 mp.start();
		 break;
	case 261:
		sqText="V";
		 mp = MediaPlayer.create(this, R.raw.v);
		 mp.start();
		 break;
	case 230:
		sqText="W";
		 mp = MediaPlayer.create(this, R.raw.w);
		 mp.start();
		 break;
	case 251:
		sqText="X";
		 mp = MediaPlayer.create(this, R.raw.x);
		 mp.start();
		 break;
	case 291:
		sqText="Y";
		 mp = MediaPlayer.create(this, R.raw.y);
		 mp.start();
		 break;
	case 281:
		sqText="Z";
		 mp = MediaPlayer.create(this, R.raw.z);
		 mp.start();
		 break;
	default:
		break;
	}
}
   private class TouchListener implements OnTouchListener 
    {
    	void sumofdot1(int sum)
    	{
    		sum1+=sum;
    		System.err.println("Sum is "+sum1);
    		if(sum1==1 || sum1==21 || sum1==11 ||sum1==51 ||sum1==41 ||sum1==31 ||sum1==71 ||sum1==61 ||sum1==30 ||
 		sum1==70 ||sum1==81 ||sum1==101 ||sum1==91 ||sum1==131 ||sum1==121 ||sum1==111 ||sum1==151 ||sum1==141 ||
 		sum1==110 ||sum1==150 ||sum1==241 ||sum1==261 ||sum1==230 ||sum1==251 ||sum1==291 ||sum1==281 )
    		{
    			brailleMapping(sum1);
       		}
    	}
        @Override
        public boolean onTouch(View v, MotionEvent event) 
        {
        	 if(event.getAction() == MotionEvent.ACTION_DOWN)
             {
                switch(v.getId()) 
                {
                   case 1:
                	  sumofdot1(1);
                	  vibrator.vibrate(50);
                   	   break;
                   case 10:
                	   sumofdot1(10); 
                	   vibrator.vibrate(50);
                       break;
                   case 20:
                	   sumofdot1(20);
                	   vibrator.vibrate(50);
                       break;
                   case 40:
                	   sumofdot1(40);
                	   vibrator.vibrate(50);
                       break;
                   case 80:
                	   sumofdot1(80);
                	   vibrator.vibrate(50);
                       break;
                   case 160:
                	   sumofdot1(160);
                	   vibrator.vibrate(50);
                       break;
                }
             } 
        	 else if (event.getAction() == MotionEvent.ACTION_UP)
        	 {
        		 sum1=0;
        	 }		
             // TODO Auto-generated method stub
            return true;
        }
    }
}