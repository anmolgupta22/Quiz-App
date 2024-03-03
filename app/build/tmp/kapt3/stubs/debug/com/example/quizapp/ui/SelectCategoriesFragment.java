package com.example.quizapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017J\b\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/example/quizapp/ui/SelectCategoriesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/quizapp/databinding/FragmentSelectCategoriesBinding;", "quizViewModelFactory", "Lcom/example/quizapp/viewModel/QuizViewModelFactory;", "getQuizViewModelFactory", "()Lcom/example/quizapp/viewModel/QuizViewModelFactory;", "setQuizViewModelFactory", "(Lcom/example/quizapp/viewModel/QuizViewModelFactory;)V", "viewModel", "Lcom/example/quizapp/viewModel/QuizViewModel;", "getViewModel", "()Lcom/example/quizapp/viewModel/QuizViewModel;", "setViewModel", "(Lcom/example/quizapp/viewModel/QuizViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "validateForm", "", "app_debug"})
public final class SelectCategoriesFragment extends androidx.fragment.app.Fragment {
    private com.example.quizapp.databinding.FragmentSelectCategoriesBinding binding;
    @javax.inject.Inject()
    public com.example.quizapp.viewModel.QuizViewModel viewModel;
    @javax.inject.Inject()
    public com.example.quizapp.viewModel.QuizViewModelFactory quizViewModelFactory;
    
    public SelectCategoriesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.quizapp.viewModel.QuizViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.viewModel.QuizViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.quizapp.viewModel.QuizViewModelFactory getQuizViewModelFactory() {
        return null;
    }
    
    public final void setQuizViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.viewModel.QuizViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean validateForm() {
        return false;
    }
}