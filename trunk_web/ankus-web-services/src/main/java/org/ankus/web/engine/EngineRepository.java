/**
 * This file is part of ankus.
 *
 * ankus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ankus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ankus.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ankus.web.engine;

import java.util.List;

import org.ankus.core.repository.PersistentRepository;
import org.ankus.model.rest.Engine;
import org.ankus.web.member.Member;

public interface EngineRepository extends PersistentRepository<Engine, Long> {

    public static final String NAMESPACE = EngineRepository.class.getName();

    List<Engine> selectAll(Member member);
    
    int addPermission(long engineId, String username);
    
    int deletePermission(long engineId);
}
