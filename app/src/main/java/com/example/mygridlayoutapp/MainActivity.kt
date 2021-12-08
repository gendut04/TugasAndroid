package com.example.mygridlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mygridlayoutapp.adapters.GambarAdapters
import com.example.mygridlayoutapp.model.gambarvespa

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<gambarvespa> ? = null
    private var gambarAdapters:GambarAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    private fun setDataInList() :ArrayList<gambarvespa>{

        var items:ArrayList<gambarvespa> = ArrayList()

        items.add(gambarvespa(R.drawable.vespa_a, *gambarvespa*))
        items.add(gambarvespa(R.drawable.vespa_b , *gambarvespa*))
        items.add(gambarvespa(R.drawable.vespa_c , *gambarvespa*))
        items.add(gambarvespa(R.drawable.vespa_d , *gambarvespa*))
        items.add(gambarvespa(R.drawable.vespa_e , *gambarvespa*))
        items.add(gambarvespa(R.drawable.vespa_f , *gambarvespa*))
        items.add(gambarvespa(R.drawable.vespa_g , *gambarvespa*))
        items.add(gambarvespa(R.drawable.vespa_h , *gambarvespa*))
        items.add(gambarvespa(R.drawable.vespa_i , *gambarvespa*))


        return items


    }
}