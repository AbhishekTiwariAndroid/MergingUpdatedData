package dev.abhishektiwari.mergingupdateddata;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SupportAdapter extends RecyclerView.Adapter<SupportAdapter.MyHolder> {

    ArrayList<TradeModel> trades;
    Context context;

    public SupportAdapter(Context context, ArrayList<TradeModel> trades) {
        this.trades = trades;
        this.context = context;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.item_trad_list, parent, false);


        return new MyHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {


        TradeModel item = trades.get(position);


//        if (item.symbol.equalsIgnoreCase("INU22") || item.product.startsWith("I")) {


//            holder.symbolTxt.setText(item.symbol);
//            holder.symbolTxt.setBackgroundColor(Color.WHITE);
//            holder.dateTxt.setText(item.expiry);
//            holder.dateTxt.setBackgroundColor(Color.WHITE);
//            holder.bfqTxt.setText(item.bfq);
//            holder.bfqTxt.setBackgroundColor(Color.YELLOW);
//            holder.netqTxt.setText(item.netq);
//            holder.netqTxt.setBackgroundColor(Color.YELLOW);
//            holder.cfqTxt.setText(item.cfq);
//            holder.cfqTxt.setBackgroundColor(Color.YELLOW);
//            holder.liverateTxt.setText(item.liveRate);
//            holder.liverateTxt.setBackgroundColor(Color.YELLOW);
//            holder.mtmTxt.setText(item.mtM);
//            holder.mtmTxt.setBackgroundColor(Color.YELLOW);
//            holder.strikeTxt.setText(item.strikeprice);
//            holder.strikeTxt.setBackgroundColor(Color.WHITE);
//            holder.opttypeTxt.setText(item.opttype);
//            holder.opttypeTxt.setBackgroundColor(Color.YELLOW);
//            holder.productTxt.setText("SGX" + item.product + "X");
//            holder.productTxt.setBackgroundColor(Color.YELLOW);


//        } else {

//            holder.symbolTxt.setText(item.symbol);
//            holder.symbolTxt.setBackgroundColor(Color.WHITE);
//            holder.dateTxt.setText(item.expiry);
//            holder.dateTxt.setBackgroundColor(Color.WHITE);

        if (item.symbol.equalsIgnoreCase("NIFTYPE")) {


            holder.bfqTxt.setText(item.bfq);
            holder.bfqTxt.setBackgroundColor(Color.YELLOW);
            holder.netqTxt.setText(item.netq);
            holder.netqTxt.setBackgroundColor(Color.YELLOW);

            holder.cfqTxt.setText(item.cfq);
            holder.cfqTxt.setBackgroundColor(Color.YELLOW);


            if (item.product.startsWith("I")) {
                holder.productTxt.setText("SGX" + item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            } else {
                holder.productTxt.setText(item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            }

        } else if (item.symbol.equalsIgnoreCase("NIFTYPE")) {

            holder.bfqTxt.setText(item.bfq);
            holder.bfqTxt.setBackgroundColor(Color.YELLOW);
            holder.netqTxt.setText(item.netq);
            holder.netqTxt.setBackgroundColor(Color.YELLOW);

            holder.cfqTxt.setText(item.cfq);
            holder.cfqTxt.setBackgroundColor(Color.YELLOW);


            if (item.product.startsWith("I")) {
                holder.productTxt.setText("SGX" + item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            } else {
                holder.productTxt.setText(item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            }
        } else if (item.symbol.equalsIgnoreCase("NIFTYXX")) {

            holder.bfqTxt.setText(item.bfq);
            holder.bfqTxt.setBackgroundColor(Color.YELLOW);
            holder.netqTxt.setText(item.netq);
            holder.netqTxt.setBackgroundColor(Color.YELLOW);

            holder.cfqTxt.setText(item.cfq);
            holder.cfqTxt.setBackgroundColor(Color.YELLOW);


            if (item.product.startsWith("I")) {
                holder.productTxt.setText("SGX" + item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            } else {
                holder.productTxt.setText(item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            }
        } else if (item.symbol.equalsIgnoreCase("NIFTYCE")) {
            holder.bfqTxt.setText(item.bfq);
            holder.bfqTxt.setBackgroundColor(Color.YELLOW);
            holder.netqTxt.setText(item.netq);
            holder.netqTxt.setBackgroundColor(Color.YELLOW);

            holder.cfqTxt.setText(item.cfq);
            holder.cfqTxt.setBackgroundColor(Color.YELLOW);


            if (item.product.startsWith("I")) {
                holder.productTxt.setText("SGX" + item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            } else {
                holder.productTxt.setText(item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            }
        } else if (item.symbol.equalsIgnoreCase("IXX")) {


            holder.bfqTxt.setText(item.bfq);
            holder.bfqTxt.setBackgroundColor(Color.YELLOW);
            holder.netqTxt.setText(item.netq);
            holder.netqTxt.setBackgroundColor(Color.YELLOW);

            holder.cfqTxt.setText(item.cfq);
            holder.cfqTxt.setBackgroundColor(Color.YELLOW);


            if (item.product.startsWith("I")) {
                holder.productTxt.setText("SGX" + item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            } else {
                holder.productTxt.setText(item.product);
                holder.productTxt.setBackgroundColor(Color.YELLOW);

            }

        } else {

            holder.bfqTxt.setText(item.bfq);
            holder.netqTxt.setText(item.netq);
            holder.cfqTxt.setText(item.cfq);


            if (item.product.startsWith("I")) {
                holder.productTxt.setText("SGX" + item.product);

            } else {
                holder.productTxt.setText(item.product);

            }


        }


    }


    @Override
    public int getItemCount() {
        return trades.size();
    }

    protected class MyHolder extends RecyclerView.ViewHolder {

        TextView bfqTxt, netqTxt, cfqTxt, productTxt;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            bfqTxt = itemView.findViewById(R.id.bfqTxt);
            netqTxt = itemView.findViewById(R.id.netqTxt);
            cfqTxt = itemView.findViewById(R.id.cfqTxt);
            productTxt = itemView.findViewById(R.id.productTxt);


        }
    }
}