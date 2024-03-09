package com.febatis.googlekeepdosguri.domain.listnote.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.febatis.googlekeepdosguri.databinding.ItemNoteBinding
import com.febatis.googlekeepdosguri.domain.listnote.model.Note


class NoteAdapter(private val dataSet: List<Note>) :
    RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemNoteBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = ItemNoteBinding.inflate(inflater, viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.binding.tvTitle.text = dataSet[position].title
        viewHolder.binding.tvContent.text = dataSet[position].content
    }

    override fun getItemCount() = dataSet.size

}
