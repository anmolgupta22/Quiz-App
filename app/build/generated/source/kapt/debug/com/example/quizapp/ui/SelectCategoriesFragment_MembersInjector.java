// Generated by Dagger (https://dagger.dev).
package com.example.quizapp.ui;

import com.example.quizapp.viewModel.QuizViewModel;
import com.example.quizapp.viewModel.QuizViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SelectCategoriesFragment_MembersInjector implements MembersInjector<SelectCategoriesFragment> {
  private final Provider<QuizViewModel> viewModelProvider;

  private final Provider<QuizViewModelFactory> quizViewModelFactoryProvider;

  public SelectCategoriesFragment_MembersInjector(Provider<QuizViewModel> viewModelProvider,
      Provider<QuizViewModelFactory> quizViewModelFactoryProvider) {
    this.viewModelProvider = viewModelProvider;
    this.quizViewModelFactoryProvider = quizViewModelFactoryProvider;
  }

  public static MembersInjector<SelectCategoriesFragment> create(
      Provider<QuizViewModel> viewModelProvider,
      Provider<QuizViewModelFactory> quizViewModelFactoryProvider) {
    return new SelectCategoriesFragment_MembersInjector(viewModelProvider, quizViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SelectCategoriesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
    injectQuizViewModelFactory(instance, quizViewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.quizapp.ui.SelectCategoriesFragment.viewModel")
  public static void injectViewModel(SelectCategoriesFragment instance, QuizViewModel viewModel) {
    instance.viewModel = viewModel;
  }

  @InjectedFieldSignature("com.example.quizapp.ui.SelectCategoriesFragment.quizViewModelFactory")
  public static void injectQuizViewModelFactory(SelectCategoriesFragment instance,
      QuizViewModelFactory quizViewModelFactory) {
    instance.quizViewModelFactory = quizViewModelFactory;
  }
}