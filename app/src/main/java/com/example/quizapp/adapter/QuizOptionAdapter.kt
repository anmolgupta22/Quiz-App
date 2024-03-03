package com.example.quizapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.databinding.OptionItemBinding

class QuizOptionAdapter(
    private val context: Context,
    private var selectedAnswerListener: SelectedAnswerListener,
) :
    RecyclerView.Adapter<QuizOptionAdapter.ViewHolder>() {

    private var items: ArrayList<String> = arrayListOf()
    private var expandedPosition = RecyclerView.NO_POSITION
    private var selectedList: ArrayList<String> = arrayListOf()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(itemsData: ArrayList<String>) {
        items = itemsData
        expandedPosition = RecyclerView.NO_POSITION
        selectedList.clear()
        Log.d("TAG", "setData: check the items $itemsData")
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        OptionItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun getItemCount(): Int = items.size

    @SuppressLint("ResourceAsColor", "NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], context)

        val isExpanded = position == expandedPosition
        if (isExpanded) {
            holder.binding.cardAnswer.setCardBackgroundColor(ContextCompat.getColor(context,
                R.color.selected_color))
            val drawable = ContextCompat.getDrawable(context, R.drawable.ic_selected_check)
            holder.binding.answerCheck.setImageDrawable(drawable)
        } else {
            holder.binding.cardAnswer.setCardBackgroundColor(ContextCompat.getColor(context,
                R.color.white))
            val drawable = ContextCompat.getDrawable(context, R.drawable.ic_unselected_check)
            holder.binding.answerCheck.setImageDrawable(drawable)
        }

        with(holder.binding) {
            cardAnswer.setOnClickListener {
                if (selectedList.isNotEmpty() && selectedList.contains(items[position])) {
                    selectedList.clear()
                } else {
                    selectedList.clear()
                    selectedList.add(items[position])
                    selectedAnswerListener.selectedData(selectedList)
                }
                Log.d("TAG", "onBindViewHolder: check the list data $selectedList")
                expandedPosition = if (isExpanded) RecyclerView.NO_POSITION
                else position
                notifyDataSetChanged()

            }
        }

    }

    class ViewHolder(
        val binding: OptionItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String, context: Context) {
            binding.answer.text = item
            binding.cardAnswer.setCardBackgroundColor(ContextCompat.getColor(context,
                R.color.white))
        }
    }

    interface SelectedAnswerListener {
        fun selectedData(data: ArrayList<String>)
    }

}