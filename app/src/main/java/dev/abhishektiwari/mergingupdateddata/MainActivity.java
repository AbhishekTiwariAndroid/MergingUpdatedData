package dev.abhishektiwari.mergingupdateddata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.facebook.shimmer.ShimmerFrameLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<TradeSummeryModel> summeryModels;
    RecyclerView list;
    private Handler handler = null;


    private JSONArray data;


    private ShimmerFrameLayout shimmerFrameLayout;
    private JSONArray jsArray;
    private JSONArray websocketjsonArray;
    private String useridbf;
    private String useridbfsecond;
    private String useridnetq;
    private String useridnetqsecond;
    private String useridcfq;
    private String useridcfqsecond;
    private String useridgroupname;
    private String useridgroupnamesecond;
    private String useridsegment;
    private String useridsegmentsecond;
    private String useridexpiry;
    private String useridexpirysecond;
    private String useridstrikeprice;
    private String useridstrikepricesecond;
    private String useridsymbol;
    private String useridsymbolsecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shimmerFrameLayout = findViewById(R.id.shimmerLayout);


        list = findViewById(R.id.List);


//        getCoinPrice();

        formatData(data);


        httpget();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                delayedjsonmerge();

            }
        }, 5000);


    }


    public void httpget() {
//
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
//                (com.android.volley.Request.Method.GET, url, null, new com.android.volley.Response.Listener<JSONObject>() {
//
//                    @Override
//                    public void onResponse(JSONObject response) {
//
//                        String http = response.toString();
//                        System.out.println("http " + http);
//
//                        try {
//                            JSONObject jsonObject = new JSONObject(http);
//                            jsArray = jsonObject.getJSONArray("data");
//                            System.out.println("aaaaaaaaaaaaa " + jsArray);
//
//
//                            json();
////
////                            formatData(js1);
//
//
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//
//                    }
//                }, new com.android.volley.Response.ErrorListener() {
//
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        // TODO: Handle error
//
//                    }
//                }) {
//            @Override
//            public Map<String, String> getHeaders() {
//                Map<String, String> params = new HashMap<String, String>();
//                params.put("Cookie", "csrftoken=" + token + "; sessionid=" + userid);
//                return params;
//            }
//
//        };
//
//// Access the RequestQueue through your singleton class.
//        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);


        try {
            data = new JSONArray("[{\"userid\":\"CNRM04\",\"groupname\":\"Rohit\",\n" +
                   "\"segment\":\"CosPROFIN\",\"accountcode\":\"OWN\",\"symbol\":\"NIFTY\",\"exchange\":\"NSEFO\",\n" +
                   "\"expirydate\":\"03NOV2022\",\"scripcode\":\"38021\",\"securitytype\":\"OPT\",\n" +
                   "\"strikeprice\":17700,\"opttype\":\"PE\",\"bfqty\":-1500,\"bfrate\":122.35,\n" +
                   "\"bfamt\":18352.5,\"buyqty\":0,\"sellqty\":0,\"netqty\":0,\"cfqty\":-150,\n" +
                   "\"cfamt\":18352.5,\"ltp\":0,\"grossmtm\":0,\"brokerageamt\":0,\"netmtm\":0,\n" +
                   "\"currency\":\"INR\",\"usdrate\":1,\"clientsharing\":0,\"broksharing\":0,\n" +
                   "\"comsharing\":100,\"multiplier\":1},{\"userid\":\"CNRM04\",\"groupname\":\"Rohit\",\n" +
                   "\"segment\":\"CosPROFIN\",\"accountcode\":\"OWN\",\"symbol\":\"NIFTY\",\n" +
                   "\"exchange\":\"NSEFO\",\"expirydate\":\"03NOV2022\",\"scripcode\":\"38026\",\n" +
                   "\"securitytype\":\"OPT\",\"strikeprice\":17800,\"opttype\":\"PE\",\"bfqty\":0,\n" +
                   "\"bfrate\":0,\"bfamt\":0,\"buyqty\":10800,\"sellqty\":15000,\"netqty\":-4200,\n" +
                   "\"cfqty\":-4200,\"cfamt\":590729.9999999998,\"ltp\":0,\"grossmtm\":0,\n" +
                   "\"brokerageamt\":3400.2888479999992,\"netmtm\":0,\"currency\":\"INR\",\n" +
                   "\"usdrate\":1,\"clientsharing\":0,\"broksharing\":0,\"comsharing\":100,\n" +
                   "\"multiplier\":11},{\"userid\":\"CNC01\",\"groupname\":\"abhishek\",\n" +
                    "\"segment\":\"Cosmic\",\"accountcode\":\"APP\",\"symbol\":\"NIFTY\",\n" +
                    "\"exchange\":\"NSEFO\",\"expirydate\":\"03NOV2022\",\"scripcode\":\"40034\",\n" +
                    "\"securitytype\":\"OPT\",\"strikeprice\":1200,\"opttype\":\"PE\",\"bfqty\":12,\n" +
                    "\"bfrate\":2,\"bfamt\":0,\"buyqty\":100,\"sellqty\":121,\"netqty\":200,\n" +
                    "\"cfqty\":11,\"cfamt\":78,\"ltp\":9,\"grossmtm\":0,\"brokerageamt\":12222,\n" +
                    "\"netmtm\":45,\"currency\":\"INR\",\"usdrate\":2,\"clientsharing\":0,\"broksharing\":0,\"comsharing\":0,\n" +
                    "\"multiplier\":99}]");

            System.out.println("dataprint " +data );




        } catch (JSONException e) {
            e.printStackTrace( );
        }

    }


    public void delayedjsonmerge() {


        formatData(data);

        websocketjsonArray = null;

        try {
            websocketjsonArray = new JSONArray("[{\"userid\":\"CNRM04\",\"groupname\":\"Rohit\",\"segment\":\"CosPROFIN\",\"accountcode\":\"OWN\",\"symbol\":\"NIFTY\",\"exchange\":\"NSEFO\",\"expirydate\":\"03NOV2022\",\"scripcode\":\"38021\",\"securitytype\":\"OPT\",\"strikeprice\":17700,\"opttype\":\"PE\",\"bfqty\":20,\"bfrate\":122.35,\"bfamt\":18352.5,\"buyqty\":0,\"sellqty\":0,\"netqty\":0,\"cfqty\":-150,\"cfamt\":18352.5,\"ltp\":0,\"grossmtm\":0,\"brokerageamt\":0,\"netmtm\":0,\"currency\":\"INR\",\"usdrate\":1,\"clientsharing\":0,\"broksharing\":0,\"comsharing\":100,\"multiplier\":1},{\"userid\":\"CNRM04\",\"groupname\":\"Rohit\",\"segment\":\"CosPROFIN\",\"accountcode\":\"OWN\",\"symbol\":\"NIFTY\",\"exchange\":\"NSEFO\",\"expirydate\":\"03NOV2022\",\"scripcode\":\"38026\",\"securitytype\":\"OPT\",\"strikeprice\":17800,\"opttype\":\"PE\",\"bfqty\":30,\"bfrate\":0,\"bfamt\":0,\"buyqty\":10800,\"sellqty\":15000,\"netqty\":-4200,\"cfqty\":-4200,\"cfamt\":590729.9999999998,\"ltp\":0,\"grossmtm\":0,\"brokerageamt\":3400.2888479999992,\"netmtm\":0,\"currency\":\"INR\",\"usdrate\":1,\"clientsharing\":0,\"broksharing\":0,\"comsharing\":100,\"multiplier\":1}]]");
            System.out.println("websocketjsonArray " + websocketjsonArray);

            for (int k = 0; k < websocketjsonArray.length(); k++) {
                for (int l = 0; l < data.length(); l++) {


                    if (data.getJSONObject(l).getString("scripcode").equalsIgnoreCase(websocketjsonArray.getJSONObject(k).getString("scripcode")) &&
                            data.getJSONObject(l).getString("userid").equalsIgnoreCase(websocketjsonArray.getJSONObject(k).getString("userid"))) {



//                        data.getJSONObject(l).getString("bfqty") = websocketjsonArray.getJSONObject(k).getString("bfqty");










                        useridbf = websocketjsonArray.getJSONObject(k).getString("bfqty");
                        useridbfsecond = data.getJSONObject(l).getString("bfqty");

                        useridnetq = websocketjsonArray.getJSONObject(k).getString("netqty");
                        useridnetqsecond = data.getJSONObject(l).getString("netqty");


                        useridcfq = websocketjsonArray.getJSONObject(k).getString("cfqty");
                        useridcfqsecond = data.getJSONObject(l).getString("cfqty");


                        useridgroupname = websocketjsonArray.getJSONObject(k).getString("groupname");
                        useridgroupnamesecond = data.getJSONObject(l).getString("groupname");


                        useridsegment = websocketjsonArray.getJSONObject(k).getString("segment");
                        useridsegmentsecond = websocketjsonArray.getJSONObject(l).getString("segment");


                        useridexpiry = data.getJSONObject(k).getString("expirydate");
                        useridexpirysecond = websocketjsonArray.getJSONObject(l).getString("expirydate");


                        useridstrikeprice = data.getJSONObject(k).getString("strikeprice");
                        useridstrikepricesecond = websocketjsonArray.getJSONObject(l).getString("strikeprice");


                        useridsymbol = websocketjsonArray.getJSONObject(k).getString("symbol");
                        useridsymbolsecond = data.getJSONObject(l).getString("symbol");



//                        useridbfsecond = useridbf;
                        useridbf = useridbfsecond;
//                        useridnetqsecond = useridnetq;
                        useridnetq = useridnetqsecond;
//                        useridcfqsecond = useridcfq;
                        useridcfq = useridcfqsecond;
//                        useridgroupnamesecond = useridgroupname;
                        useridgroupname = useridgroupnamesecond;
//                        useridsegmentsecond = useridsegment;
                        useridsegment = useridsegmentsecond;
//                        useridexpirysecond = useridexpiry;
                        useridexpiry = useridexpirysecond;
//                        useridstrikepricesecond = useridstrikeprice;
                        useridstrikeprice = useridstrikepricesecond;
//                        useridsymbolsecond = useridsymbol;
                        useridsymbol = useridsymbolsecond;



//                        System.out.println("khjkjkjkjk " + websocketjsonArray);
                    }

                    data.put(websocketjsonArray.getJSONObject(k));
                    System.out.println("frsdsds "+data);



//                    if (data != null){

//                    }


                }



            }





        } catch (JSONException e) {
            e.printStackTrace();
        }

    }





