package com.example.quizapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/example/quizapp/model/QuizResponse;", "", "responseCode", "", "results", "Ljava/util/ArrayList;", "Lcom/example/quizapp/model/Results;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getResponseCode", "()Ljava/lang/Integer;", "setResponseCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getResults", "()Ljava/util/ArrayList;", "setResults", "(Ljava/util/ArrayList;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/ArrayList;)Lcom/example/quizapp/model/QuizResponse;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class QuizResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer responseCode;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.quizapp.model.Results> results;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.quizapp.model.QuizResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer responseCode, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.quizapp.model.Results> results) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public QuizResponse() {
        super();
    }
    
    public QuizResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer responseCode, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.quizapp.model.Results> results) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getResponseCode() {
        return null;
    }
    
    public final void setResponseCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.quizapp.model.Results> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.quizapp.model.Results> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.quizapp.model.Results> p0) {
    }
}