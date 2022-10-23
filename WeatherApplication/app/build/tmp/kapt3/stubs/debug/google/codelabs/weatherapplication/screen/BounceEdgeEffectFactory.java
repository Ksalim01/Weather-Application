package google.codelabs.weatherapplication.screen;

import java.lang.System;

/**
 * Replace edge effect by a bounce
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\f"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/BounceEdgeEffectFactory;", "Landroidx/recyclerview/widget/RecyclerView$EdgeEffectFactory;", "isVertical", "", "(Z)V", "()Z", "createEdgeEffect", "Landroid/widget/EdgeEffect;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "direction", "", "app_debug"})
public final class BounceEdgeEffectFactory extends androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory {
    private final boolean isVertical = false;
    
    public BounceEdgeEffectFactory() {
        super();
    }
    
    public BounceEdgeEffectFactory(boolean isVertical) {
        super();
    }
    
    public final boolean isVertical() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.widget.EdgeEffect createEdgeEffect(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int direction) {
        return null;
    }
}