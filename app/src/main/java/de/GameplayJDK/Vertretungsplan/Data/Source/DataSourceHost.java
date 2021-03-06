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

package de.GameplayJDK.Vertretungsplan.Data.Source;

import de.GameplayJDK.Vertretungsplan.Data.Model.Host;

/**
 * Created by GameplayJDK on 07.12.2016.
 */

public interface DataSourceHost extends DataSource {

    interface GetHostCallback {

        void onSuccess(Host host);

        void onError();
    }

    // GET /vpl
    void getHost(GetHostCallback callback);

    void setHost(Host host);
}
