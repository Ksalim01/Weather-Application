package google.codelabs.weatherapplication.network.forecast.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u00c6\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006\""}, d2 = {"Lgoogle/codelabs/weatherapplication/network/forecast/entities/Alerts;", "", "sender_name", "", "event", "start", "", "end", "morn", "day", "", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/util/List;)V", "getDay", "()Ljava/util/List;", "getEnd", "()J", "getEvent", "()Ljava/lang/String;", "getMorn", "getSender_name", "getStart", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Alerts {
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "sender_name")
    private final java.lang.String sender_name = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "event")
    private final java.lang.String event = null;
    @com.squareup.moshi.Json(name = "start")
    private final long start = 0L;
    @com.squareup.moshi.Json(name = "end")
    private final long end = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "description")
    private final java.lang.String morn = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "tags")
    private final java.util.List<java.lang.String> day = null;
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.Alerts copy(@org.jetbrains.annotations.NotNull()
    java.lang.String sender_name, @org.jetbrains.annotations.NotNull()
    java.lang.String event, long start, long end, @org.jetbrains.annotations.NotNull()
    java.lang.String morn, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> day) {
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
    
    public Alerts(@org.jetbrains.annotations.NotNull()
    java.lang.String sender_name, @org.jetbrains.annotations.NotNull()
    java.lang.String event, long start, long end, @org.jetbrains.annotations.NotNull()
    java.lang.String morn, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> day) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSender_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEvent() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getStart() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getEnd() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMorn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDay() {
        return null;
    }
}