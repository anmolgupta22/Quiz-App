// Generated by Dagger (https://dagger.dev).
package com.example.quizapp.di;

import com.example.quizapp.database.DBHelper;
import com.example.quizapp.database.dao.QuizDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DatabaseModule_ProvidesLocationDaoFactory implements Factory<QuizDao> {
  private final DatabaseModule module;

  private final Provider<DBHelper> databaseProvider;

  public DatabaseModule_ProvidesLocationDaoFactory(DatabaseModule module,
      Provider<DBHelper> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public QuizDao get() {
    return providesLocationDao(module, databaseProvider.get());
  }

  public static DatabaseModule_ProvidesLocationDaoFactory create(DatabaseModule module,
      Provider<DBHelper> databaseProvider) {
    return new DatabaseModule_ProvidesLocationDaoFactory(module, databaseProvider);
  }

  public static QuizDao providesLocationDao(DatabaseModule instance, DBHelper database) {
    return Preconditions.checkNotNullFromProvides(instance.providesLocationDao(database));
  }
}
