package problemsolver;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.media.MediaPlayer;

import android.media.AudioManager;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    static Context ard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ard = this.getApplicationContext();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    public void onClkClose(View view){
        android.os.Process.killProcess(android.os.Process.myPid());
    }
    public void onClick(View view) {
        MediaPlayer mPlayer;
        switch (view.getId()) {
            case R.id.button:
                mPlayer = MediaPlayer.create(this,R.raw.crisis);


                break;
            case R.id.button2:
                mPlayer = MediaPlayer.create(this,R.raw.dashdeneg);
                break;
            case R.id.button3:
                mPlayer = MediaPlayer.create(this,R.raw.eshekaknado);
                break;
            case R.id.button4:
                mPlayer = MediaPlayer.create(this,R.raw.gdedengi);
                break;
            case R.id.button5:
                mPlayer = MediaPlayer.create(this,R.raw.her);
                break;
            case R.id.button6:
                mPlayer = MediaPlayer.create(this, R.raw.izzatakih);
                break;
            case R.id.button7:
                mPlayer = MediaPlayer.create(this, R.raw.leshiy);
                break;
            case R.id.button8:
                mPlayer = MediaPlayer.create(this, R.raw.nenado);
                break;
            case R.id.button9:
                mPlayer = MediaPlayer.create(this, R.raw.pasholvzhopy);
                break;
            case R.id.button11:
                mPlayer = MediaPlayer.create(this, R.raw.zachto);
                break;
            case R.id.button10:
                mPlayer = MediaPlayer.create(this, R.raw.uvolen);
                break;

            case R.id.button13:
                mPlayer = MediaPlayer.create(this, R.raw.blackmagick);
                break;

            case R.id.button14:
                mPlayer = MediaPlayer.create(this, R.raw.bullshit);
                break;
            case R.id.button15:
                mPlayer = MediaPlayer.create(this, R.raw.idiot);
                break;
            case R.id.button16:
                mPlayer = MediaPlayer.create(this, R.raw.myname);
                break;
            case R.id.button17:
                mPlayer = MediaPlayer.create(this, R.raw.showme);
                break;

            case R.id.button18:
                mPlayer = MediaPlayer.create(this, R.raw.xmasfuck);
                break;
            case R.id.button19:
                mPlayer = MediaPlayer.create(this, R.raw.yavseznau);
                break;


            default:
                mPlayer = MediaPlayer.create(this, R.raw.crisis);
                break;


        }
        try {
            mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
           // mPlayer.prepare();
            mPlayer.start();
        }
        catch (Exception err){

        }
        finally {

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://fgbufkp.oit_svm.problemsolver/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://fgbufkp.oit_svm.problemsolver/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
