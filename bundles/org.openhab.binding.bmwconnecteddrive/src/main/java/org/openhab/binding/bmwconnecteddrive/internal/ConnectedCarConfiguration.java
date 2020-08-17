/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.bmwconnecteddrive.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link ConnectedCarConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Bernd Weymann - Initial contribution
 */
@NonNullByDefault
public class ConnectedCarConfiguration {

    /**
     * Depending on the location the correct server needs to be called
     */
    public String region = "";

    /**
     * BMW Connected Drive Username
     */
    public String userName = "";

    /**
     * BMW Connected Drive Password
     */
    public String password = "";

    /**
     * Vehilce Identification Number (VIN)
     */
    public String vin = "";

    /**
     * Data refresh rate in minutes
     */
    public int refreshInterval = 15;
}