/*
 *     Vertretungsplan Android App
 *     Copyright (C) 2017  GameplayJDK
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.GameplayJDK.Vertretungsplan.Activity.List.Fragment.Extra;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by GameplayJDK on 14.02.2017.
 */

public class ChildSwipeRefreshLayout extends SwipeRefreshLayout {

    private View mChildView;

    public ChildSwipeRefreshLayout(Context context) {
        super(context);
    }

    public ChildSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean canChildScrollUp() {
        if (this.mChildView != null) {
            return this.mChildView.canScrollVertically(-1);
        }

        return super.canChildScrollUp();
    }

    public View getChildView() {
        return this.mChildView;
    }

    public void setChildView(View scrollableChildView) {
        this.mChildView = scrollableChildView;
    }
}
