/**
 * Created by yangqing on 3/18/15.
 *
 */
package helpers.logger

import play.api.Logger

/**
 * ApplicationLogger
 */
object ApplicationLogger {
  /**
   * Log info
   * @param msg message
   * @param tag tag
   * @return
   */
  def info(msg:String)(implicit tag:String): Unit = {
    Logger.logger.info(s" [$tag] $msg")
  }

  /**
   * Debug info
   * @param msg message
   * @param tag tag
   * @return Unit
   */
  def debug(msg:String)(implicit tag:String) : Unit = {
    Logger.logger.debug(s" [$tag] $msg")
  }

  /**
   * Error info
   * @param msg message
   * @param tag tag
   * @return Unit
   */
  def error(msg:String)(implicit tag:String) : Unit = {
    Logger.logger.error(s" [$tag] $msg")
  }

  /**
   * Trace info
   * @param msg message
   * @param tag tag
   * @return Unit
   */
  def trace(msg:String)(implicit tag:String) : Unit = {
    Logger.logger.trace(s" [$tag] $msg")
  }
}

/**
 * Trait for all those want logging
 */
trait RecLogging { self =>
  implicit val TAG = self.getClass.getSimpleName
}