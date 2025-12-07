package hu.blackbelt.judo.meta.psm.validation.rules.service;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2024 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;

/**
 * Validation rules for MappedTransferObjectType.
 * Corresponds to validations/service/mappedTransferObjectType.evl
 * 
 * Note: The AllRequiredFeaturesHaveBindingIfCreatable constraint is complex
 * and requires psmUtils which would need to be implemented separately.
 */
@ValidationContext(MappedTransferObjectType.class)
public class MappedTransferObjectTypeValidations {
    // Complex validations requiring psmUtils are omitted for now
}