//    public void json() {
//
//
//        formatData(jsArray);
//
//
//    }


    private void formatData(JSONArray data) {


        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                summeryModels = new ArrayList<>();


                if (data == null) {
                    shimmerFrameLayout.startShimmer();
                }

                if (data != null)

                    try {
                        for (int i = 0; i < data.length(); i++) {
                            String userId = data.getJSONObject(i).getString("userid");
                            int index = chekId(userId);
                            if (index != -1) {
                                //in this case summery model is already in list
                                //we have to add single trade object to that list

                                JSONObject singleRow = data.getJSONObject(i);
                                TradeModel trade = new TradeModel();

                                trade.userId = singleRow.getString("userid");
                                trade.product = singleRow.getString("symbol") + singleRow.getString("expirydate") + singleRow.getInt("strikeprice") + singleRow.getString("opttype");
                                trade.symbol = singleRow.getString("symbol");
                                trade.bfq = String.valueOf(singleRow.getInt("bfqty"));
                                trade.netq = String.valueOf(singleRow.getInt("netqty"));
                                trade.cfq = String.valueOf(singleRow.getInt("cfqty"));
                                trade.groupname = singleRow.getString("groupname");
                                trade.segment = singleRow.getString("segment");


                                //get existing model from list
                                TradeSummeryModel tmp_model = summeryModels.get(index);

                                //add trade in tmp model
                                tmp_model.tradeList.add(trade);

                                //replace tmp model with old model in list
                                summeryModels.set(index, tmp_model);

                            } else {
                                //single row of data
                                JSONObject singleRow = data.getJSONObject(i);

                                //trade summery model
                                TradeSummeryModel full_summery = new TradeSummeryModel();

                                //trade model
                                TradeModel trade = new TradeModel();
                                //fill data in trade model
                                trade.product = singleRow.getString("symbol") + singleRow.getString("expirydate") + singleRow.getInt("strikeprice") + singleRow.getString("opttype");
                                trade.symbol = singleRow.getString("symbol");
                                trade.bfq = String.valueOf(singleRow.getInt("bfqty"));
                                trade.netq = String.valueOf(singleRow.getInt("netqty"));
                                trade.cfq = String.valueOf(singleRow.getInt("cfqty"));
                                trade.groupname = singleRow.getString("groupname");
                                trade.segment = singleRow.getString("segment");

                                full_summery.userId = singleRow.getString("userid");
                                full_summery.groupname = singleRow.getString("groupname");
                                full_summery.segment = singleRow.getString("segment");
                                full_summery.tradeList = new ArrayList<>();
                                full_summery.tradeList.add(trade);

                                summeryModels.add(full_summery);


                            }

                        }
                        for (int i = 0; i < summeryModels.size(); i++) {
                            int NIFTYPE_Bfq = 0;
                            int NIFTYPE_Netq = 0;
                            int NIFTYPE_Cfq = 0;
                            int NIFTYCE_Bfq = 0;
                            int NIFTYCE_Netq = 0;
                            int NIFTYCE_Cfq = 0;
                            int NIFTYXX_Bfq = 0;
                            int NIFTYXX_Netq = 0;
                            int NIFTYXX_Cfq = 0;
                            int IXX_Bfq = 0;
                            int IXX_Netq = 0;
                            int IXX_Cfq = 0;
                            ArrayList<TradeModel> list = summeryModels.get(i).tradeList;
                            for (int i1 = 0; i1 < list.size(); i1++) {
                                if (list.get(i1).product.startsWith("N") && list.get(i1).product.endsWith("PE")) {
                                    NIFTYPE_Bfq = NIFTYPE_Bfq + Integer.parseInt(list.get(i1).bfq);
                                    NIFTYPE_Netq = NIFTYPE_Netq + Integer.parseInt(list.get(i1).netq);
                                    NIFTYPE_Cfq = NIFTYPE_Cfq + Integer.parseInt(list.get(i1).cfq);
                                } else if (list.get(i1).product.startsWith("N") && list.get(i1).product.endsWith("CE")) {
                                    NIFTYCE_Bfq = NIFTYCE_Bfq + Integer.parseInt(list.get(i1).bfq);
                                    NIFTYCE_Netq = NIFTYCE_Netq + Integer.parseInt(list.get(i1).netq);
                                    NIFTYCE_Cfq = NIFTYCE_Cfq + Integer.parseInt(list.get(i1).cfq);
                                } else if (list.get(i1).product.startsWith("N") && list.get(i1).product.endsWith("XX")) {
                                    NIFTYXX_Bfq = NIFTYXX_Bfq + Integer.parseInt(list.get(i1).bfq);
                                    NIFTYXX_Netq = NIFTYXX_Netq + Integer.parseInt(list.get(i1).netq);
                                    NIFTYXX_Cfq = NIFTYXX_Cfq + Integer.parseInt(list.get(i1).cfq);
                                } else if (list.get(i1).product.startsWith("I") && list.get(i1).product.endsWith("XX")) {
                                    IXX_Bfq = IXX_Bfq + Integer.parseInt(list.get(i1).bfq);
                                    IXX_Netq = IXX_Netq + Integer.parseInt(list.get(i1).netq);
                                    IXX_Cfq = IXX_Cfq + Integer.parseInt(list.get(i1).cfq);
                                }
                            }
                            TradeModel tradeModel = new TradeModel();
                            tradeModel.sr = "1";
                            tradeModel.userId = summeryModels.get(i).userId;
                            tradeModel.product = "NIFTYPE";
                            tradeModel.symbol = "NIFTYPE";
                            tradeModel.expiry = "none";
                            tradeModel.bfq = String.valueOf(NIFTYPE_Bfq);
                            tradeModel.netq = String.valueOf(NIFTYPE_Netq);
                            tradeModel.cfq = String.valueOf(NIFTYPE_Cfq);
                            list.add(tradeModel);

                            TradeModel tradeModel1 = new TradeModel();
                            tradeModel1.sr = "1";
                            tradeModel1.userId = summeryModels.get(i).userId;
                            tradeModel1.product = "NIFTYCE";
                            tradeModel1.symbol = "NIFTYCE";
                            tradeModel1.expiry = "none";
                            tradeModel1.bfq = String.valueOf(NIFTYCE_Bfq);
                            tradeModel1.netq = String.valueOf(NIFTYCE_Netq);
                            tradeModel1.cfq = String.valueOf(NIFTYCE_Cfq);
                            list.add(tradeModel1);

                            TradeModel tradeModel11 = new TradeModel();
                            tradeModel11.sr = "1";
                            tradeModel11.userId = summeryModels.get(i).userId;
                            tradeModel11.product = "NIFTYXX";
                            tradeModel11.symbol = "NIFTYXX";
                            tradeModel11.expiry = "none";
                            tradeModel11.bfq = String.valueOf(NIFTYXX_Bfq);
                            tradeModel11.netq = String.valueOf(NIFTYXX_Netq);
                            tradeModel11.cfq = String.valueOf(NIFTYXX_Cfq);
                            list.add(tradeModel11);

                            TradeModel tradeModel2 = new TradeModel();
                            tradeModel2.sr = "1";
                            tradeModel2.userId = summeryModels.get(i).userId;
                            tradeModel2.product = "IXX";
                            tradeModel2.symbol = "IXX";
                            tradeModel2.expiry = "none";
                            tradeModel2.bfq = String.valueOf(IXX_Bfq);
                            tradeModel2.netq = String.valueOf(IXX_Netq);
                            tradeModel2.cfq = String.valueOf(IXX_Cfq);
                            list.add(tradeModel2);


                        }


                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initRecyclers();
                        if (data != null) {
                            shimmerFrameLayout.stopShimmer();
                            shimmerFrameLayout.setVisibility(View.GONE);
                        }

                    }
                }, 100);

            }
        });


    }


    private int chekId(String userId) {

        for (int i = 0; i < summeryModels.size(); i++) {
            if (summeryModels.get(i).userId.equalsIgnoreCase(userId))
                return i;
        }


        return -1;


    }


    private void initRecyclers() {


        //after purifying data let's show it
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        MainAdapter adapter = new MainAdapter(this, summeryModels);
        adapter.hasStableIds();


        list.setLayoutManager(manager);

        list.setAdapter(adapter);


        list.setFocusable(false);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();



        finish();
        finishAffinity();
        android.os.Process.killProcess(android.os.Process.myPid());


    }


}