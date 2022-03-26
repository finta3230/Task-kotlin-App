package com.example.weather

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.weather.databinding.GroupIconsBinding

class GroupIconsVIew(
    context : Context,
    attrs : AttributeSet?,
    defStyleAttr : Int,
    defStyleRes : Int
    ) : LinearLayout (context, attrs, defStyleAttr, defStyleRes) {

        private val binding : GroupIconsBinding

        constructor(context: Context,attrs: AttributeSet?, defStyleAttr: Int) : this(context,attrs,defStyleAttr,0)
        constructor(context: Context, attrs: AttributeSet?) : this(context,attrs,0)
        constructor(context: Context) : this(context, null)

        init{
            val inflater = LayoutInflater.from(context)
            inflater.inflate(R.layout.group_icons,this,true)
            binding = GroupIconsBinding.bind(this)
        }

        private fun initializedAttributes(attrs : AttributeSet?, defStyleAttr : Int, defStyleRes : Int){
            if (attrs == null) return
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.GroupIconsVIew, defStyleAttr,defStyleRes)
            with(binding){

            }

            typedArray.recycle()
        }
}