package com.optimistic.amit.vgptchemistry;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class docViewer extends AppCompatActivity {
    public String uril;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_viewer);
        pdfView=findViewById(R.id.pdfView);
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


        if(binary==1){
            //theory
            // Toast.makeText(getApplicationContext(),""+binary,Toast.LENGTH_SHORT).show();
            int getdata=datafrochapter;
            if(getdata==1){
                uril="https://drive.google.com/uc?id=1JzPY8rx2k6NE0gLTcflKw6HmPGFndoir&export=download";

            }
            if(getdata==2){
                uril="https://drive.google.com/uc?id=107q1lVVBAypmBsFZnjv3uLPinE9R_QE6&export=download";

            }
            if(getdata==3){
                uril="https://drive.google.com/uc?id=1Zx81xgGi9dF5pVX10yiNzvEp4Bd8p7S8&export=download";

            }
            if(getdata==4){
                uril="https://drive.google.com/uc?id=1erP7ecSxwUHkJn_sokk8_-PvTK97E6VW&export=download";

            }
            if(getdata==5){
                uril="https://drive.google.com/uc?id=1JYZc_Rgiz_XHp-Gz9_7Hc2QjDa6f8ooi&export=download";

            }
            if(getdata==6){
                uril="https://drive.google.com/uc?id=1uDqbcKfYHp5zrVx3IdITejhrUfOIj9C_&export=download";

            }
            if(getdata==7){
                uril="https://drive.google.com/uc?id=1QyYN-qfZfNm9_ZseTpG6odvPF2YhZvV4&export=download";

            }
            if(getdata==8){
                uril="https://drive.google.com/uc?id=1FfmlndpfwKmkJyoqPfdhBmKmVoFnKIWK&export=download";

            }
            if(getdata==9){
                uril="https://drive.google.com/uc?id=1DnoM4Ejr7VuuzPsWOdkIzvEqgFkca777&export=download";

            }
            if(getdata==10){
                uril="https://drive.google.com/uc?id=19EokS4ChoNwH4CAWXFVeTWCPQur9-JJN&export=download";

            }
            if(getdata==11){
                uril="https://drive.google.com/uc?id=1NZ2J5FsNEsZaHhc4ywAh8ujTceXGdYvq&export=download";

            }
            if(getdata==12){
                uril="https://drive.google.com/uc?id=1PYqokS5mkTSffZXZAy41AjxPmaiDM2hJ&export=download";

            }
            if(getdata==13){
                uril="https://drive.google.com/uc?id=1h-TNoyIrMxlGoc3Qr1p--_HW45Q4EXjw&export=download";

            }
            if(getdata==14){
                uril="https://drive.google.com/uc?id=1zUSTpIe1CcmR_zbwwiG-AzKcQNvgZSOm&export=download";

            }
            if(getdata==15){
                uril="https://drive.google.com/uc?id=1MDqzfCW0gLjKkBungC7Wym6FLGGYbvIR&export=download";

            }


        }
        if(binary==2){
            //question
            int getdata=datafrochapter;
            if(getdata==1){
                uril="https://drive.google.com/uc?id=1xszjHkCONQAUN8MVLPt3-4nIAnFUMa8C&export=download";

            }
            if(getdata==2){
                uril="https://drive.google.com/uc?id=19tnsUBl2iI33640l9JOLvZg7oGTVKhGT&export=download";

            }
            if(getdata==3){
                uril="https://drive.google.com/uc?id=1UHowJIEQD3e3FwlKg1BOa4VFEJFWxMxK&export=download";

            }
            if(getdata==4){
                uril="https://drive.google.com/uc?id=1nlBzOIGi0EaIvG_dI_HkAln3bgzgNNOM&export=download";

            }
            if(getdata==5){
                uril="https://drive.google.com/uc?id=1Dy8VYA9VMYi2WFjshvCDreJ2VdGjlZhG&export=download";

            }
            if(getdata==6){
                uril="https://drive.google.com/uc?id=1vdbMujiVthg0VIiKsEiSjPDAm19PDfUj&export=download";

            }
            if(getdata==7){
                uril="https://drive.google.com/uc?id=1U_IPi1Lqf9MXceMZ-wXmgo1Jfdd9vcmu&export=download";

            }
            if(getdata==8){
                uril="https://drive.google.com/uc?id=1gn9Qk7foKK0w13ah3gf0yNiy8eNqsNi3&export=download";

            }
            if(getdata==9){
                uril="https://drive.google.com/uc?id=124k9rIVVBJrJ0359SWGr3r9OWORtKPM6&export=download";

            }if(getdata==10){
                uril="https://drive.google.com/uc?id=1bOVqUIEKOKJyKU9gkKHjhtKkvhhNdmrH&export=download";

            }
            if(getdata==11){
                uril="https://drive.google.com/uc?id=1_Ygvs5bjcj5zSHnwPbCR5vm0i9FnTe07&export=download";

            }if(getdata==12){
                uril="https://drive.google.com/uc?id=1IN43I1qTMBTg_0DJXTDSMT49xmg1fc5t&export=download";

            }if(getdata==13){
                uril="https://drive.google.com/uc?id=1kUwaYDvs4RhH5f8DCgls6bETsbdDdB-L&export=download";

            }if(getdata==14){
                uril="https://drive.google.com/uc?id=1Ya-Lj3rYxoigsx4IqiiT5FlXMY0_SOZ8&export=download";

            }if(getdata==15){
                uril="https://drive.google.com/uc?id=16Gj9UdVpnvmrkF_YaO562Q1fcQyUvfgv&export=download";



            }











        }
        if(binary==3){
            int getdata=datafrochapter;
            if(getdata==1){
                uril="https://drive.google.com/uc?id=1KbVi4NmMQWY5pc4hm3Xw6gWolu6zr-2f&export=download";
            }
            if(getdata==2){
                uril="https://drive.google.com/uc?id=1py0Hk1lM49u9Y6jrDUVe_Ijk_1poAF7E&export=download";

            }
            if(getdata==3){
                uril="https://drive.google.com/uc?id=12aqBnafkKD491whSBq3E1QHmNEsY1Gq5&export=download";

            }
            if(getdata==4){
                uril="https://drive.google.com/uc?id=1KbsSMHy_abSDc_6LYjaU3vTf88zby5Uu&export=download";

            }
            if(getdata==5){
                uril="https://drive.google.com/uc?id=17KWbCvm8GYx9UQVrXDEtIxsdhd-98dbe&export=download";

            }
            if(getdata==6){
                uril="https://drive.google.com/uc?id=1HplBEkY3EFVRpayjfXHujGrEzAJ2Cwhn&export=download";

            }
            if(getdata==7){
                uril="https://drive.google.com/uc?id=14ThzYmei6XDC8-lNfh32VwQbgMrlzpa8&export=download";

            }
            if(getdata==8){
                uril="https://drive.google.com/uc?id=145OC7sKeqf91jvLRSByIqzlKFQZHunov&export=download";

            }
            if(getdata==9){
                uril="https://drive.google.com/uc?id=1w1L37vNuZVfkSy8KoHqzChshH-0NCB9K&export=download";

            }if(getdata==10){
                uril="https://drive.google.com/uc?id=13ayCAl6JUG_cJJutnlykI1DZYc4xXz3A&export=download";

            }
            if(getdata==11){
                uril="https://drive.google.com/uc?id=1GmjrrvzK-JaMFdtoIXbNBBugsTWeVHm9&export=download";

            }if(getdata==12){
                uril="https://drive.google.com/uc?id=13J1NJQhCEUmtHTCWMeN3417HCb-M7TPQ&export=download";

            }if(getdata==13){
                uril="https://drive.google.com/uc?id=1Vgu3BoQ8QERVhvBLhM6ZzCI-xnFAU1nZ&export=download";

            }if(getdata==14){
                uril="https://drive.google.com/uc?id=1fkqb4nMCOj3ZeOzGaevQz9aMy6iKBVSm&export=download";

            }if(getdata==15) {

                Toast.makeText(getApplicationContext(),"There is no solution for this chapter",Toast.LENGTH_LONG).show();
                uril = "";

            }










        }



        new RetrivePDFStream().execute(uril);
        Handler pdCanceller = new Handler();
        pdCanceller.postDelayed(progressRunnable, 8000);

    }
    class RetrivePDFStream extends AsyncTask<String,Void,InputStream> {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream=null;
            try{
                URL url=new URL(uril);
                HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200){
                    inputStream =new BufferedInputStream(urlConnection.getInputStream());
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
