package androidx.core.widget;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.NonNull;

public class ListViewAutoScrollHelper extends AutoScrollHelper {
    private final ListView mTarget;

    public ListViewAutoScrollHelper(@NonNull ListView target) {
        super(target);
        this.mTarget = target;
    }

    @Override
    public void scrollTargetBy(int deltaX, int deltaY) {
        ListViewCompat.scrollListBy(this.mTarget, deltaY);
    }

    @Override
    public boolean canTargetScrollHorizontally(int direction) {
        return false;
    }

    @Override
    public boolean canTargetScrollVertically(int direction) {
        ListView target = this.mTarget;
        int itemCount = target.getCount();
        if (itemCount == 0) {
            return false;
        }
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction > 0) {
            if (lastPosition >= itemCount) {
                View lastView = target.getChildAt(childCount - 1);
                if (lastView.getBottom() <= target.getHeight()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        if (direction >= 0) {
            return false;
        }
        if (firstPosition <= 0) {
            View firstView = target.getChildAt(0);
            if (firstView.getTop() >= 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
