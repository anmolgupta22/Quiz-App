package com.example.quizapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\tH\u0017J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J \u0010\u0018\u001a\u00020\u00112\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/quizapp/adapter/QuizOptionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/quizapp/adapter/QuizOptionAdapter$ViewHolder;", "context", "Landroid/content/Context;", "selectedAnswerListener", "Lcom/example/quizapp/adapter/QuizOptionAdapter$SelectedAnswerListener;", "(Landroid/content/Context;Lcom/example/quizapp/adapter/QuizOptionAdapter$SelectedAnswerListener;)V", "expandedPosition", "", "items", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "selectedList", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "itemsData", "SelectedAnswerListener", "ViewHolder", "app_debug"})
public final class QuizOptionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.quizapp.adapter.QuizOptionAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private com.example.quizapp.adapter.QuizOptionAdapter.SelectedAnswerListener selectedAnswerListener;
    private java.util.ArrayList<java.lang.String> items;
    private int expandedPosition = androidx.recyclerview.widget.RecyclerView.NO_POSITION;
    private java.util.ArrayList<java.lang.String> selectedList;
    
    public QuizOptionAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.quizapp.adapter.QuizOptionAdapter.SelectedAnswerListener selectedAnswerListener) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> itemsData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.quizapp.adapter.QuizOptionAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor", "NotifyDataSetChanged"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.adapter.QuizOptionAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/quizapp/adapter/QuizOptionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/quizapp/databinding/OptionItemBinding;", "(Lcom/example/quizapp/databinding/OptionItemBinding;)V", "getBinding", "()Lcom/example/quizapp/databinding/OptionItemBinding;", "bind", "", "item", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.quizapp.databinding.OptionItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.quizapp.databinding.OptionItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.quizapp.databinding.OptionItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String item, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/quizapp/adapter/QuizOptionAdapter$SelectedAnswerListener;", "", "selectedData", "", "data", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface SelectedAnswerListener {
        
        public abstract void selectedData(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> data);
    }
}