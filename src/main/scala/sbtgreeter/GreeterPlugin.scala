package sbtgreeter

import sbt._, Keys._

object GreeterPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = plugins.JvmPlugin

  override val globalSettings = Seq(
    initialize := {
      val _ = initialize.value
      sLog.value info "Greetings, Dale!"
    }
  )
}
