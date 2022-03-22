package com.example.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ForecastFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val recyclerView: RecyclerView = requireView().findViewById(R.id.recyclerView)
//        recyclerView.apply {
//            layoutManager = LinearLayoutManager(activity)
//            adapter = CustomRecyclerAdapter(getTimeList(),getDescList(),getTempList())
//        }
    }

    private fun getTimeList() : List<String> {
        return this.resources.getStringArray(R.array.time).toList()
    }
    private fun getTempList() : List<String> {
        return this.resources.getStringArray(R.array.temp).toList()
    }
    private fun getDescList() : List<String> {
        return this.resources.getStringArray(R.array.desc).toList()
    }

//    class CustomRecyclerAdapter(private val time: List<String>, private val desc : List<String>, private val temp : List<String>):
//        RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {
//
//        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//            val time : TextView = itemView.findViewById(R.id.time)
//            val description : TextView = itemView.findViewById(R.id.description)
//            val temperature : TextView = itemView.findViewById(R.id.temp)
//        }
//
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//            val itemView = LayoutInflater.from(parent.context)
//                .inflate(R.layout.recyclerview_item,parent,false)
//            return MyViewHolder(itemView)
//        }
//
//        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//            holder.time.text = time[position]
//            holder.description.text = desc[position]
//            holder.temperature.text = temp[position]
//        }
//
//        override fun getItemCount() = time.size
//    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forecast, container, false)
    }
}