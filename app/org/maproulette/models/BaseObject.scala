// Copyright (C) 2016 MapRoulette contributors (see CONTRIBUTORS.md).
// Licensed under the Apache License, Version 2.0 (see LICENSE).
package org.maproulette.models

import org.maproulette.actions.ItemType

/**
  * Every object in the system uses this trait, with exception to the User object. This enables
  * a consistent workflow when used in caching, through the controllers and through the data access
  * layer. Simply it contains an id and name, with the id being typed but in this system it is pretty
  * much a long.
  *
  * @author cuthbertm
  */
trait BaseObject[Key] {
  def name:String
  def id:Key
  def description:Option[String] = None

  val itemType:ItemType
}
