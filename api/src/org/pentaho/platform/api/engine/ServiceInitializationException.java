/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2002-2013 Pentaho Corporation..  All rights reserved.
 */

package org.pentaho.platform.api.engine;

public class ServiceInitializationException extends Exception {

  private static final long serialVersionUID = -2151267602926525247L;

  public ServiceInitializationException() {
    super();
  }

  public ServiceInitializationException( final String message ) {
    super( message );
  }

  public ServiceInitializationException( final String message, final Throwable reas ) {
    super( message, reas );
  }

  public ServiceInitializationException( final Throwable reas ) {
    super( reas );
  }
}
