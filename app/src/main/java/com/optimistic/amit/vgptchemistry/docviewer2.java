package com.optimistic.amit.vgptchemistry;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class docviewer2 extends AppCompatActivity {
    public String uril;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docviewer2);
        pdfView = findViewById(R.id.pdfView);
        final ProgressDialog progress = new ProgressDialog(this);
        progress.setTitle("Connecting");
        progress.setMessage("Please wait while we fetch data .....");
        progress.show();

        Runnable progressRunnable = new Runnable() {

            @Override
            public void run() {
                progress.cancel();
            }
        };


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int binary = extras.getInt("binary");
        int datafrochapter = extras.getInt("datafromchapter");


        if (binary == 1) {
            //theory
            // Toast.makeText(getApplicationContext(),""+binary,Toast.LENGTH_SHORT).show();
            int getdata = datafrochapter;
            if (getdata == 1) {
                uril = "https://drive.google.com/uc?id=1DhdqHfcb-8cf3QPW5k0T3FcZ4sFjWaua&export=download";

            }
            if (getdata == 2) {
                uril = "https://drive.google.com/uc?id=13Mhk4cTSDD8v7PwmNOYVZy0bj_PjDL7y&export=download";

            }
            if (getdata == 3) {
                uril = "https://drive.google.com/uc?id=1MCcsUNbuWtVHwlmMZVwDqwsx8hJtztDf&export=download";

            }
            if (getdata == 4) {
                uril = "https://drive.google.com/uc?id=1IXrpb6KXwpFT46YuQFO_I3022d8EWGqV&export=download";

            }
            if (getdata == 5) {
                uril = "https://drive.google.com/uc?id=1tCYSkA9GkMDnDoujFXPzd676EkimmPf9&export=download";

            }
            if (getdata == 6) {
                uril = "https://drive.google.com/uc?id=1OSMB637AcXwav4qee2nrR05gIE74JW-h&export=download";

            }
            if (getdata == 7) {
                uril = "https://drive.google.com/uc?id=1JQrPk5GvY9McEGbKk696rq9Gs7BAuPrc&export=download";

            }if (getdata == 8) {
                uril = "https://drive.google.com/uc?id=1yGVq7KFSN88r3sMOu3xlSqjyYK4xWsG9&export=download";

            }
            if (getdata == 9) {
                uril = "https://drive.google.com/uc?id=1i3KxD--1MemWWQCH0USlR_DOSCCnCtQd&export=download";

            }if (getdata == 10) {
                uril = "https://drive.google.com/uc?id=1sgI5By_2_6wDRp8wAfSFKWwkP7VE_1vr&export=download";

            }if (getdata == 11) {
                uril = "https://drive.google.com/uc?id=19QEAN7cY784rCGig2UU-zYVvmufRLwB-&export=download";


            }if (getdata == 12) {
                uril = "https://drive.google.com/uc?id=1TDHWbMVM4goODaMy0SswYAOBqp96EJ8O&export=download";

            }if (getdata == 13) {
                uril = "https://drive.google.com/uc?id=1vLHAE0RFXZ8oXIA_GqRI6vYiGIIoChIf&export=download";

            }if (getdata == 14) {
                uril = "https://drive.google.com/uc?id=12Y4p1-iIZEcTOT9v_SrEv7KXApDqjLdi&export=download";

            }
            if (getdata == 15) {
                uril = "https://drive.google.com/uc?id=1vLXd-V7SPmmhPF5Fj-CUgzlEY7soKSi8&export=download";

            }
            if (getdata == 16) {
                uril = "https://drive.google.com/uc?id=1zHm5EyW5fg79-AdeDcm8PbN-ZTnDBVyn&export=download";

            }
            if (getdata == 17) {
                uril = "https://drive.google.com/uc?id=1__bDsXyKCKz1RRX-1Rq42f1kS8SgQuhf&export=download";

            }







        }
        if (binary == 2) {
            //question
            int getdata = datafrochapter;
            if (getdata == 1) {
                uril = "https://drive.google.com/uc?id=1tOJBg6fxXTql-qYnSAtmtqHJoH_oXDvr&export=download";

            }
            if (getdata == 2) {
                uril = "https://drive.google.com/uc?id=1ZcwTyesAvc2h_GL3RsijuXoSdx1hsB_8&export=download";

            }
            if (getdata == 3) {
                uril = "https://drive.google.com/uc?id=18PmkTN9k_yXbYRa9lcE_LawTbk_ZO4oJ&export=download";

            }
            if (getdata == 4) {
                uril = "https://drive.google.com/uc?id=1P3qDUoUzPuVo9reifDQvjV8ELA9NVOgm&export=download";

            }
            if (getdata == 5) {
                uril = "https://drive.google.com/uc?id=1KQhI1faLmbDniRIBtAtyrAd_LMQ7WX4I&export=download";

            }
            if (getdata == 6) {
                uril = "https://drive.google.com/uc?id=19WhYO3_aHN0od44dUwtOCjCvjYMQkFmB&export=download";

            }
            if (getdata == 7) {
                uril = "https://drive.google.com/uc?id=1tb6mVKZ20ATCMWzu4wJDQqv7eOLzINFT&export=download";

            }if (getdata == 8) {
                uril = "https://drive.google.com/uc?id=1sQurEGkk-E3-YRDfD4UiEXVOtcWURP5V&export=download";

            }
            if (getdata == 9) {
                uril = "https://drive.google.com/uc?id=1d7PIjpHw9rp0nhQ8ge7PwCiXR1nHONgn&export=download";

            }if (getdata == 10) {
                uril = "https://drive.google.com/uc?id=1EsnzdTh7ajsG7fyGabtiV6DOTvyHPH5O&export=download";

            }if (getdata == 11) {
                uril = "https://drive.google.com/uc?id=1E_gSflNUqaS0_ytCujtVUl0zT0EFA1D2&export=download";


            }if (getdata == 12) {
                uril = "https://drive.google.com/uc?id=1kmsiz0O2Dr2gWlSQ_bgq4fOTPBeKuooK&export=download";

            }if (getdata == 13) {
                uril = "https://drive.google.com/uc?id=1szDf6RLctI4Do76oYt0j06SKU0H2aCiD&export=download";

            }if (getdata == 14) {
                uril = "https://drive.google.com/uc?id=1Jzvwl0sjZY0Ri15JEIBzIjHqk4nJBxH5&export=download";

            }
            if (getdata == 15) {
                uril = "https://drive.google.com/uc?id=1dUiI8YJoMhBDHGbInoy4eqho-KGdEUpe&export=download";

            }
            if (getdata == 16) {
                uril = "https://drive.google.com/uc?id=1T0Hw-3FHGSgq8rhRHj-C2L7HTT1BssSv&export=download";

            }
            if (getdata == 17) {
                uril = "https://drive.google.com/uc?id=17GNOiYU5JUuYCMeWPW187upiv1k1hwd5&export=download";

            }
        }
        if (binary == 3) {
            int getdata = datafrochapter;
            if (getdata == 1) {
                uril = "https://drive.google.com/uc?id=1-y42oLNy5674aXrz9BN9ZJRMQH3OGJ4Q&export=download";

            }
            if (getdata == 2) {
                uril = "https://drive.google.com/uc?id=1obZQyKqhoJOh_nCpSq-5yNPQXE-cM1Rw&export=download";

            }
            if (getdata == 3) {
                uril = "https://drive.google.com/uc?id=116NkegJdeaBRbeWSFQRdN43r_1dWJypj&export=download";

            }
            if (getdata == 4) {
                uril = "https://drive.google.com/uc?id=1pgxmrH7jHxNp-QkcUAFliWFTk4_lw4tq&export=download";

            }
            if (getdata == 5) {
                uril = "https://drive.google.com/uc?id=1L5VXUPNT9TRCEIGt-gN4kVrsM74GBfXh&export=download";

            }
            if (getdata == 6) {
                uril = "https://drive.google.com/uc?id=1Gn7kC3lyPIRP5HMmdZmg2XiDOP4ZE0lt&export=download";

            }
            if (getdata == 7) {
                uril = "https://drive.google.com/uc?id=1Sz6kyceGaJtJtaYLCFGeLH2xAKhVte8j&export=download";

            }if (getdata == 8) {
                uril = "https://drive.google.com/uc?id=13mMcAJ6TuSbUV05h-ZTxdO6EDi86rdXq&export=download";

            }
            if (getdata == 9) {
                uril = "https://drive.google.com/uc?id=1NWLQ_v5yy1aFFWQCrqcTZCbH4KUvyklB&export=download";

            }if (getdata == 10) {
                uril = "https://drive.google.com/uc?id=1t1D3nURQVlhB4PcDqFxU5jG8fhwHbL_8&export=download";

            }if (getdata == 11) {
                uril = "https://drive.google.com/uc?id=1QDd46cuc4XIvVroOutV69s9k3lhLTzBB&export=download";


            }if (getdata == 12) {
                uril = "https://drive.google.com/uc?id=1MRu8dPbOUAG6gGDQfr5rA-SoaXybsrqc&export=download";

            }if (getdata == 13) {
                uril = "https://drive.google.com/uc?id=1rkP0TGTfXnrMgQ3zFAt3Z65_P2UC7E00&export=download";

            }if (getdata == 14) {
                uril = "https://drive.google.com/uc?id=1BV6HSL5DdyKDtgzRCX0RYHLmo66mLqg9&export=download";

            }
            if (getdata == 15) {
                uril = "https://drive.google.com/uc?id=14MSukbcY5qn_JEsLJa8rlR3COaA0YYey&export=download";

            }
            if (getdata == 16) {
                uril = "https://drive.google.com/uc?id=146wTLws2gZxonJElSL87P-Ho69lkL9Ww&export=download";

            }
            if (getdata == 17) {
                uril = "https://drive.google.com/uc?id=1aX1nFHMs6sCnEAcfw-ZdSdo_XJ_M0HFM&export=download";

            }


        }


        new RetrivePDFStream().execute(uril);
        Handler pdCanceller = new Handler();
        pdCanceller.postDelayed(progressRunnable, 6000);

    }

    class RetrivePDFStream extends AsyncTask<String, Void, InputStream> {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL url = new URL(uril);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }

            } catch (IOException e) {
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {

            pdfView.fromStream(inputStream).load();
        }
    }
}



