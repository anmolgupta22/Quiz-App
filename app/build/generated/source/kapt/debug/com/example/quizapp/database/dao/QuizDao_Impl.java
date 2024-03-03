package com.example.quizapp.database.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.quizapp.model.Score;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuizDao_Impl implements QuizDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Score> __insertionAdapterOfScore;

  private final EntityDeletionOrUpdateAdapter<Score> __deletionAdapterOfScore;

  private final EntityDeletionOrUpdateAdapter<Score> __updateAdapterOfScore;

  public QuizDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfScore = new EntityInsertionAdapter<Score>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `tbl_quiz` (`id`,`name`,`score`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Score entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getScore() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getScore());
        }
      }
    };
    this.__deletionAdapterOfScore = new EntityDeletionOrUpdateAdapter<Score>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `tbl_quiz` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Score entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfScore = new EntityDeletionOrUpdateAdapter<Score>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR REPLACE `tbl_quiz` SET `id` = ?,`name` = ?,`score` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Score entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getScore() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getScore());
        }
        statement.bindLong(4, entity.getId());
      }
    };
  }

  @Override
  public void insertAll(final List<? extends Score> dashBoardResponseDb) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfScore.insert(dashBoardResponseDb);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(final Score dashBoardResponseDb) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfScore.insertAndReturnId(dashBoardResponseDb);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Score dashBoardResponseDb) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __deletionAdapterOfScore.handle(dashBoardResponseDb);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final Score dashBoardResponseDb) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __updateAdapterOfScore.handle(dashBoardResponseDb);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
