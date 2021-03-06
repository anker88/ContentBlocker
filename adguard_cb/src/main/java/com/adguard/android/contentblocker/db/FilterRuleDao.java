/*
 This file is part of AdGuard Content Blocker (https://github.com/AdguardTeam/ContentBlocker).
 Copyright © 2018 AdGuard Content Blocker. All rights reserved.

 AdGuard Content Blocker is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by the
 Free Software Foundation, either version 3 of the License, or (at your option)
 any later version.

 AdGuard Content Blocker is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

 You should have received a copy of the GNU General Public License along with
 AdGuard Content Blocker.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.adguard.android.contentblocker.db;

import java.util.List;

/**
 * Data access object for filter rules
 */
public interface FilterRuleDao {

    /**
     * Selects rules by filter ids list
     *
     * @param filterIds Filter ID list
     * @return List of rules
     */
    List<String> selectRuleTexts(List<Integer> filterIds, boolean useCosmetics);

    /**
     * Inserts batch of rules to the specified filter.
     *
     * @param filterId Filter to insert rules to
     * @param rules    Rules to be inserted
     */
    void setFilterRules(int filterId, List<String> rules);

    /**
     * Checks if we have filter rules for this filter locally
     *
     * @param filterId Filter id to check
     * @return True if we do not need to download rules, False otherwise
     */
    boolean hasFilterRules(int filterId);
}
