package com.example.furniture

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(
    private val context: Context,
    private val flowerName: Array<String>,
    private val image: Array<Int>
) : BaseAdapter() {

    private val inflater: LayoutInflater by lazy {
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int {
        return flowerName.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0L
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = inflater.inflate(R.layout.item_gridview, parent, false)
            viewHolder = ViewHolder(view.findViewById(R.id.product_image), view.findViewById(R.id.product_title))
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        viewHolder.imageView.setImageResource(image[position])
        viewHolder.textView.text = flowerName[position]

        return view
    }

    private data class ViewHolder(val imageView: ImageView, val textView: TextView)
}
