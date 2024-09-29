package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.myapplication.Adapter.CryptoWallerAdapter;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.domain.CryptoWallet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Binding
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        
        RecyclerViewInit();


    }

    private void RecyclerViewInit() {
        binding.list.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<CryptoWallet> cryptoWalletArrayList = new ArrayList<>();
        cryptoWalletArrayList.add(new CryptoWallet("BTC","btc",2.13,1.4,1423.33));
        cryptoWalletArrayList.add(new CryptoWallet("ETH","eth",-1.3,4.5,233.4));
        cryptoWalletArrayList.add(new CryptoWallet("XRP","xrp",-3.14,2.4,235.32));
        cryptoWalletArrayList.add(new CryptoWallet("LTC","ltc",4.45,3.5,23423.44));

        binding.list.setLayoutManager(new GridLayoutManager(this,2));


        binding.list.setAdapter(new CryptoWallerAdapter(cryptoWalletArrayList));
    }
}