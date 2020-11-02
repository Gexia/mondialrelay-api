/*
 * Copyright 2020 Erik Amzallag
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.dajlab.mondialrelayapi.vo;

import java.util.Comparator;

/**
 * Comparateur des évènements de suivi (comparaison de la date pour tri
 * décroissant).
 * 
 * @author Erik
 *
 */
public class EvenementSuiviComparator implements Comparator<MREvenementSuivi> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compare(MREvenementSuivi o1, MREvenementSuivi o2) {

		if (o1 != null && o2 != null && o1.getDate() != null && o2.getDate() != null) {
			return o2.getDate().compareTo(o1.getDate());
		}
		return 0;
	}

}
